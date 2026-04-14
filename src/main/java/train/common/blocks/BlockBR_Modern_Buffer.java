/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.tile.TileBR_Modern_Buffer;

import static net.minecraftforge.common.util.ForgeDirection.UP;

public class BlockBR_Modern_Buffer extends BlockContainer {

	private IIcon texture;

	public BlockBR_Modern_Buffer() {
		super(Material.iron);
		setCreativeTab(Traincraft.BIPInfrastructureTab);
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
		TileBR_Modern_Buffer te = (TileBR_Modern_Buffer) world.getTileEntity(par2, par3, par4);
		if (te != null) {
			int dir = MathHelper.floor_double((living.rotationYaw * 8f) / 360.0F + 0.5D) & 7;
			te.setDiagonalFacing(dir);
			world.markBlockForUpdate(par2, par3, par4);
		}
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) { return new TileBR_Modern_Buffer(); }

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileBR_Modern_Buffer(meta);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":br_modern_buffer");
	}

}