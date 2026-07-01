package train.common.tile.tileSwitch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.util.AxisAlignedBB;
import train.common.api.blocks.TileRenderFacing;
import train.common.blocks.blockSwitch.BlockBR_UK_SpeedSign_EPS;
import train.common.blocks.blockSwitch.BlockBR_UK_SpeedSign_Warning;

public class TileBR_UK_SpeedSign_Warning extends TileRenderFacing {

	private int skinstate;

	public TileBR_UK_SpeedSign_Warning(){
	}
	public TileBR_UK_SpeedSign_Warning(BlockBR_UK_SpeedSign_Warning block){
		host = block;
	}
	public void setSkinstate(int skinstate) {
		this.skinstate = skinstate;
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);

	}

	public int getSkinstate() {
		return skinstate;
	}

	public void increaseSkinState(){
		if (skinstate >= 13){
			skinstate = 0;
		} else {
			skinstate++;
		}
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	public TileRenderFacing setDiagonalFacing(int dir){
		facing = dir;
		this.markDirty();
		return this;
	}

	public int getDiagonalfacing(){
		return facing;
	}

	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		if(nbtTag.hasKey("skinstate")){
			skinstate = nbtTag.getInteger("skinstate");
		}

		else {
			System.out.println("No Skins");
		}

	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		nbtTag.setInteger("skinstate", this.skinstate);
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

	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return AxisAlignedBB.getBoundingBox(xCoord - 1, yCoord - 1, zCoord - 1, xCoord + 2, yCoord + 2, zCoord + 2);
	}
}
