package train.client.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelPlatform_Slab_10x10_Outside;
import train.common.library.Info;

public class ItemRenderPlatform_Slab_10x10_Outside implements IItemRenderer {
    private static final ModelPlatform_Slab_10x10_Outside modelSwitch = new ModelPlatform_Slab_10x10_Outside();
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "Platform_Slab_10x10_Outside.png");
    private Object IIconRegister;
    private Object IItemRenderer;
    private IIcon itemIcon;

    public ItemRenderPlatform_Slab_10x10_Outside() {
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
        Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Platform_Slab_10x10_Outside.png"));
        switch (type) {
            case ENTITY: {
                renderSwitch(0f, 0f, 0f, 1f);
                return;
            }
            case EQUIPPED: {
                GL11.glPushMatrix();
                GL11.glRotatef(0,1f,0f,0f);
                GL11.glRotatef(180,0f,1f,0f);
                renderSwitch(-1.2f, 0.5f, -1.0f, 0.45f);
                GL11.glPopMatrix();
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                GL11.glPushMatrix();
                GL11.glRotatef(-295,0.5f,2f,0f);
                GL11.glRotatef(125,0f,2.5f,0f);
                renderSwitch(-2f, 1.0f, -0.7f, 1.0f);
                GL11.glPopMatrix();
                return;
            }
            case INVENTORY: {
                GL11.glPushMatrix();
                GL11.glRotatef(90,0f,1f,0f);
                GL11.glRotatef(225,0f,1f,0f);
                renderSwitch(0.3f, -0.2f, 0.55f, 0.28f);
                GL11.glPopMatrix();

                return;
            }
            default:
                break;
        }
    }


    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":platform_slab");
    }

    /*
    public static ResourceLocation getTexture(Entity entity) {
        for (RenderEnum renders : RenderEnum.values()) {
            if (renders.getEntityClass() != null && renders.getEntityClass().equals(entity.getClass())) {
                texture = Info.modID
                return "texture.png";
            }
        }
        return null;
    }

     */

    private void renderSwitch(float x, float y, float z, float scale) {
        Tessellator.bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);

        GL11.glTranslatef(x, y, z);
        GL11.glScalef(scale, scale, scale);
        GL11.glRotated(180,0,0,1);
        GL11.glRotated(180,0,1,0);


        modelSwitch.render(null,0,0,0,0,0,0.0625f);

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }


}
