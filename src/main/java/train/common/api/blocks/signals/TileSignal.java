package train.common.api.blocks.signals;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;
import train.common.api.blocks.TileRenderFacing;
import train.common.api.blocks.TileSwitch;

import java.util.List;

public class TileSignal extends TileSwitch {
    /**Flags*/
    /**Handles if this signal can flash aspects (Flashing green ect)*/
    Boolean allowFlashing = false;
    /**The actual toggle for the flashing aspects*/
    Boolean isActive = false;
    /**Not all signals will need rolling stock detection, might as well save some performance and skip it when unnecessary*/
    Boolean allowRollingStockDetection = false;

    /**Rolling stock storage*/

    Boolean stockPresent = false;
    Boolean signalPassed = false;



    /**Tells the signal behind that the rollingstock has passed and thus left its reach*/

    public enum SignalStates{
        OFF,
        FLASHING_GREEN,
        GREEN,
        DOUBLE_YELLOW,
        YELLOW,
        RED;

        public SignalStates next() {
            SignalStates[] values = values();
            return values[(this.ordinal() + 1) % values.length];
        }
    }




    SignalStates currentAspect = SignalStates.OFF;

    public void setAspect(SignalStates aspect) {
        this.currentAspect = aspect;
        this.markDirty();

    }

    public SignalStates getAspect() {
        return this.currentAspect;
    }

    public void cycleAspects(){
        SignalStates temp = this.currentAspect;
        this.setAspect(temp.next());
    }



    /**Connected signals, We'll need 2 signals stored inside each tile, for logic reasons.*/

    Boolean isConnectedAhead = false;


    /**Signal 1, and its coordinates stored in nbt*/
    int[] aheadSignalPosition = new int[3];
    TileSignal aheadSignal;




    public TileSignal getAheadSignal() {
        if (this.isConnectedAhead) {
            return aheadSignal;
        }
        return null;
    }
    public void setAheadSignal(TileSignal aheadSignal) {
        this.aheadSignal = aheadSignal;
        this.isConnectedAhead = true;
        this.markDirty();
    }

    public int[] getAheadSignalPosition() {

        if (aheadSignalPosition != null) {
            return aheadSignalPosition;
        }

        return null;

    }
    public void setAheadSignalPosition(int[] aheadSignalPosition) {
        this.aheadSignalPosition = aheadSignalPosition;
        this.markDirty();
    }

    public Boolean getSignalPassed() {
        return signalPassed;
    }

    public void setSignalPassed(Boolean signalPassed) {
        this.signalPassed = signalPassed;
        this.markDirty();
    }





    boolean connectingMode = false;

    public void setConnectingMode(Boolean connecting){
        connectingMode = connecting;
        this.markDirty();
    }
    public Boolean getConnectingMode(){
        return this.connectingMode;
    }

    /**Is this signal connected?*/





    public Boolean getIsActive(){ return isActive; }
    public void setIsActive(boolean active){
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
        this.isActive = active;
    }

    public Boolean getAllowFlashing(){ return allowFlashing;}

    public void setAllowFlashing(Boolean flashing){
        this.allowFlashing = flashing;
        this.markDirty();
    }

    public Boolean getAllowRollingStockDetection() { return allowRollingStockDetection; }

    public void setAllowRollingStockDetection(Boolean detection){
        this.allowRollingStockDetection = detection;
        this.markDirty();
    }

    /** Rollingstock storage*/

    public Boolean getStockPresent() { return stockPresent; }
    public void setStockPresent(Boolean present){
        this.stockPresent = present;
        this.markDirty();
    }





