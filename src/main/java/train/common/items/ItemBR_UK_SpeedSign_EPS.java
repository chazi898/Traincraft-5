package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBlock;
import train.common.Traincraft;
import train.common.library.Info;

public class ItemBR_UK_SpeedSign_EPS extends ItemBlock {

    public ItemBR_UK_SpeedSign_EPS(Block id) {
        super(id);
        maxStackSize = 64;
        setCreativeTab(Traincraft.BIPInfrastructureTab);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID + ":br_uk_speedsign");
    }

}
