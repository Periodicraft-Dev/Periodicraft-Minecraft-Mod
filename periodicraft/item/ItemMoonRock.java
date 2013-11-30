package mods.periodicraft.item;

//Periodicraft Class
//Created By Jack Maloney on 3/12/2013
//Copyright (C)2013 Jack Maloney

import java.util.Random;

import mods.periodicraft.Periodicraft;
import mods.periodicraft.PeriodicraftItem;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMoonRock extends PeriodicraftItem {

	public ItemMoonRock(int par1) {
		super(par1);
		this.setCreativeTab(Periodicraft.tabMaterials).setMaxStackSize(64).setUnlocalizedName("MoonRock");
	}
}
