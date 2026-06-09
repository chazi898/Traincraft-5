package train.client.render.renderSwitch;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.renderSwitch.models.ModelBR_UK_SpeedSign_Double;
import train.common.library.Info;
import train.common.tile.tileSwitch.TileBR_UK_SpeedSign_DoubleLeft;

public class RenderBR_UK_SpeedSign_DoubleLeft extends TileEntitySpecialRenderer {
	static final ModelBR_UK_SpeedSign_Double modelBR_UK_SpeedSign = new ModelBR_UK_SpeedSign_Double();
	/*
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign.png");
	private static final ResourceLocation texture2 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign2.png");
	private static final ResourceLocation texture3 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign3.png");
	private static final ResourceLocation texture4 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign4.png");

	 */

	private ResourceLocation[] textures = {new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_20140.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_2550.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_3080.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_3090.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_30200.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_4050.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_4060.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_40130.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_4580.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_45120.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_5060.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_5070.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_5080.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_5085.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_50120.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_50130.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_50140.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_50160.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_60120.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_60160.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_60200.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_60225.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_65120.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_7060.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_75140.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_80130.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_100160.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_120100.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_120160.png"),
	                                       new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeft_6570.png")};


	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		Tessellator.bindTexture(textures[((TileBR_UK_SpeedSign_DoubleLeft) tileEntity).getSkinstate()]);
		GL11.glPushMatrix();
		GL11.glTranslated(x +0.5 , y+0.625, z +0.125);
		GL11.glRotated(180, 0, 1, 0);
		boolean skipRender = false;

		switch (((TileBR_UK_SpeedSign_DoubleLeft) tileEntity).getDiagonalfacing()) {
			case 0: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(90, 0, 1, 0);
				GL11.glTranslated(0.3, 0f, 0);
				//System.out.println("N");

				break;
			}
			case 4: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(270, 0, 1, 0);
				GL11.glTranslated(-0.45, 0f, 0);
				//GL11.glTranslated(0.5, 0f, 0.5);
				//System.out.println("S");

				//GL11.glTranslated(0.1875, -1, 0.125);
				break;
			}
			case 2: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(180, 0, 1, 0);
				GL11.glTranslated(-0.1, 0f, 0.4);
				//System.out.println("E");

				//GL11.glTranslated(0.1875, -1, 0.125);
				break;
			}
			case 6: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(0, 0, 1, 0);
				GL11.glTranslatef(-0.05f,0f, -0.35f);
				//System.out.println("W");
				//GL11.glTranslated(0.1875, -1, 0.125);
				break;
			}
			case 1: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(135, 0, 1, 0);
				GL11.glTranslatef(0.25f,0f, -0f);
				break;
			}
			case 3: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(225, 0, 1, 0);
				GL11.glTranslatef(-0.25f,0f, -0f);
				break;
			}
			case 5: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(315, 0, 1, 0);
				GL11.glTranslatef(-0.25f,0f, -0.5f);
				break;
			}
			case 7: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(45, 0, 1, 0);
				GL11.glTranslatef(0.25f,0f, -0.5f);
				break;
			}
			default: {
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

			modelBR_UK_SpeedSign.render(null, 0, 0, 0, 0, 0, 0.0625f);



		}
		GL11.glPopMatrix();
	}
}

