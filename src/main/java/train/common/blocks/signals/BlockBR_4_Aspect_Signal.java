package train.common.blocks.signals;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.api.blocks.BlockSignal;
import train.common.api.blocks.signals.TileSignal;
import train.common.items.ItemSignalConnector;
import train.common.tile.signals.TileBR_4_Aspect_Signal;

import java.util.List;

public class BlockBR_4_Aspect_Signal extends BlockSignal {
	private IIcon texture;

	public BlockBR_4_Aspect_Signal() {
		super(Material.iron, 0);
		this.setTickRandomly(true);
		setBlockBounds(0.3F,0.0F,0.3F,0.7F,1F,0.7F);
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}

	@Override
	public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
	{
	}


	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}


	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
		super.onBlockPlacedBy(world, i, j, k, entityliving, stack);
		TileBR_4_Aspect_Signal te = (TileBR_4_Aspect_Signal) world.getTileEntity(i, j, k);
		if (te != null) {
			int dir = MathHelper.floor_double((entityliving.rotationYaw * 8f) / 360.0F + 0.5D ) & 7;
			te.setDiagonalFacing(dir);
			te.setAspect(TileSignal.SignalStates.OFF);
			te.setAllowFlashing(true);
			te.setIsActive(false);
			te.setAllowRollingStockDetection(true);
			world.markBlockForUpdate(i, j, k);


		}
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		if (!world.isRemote) {
			TileBR_4_Aspect_Signal te = (TileBR_4_Aspect_Signal) world.getTileEntity(x, y, z);
			if (player.getHeldItem() != null && (player.getHeldItem().getItem() instanceof ItemSignalConnector)) {
				return super.onBlockActivated(world, x, y, z, player, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);

			} else {
				te.cycleAspects();
				world.markBlockForUpdate(x, y, z);
			}
		}

		return super.onBlockActivated(world, x, y, z, player, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) { return new TileBR_4_Aspect_Signal();
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) { return new TileBR_4_Aspect_Signal();
	}



	@Override
	public int getRenderType() {
		return -1;
	}







	public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
		super.breakBlock(world, x, y, z, block, meta);
		if(world.getTileEntity(x,y,z)!=null){
			world.removeTileEntity(x, y, z);
		}
	}






	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}
}
