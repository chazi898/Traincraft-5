/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;
import train.common.library.TraincraftRegistry;

public class CreativeTabBIPInfrastructure extends CreativeTabs {
    public Item tabItem;

    public CreativeTabBIPInfrastructure(String name, String MODID, String textureName) {
        super(CreativeTabs.getNextID(), name);
        tabItem= TraincraftRegistry.RegisterItem(new Item(),MODID,textureName,null);
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(ItemIDs.BR_Modern_Buffer.item);
    }

    @Override
    public String getTranslatedTabLabel() {
        return super.getTabLabel();
    }

    @Override
    public Item getTabIconItem() { return ItemIDs.BR_Modern_Buffer.item; }
}
