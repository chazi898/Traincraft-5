package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.blocks.BlockSignal;
import train.common.api.blocks.signals.TileSignal;
import train.common.library.Info;

import java.util.List;

public class ItemSignalConnector extends Item {

    Boolean isConnecting = false;
    TileSignal signal1;
    TileSignal signal2;
    String bipPrefix = EnumChatFormatting.GREEN + "B.I.P" +EnumChatFormatting.WHITE +  ": ";
    public ItemSignalConnector() {
        super();
        maxStackSize = 1;
        setCreativeTab(Traincraft.BIPInfrastructureTab);
    }
    Block block;
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":item_signal_connector");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List lore, boolean par4) {
        lore.add("\u00a77" + EnumChatFormatting.GOLD + "Use this to connect signals to each-other");
    }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
        if (!world.isRemote) {
            block = world.getBlock(x, y, z);
            //Check if the block is actually a signal.


            if (block instanceof BlockSignal && player.isSneaking()){
                if (!(signal1 == null)) {
                    signal1.setConnectingMode(false);
                    signal1.setIsConnected(false);
                }
                signal1 = null;
                signal2 = null;
                isConnecting = false;
                player.addChatMessage(new ChatComponentText(bipPrefix + "Connection reset."));
                return false;
            }

            if (block instanceof BlockSignal) {
                if (!isConnecting) {
                    //Assumed that it's the first signal we're touching.
                    //Clear out the Tile in the item data.
                    signal1 = null;
                    signal2 = null;
                    //Store the first block in the item data.
                    signal1 = (TileSignal) world.getTileEntity(x, y, z);
                    if (signal1.getIsConnected()){
                        return false;
                    }
                    signal1.setConnectingMode(true);
                    //set the item in connecting mode.
                    isConnecting = true;


                    player.addChatMessage(new ChatComponentText(bipPrefix +  "Enabled connecting mode for: " + EnumChatFormatting.GOLD + block.getLocalizedName() + EnumChatFormatting.WHITE + "."));
                    player.addChatMessage(new ChatComponentText(bipPrefix +  "Click on another signal to connect them together."));
                    return false;
                }
                else{
                    if (signal1 != null) {
                        if (signal1 == world.getTileEntity(x, y, z)) {
                            player.addChatMessage(new ChatComponentText(bipPrefix + "Connecting mode already enabled for: " + EnumChatFormatting.GOLD + block.getLocalizedName() + EnumChatFormatting.WHITE + "."));
                            return false;
                        }
                    signal2 = (TileSignal) world.getTileEntity(x, y, z);

                    signal1.setAheadSignal(signal2.xCoord, signal2.yCoord, signal2.zCoord);
                    signal1.setConnectingMode(false);
                    signal1.setIsConnected(true);
                    signal1 = null;
                    signal2 = null;
                    isConnecting = false;
                    player.addChatMessage(new ChatComponentText(bipPrefix + "Connected!"));


                    }

                    //else {
                        //player.addChatMessage();
                    //}

                }
            }
            else if (player.isSneaking()){
                if (!(signal1 == null)) signal1.setConnectingMode(false);
                if (!(signal2 == null)) signal2.setConnectingMode(false);
                signal1 = null;
                signal2 = null;
                isConnecting = false;
                player.addChatMessage(new ChatComponentText(bipPrefix + "Connection reset."));


            }

        }

    return false;
    }
}