    public void readFromNBT(NBTTagCompound nbtTag) {
        super.readFromNBT(nbtTag);
        currentAspect = SignalStates.values()[nbtTag.getInteger("currentAspect")];
        allowFlashing = nbtTag.getBoolean("allowFlashing");
        connectingMode = nbtTag.getBoolean("connectingMode");
        allowRollingStockDetection = nbtTag.getBoolean("allowRollingStockDetection");
        aheadSignalPosition = nbtTag.getIntArray("aheadSignalPosition");
        stockPresent = nbtTag.getBoolean("stockPresent");
        signalPassed = nbtTag.getBoolean("signalPassed");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTag) {
        super.writeToNBT(nbtTag);
        nbtTag.setInteger("currentAspect", this.currentAspect.ordinal());
        nbtTag.setBoolean("allowFlashing", this.allowFlashing);
        nbtTag.setBoolean("allowRollingStockDetection", this.allowRollingStockDetection);
        nbtTag.setIntArray("aheadSignalPosition", this.aheadSignalPosition);
        nbtTag.setBoolean("connectingMode", this.connectingMode);
        nbtTag.setBoolean("stockPresent", this.stockPresent);
        nbtTag.setBoolean("signalPassed", this.signalPassed);

            }

    public S35PacketUpdateTileEntity getDescriptionPacket() {

        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);

        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt){
        this.readFromNBT(pkt.func_148857_g());
        super.onDataPacket(net, pkt);
    }
    public TileRenderFacing setDiagonalFacing(int dir){
        facing = dir;
        this.markDirty();
        return this;
    }

    public int getDiagonalfacing(){
        return facing;
    }

    private int flashingTicks = 0;
    private int checkingTicks = 0;

    @Override
    public void updateEntity() {
        if (worldObj.isRemote) {
            super.updateEntity();

            //Flashing mechanic
            if (allowFlashing) {
                flashingTicks++;
                setIsActive((flashingTicks / 20) % 2 == 0);
                if (flashingTicks > 40) {
                    flashingTicks = 0;
                }
            }



            //Rolling stock Detection
            /*if (allowRollingStockDetection){



            int x1 = 1;// x2
            int x2 = 1;// y2
            int x3 = 1;// z2
            int x4 = 1;// x1
            int x5 = 1;// z1

            switch (facing) {

                case 0:
                    x4 = -1;
                    x5 = 0;
                    x1 = 0;
                    x3 = 1;
                    break;

                case 1:
                    x4 = -1;
                    x5 = -1;
                    x1 = 0;
                    x3 = 0;
                    break;

                case 2:
                    x4 = 0;
                    x5 = -1;
                    x1 = 1;
                    x3 = 0;
                    break;
                case 3:
                    x4 = 0;
                    x5 = -2;
                    x1 = 1;
                    x3 = -1;
                    break;
                case 4:
                    x4 = 1;
                    x5 = 0;
                    x1 = 2;
                    x3 = 1;
                    break;
                case 5:
                    x4 = 2;
                    x5 = 0;
                    x1 = 3;
                    x3 = 1;
                    break;
                case 6:
                    x4 = 0;
                    x5 = 1;
                    x1 = 1;
                    x3 = 2;
                    break;
                case 7:
                    x4 = -1;
                    x5 = 1;
                    x1 = 0;
                    x3 = 2;
                    break;
            }

            List list = this.worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getBoundingBox( this.xCoord + x4, this.yCoord, this.zCoord + x5, (this.xCoord + x1), (this.yCoord + 1),  (this.zCoord + x3)));
            Entity entity;

            if (list != null && list.size() > 0) {

                for (int j1 = 0; j1 < list.size(); j1++) {

                    entity = (Entity) list.get(j1);

                    if (entity instanceof EntityRollingStock) {

                        if (entity instanceof Locomotive && !((Locomotive) entity).canBePulled) {
                            if (getStockPresent()) {
                                worldObj.getClosestPlayer(this.xCoord, this.yCoord, this.zCoord, 10).addChatMessage(new ChatComponentText("Warning: Signal passed at danger!"));
                                break;
                            }




                            this.setStockPresent(true);
                            if (getAheadSignal() != null){
                                aheadSignal.setSignalPassed(false);
                            }
                            this.setSignalPassed(true);
                            return;


                        }


                    }
                }
            }
        }*/
        }

    }

}


