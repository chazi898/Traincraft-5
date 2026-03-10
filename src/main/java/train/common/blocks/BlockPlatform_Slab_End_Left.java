/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.tile.TilePlatform_Slab_End_Left;

import static net.minecraftforge.common.util.ForgeDirection.UP;

public class BlockPlatform_Slab_End_Left extends BlockContainer {

	private IIcon texture;

	public BlockPlatform_Slab_End_Left() {
		super(Material.iron);
		setCreativeTab(Traincraft.BIPInfrastructureTab);
		setBlockBounds(0.0F, 0.0F, 0.0F, 1F, 0.5F, 1F);
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
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
		TilePlatform_Slab_End_Left te = (TilePlatform_Slab_End_Left) world.getTileEntity(par2, par3, par4);
		if (te != null) {
			int dir = MathHelper.floor_double((living.rotationYaw * 4f) / 360.0F + 0.5D) & 3;
			te.setDiagonalFacing(dir);
			world.markBlockForUpdate(par2, par3, par4);
		}
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) { return new TilePlatform_Slab_End_Left(); }

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TilePlatform_Slab_End_Left(meta);
	}
}