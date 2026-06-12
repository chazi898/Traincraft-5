package train.common.api.blocks.signals;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

public class TileMultiSignal extends TileSignal{

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



        if (worldObj.isRemote) {
            super.updateEntity();
            /**Update signal based on ahead signal*/
            {
                signalTicks++;
                if (signalTicks > 20) {
                    if (getAheadSignal() != null) {
                        if (signalPassed && !aheadSignal.signalPassed){
                            setAspect(SignalStates.RED);
                            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
                            signalTicks = 0;
                            return;
                        }
                        if (aheadSignal.getAspect() == SignalStates.OFF) setAspect(SignalStates.GREEN);
                        if (aheadSignal.getAspect() == SignalStates.RED) setAspect(SignalStates.YELLOW);
                        if (aheadSignal.getAspect() == SignalStates.YELLOW) setAspect(SignalStates.DOUBLE_YELLOW);
                        if (aheadSignal.getAspect() == SignalStates.DOUBLE_YELLOW) setAspect(SignalStates.GREEN);
                        if (aheadSignal.getAspect() == SignalStates.GREEN) setAspect(SignalStates.FLASHING_GREEN);

                    }
                    signalTicks = 0;

                }
            }

        }
    }

}
