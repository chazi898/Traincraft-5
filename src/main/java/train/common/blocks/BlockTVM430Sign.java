/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.blocks.BlockDynamic;
import train.common.tile.TilePlatform_Slab_Diagonal_End;
import train.common.tile.TileTVM430Sign;

import java.util.List;

import static net.minecraftforge.common.util.ForgeDirection.UP;

public class BlockTVM430Sign extends BlockDynamic {

	private IIcon texture;

	public BlockTVM430Sign() {
		super(Material.iron,0);
		setCreativeTab(Traincraft.BIPInfrastructureTab);
		setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 1.9F, 0.8F);
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
	public int getRenderType() {
		return -1; //RenderingRegistry.getNextAvailableRenderId();
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		return (world.isSideSolid(x, y-1, z, UP));
	}

	@Override
	public void onBlockPlacedBy(World world, int par2, int par3, int par4, EntityLivingBase living, ItemStack stack) {
		TileTVM430Sign te = (TileTVM430Sign) world.getTileEntity(par2, par3, par4);
		if (te != null) {
			int dir = MathHelper.floor_double((living.rotationYaw * 8f) / 360.0F + 0.5D) & 7;
			te.setDiagonalFacing(dir);
			world.markBlockForUpdate(par2, par3, par4);
		}
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) { return new TileTVM430Sign(); }

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileTVM430Sign(meta);
	}
}