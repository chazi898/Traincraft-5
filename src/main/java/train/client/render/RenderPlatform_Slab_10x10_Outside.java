package train.client.render;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelPlatform_Slab_10x10_Outside;
import train.common.library.Info;
import train.common.tile.TilePlatform_Slab_10x10_Outside;

public class RenderPlatform_Slab_10x10_Outside extends TileEntitySpecialRenderer {
    static final ModelPlatform_Slab_10x10_Outside modelPlatform_Slab_10x10_Outside = new ModelPlatform_Slab_10x10_Outside();
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Platform_Slab_10x10_Outside.png");


    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        Tessellator.bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5,y+0.625,z+0.125);
        GL11.glRotated(180,0,1,0);
        boolean skipRender = false;

        switch (((TilePlatform_Slab_10x10_Outside)tileEntity).getFacing()){
            case NORTH:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(90,0,1,0);
                GL11.glTranslated(-1.125,0,0.5);
                break;
            }
            case SOUTH:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(270,0,1,0);
                GL11.glTranslated(-1.875,0,0.5);
                break;
            }
            case EAST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(0,0,1,0);
                GL11.glTranslated(-1.5,0,0.125);
                break;
            }
            case WEST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(180,0,1,0);
                GL11.glTranslated(-1.5,0,0.875);
                break;
            }
            default:{
                skipRender = true;
            }
        }

        if (!skipRender) {
            modelPlatform_Slab_10x10_Outside.render(null, 0, 0, 0, 0, 0, 0.0625f);
        }
        GL11.glPopMatrix();
    }


}
