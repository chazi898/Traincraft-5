package train.common.tile.signals;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.util.AxisAlignedBB;
import train.common.api.blocks.signals.TileHomeSignal;
import train.common.blocks.signals.BlockBR_3_Aspect_Signal;

public class TileBR_3_Aspect_Signal extends TileHomeSignal {

	public TileBR_3_Aspect_Signal(){
	}
	public TileBR_3_Aspect_Signal(BlockBR_3_Aspect_Signal block){
		host = block;
	}

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
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.func_148857_g());
		super.onDataPacket(net, pkt);
	}


	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return AxisAlignedBB.getBoundingBox(xCoord - 1, yCoord - 1, zCoord - 1, xCoord + 2, yCoord + 2, zCoord + 2);
	}
}
