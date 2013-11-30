package mods.periodicraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mods.periodicraft.Periodicraft;
import mods.periodicraft.PeriodicraftItem;
import mods.periodicraft.item.weapon.projectile.EntityFireball;
import mods.periodicraft.item.weapon.projectile.EntityLaserPulse;

public class ItemLaserPulseRifle extends PeriodicraftItem {

	public ItemLaserPulseRifle(int par1) {
		super(par1);
		this.setUnlocalizedName("LaserPulseRifle").setCreativeTab(Periodicraft.tabWeapons);
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.consumeInventoryItem(Item.redstone.itemID))
        {

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityLaserPulse(par2World, par3EntityPlayer));
        }

        }
        return par1ItemStack;
    }

}
