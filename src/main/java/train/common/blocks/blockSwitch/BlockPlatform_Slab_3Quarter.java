package train.common.blocks.blockSwitch;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
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
import train.common.api.blocks.BlockDynamic;
import train.common.tile.tileSwitch.TilePlatform_Slab_3Quarter;
import train.common.tile.tileSwitch.TileTram_Platform_Fenced;

import java.util.List;

import static net.minecraftforge.common.util.ForgeDirection.UP;

public class BlockPlatform_Slab_3Quarter extends BlockDynamic {
	private IIcon texture;
	private int skinstate = 0;

	public BlockPlatform_Slab_3Quarter() {
		super(Material.iron,0);
		this.setTickRandomly(true);
		setBlockBounds(0.0F,0.0F,0.0F,1F,0.5F,1F);
	}

	@Override
	public boolean hasTileEntity(int metadata) { return true; }

	@Override
	public boolean renderAsNormalBlock() { return false; }

	@Override
	public boolean isOpaqueCube() { return false; }

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) { return (world.isSideSolid(x, y-1, z, UP));
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
		super.onBlockPlacedBy(world, i, j, k, entityliving, stack);
		TilePlatform_Slab_3Quarter te = (TilePlatform_Slab_3Quarter) world.getTileEntity(i, j, k);
		if (te != null) {
			int dir = MathHelper.floor_double((entityliving.rotationYaw * 4f) / 360.0F + 0.5D ) & 3;
			te.setFacing(dir);
			te.setSkinstate(0);
			world.markBlockForUpdate(i, j, k);
		}
	}

	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		TilePlatform_Slab_3Quarter te = (TilePlatform_Slab_3Quarter) p_149727_1_.getTileEntity(p_149727_2_, p_149727_3_, p_149727_4_);
		te.increaseSkinState();
		p_149727_1_.markBlockForUpdate(p_149727_2_, p_149727_3_, p_149727_4_);


		return super.onBlockActivated(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, p_149727_5_, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) { return new TilePlatform_Slab_3Quarter();
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) { return new TilePlatform_Slab_3Quarter();
	}

	@Override
	public int getRenderType() { return -1; }


	public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
		super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
		if(p_149749_1_.getTileEntity(p_149749_2_,p_149749_3_,p_149749_4_)!=null){
			p_149749_1_.removeTileEntity(p_149749_2_, p_149749_3_, p_149749_4_);
		}
	}


	@Override
	public IIcon getIcon(int i, int j) { return texture; }
}
