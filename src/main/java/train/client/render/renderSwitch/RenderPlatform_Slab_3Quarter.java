package train.client.render.renderSwitch;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelPlatform_Slab_3Quarter;
import train.client.render.renderSwitch.models.ModelTramPlatformFenced;
import train.common.library.Info;
import train.common.tile.tileSwitch.TilePlatform_Slab_3Quarter;
import train.common.tile.tileSwitch.TileTram_Platform_Fenced;

public class RenderPlatform_Slab_3Quarter extends TileEntitySpecialRenderer {
	static final ModelPlatform_Slab_3Quarter modelPlatform_Slab_3Quarter = new ModelPlatform_Slab_3Quarter();

	private ResourceLocation[] textures = {new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Platform_Slab_3Quarter.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Platform_Slab_3Quarter_Stripe.png")};


	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		Tessellator.bindTexture(textures[((TilePlatform_Slab_3Quarter) tileEntity).getSkinstate()]);
		GL11.glPushMatrix();
		GL11.glTranslated(x +0.4 , y+0.625, z +0.1);
		GL11.glRotated(180, 0, 1, 0);
		boolean skipRender = false;

		switch (((TilePlatform_Slab_3Quarter)tileEntity).getFacing()){
			case NORTH:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(0,0,1,0);
				GL11.glTranslated(-0.4,0,0.1);
				break;
			}
			case SOUTH:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(180,0,1,0);
				GL11.glTranslated(-0.6,0,0.9);
				break;
			}
			case EAST:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(270,0,1,0);
				GL11.glTranslated(-0.9,0,0.4);
				break;
			}
			case WEST:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(90,0,1,0);
				GL11.glTranslated(-0.1,0,0.6);
				break;
			}
			default :{
				skipRender = true;
			}
		}


		if (!skipRender) {

			// tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord).isProvidingWeakPower(tileEntity.getWorldObj(), tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord, 0) > 0

			/*
			if (((TileSpeedSign) tileEntity).getSkinstate() == 0) {
				Tessellator.bindTexture(texture);
			} else if (((TileSpeedSign) tileEntity).getSkinstate() == 1){
				Tessellator.bindTexture(texture2);
			} else if (((TileSpeedSign) tileEntity).getSkinstate() == 2){
				Tessellator.bindTexture(texture3);
			} else if (((TileSpeedSign) tileEntity).getSkinstate() == 3) {
				Tessellator.bindTexture(texture4);
			}

			 */

			modelPlatform_Slab_3Quarter.render(null, 0, 0, 0, 0, 0, 0.0625f);



		}
		GL11.glPopMatrix();
	}


	}
