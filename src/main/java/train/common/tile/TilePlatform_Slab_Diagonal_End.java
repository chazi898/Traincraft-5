/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import train.common.api.blocks.TileRenderFacing;

public class TilePlatform_Slab_Diagonal_End extends TileRenderFacing {

	public TilePlatform_Slab_Diagonal_End() {
		//facingMeta = this.getBlockMetadata(); // Changed from this.blockMetadata to the method call to avoid receiving invalid Metadata.
	}

	public TilePlatform_Slab_Diagonal_End(int meta){
		
		this.facing = meta;
	}

	public TileRenderFacing setDiagonalFacing(int dir){
		facing = dir;
		this.markDirty();
		return this;
	}

	public int getDiagonalfacing(){
		return facing;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {

		super.readFromNBT(nbtTag);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {

		super.writeToNBT(nbtTag);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt){
		this.readFromNBT(pkt.func_148857_g());
		super.onDataPacket(net, pkt);
	}
}