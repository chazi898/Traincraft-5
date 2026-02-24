/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelBR_Modern_Buffer;
import train.common.library.Info;
import train.common.tile.TileBR_Modern_Buffer;

public class RenderBR_Modern_Buffer extends TileEntitySpecialRenderer {

    private static final ModelBR_Modern_Buffer modelBR_Modern_Buffer = new ModelBR_Modern_Buffer(1F / 16.0F);
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_Modern_Buffer_Red.png");

    private IModelCustom track;

    public RenderBR_Modern_Buffer() {
    }

    public void render(TileEntity var1, double x, double y, double z) {

    }

    private void modelBR_Modern_Buffer(float v, Entity facing) {
    }

    @Override
    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8) {
        Tessellator.bindTexture(texture);
        if (((TileBR_Modern_Buffer) var1).getDiagonalfacing()== 1 ||((TileBR_Modern_Buffer) var1).getDiagonalfacing()== 3 ||((TileBR_Modern_Buffer) var1).getDiagonalfacing()== 5 ||((TileBR_Modern_Buffer) var1).getDiagonalfacing()== 7)
            track = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_straight_diagonal.obj"));
        else
        track = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_normal.obj"));
        GL11.glPushMatrix();
        GL11.glTranslated(var2 +0.5 , var4+0.5, var6 +0.5);
        GL11.glRotated(180, 0, 1, 0);
        boolean skipRender = false;
        switch (((TileBR_Modern_Buffer) var1).getDiagonalfacing()) {
            case 0: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(90, 0, 1, 0);
                GL11.glTranslated(-0.05, -0.12f, 0);
                //System.out.println("N");

                break;
            }
            case 4: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(270, 0, 1, 0);
                GL11.glTranslated(-0.05, -0.12f, 0);
                //GL11.glTranslated(0.5, 0f, 0.5);
                //System.out.println("S");

                //GL11.glTranslated(0.1875, -1, 0.125);
                break;
            }
            case 2: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(180, 0, 1, 0);
                GL11.glTranslated(-0.05, -0.12f, 0);
                //System.out.println("E");

                //GL11.glTranslated(0.1875, -1, 0.125);
                break;
            }
            case 6: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(0, 0, 1, 0);
                GL11.glTranslatef(-0.05f,-0.12f, -0f);
                //System.out.println("W");
                //GL11.glTranslated(0.1875, -1, 0.125);
                break;
            }
            case 1: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(135, 0, 1, 0);
                GL11.glTranslatef(-0.05f,-0.12f, -0f);
                break;
            }
            case 3: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(225, 0, 1, 0);
                GL11.glTranslatef(-0.05f,-0.12f, -0f);
                break;
            }
            case 5: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(315, 0, 1, 0);
                GL11.glTranslatef(-0.05f,-0.12f, -0f);
                break;
            }
            case 7: {
                GL11.glRotated(180, 0, 0, 1);
                GL11.glRotated(45, 0, 1, 0);
                GL11.glTranslatef(-0.05f,-0.12f, -0f);
                break;
            }
            default: {
                skipRender = true;
            }
        }
        if (!skipRender) {
            modelBR_Modern_Buffer.render(0.0625F);
            GL11.glRotatef(180, 0, 0, 1);
            if (((TileBR_Modern_Buffer) var1).getDiagonalfacing()== 1 ||((TileBR_Modern_Buffer) var1).getDiagonalfacing()== 3 ||((TileBR_Modern_Buffer) var1).getDiagonalfacing()== 5 ||((TileBR_Modern_Buffer) var1).getDiagonalfacing()== 7){
                GL11.glRotatef(45, 0, 1, 0);
                GL11.glTranslatef(-0.534f,-0.62f, -0.534f);
            }
            else {
                GL11.glTranslatef(-0.05f, -0.62f, -0.0f);
                GL11.glRotatef(90, 0, 1, 0);
            }
            fexcraft.tmt.slim.Tessellator
                    .bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
            GL11.glColor4f(1, 1, 1, 1);
            track.renderAll();

        }
        GL11.glPopMatrix();

    }
}