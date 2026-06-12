package train.common.api.blocks.signals;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.util.AxisAlignedBB;
import train.common.api.EntityRollingStock;
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

    /**Tells the signal behind that the rollingstock has passed and thus left its reach*/
    Boolean signalPassed = false;
    /**Check if rollingstock is present in this region*/
    Boolean stockPresent = false;
    /**This can be used to check if the stored rolling stock still exists.*/
    EntityRollingStock savedStock;

    public void setSignalPassed(Boolean passed){
        this.signalPassed = passed;
        this.markDirty();
    }

    public Boolean getSignalPassed(){
        return this.signalPassed;
    }

    public void setStockPresent(Boolean present){
        this.stockPresent = present;
        this.markDirty();
    }

    public Boolean getStockPresent(){
        return this.stockPresent;
    }

    /**Currently availabl aspects*/


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



    /**Connected signals, We'll need 2 signals stored inside each tile, for logic reasons.

    /**Signal 1, and its coordinates stored in nbt*/
    int[] aheadSignalPosition = new int[3];
    TileSignal aheadSignal;

    public void setAheadSignal(int x, int y, int z){

        if (worldObj.getTileEntity(x, y, z) instanceof TileSignal){
            aheadSignalPosition = new int[]{x, y, z};
            setIsConnected(true);
            aheadSignal = ((TileSignal) worldObj.getTileEntity(x, y, z));

        }

        this.markDirty();


    }

    public int[] getAheadSignal() {

        if (!this.isConnected) return null;
        if (worldObj.getTileEntity(aheadSignalPosition[0], aheadSignalPosition[1], aheadSignalPosition[2]) instanceof TileSignal){
            return aheadSignalPosition;
        }

        else {
            isConnected = false;
            aheadSignal = null;
            return null;
        }

    }

    public TileSignal getAheadSignalTile(){
        if (!this.isConnected) return null;
        if (worldObj.getTileEntity(aheadSignalPosition[0], aheadSignalPosition[1], aheadSignalPosition[2]) instanceof TileSignal){
            return aheadSignal;
        }
        else {
            isConnected = false;
            aheadSignal = null;
            return null;
        }
    }

    boolean connectingMode = false;

    public void setConnectingMode(Boolean connecting){
        connectingMode = connecting;
        this.markDirty();
    }
    public Boolean getConnectingMode(){
        return this.connectingMode;
    }

    //Signal 2, and its coordinates stored in nbt
    //  TileSignal signal2;
    //  int[] signal2Position = new int[3];

    //public void setSignal2Position(int x, int y, int z){
    //     signal2Position = new int[]{x, y, z};
    //     worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    // }
    // public int[] getSignal2Position() {return signal2Position;}

    /**Is this signal connected?*/
    Boolean isConnected = false;

    public void setIsConnected(Boolean connected){
        if (connected == false){
            aheadSignal = null;
            aheadSignalPosition = null;
        }
        isConnected = connected;
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }
    public Boolean getIsConnected(){
        return this.isConnected;
    }

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

    public void readFromNBT(NBTTagCompound nbtTag) {
        super.readFromNBT(nbtTag);
        currentAspect = SignalStates.values()[nbtTag.getInteger("currentAspect")];
        allowFlashing = nbtTag.getBoolean("allowFlashing");
        connectingMode = nbtTag.getBoolean("connectingMode");
        allowRollingStockDetection = nbtTag.getBoolean("allowRollingStockDetection");
        signalPassed = nbtTag.getBoolean("signalPassed");
        stockPresent = nbtTag.getBoolean("stockPresent");
        aheadSignalPosition = nbtTag.getIntArray("aheadSignalPosition");
        isConnected = nbtTag.getBoolean("isConnected");
     //   signal2Position = nbtTag.getIntArray("signal2Position");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTag) {
        super.writeToNBT(nbtTag);
        nbtTag.setInteger("currentAspect", this.currentAspect.ordinal());
        nbtTag.setBoolean("allowFlashing", this.allowFlashing);
        nbtTag.setBoolean("allowRollingStockDetection", this.allowRollingStockDetection);
        nbtTag.setBoolean("signalPassed", this.signalPassed);
        nbtTag.setBoolean("stockPresent", this.stockPresent);
        nbtTag.setIntArray("aheadSignalPosition", this.aheadSignalPosition);
        nbtTag.setBoolean("connectingMode", this.connectingMode);
        nbtTag.setBoolean("isConnected", this.isConnected);
      //  nbtTag.setIntArray("signal2Position", this.signal2Position);
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
        if (aheadSignalPosition != null) {
            if (!(worldObj.getTileEntity(aheadSignalPosition[0], aheadSignalPosition[1], aheadSignalPosition[2]) instanceof TileSignal)){
                this.setIsConnected(false);
                return;
            }
            aheadSignal = ((TileSignal) worldObj.getTileEntity(aheadSignalPosition[0], aheadSignalPosition[1], aheadSignalPosition[2]));
            //Check if the next signal has been passed



        }

        else if (aheadSignal == null) {
            this.setIsConnected(false);
            this.setAspect(SignalStates.RED);
        }
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

            //Check if rolling stock is still alive
            if (allowRollingStockDetection) {
                checkingTicks++;
                if (checkingTicks > 100) {
                    if (stockPresent) {
                        if (savedStock == null || savedStock.isDead) {
                            setStockPresent(false);
                            setSignalPassed(false);
                            savedStock = null;
                        }

                    }
                    checkingTicks = 0;
                }
            }



            //Rolling stock Detection
            if (allowRollingStockDetection && !(signalPassed)){



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
                        setStockPresent(true);
                        setSignalPassed(true);
                        savedStock = (EntityRollingStock) entity;
                    }
                }
            }
        }
    }

        }

    }


