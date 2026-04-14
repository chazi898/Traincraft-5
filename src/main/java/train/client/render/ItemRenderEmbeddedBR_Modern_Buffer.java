/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelBR_Modern_Buffer;
import train.common.library.Info;

public class ItemRenderEmbeddedBR_Modern_Buffer implements IItemRenderer {
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_Modern_Buffer_Red.png");
    private static final ModelBR_Modern_Buffer BR_Modern_Buffer = new ModelBR_Modern_Buffer(1F);

    public ItemRenderEmbeddedBR_Modern_Buffer() {
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "BR_Modern_Buffer_Red.png"));
        switch (type) {
            case ENTITY: {
                renderEmbeddedBR_Modern_Buffer(0.0F, 0F, 0.0F, 0.0F);
                break;
            }
            case EQUIPPED: {
                GL11.glRotatef(180,3f,0f,0f);
                GL11.glTranslatef(0.4f, -1f, -0.5f);
                renderEmbeddedBR_Modern_Buffer(0.5F, -1.25F, -0.5F, 0.0F);
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                GL11.glRotatef(180,3f,0f,0f);
                GL11.glTranslatef(0.4f, -1f, -0.5f);
                renderEmbeddedBR_Modern_Buffer(0.1F, -1.25F, -0.5F, 0.0F);
                return;
            }
            case INVENTORY: {
                GL11.glRotatef(180,3f,0f,0f);
                GL11.glRotatef(180,0f,-1f,0f);
                renderEmbeddedBR_Modern_Buffer(1F, 0.65F, 1F, 0.0F);
                break;
            }
            default:
                break;
        }
    }

    private void renderEmbeddedBR_Modern_Buffer(float f, float g, float h, float rotation) {
        Tessellator.bindTexture(texture);
        GL11.glPushMatrix(); //start
        BR_Modern_Buffer.render(0.0625F);
        GL11.glTranslatef(f, g, h); //size
        GL11.glRotatef(rotation, f, g, h);
        GL11.glPopMatrix(); //end
    }
}
