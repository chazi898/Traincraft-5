package train.common.tile.tileSwitch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.api.blocks.TileRenderFacing;
import train.common.api.blocks.TileSwitch;
import train.common.blocks.blockSwitch.BlockoverheadWire;
import train.common.library.BlockIDs;
import train.common.api.blocks.TileTraincraft;
import train.common.tile.TileSwitchStand;

import java.util.Random;

public class TileoverheadWire extends TileSwitch {

    private int updateTicks = 0;
    private static Random rand = new Random();

    public TileoverheadWire(){}
    public TileoverheadWire(BlockoverheadWire block){
        host = block;
    }

    private int facingMeta;

    public TileoverheadWire(int metadata){

        this.facing = metadata;
    }

    public int getFacing(int facingMeta) {
        return facingMeta;
    }

    public void setFacing() {
        this.facingMeta = facing;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTag) {

        super.readFromNBT(nbtTag);

        facingMeta = nbtTag.getByte("Orientation");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTag) {

        super.writeToNBT(nbtTag);

        nbtTag.setByte("Orientation", (byte) facingMeta);
    }

    public S35PacketUpdateTileEntity getDescriptionPacket() {

        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);

        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt){
        this.readFromNBT(pkt.func_148857_g());
        super.onDataPacket(net, pkt);
    }

    @Override
    public void updateEntity() {
        super.updateEntity();
        updateTicks++;

        /**
         * Remove any block on top of the wind mill
         */
        if (!worldObj.isRemote) {
            if (updateTicks % 20 == 0) {
                if (!this.worldObj.isAirBlock(this.xCoord, this.yCoord + 1, this.zCoord)) {
                    Block block = this.worldObj.getBlock(this.xCoord, this.yCoord + 1, this.zCoord);
                    if (block != null) {
                        EntityItem entityitem = new EntityItem(worldObj, this.xCoord, this.yCoord + 1, this.zCoord, new ItemStack(Item.getItemFromBlock(BlockIDs.owoSwitchStand.block), 1));
                        float f3 = 0.05F;
                        entityitem.motionX = (float) rand.nextGaussian() * f3;
                        entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
                        entityitem.motionZ = (float) rand.nextGaussian() * f3;
                        worldObj.spawnEntityInWorld(entityitem);
                    }
                    this.worldObj.setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
                }
                syncTileEntity();
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return AxisAlignedBB.getBoundingBox(xCoord - 1, yCoord - 1, zCoord - 1, xCoord + 2, yCoord + 2, zCoord + 2);
    }
}
