package mods.Periodicraft.item;

import mods.Periodicraft.Periodicraft;
import mods.Periodicraft.PeriodicraftTool;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;

public class ItemIceCutter extends PeriodicraftTool {

	public ItemIceCutter(int par1, int par2,
			EnumToolMaterial par3EnumToolMaterial, Block[] par4ArrayOfBlock) {
		super(par1, par2, par3EnumToolMaterial, par4ArrayOfBlock);
		this.setUnlocalizedName("IceCutter").setCreativeTab(Periodicraft.tabTools);
	}

	public static final Block[] blocksEffectiveAgainst = new Block[] {Block.ice, Block.pumpkin, Block.pumpkinLantern, Block.melon, Block.sponge};
}
