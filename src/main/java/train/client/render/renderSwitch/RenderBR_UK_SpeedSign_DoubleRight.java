package train.client.render.renderSwitch;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.renderSwitch.models.ModelBR_UK_SpeedSign_Double;
import train.common.library.Info;
import train.common.tile.tileSwitch.TileBR_UK_SpeedSign_DoubleRight;

public class RenderBR_UK_SpeedSign_DoubleRight extends TileEntitySpecialRenderer {
	static final ModelBR_UK_SpeedSign_Double modelBR_UK_SpeedSign = new ModelBR_UK_SpeedSign_Double();
	/*
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign.png");
	private static final ResourceLocation texture2 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign2.png");
	private static final ResourceLocation texture3 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign3.png");
	private static final ResourceLocation texture4 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign4.png");

	 */

	private ResourceLocation[] textures = {new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_4080.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_40120.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_40140.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_5075.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_5090.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_50110.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_6580.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_80100.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_80120.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_100160.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleRight_100200.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeftRight_4050.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeftRight_4060.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeftRight_50100.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeftRight_50120.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeftRight_60100.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeftRight_60120.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeftRight_60160.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_Double_140170.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_Double_160180.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_Double_160200.png"),
			                               new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeftRight_4595.png"),
	                                       new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_UK_SpeedSign_DoubleLeftRight_6080.png")};


	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		Tessellator.bindTexture(textures[((TileBR_UK_SpeedSign_DoubleRight) tileEntity).getSkinstate()]);
		GL11.glPushMatrix();
		GL11.glTranslated(x +0.5 , y+0.625, z +0.125);
		GL11.glRotated(180, 0, 1, 0);
		boolean skipRender = false;

		switch (((TileBR_UK_SpeedSign_DoubleRight) tileEntity).getDiagonalfacing()) {
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

