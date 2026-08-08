package train.client.render.renderSwitch;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.Tessellator;
import train.client.render.renderSwitch.models.ModelBR_2_Aspect_Signal;
import train.common.api.blocks.signals.TileMultiSignal;
import train.common.library.Info;
import train.common.tile.signals.TileBR_2_Aspect_Signal;
import train.common.tile.signals.TileBR_4_Aspect_Signal;

public class RenderBR_2_Aspect_Signal extends TileEntitySpecialRenderer {
    static final ModelBR_2_Aspect_Signal modelBR_2_Aspect_Signal = new ModelBR_2_Aspect_Signal();
    private ResourceLocation[] textures = {
            new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_2_Aspect_Signal_Off.png"),
            new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_2_Aspect_Signal_Off.png"),
            new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_2_Aspect_Signal_Green.png"),
            new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_2_Aspect_Signal_Off.png"),
            new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_2_Aspect_Signal_Yellow.png"),
            new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_2_Aspect_Signal_Red.png")};



    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {


        Tessellator.bindTexture(textures[((TileBR_2_Aspect_Signal) tileEntity).getAspect().ordinal()]);

        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5,y+0.6,z+0.125);
        GL11.glRotated(180,0,1,0);
        boolean skipRender = false;

        switch (((TileBR_2_Aspect_Signal)tileEntity).getDiagonalfacing()) {
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
            modelBR_2_Aspect_Signal.render(0.0625f);
        }
        GL11.glPopMatrix();
    }
}
