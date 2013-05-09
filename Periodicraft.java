package mods.Periodicraft;

//Periodicraft Class
//Copyright (C)2013 Jack Maloney

import java.util.logging.Level;

import mods.Periodicraft.biome.BiomeWoodland;
import mods.Periodicraft.block.BlockBlueStone;
import mods.Periodicraft.block.BlockCompressedWood;
import mods.Periodicraft.block.BlockInflatableHouseDecor;
import mods.Periodicraft.block.BlockManganeseCrystal;
import mods.Periodicraft.block.BlockMoonStone;
import mods.Periodicraft.block.BlockPureSteelBlock;
import mods.Periodicraft.block.BlockSiliconSand;
import mods.Periodicraft.block.BlockSteelBlock;
import mods.Periodicraft.block.ore.BlockAluminumOre;
import mods.Periodicraft.block.ore.BlockBerylliumOre;
import mods.Periodicraft.block.ore.BlockBoronOre;
import mods.Periodicraft.block.ore.BlockCarbonOre;
import mods.Periodicraft.block.ore.BlockChromiumOre;
import mods.Periodicraft.block.ore.BlockCobaltOre;
import mods.Periodicraft.block.ore.BlockCopperOre;
import mods.Periodicraft.block.ore.BlockCuriumOre;
import mods.Periodicraft.block.ore.BlockFireStoneOre;
import mods.Periodicraft.block.ore.BlockHafniumOre;
import mods.Periodicraft.block.ore.BlockLithiumOre;
import mods.Periodicraft.block.ore.BlockMagnesiumOre;
import mods.Periodicraft.block.ore.BlockManganeseOre;
import mods.Periodicraft.block.ore.BlockNeodymiumOre;
import mods.Periodicraft.block.ore.BlockNickelOre;
import mods.Periodicraft.block.ore.BlockPhosphorusOre;
import mods.Periodicraft.block.ore.BlockPlatinumOre;
import mods.Periodicraft.block.ore.BlockPoloniumOre;
import mods.Periodicraft.block.ore.BlockRutheniumOre;
import mods.Periodicraft.block.ore.BlockScandiumOre;
import mods.Periodicraft.block.ore.BlockSilverOre;
import mods.Periodicraft.block.ore.BlockSodiumOre;
import mods.Periodicraft.block.ore.BlockSulfurOre;
import mods.Periodicraft.block.ore.BlockTinOre;
import mods.Periodicraft.block.ore.BlockTitaniumOre;
import mods.Periodicraft.block.ore.BlockTungstenOre;
import mods.Periodicraft.block.ore.BlockVanadiumOre;
import mods.Periodicraft.block.ore.BlockZincOre;
import mods.Periodicraft.dimension.moon.BlockMoonPortal;
import mods.Periodicraft.dimension.moon.WorldProviderMoon;
import mods.Periodicraft.entity.mob.EntityAlienScientist;
import mods.Periodicraft.entity.mob.EntityMoonMan;
import mods.Periodicraft.item.ItemAluminumIngot;
import mods.Periodicraft.item.ItemBanana;
import mods.Periodicraft.item.ItemBerylliumIngot;
import mods.Periodicraft.item.ItemBlueStoneGem;
import mods.Periodicraft.item.ItemBlueStoneShard;
import mods.Periodicraft.item.ItemBoronDust;
import mods.Periodicraft.item.ItemBronzeDust;
import mods.Periodicraft.item.ItemCarbonDust;
import mods.Periodicraft.item.ItemChromiumIngot;
import mods.Periodicraft.item.ItemCobaltIngot;
import mods.Periodicraft.item.ItemCopperAxe;
import mods.Periodicraft.item.ItemCopperDust;
import mods.Periodicraft.item.ItemCopperHoe;
import mods.Periodicraft.item.ItemCopperIngot;
import mods.Periodicraft.item.ItemCopperNugget;
import mods.Periodicraft.item.ItemCopperPickaxe;
import mods.Periodicraft.item.ItemCopperShovel;
import mods.Periodicraft.item.ItemHafniumIngot;
import mods.Periodicraft.item.ItemIceCutter;
import mods.Periodicraft.item.ItemInflatableHouse;
import mods.Periodicraft.item.ItemLaserPulseRifle;
import mods.Periodicraft.item.ItemLithiumShard;
import mods.Periodicraft.item.ItemMagnesiumShard;
import mods.Periodicraft.item.ItemMatch;
import mods.Periodicraft.item.ItemMiningLaser;
import mods.Periodicraft.item.ItemMoonRock;
import mods.Periodicraft.item.ItemMoonRocket;
import mods.Periodicraft.item.ItemNeodymiumIngot;
import mods.Periodicraft.item.ItemNeodymiumMagnet;
import mods.Periodicraft.item.ItemNickelIngot;
import mods.Periodicraft.item.ItemPhosphorusShard;
import mods.Periodicraft.item.ItemPlatinumAlloy;
import mods.Periodicraft.item.ItemPlatinumAxe;
import mods.Periodicraft.item.ItemPlatinumHoe;
import mods.Periodicraft.item.ItemPlatinumIngot;
import mods.Periodicraft.item.ItemPlatinumPickaxe;
import mods.Periodicraft.item.ItemPoloniumShard;
import mods.Periodicraft.item.ItemRutheniumIngot;
import mods.Periodicraft.item.ItemScandiumIngot;
import mods.Periodicraft.item.ItemSiliconPlate;
import mods.Periodicraft.item.ItemSiliconShard;
import mods.Periodicraft.item.ItemSilverFragments;
import mods.Periodicraft.item.ItemSilverIngot;
import mods.Periodicraft.item.ItemSodiumDust;
import mods.Periodicraft.item.ItemSteelAlloy;
import mods.Periodicraft.item.ItemSteelIngot;
import mods.Periodicraft.item.ItemSulfurShard;
import mods.Periodicraft.item.ItemTinDust;
import mods.Periodicraft.item.ItemTinIngot;
import mods.Periodicraft.item.ItemTinNugget;
import mods.Periodicraft.item.ItemTitaniumArmor;
import mods.Periodicraft.item.ItemTitaniumAxe;
import mods.Periodicraft.item.ItemTitaniumHoe;
import mods.Periodicraft.item.ItemTitaniumIngot;
import mods.Periodicraft.item.ItemTitaniumPickaxe;
import mods.Periodicraft.item.ItemTitaniumShovel;
import mods.Periodicraft.item.ItemTungstenAxe;
import mods.Periodicraft.item.ItemTungstenHoe;
import mods.Periodicraft.item.ItemTungstenIngot;
import mods.Periodicraft.item.ItemTungstenPickaxe;
import mods.Periodicraft.item.ItemTungstenShovel;
import mods.Periodicraft.item.ItemVanadiumAlloy;
import mods.Periodicraft.item.ItemVanadiumIngot;
import mods.Periodicraft.item.ItemZincDust;
import mods.Periodicraft.item.weapon.ItemCopperSword;
import mods.Periodicraft.item.weapon.ItemFlameThrower;
import mods.Periodicraft.item.weapon.ItemPistol;
import mods.Periodicraft.item.weapon.ItemSteelSword;
import mods.Periodicraft.item.weapon.ItemTitaniumSword;
import mods.Periodicraft.item.weapon.ItemTungstenSword;
import mods.Periodicraft.item.weapon.projectile.ItemBullet;
import mods.Periodicraft.item.weapon.projectile.ItemFireball;
import mods.Periodicraft.item.weapon.projectile.ItemFlare;
import mods.Periodicraft.item.weapon.projectile.ItemFlareGun;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="Periodicraft", name="Periodicraft", version="Alpha 1.0.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Periodicraft {
	
	//Creative Tabs
	
	public static CreativeTabs tabTools = new CreativeTabs("tabTools") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Periodicraft.TitaniumPickaxe, 1, 0);
        }
	};
	
	public static CreativeTabs tabArmor = new CreativeTabs("tabArmor") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Periodicraft.TitaniumChest, 1, 0);
        }
	};
	
	public static CreativeTabs tabBlocks = new CreativeTabs("tabBlocks") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Periodicraft.TitaniumOre, 1, 0);
        }
	};
	
	public static CreativeTabs tabMaterials = new CreativeTabs("tabMaterials") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Periodicraft.MoonRock, 1, 0);
        }
	};
	
	public static CreativeTabs tabFood = new CreativeTabs("tabFood") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Periodicraft.Banana, 1, 0);
        }
	};
	
	public static CreativeTabs tabWeapons = new CreativeTabs("tabWeapons") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Periodicraft.TitaniumSword, 1, 0);
        }
	};
	
	public static CreativeTabs tabSpace = new CreativeTabs("tabSpace") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Periodicraft.TitaniumSword, 1, 0);
        }
	};
	
	public static CreativeTabs tabUtility = new CreativeTabs("tabUtility") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Periodicraft.TitaniumSword, 1, 0);
        }
	};
	

	
	
	//Demensions
	public static final int MoonID = 100;
	public static final int MarsID = 101;
	public static final int VenusID = 102;
	public static final int MercuryID = 103;
	public static final int EuropaID = 104;
	public static final int IoID = 105;
	public static final int TitanID = 106;
	public static final int EnceladusID = 107;
	public static final int TitaniaID = 108;
	public static final int PlutoID = 109;
	public static final int CharonID = 110;
	
	
	//Blocks
	public static final Block CopperOre = new BlockCopperOre(ID.id(), 190, Material.rock);
	public static final Block CarbonOre = new BlockCarbonOre(ID.id(), 42, Material.rock);
	public static final Block TungstenOre = new BlockTungstenOre(ID.id(), 27, Material.rock);
	public static final Block PlatinumOre = new BlockPlatinumOre(ID.id(), 189, Material.rock);
	public static final Block TitaniumOre = new BlockTitaniumOre(ID.id(), 187, Material.rock);
	public static final Block NeodymiumOre = new BlockNeodymiumOre(ID.id(), 191, Material.rock);
	public static final Block MoonStone = new BlockMoonStone(ID.id(), Material.sand);
	public static final Block BlueStone = new BlockBlueStone(ID.id(), 18, Material.rock);
	public static final Block TinOre = new BlockTinOre(ID.id(), 000, Material.rock);
	public static final Block BerylliumOre = new BlockBerylliumOre(ID.id(), Material.rock);
	public static final Block LithiumOre = new BlockLithiumOre(ID.id(), Material.rock);
	public static final Block NickelOre = new BlockNickelOre(ID.id(), Material.rock);
	public static final Block SilverOre = new BlockSilverOre(ID.id(), Material.rock);
	public static final Block SiliconSand = new BlockSiliconSand(ID.id(), Material.sand);
	public static final Block PoloniumOre = new BlockPoloniumOre(ID.id(), Material.rock);
	public static final Block AluminumOre = new BlockAluminumOre(ID.id(), Material.rock);
	public static final Block MagnesiumOre = new BlockMagnesiumOre(ID.id(), Material.rock);
	public static final Block SodiumOre = new BlockSodiumOre(ID.id(), Material.rock);
	public static final Block PhosphorusOre = new BlockPhosphorusOre(ID.id(), Material.rock);
	public static final Block SulfurOre = new BlockSulfurOre(ID.id(), Material.rock);
	public static final Block ScandiumOre = new BlockScandiumOre(ID.id(), Material.rock);
	public static final Block VanadiumOre = new BlockVanadiumOre(ID.id(), Material.rock);
	public static final Block BoronOre = new BlockBoronOre(ID.id(), Material.rock);
	public static final Block ChromiumOre = new BlockChromiumOre(ID.id(), Material.rock);
	public static final Block ManganeseOre = new BlockManganeseOre(ID.id(), Material.rock);
	public static final Block CobaltOre = new BlockCobaltOre(ID.id(), Material.rock);
	public static final Block ZincOre = new BlockZincOre(ID.id(), Material.rock);
	public final static Item CopperIngot = new ItemCopperIngot(ID.id());
	public final static Item CarbonDust = new ItemCarbonDust(ID.id());
	public final static Item TitaniumIngot = new ItemTitaniumIngot(ID.id());
	public final static Item MagnesiumShard = new ItemMagnesiumShard(ID.id());
	public final static Item TitaniumPickaxe = new ItemTitaniumPickaxe(ID.id(), EnumPeriodicraftToolMaterial.TITANIUM);
	public final static Item TitaniumSword = new ItemTitaniumSword(ID.id(), EnumPeriodicraftToolMaterial.TITANIUM);
	public final static Item TitaniumAxe = new ItemTitaniumAxe(ID.id(), EnumPeriodicraftToolMaterial.TITANIUM);
	public static final Item TitaniumHoe = new ItemTitaniumHoe(ID.id(), EnumPeriodicraftToolMaterial.TITANIUM);
	public static final Item TitaniumShovel = new ItemTitaniumShovel(ID.id(), EnumPeriodicraftToolMaterial.TITANIUM);
	public final static Item MoonRock = new ItemMoonRock(ID.id());
	public final static Item BlueStoneShard = new ItemBlueStoneShard(ID.id());
	public final static Item BlueStoneGem = new ItemBlueStoneGem(ID.id());
	public final static Item TitaniumHelm = new ItemTitaniumArmor(ID.id(), EnumArmorMaterial.TITANIUM, 2, 0, "TitaniumHelm");
	public final static Item TitaniumChest = new ItemTitaniumArmor(ID.id(), EnumArmorMaterial.TITANIUM, 2, 1, "TitaniumChest");
	public final static Item TitaniumLegs = new ItemTitaniumArmor(ID.id(), EnumArmorMaterial.TITANIUM, 2, 2, "TitaniumLegs");
	public final static Item TitaniumBoots = new ItemTitaniumArmor(ID.id(), EnumArmorMaterial.TITANIUM, 2, 3, "TitaniumBoots");
	public final static Item CopperNugget = new ItemCopperNugget(ID.id());
	public final static Item CopperDust = new ItemCopperDust(ID.id());
	public final static Item TinIngot = new ItemTinIngot(ID.id());
	public final static Item TinNugget = new ItemTinNugget(ID.id());
	public final static Item TinDust = new ItemTinDust(ID.id());
	public final static Item BronzeDust = new ItemBronzeDust(ID.id());
	public final static Item IceCutter = new ItemIceCutter(ID.id(), 2, EnumPeriodicraftToolMaterial.IRON, ItemIceCutter.blocksEffectiveAgainst);
	public final static Item Banana = new ItemBanana(ID.id());
	public static final Item LithiumShards = new ItemLithiumShard(ID.id());
	public static final Item SteelIngot = new ItemSteelIngot(ID.id());
	public static final Item NickelIngot = new ItemNickelIngot(ID.id());
	public static final Item SilverFragments = new ItemSilverFragments(ID.id());
	public static final Item TungstenIngot = new ItemTungstenIngot(ID.id());
	public static final Item TungstenSword = new ItemTungstenSword(ID.id(), EnumPeriodicraftToolMaterial.TUNGSTEN);
	public static final Item SiliconShard = new ItemSiliconShard(ID.id());
	public static final Item SiliconPlate = new ItemSiliconPlate(ID.id());
	public static final Item SodiumDust = new ItemSodiumDust(ID.id());
	public static final Item PhosphorusShard = new ItemPhosphorusShard(ID.id());
	public static final Item ZincDust = new ItemZincDust(ID.id());
	public static final Item BerylliumIngot = new ItemBerylliumIngot(ID.id());
	public static final Item ChromiumIngot = new ItemChromiumIngot(ID.id());
	public static final Item CobaltIngot = new ItemCobaltIngot(ID.id());
	public static final Block ManganeseCrystal = new BlockManganeseCrystal(ID.id());
	public static final Item NeodymiumIngot = new ItemNeodymiumIngot(ID.id());
	public static final Item PlatinumIngot = new ItemPlatinumIngot(ID.id());
	public static final Item ScandiumIngot = new ItemScandiumIngot(ID.id());
	public static final Item VanadiumIngot = new ItemVanadiumIngot(ID.id());
	public static final Item SulfurShard = new ItemSulfurShard(ID.id());
	public static final Item SilverIngot = new ItemSilverIngot(ID.id());
	public static final Item AluiminumIngot = new ItemAluminumIngot(ID.id());
	public static final Item BoronDust = new ItemBoronDust(ID.id());
	public static final Item PoloniumShard = new ItemPoloniumShard(ID.id());
	public static final Item Pistol = new ItemPistol(ID.id());
	public static final Item Bullet = new ItemBullet(ID.id());
	public static final Item FlareGun = new ItemFlareGun(ID.id());
	public static final Item Flare = new ItemFlare(ID.id());
	public static final Item CopperPickaxe = new ItemCopperPickaxe(ID.id(), EnumPeriodicraftToolMaterial.COPPER);
	public static final Item CopperSword = new ItemCopperSword(ID.id(), EnumPeriodicraftToolMaterial.COPPER);
	public static final Item CopperShovel = new ItemCopperShovel(ID.id(), EnumPeriodicraftToolMaterial.COPPER);
	public static final Item CopperAxe = new ItemCopperAxe(ID.id(), EnumPeriodicraftToolMaterial.COPPER);
	public static final Item CopperHoe = new ItemCopperHoe(ID.id(), EnumPeriodicraftToolMaterial.COPPER);
	public static final Item SteelAlloy = new ItemSteelAlloy(ID.id());
	public static final Item VanadiumAlloy = new ItemVanadiumAlloy(ID.id());
	public static final Item NeodymiumMagnet = new ItemNeodymiumMagnet(ID.id());
	public static final Item TungstenPickaxe = new ItemTungstenPickaxe(ID.id(), EnumPeriodicraftToolMaterial.TUNGSTEN);
	public static final Item TungstenHoe = new ItemTungstenHoe(ID.id(), EnumPeriodicraftToolMaterial.TUNGSTEN);
	public static final Item TungstenAxe = new ItemTungstenAxe(ID.id(), EnumPeriodicraftToolMaterial.TUNGSTEN);
	public static final Item TungstenShovel = new ItemTungstenShovel(ID.id(), EnumPeriodicraftToolMaterial.TUNGSTEN);
	public static final Block SteelBlock = new BlockSteelBlock(ID.id(), Material.iron);
	public static final Item SteelSword = new ItemSteelSword(ID.id(), EnumPeriodicraftToolMaterial.STEELSWORD);
	public static final Block PureSteelBlock = new BlockPureSteelBlock(ID.id(), Material.iron);
	public static final Block FireStoneOre = new BlockFireStoneOre(ID.id(), Material.rock);
	public static final Block CuriumOre = new BlockCuriumOre(ID.id(), Material.rock);
	public static final Item Match = new ItemMatch(ID.id());
	public static final Item FlameThrower = new ItemFlameThrower(ID.id());
	public static final Item Fireball = new ItemFireball(ID.id());
	public static final Block HafniumOre = new BlockHafniumOre(ID.id(), Material.rock);
	public static final Item LaserPulseRifle = new ItemLaserPulseRifle(ID.id());
	public static final Item MiningLaser = new ItemMiningLaser(ID.id(), 3, EnumPeriodicraftToolMaterial.IRON, null);
	public static final Item MoonRocket = new ItemMoonRocket(ID.id());
	public static final Block MoonPortal = new BlockMoonPortal(ID.id());
	public static final Item InflatableHouse = new ItemInflatableHouse(ID.id());
	public static final Block CompressedWood = new BlockCompressedWood(ID.id(), Material.wood);
	public static final Block InflatableHouseDecor = new BlockInflatableHouseDecor(ID.id(), Material.wood);
	public static final Item HafniumIngot = new ItemHafniumIngot(ID.id());
	public static final Block RutheniumOre = new BlockRutheniumOre(ID.id(), Material.rock);
	public static final Item RuthinumIngot = new ItemRutheniumIngot(ID.id());
	public static final Item PlatinumAlloy = new ItemPlatinumAlloy(ID.id());
	public static final Item PlatinumPickaxe = new ItemPlatinumPickaxe(ID.id(), EnumPeriodicraftToolMaterial.PLATINUM);
	public static final Item PlatinumHoe = new ItemPlatinumHoe(ID.id(), EnumPeriodicraftToolMaterial.PLATINUM);
	public static final Item PlatinumAxe = new ItemPlatinumAxe(ID.id(), EnumPeriodicraftToolMaterial.PLATINUM);
	
	//Mobs/Entitys
	int MoonManID = ID.eID();
	int AlienScientistID = ID.eID();  
	
	
	
	// The instance of your mod that Forge uses.
    @Instance("Periodicraft")
    public static Periodicraft instance;
    
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="mods.Periodicraft.client.ClientProxy", serverSide="mods.Periodicraft.CommonProxy")
    public static CommonProxy proxy;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    	FMLLog.log(Level.INFO ,"=======================================================Pre-Initalizing Periodicraft=======================================================");
    }
    
    @Init
    public void load(FMLInitializationEvent event) {
    	
    	proxy.registerRenderers();
    	
    	FMLLog.log(Level.INFO, "=======================================================Initalizing Periodicraft=======================================================");
    	
    	//Biomes
    	
    	GameRegistry.addBiome(BiomeWoodland.Woodland);
    	BiomeDictionary.registerBiomeType(BiomeWoodland.Woodland, Type.FOREST, Type.PLAINS);
    	
    	//Mobs
    	EntityRegistry.registerModEntity(EntityMoonMan.class, "MoonMan", MoonManID, this, 80, 3, true);
    	EntityRegistry.addSpawn(EntityMoonMan.class, 15, 5, 10, EnumCreatureType.monster, BiomeGenBase.extremeHills, BiomeGenBase.jungle, BiomeGenBase.desert, BiomeGenBase.iceMountains);
    	LanguageRegistry.instance().addStringLocalization("entity.Periodicraft.MoonMan.name", "Moon Man");
    	Egg(EntityMoonMan.class, ID.id(),0x000000, 0x515C66);
    	
    	EntityRegistry.registerModEntity(EntityAlienScientist.class, "AlienScientist", ID.eID(), this, 30, 2, true);
    	EntityRegistry.addSpawn(EntityAlienScientist.class, 2, 2, 5, EnumCreatureType.monster, BiomeGenBase.jungle, BiomeGenBase.extremeHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.iceMountains);
    	LanguageRegistry.instance().addStringLocalization("entity.Periodicraft.AlienScientist.name", "Alien Scientist");
    	Egg(EntityAlienScientist.class, ID.id(), 0x095C16, 0xDEB845);
    	
    	//CreativeTabs
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabArmor", "en_US", "Armor");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabTools", "en_US", "Tools");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabElements", "en_US", "Elements");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabFood", "en_US", "Food");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabBlocks", "en_US", "Blocks");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabMaterials", "en_US", "Materials");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabWeapons", "en_US", "Weapons");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabSpace", "en_US", "Space Travel");
    	
    	//Demensions
    	DimensionManager.registerProviderType(MoonID, WorldProviderMoon.class, false);
    	DimensionManager.registerDimension(MoonID, MoonID);
    	
    	//plants
    	
    	//Ore Gen
    	GameRegistry.registerWorldGenerator(new PeriodicraftWorldGenerator());
    	
    	//Blocks
    	LanguageRegistry.addName(InflatableHouseDecor, "Inflatable House Decorations");
    	MinecraftForge.setBlockHarvestLevel(InflatableHouseDecor, "axe", 0);
    	GameRegistry.registerBlock(InflatableHouseDecor, "InflatableHouseDecor");
    	
    	LanguageRegistry.addName(CompressedWood, "Compressed Wood");
    	MinecraftForge.setBlockHarvestLevel(CompressedWood, "axe", 0);
    	GameRegistry.registerBlock(CompressedWood, "CompressedWood");
    	
    	LanguageRegistry.addName(MoonPortal, "Moon Portal");
    	GameRegistry.registerBlock(MoonPortal, "MoonPortal");
    	
    	LanguageRegistry.addName(HafniumOre, "Hafnium Ore");
    	MinecraftForge.setBlockHarvestLevel(HafniumOre, "pickaxe", 3);
    	GameRegistry.registerBlock(HafniumOre, "HafniumOre");
    	
    	LanguageRegistry.addName(CuriumOre, "Curium Ore");
    	MinecraftForge.setBlockHarvestLevel(CuriumOre, "pickaxe", 3);
    	GameRegistry.registerBlock(CuriumOre, "CuriumOre");
    	
    	LanguageRegistry.addName(ZincOre, "Zinc Ore");
    	MinecraftForge.setBlockHarvestLevel(ZincOre, "pickaxe", 2);
    	GameRegistry.registerBlock(ZincOre, "ZincOre");
    	
    	LanguageRegistry.addName(CobaltOre, "Cobalt Ore");
    	MinecraftForge.setBlockHarvestLevel(CobaltOre, "pickaxe", 2);
    	GameRegistry.registerBlock(CobaltOre, "CobaltOre");
    	
    	LanguageRegistry.addName(ManganeseOre, "Manganese Ore");
    	MinecraftForge.setBlockHarvestLevel(ManganeseOre, "pickaxe", 2);
    	GameRegistry.registerBlock(ManganeseOre, "ManganeseOre");
    	
    	LanguageRegistry.addName(ChromiumOre, "Chromium Ore");
    	MinecraftForge.setBlockHarvestLevel(ChromiumOre, "pickaxe", 2);
    	GameRegistry.registerBlock(ChromiumOre, "ChromiumOre");
    	
    	LanguageRegistry.addName(CopperOre, "Copper Ore");
    	MinecraftForge.setBlockHarvestLevel(CopperOre, "pickaxe", 1);
    	GameRegistry.registerBlock(CopperOre, "CopperOre");
    	
    	LanguageRegistry.addName(CarbonOre, "Carbon Ore");
    	MinecraftForge.setBlockHarvestLevel(CarbonOre, "pickaxe", 1);
    	GameRegistry.registerBlock(CarbonOre, "CarbonOre");
    	
    	LanguageRegistry.addName(TungstenOre, "Tungsten Ore");
    	MinecraftForge.setBlockHarvestLevel(TungstenOre, "pickaxe", 2);
    	GameRegistry.registerBlock(TungstenOre, "TungstenOre");
    	
    	LanguageRegistry.addName(PlatinumOre, "Platinum Ore");
    	MinecraftForge.setBlockHarvestLevel(PlatinumOre, "pickaxe", 2);
    	GameRegistry.registerBlock(PlatinumOre, "PlatinumOre");
    	
    	LanguageRegistry.addName(TitaniumOre, "Titanium Ore");
    	MinecraftForge.setBlockHarvestLevel(TitaniumOre, "pickaxe", 3);
    	GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
    		
    	LanguageRegistry.addName(NeodymiumOre, "Neodymium Ore");
    	MinecraftForge.setBlockHarvestLevel(NeodymiumOre, "pickaxe", 2);
    	GameRegistry.registerBlock(NeodymiumOre, "NeodymiumOre");

    	LanguageRegistry.addName(MoonStone, "Moon Stone");
    	MinecraftForge.setBlockHarvestLevel(MoonStone, "pickaxe", 3);
    	GameRegistry.registerBlock(MoonStone, "MoonStone");
    	
    	LanguageRegistry.addName(BlueStone, "Blue Stone");
    	MinecraftForge.setBlockHarvestLevel(BlueStone, "pickaxe", 2);
    	GameRegistry.registerBlock(BlueStone, "BlueStone");
    	
    	LanguageRegistry.addName(BerylliumOre, "Beryllium Ore");
    	MinecraftForge.setBlockHarvestLevel(BerylliumOre, "pickaxe", 3);
    	GameRegistry.registerBlock(BerylliumOre, "BerylliumOre");
    	
    	LanguageRegistry.addName(LithiumOre, "Lithium Ore");
    	MinecraftForge.setBlockHarvestLevel(LithiumOre, "pickaxe", 1);
    	GameRegistry.registerBlock(LithiumOre, "LithiumOre");
    		
    	LanguageRegistry.addName(NickelOre, "Nickel Ore");
    	MinecraftForge.setBlockHarvestLevel(NickelOre, "pickaxe", 2);
    	GameRegistry.registerBlock(NickelOre, "NickelOre");
    		
    	LanguageRegistry.addName(SilverOre, "Silver Ore");
    	MinecraftForge.setBlockHarvestLevel(SilverOre, "pickaxe", 2);
    	GameRegistry.registerBlock(SilverOre, "SilverOre");
			
    	LanguageRegistry.addName(SiliconSand, "Silicon Sand");
    	MinecraftForge.setBlockHarvestLevel(SiliconSand, "shovel", 2);
    	GameRegistry.registerBlock(SiliconSand, "SiliconSand");
    	
    	LanguageRegistry.addName(PoloniumOre, "Polonium Ore");
    	MinecraftForge.setBlockHarvestLevel(PoloniumOre, "pickaxe", 4);
    	GameRegistry.registerBlock(PoloniumOre, "PoloniumOre");
    	
        LanguageRegistry.addName(AluminumOre, "Aluminum Ore");
        MinecraftForge.setBlockHarvestLevel(AluminumOre, "pickaxe", 2);
        GameRegistry.registerBlock(AluminumOre, "AluminumOre");
    	
    	LanguageRegistry.addName(MagnesiumOre, "Magnesium Ore");
    	MinecraftForge.setBlockHarvestLevel(MagnesiumOre, "pickaxe", 2);
    	GameRegistry.registerBlock(MagnesiumOre, "MagnesiumOre");
    	
    	LanguageRegistry.addName(SodiumOre, "Sodium Ore");
    	MinecraftForge.setBlockHarvestLevel(SodiumOre, "pickaxe", 1);
    	GameRegistry.registerBlock(SodiumOre, "SodiumOre");
    	
    	LanguageRegistry.addName(PhosphorusOre, "Phosphorus Ore");
    	MinecraftForge.setBlockHarvestLevel(PhosphorusOre, "pickaxe", 2);
    	GameRegistry.registerBlock(PhosphorusOre, "PhosphorusOre");
    	
    	LanguageRegistry.addName(SulfurOre, "Sulfur Ore");
    	MinecraftForge.setBlockHarvestLevel(SulfurOre, "pickaxe", 1);
    	GameRegistry.registerBlock(SulfurOre, "SulfurOre");
    	
    	LanguageRegistry.addName(ScandiumOre, "Scandium Ore");
    	MinecraftForge.setBlockHarvestLevel(ScandiumOre, "pickaxe", 2);
    	GameRegistry.registerBlock(ScandiumOre, "ScandiumOre");
    	
    	LanguageRegistry.addName(VanadiumOre, "Vanadium Ore");
    	MinecraftForge.setBlockHarvestLevel(VanadiumOre, "pickaxe", 3);
    	GameRegistry.registerBlock(VanadiumOre, "VanadiumOre");
    	
    	LanguageRegistry.addName(BoronOre, "Boron Ore");
    	MinecraftForge.setBlockHarvestLevel(BoronOre, "pickaxe", 1);
    	GameRegistry.registerBlock(BoronOre, "BoronOre");
    	
    	LanguageRegistry.addName(SteelBlock, "Steel Block");
    	MinecraftForge.setBlockHarvestLevel(SteelBlock, "pickaxe", 2);
    	GameRegistry.registerBlock(SteelBlock, "SteelBlock");
    	
    	LanguageRegistry.addName(PureSteelBlock, "Purified Steel Block");
    	MinecraftForge.setBlockHarvestLevel(PureSteelBlock, "pickaxe", 2);
    	GameRegistry.registerBlock(PureSteelBlock, "PureSteelBlock");
    	
    	LanguageRegistry.addName(TinOre, "Tin Ore");
    	MinecraftForge.setBlockHarvestLevel(TinOre, "pickaxe", 2);
    	GameRegistry.registerBlock(TinOre, "TinOre");
    	
    	LanguageRegistry.addName(FireStoneOre, "Fire Stone Ore");
    	MinecraftForge.setBlockHarvestLevel(FireStoneOre, "pickaxe", 3);
    	GameRegistry.registerBlock(FireStoneOre, "FireStoneOre");
    	
    	LanguageRegistry.addName(RutheniumOre, "Ruthenium Ore");
    	MinecraftForge.setBlockHarvestLevel(RutheniumOre, "pickaxe", 3);
    	GameRegistry.registerBlock(RutheniumOre, "RutheniumOre");
    	
    	//Items
    	LanguageRegistry.addName(LaserPulseRifle, "Laser Pulse Rifle");
    	LanguageRegistry.addName(PoloniumShard, "Polonium Shard");
    	LanguageRegistry.addName(BoronDust, "Boron Dust");
    	LanguageRegistry.addName(AluiminumIngot, "Aluminum Ingot");
    	LanguageRegistry.addName(SilverIngot, "Silver Ingot");
    	LanguageRegistry.addName(SulfurShard, "Sulfur Shards");
    	LanguageRegistry.addName(ScandiumIngot, "Scandium Ingot");
    	LanguageRegistry.addName(PlatinumIngot, "Platinum Ingot");
    	LanguageRegistry.addName(ManganeseCrystal, "Manganese Crystal");
    	LanguageRegistry.addName(ChromiumIngot, "Chromium Ingot");
    	LanguageRegistry.addName(BerylliumIngot, "Beryllium Ingot");
    	LanguageRegistry.addName(CobaltIngot, "Cobalt Ingot");
    	LanguageRegistry.addName(CopperIngot, "Copper Ingot");
    	LanguageRegistry.addName(CarbonDust, "Carbon Dust");
    	LanguageRegistry.addName(TitaniumIngot, "Titanium Ingot");
    	LanguageRegistry.addName(MagnesiumShard, "Magnesium Shard");
    	LanguageRegistry.addName(TitaniumPickaxe, "Titanium Pickaxe");
    	LanguageRegistry.addName(TitaniumSword, "Titanium Sword");
    	LanguageRegistry.addName(TitaniumAxe, "Titanium Axe");
    	LanguageRegistry.addName(TitaniumHoe, "Titanium Hoe");
    	LanguageRegistry.addName(TitaniumShovel, "Titanium Shovel");
    	LanguageRegistry.addName(TitaniumHelm, "Titanium Helmet");
    	LanguageRegistry.addName(TitaniumChest, "Titanium Chestplate");
    	LanguageRegistry.addName(TitaniumLegs, "Titanium Leggings");
    	LanguageRegistry.addName(TitaniumBoots, "Titanium Boots");
    	LanguageRegistry.addName(MoonRock, "Moon Rock");
    	LanguageRegistry.addName(BlueStoneGem, "BlueStone Gem");
    	LanguageRegistry.addName(BlueStoneShard, "BlueStone Shards");
    	LanguageRegistry.addName(CopperNugget, "Copper Nugget");
    	LanguageRegistry.addName(CopperDust, "Copper Dust");
    	LanguageRegistry.addName(TinNugget, "TinNugget");
    	LanguageRegistry.addName(TinDust, "Tin Dust");
    	LanguageRegistry.addName(BronzeDust, "Bronze Dust");
    	LanguageRegistry.addName(Banana, "Banana");
    	LanguageRegistry.addName(LithiumShards, "Lithium Shards");
    	LanguageRegistry.addName(SteelIngot, "Steel Bar");
    	LanguageRegistry.addName(NickelIngot, "Nickel Ingot");
    	LanguageRegistry.addName(SilverFragments, "Silver Fragments");
    	LanguageRegistry.addName(TungstenIngot, "Tungsten Ingot");
    	LanguageRegistry.addName(TungstenSword, "Tungsten Sword");
    	LanguageRegistry.addName(SiliconShard, "Silicon Shard");
    	LanguageRegistry.addName(SiliconPlate, "Silicon Plate");
    	LanguageRegistry.addName(IceCutter, "Ice Cutter");
    	LanguageRegistry.addName(Pistol, "Revolver");
    	LanguageRegistry.addName(Bullet, "Bullet");
    	LanguageRegistry.addName(FlareGun, "Flare Gun");
    	LanguageRegistry.addName(Flare, "Flare");
    	LanguageRegistry.addName(ZincDust, "Zinc Dust");
    	LanguageRegistry.addName(CopperPickaxe, "Copper Pickaxe");
    	LanguageRegistry.addName(NeodymiumIngot, "Neodymium Ingot");
    	LanguageRegistry.addName(CopperAxe, "Copper Axe");
    	LanguageRegistry.addName(CopperShovel, "Copper Shovel");
    	LanguageRegistry.addName(CopperHoe, "Copper Hoe");
    	LanguageRegistry.addName(SteelAlloy, "Steel Alloy");
    	LanguageRegistry.addName(VanadiumAlloy, "Vanadium Alloy");
    	LanguageRegistry.addName(VanadiumIngot, "Vanadium Ingot");
    	LanguageRegistry.addName(NeodymiumMagnet, "Neodymium Magnet");
    	LanguageRegistry.addName(TungstenAxe, "Tungsten Axe");
    	LanguageRegistry.addName(TungstenShovel, "Tungsten Shovel");
    	LanguageRegistry.addName(TungstenPickaxe, "Tungsten Pickaxe");
    	LanguageRegistry.addName(TungstenHoe, "Tungsten Hoe");
    	LanguageRegistry.addName(SteelSword, "Steel Sword");
    	LanguageRegistry.addName(SodiumDust, "Sodium Dust");
    	LanguageRegistry.addName(TinIngot, "Tin Ingot");
    	LanguageRegistry.addName(PhosphorusShard, "Phosphorus Shard");
    	LanguageRegistry.addName(Match, "Match");
    	LanguageRegistry.addName(FlameThrower, "Flame Thrower");
    	LanguageRegistry.addName(Fireball, "Fireball");
    	LanguageRegistry.addName(MiningLaser, "Mining Laser");
    	LanguageRegistry.addName(MoonRocket, "Moon Rocket");
    	LanguageRegistry.addName(InflatableHouse, "Inflatable House");
    	LanguageRegistry.addName(HafniumIngot, "Hafnium Ingot");
    	LanguageRegistry.addName(RuthinumIngot, "Ruthinum Ingot");
    	LanguageRegistry.addName(PlatinumAlloy, "Platinum Alloy");
    	LanguageRegistry.addName(PlatinumPickaxe, "Platinum Pickaxe");
    	LanguageRegistry.addName(PlatinumHoe, "Platinum Hoe");
    	
    	
    	
    	float xp = 2.0F;
    	
    	//crafting and smelting
    	ItemStack DirtStack = new ItemStack(Block.dirt);
        ItemStack GravelStack = new ItemStack(Block.gravel);
        ItemStack SandStack = new ItemStack(Block.sand);
        ItemStack CobbleStack = new ItemStack(Block.cobblestone);
        ItemStack CopperIngotStack = new ItemStack(Periodicraft.CopperIngot);
        ItemStack CopperOreStack = new ItemStack(Periodicraft.CopperOre);
        ItemStack TitaniumIngotStack = new ItemStack(Periodicraft.TitaniumIngot);
        ItemStack MagnesiumShardStack = new ItemStack(Periodicraft.MagnesiumShard);
        ItemStack StickStack = new ItemStack(Item.stick);
        ItemStack BlueStoneShardStack = new ItemStack(Periodicraft.BlueStoneShard);
        ItemStack MoonRockStack = new ItemStack(Periodicraft.MoonRock);
        ItemStack CopperNuggetStack = new ItemStack(Periodicraft.CopperNugget);
        ItemStack CopperDustStack = new ItemStack(Periodicraft.CopperDust);
        ItemStack TinDustStack = new ItemStack(Periodicraft.TinDust);
        ItemStack TinIngotStack = new ItemStack(Periodicraft.TinIngot);
        ItemStack TinNuggetStack = new ItemStack(Periodicraft.TinNugget);
        ItemStack SteelIngotStack = new ItemStack(Periodicraft.SteelIngot);
        ItemStack TungstenIngotStack = new ItemStack(Periodicraft.TungstenIngot);
        ItemStack SiliconShardStack = new ItemStack(Periodicraft.SiliconShard);
        ItemStack StoneStack = new ItemStack(Block.stone); 
        ItemStack BerylliumIngotStack = new ItemStack(Periodicraft.BerylliumIngot);
        ItemStack ChomiumIngotStack = new ItemStack(Periodicraft.ChromiumIngot);
        ItemStack CobaltIngotStack = new ItemStack(Periodicraft.CobaltIngot);
        ItemStack ManganeseCrystalStack = new ItemStack(Periodicraft.ManganeseCrystal);
        ItemStack NeodymiumIngotStack = new ItemStack(Periodicraft.NeodymiumIngot);
        ItemStack PlatinumIngotStack = new ItemStack(Periodicraft.PlatinumIngot);
        ItemStack SilverFragmentsStack = new ItemStack(Periodicraft.SilverFragments);
        ItemStack IronBlockStack = new ItemStack(Block.blockIron);
        ItemStack AluminumIngotStack = new ItemStack(Periodicraft.AluiminumIngot);
        ItemStack BulletStack = new ItemStack(Periodicraft.Bullet);
        ItemStack PlatinumAlloyStack = new ItemStack(this.PlatinumAlloy);
        
        GameRegistry.addRecipe(new ItemStack(Block.cobblestone), "xyx", "yzy", "xyx",
                'x', DirtStack, 'y', GravelStack, 'z', SandStack);
        
        GameRegistry.addRecipe(new ItemStack(Block.cobblestone), "yxy", "xzx", "yxy",
                'x', DirtStack, 'y', GravelStack, 'z', SandStack);
        GameRegistry.addRecipe(new ItemStack(Block.gravel), "xxx", "xxx", "xxx", 'x', DirtStack);
        GameRegistry.addRecipe(new ItemStack(Block.sand), "xyx", "xxx", "xyx", 'x', DirtStack, 'y', GravelStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.TitaniumPickaxe), "xxx", " i ", " i ", 'x', TitaniumIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.TitaniumAxe), "xxx", "xix", " i ", 'x', TitaniumIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.TitaniumSword), " x ", "xxx", " i ", 'x', TitaniumIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.BlueStone), "xxx", "xxx", "xxx", 'x', MoonRockStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.BlueStoneGem), "xxx", "xxx", "xxx", 'x',BlueStoneShardStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.TitaniumChest), "x x", "xxx", "xxx", 'x', TitaniumIngotStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.TitaniumHelm), "xxx", "x x", "   ", 'x', TitaniumIngotStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.TitaniumLegs), "xxx", "x x", "x x", 'x', TitaniumIngotStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.TitaniumBoots), "   ", "x x", "x x", 'x', TitaniumIngotStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.TungstenSword), " x ", " x ", " i ", 'x', TungstenIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(this.TungstenPickaxe), "xxx", " i ", " i ", 'x', TungstenIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.SiliconSand), "xxx", "xxx", "xxx", 'x', SandStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.SiliconPlate), "xxx", "xxx", "xxx", 'x', SiliconShardStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.SilverIngot), "xxx", "xxx", "xxx", 'x', SilverFragmentsStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.CopperPickaxe), "xxx", " i ", " i ", 'i', StickStack, 'x', CopperIngotStack);
        GameRegistry.addRecipe(new ItemStack(Periodicraft.CopperSword), " x ", " x ", " i ", 'x', CopperIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(Item.coal), "xx", "xx", 'x', new ItemStack(Periodicraft.CarbonDust));
        GameRegistry.addRecipe(new ItemStack(this.CopperAxe), "xx ", "xi ", " i ", 'x', CopperIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(this.CopperShovel), " x ", " i ", " i ", 'x', CopperIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(this.CopperHoe), "xx ", " i ", " i ", 'x', CopperIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(this.NeodymiumMagnet), "xxx", "x x", "x x", 'x', new ItemStack(this.NeodymiumIngot));
        GameRegistry.addRecipe(new ItemStack(this.TungstenHoe), "xx ", " i ", " i ", 'i', StickStack, 'x', TungstenIngotStack);
        GameRegistry.addRecipe(new ItemStack(this.TungstenShovel), " x ", " i ", " i ", 'x', TungstenIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(this.TungstenAxe), "xx ", "xi ", " i ", 'x', TungstenIngotStack, 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(this.SteelBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(this.SteelIngot));
        GameRegistry.addRecipe(new ItemStack(this.SteelSword), " x ", " x ", " i ", 'x', new ItemStack(this.PureSteelBlock), 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(this.PureSteelBlock), "xxx", "xxx", "xxx", 'x',new ItemStack(this.SteelBlock));
        GameRegistry.addRecipe(new ItemStack(this.Match), " x", " i", 'x', new ItemStack(this.PhosphorusShard), 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(this.Fireball), "x x", "x#x", "x x", 'x', new ItemStack(this.MagnesiumShard), '#', new ItemStack(Item.gunpowder));
        GameRegistry.addRecipe(new ItemStack(this.CompressedWood), "xxx", "xxx", "xxx", 'x', new ItemStack(Block.wood));
        GameRegistry.addRecipe(new ItemStack(this.InflatableHouse), "xxx", "x x", "   ", 'x', new ItemStack(Periodicraft.CompressedWood));
        GameRegistry.addRecipe(new ItemStack(this.PlatinumPickaxe), "xxx", " i ", " i ", 'x', new ItemStack(this.PlatinumAlloy), 'i', StickStack);
        GameRegistry.addRecipe(new ItemStack(this.PlatinumHoe), "xx ", " i ", " i ", 'x', PlatinumAlloyStack, 'i', StickStack);
        
        
        GameRegistry.addShapelessRecipe(new ItemStack(Periodicraft.CopperDust, 1),  new Object[] {Periodicraft.CopperNugget});
        GameRegistry.addShapelessRecipe(new ItemStack(Periodicraft.CopperNugget, 9), new Object[] {Periodicraft.CopperIngot});
        GameRegistry.addShapelessRecipe(new ItemStack(Periodicraft.TinNugget, 9), new Object[] {Periodicraft.TinIngot});
        GameRegistry.addShapelessRecipe(new ItemStack(Periodicraft.TinDust, 1), new Object[] {Periodicraft.TinNugget});
        GameRegistry.addShapelessRecipe(new ItemStack(Periodicraft.SteelAlloy), new Object[] {Periodicraft.SteelIngot, Periodicraft.AluiminumIngot, Periodicraft.ChromiumIngot, Periodicraft.NickelIngot});
        GameRegistry.addShapelessRecipe(new ItemStack(Periodicraft.VanadiumAlloy), new Object[] {Periodicraft.SteelAlloy, Periodicraft.CopperIngot, Periodicraft.VanadiumIngot});
        GameRegistry.addShapelessRecipe(new ItemStack(this.PlatinumAlloy), new Object[] {this.PlatinumIngot, this.RuthinumIngot});  
        
        GameRegistry.addSmelting(Periodicraft.CopperOre.blockID, CopperIngotStack, 0.5F);
        GameRegistry.addSmelting(Periodicraft.TitaniumOre.blockID, TitaniumIngotStack, 6.0F);
        GameRegistry.addSmelting(Periodicraft.BlueStone.blockID, BlueStoneShardStack, 1.5F);
        GameRegistry.addSmelting(Periodicraft.TinOre.blockID, TinIngotStack, 0.5F);
        GameRegistry.addSmelting(Item.ingotIron.itemID, SteelIngotStack, 1.0F);
        GameRegistry.addSmelting(Periodicraft.SiliconSand.blockID, SiliconShardStack, 1.5F);
        GameRegistry.addSmelting(Periodicraft.BerylliumOre.blockID, BerylliumIngotStack, 2.5F);
        GameRegistry.addSmelting(Periodicraft.ChromiumIngot.itemID, ChomiumIngotStack, 1.0F);
        GameRegistry.addSmelting(Periodicraft.CobaltOre.blockID, CobaltIngotStack, 1.0F);
        GameRegistry.addSmelting(Periodicraft.ManganeseOre.blockID, ManganeseCrystalStack, 5.5F);
        GameRegistry.addSmelting(Periodicraft.NeodymiumOre.blockID, NeodymiumIngotStack, 0.5F);
        GameRegistry.addSmelting(Periodicraft.PlatinumOre.blockID, PlatinumIngotStack, 1.0F);
        GameRegistry.addSmelting(Periodicraft.AluminumOre.blockID, AluminumIngotStack, 1.0F);
        GameRegistry.addSmelting(Periodicraft.NickelOre.blockID, new ItemStack(Periodicraft.NickelIngot), 1.0F);
        GameRegistry.addSmelting(Periodicraft.ChromiumOre.blockID, new ItemStack(Periodicraft.ChromiumIngot), 1.0F);
        GameRegistry.addSmelting(Periodicraft.ScandiumOre.blockID, new ItemStack(Periodicraft.ScandiumIngot), xp);
        GameRegistry.addSmelting(Periodicraft.VanadiumOre.blockID, new ItemStack(Periodicraft.VanadiumIngot), xp);
        GameRegistry.addSmelting(Periodicraft.SilverOre.blockID, new ItemStack(Periodicraft.SilverIngot), xp);
        GameRegistry.addSmelting(this.HafniumOre.blockID, new ItemStack(this.HafniumIngot), xp);
        
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    	FMLLog.log(Level.INFO, "=======================================================Starting Periodicraft=======================================================");
    }
    
    public void Egg(Class <? extends Entity> entity, int ID, int PrimaryColor, int SecondaryColor) {
    	EntityList.IDtoClassMapping.put(ID, entity);
    	EntityList.entityEggs.put(ID, new EntityEggInfo(ID, PrimaryColor, SecondaryColor));
    }
    
    

}
