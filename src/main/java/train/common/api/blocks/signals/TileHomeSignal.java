package train.common.api.blocks.signals;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import train.common.api.blocks.TileRenderFacing;

public class TileHomeSignal extends TileSignal{

    public void readFromNBT(NBTTagCompound nbtTag) {
        super.readFromNBT(nbtTag);

    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTag) {
        super.writeToNBT(nbtTag);
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

    private int signalTicks = 0;
    @Override
    public void updateEntity() {
        if (!worldObj.isRemote) {
            super.updateEntity();
            /**Update signal based on ahead signal*/
            {
                signalTicks++;
                if (signalTicks > 20) {
                    if (getAheadSignal() != null) {

                    if (getStockPresent()) {
                        setAspect(SignalStates.RED);


                        if (aheadSignal.getSignalPassed()) {
                            aheadSignal.setStockPresent(true);
                            this.setSignalPassed(false);
                            this.setStockPresent(false);
                        }



                        return;



                        /*



                        if (this.getStockPresent() && !aheadSignal.getSignalPassed()) {
                            setAspect(SignalStates.RED);
                            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
                            return;

                        }

                        if (this.getStockPresent() && aheadSignal.getSignalPassed()) {
                            if (aheadSignal.getStockPresent()) {
                                aheadSignal.setSignalPassed(false);
                            }
                            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
                            return;
                        }


                        if (aheadSignal.getSignalPassed() && aheadSignal.getStockPresent()) {
                            setSignalPassed(false);
                            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
                            return;
                        }*/
                    }



                        if (aheadSignal.getAspect() == SignalStates.RED) setAspect(SignalStates.YELLOW);
                        if (aheadSignal.getAspect() == SignalStates.YELLOW || aheadSignal.getAspect() == SignalStates.DOUBLE_YELLOW) setAspect(SignalStates.GREEN);
                        if (aheadSignal.getAspect() == SignalStates.GREEN || aheadSignal.getAspect() == SignalStates.FLASHING_GREEN ) setAspect(SignalStates.GREEN);
                        if (aheadSignal.getAspect() == SignalStates.OFF) setAspect(SignalStates.GREEN);
                    }
                    signalTicks = 0;

                }
            }

        }
    }

}
