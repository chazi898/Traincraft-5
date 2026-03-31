package train.client.render.renderSwitch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import train.client.render.renderSwitch.models.ModelBR_3_Aspect_Signal;
import train.common.library.Info;

public class ItemRenderBR_3_Aspect_Signal implements IItemRenderer {
    private static final ModelBR_3_Aspect_Signal modelSwitch = new ModelBR_3_Aspect_Signal();
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "BR_3_Aspect_Signal_Green.png");
    private Object IIconRegister;
    private Object IItemRenderer;
    private IIcon itemIcon;

    public ItemRenderBR_3_Aspect_Signal() {
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
        switch (type) {
            case ENTITY: {
                renderSwitch(0f, 0f, 0f, 1f);
                return;
            }
            case EQUIPPED: {
                renderSwitch(0.2f, 1f, 1f, 1f);
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderSwitch(0.2f, 0, 0.2f, 1f);
                return;
            }
            case INVENTORY: {
                renderSwitch(0f, 0f, 0f, 1f);

                return;
            }
            default:
                break;
        }
    }


    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":br_3_aspect_signal");
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
