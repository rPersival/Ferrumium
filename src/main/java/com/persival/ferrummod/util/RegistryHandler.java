package com.persival.ferrummod.util;

import com.persival.ferrummod.Main;
import com.persival.ferrummod.blocks.metals.*;
import com.persival.ferrummod.items.armor.ArmorTier;
import com.persival.ferrummod.blocks.ores.BlackGoldOre;
import com.persival.ferrummod.blocks.ores.EnderiumOre;
import com.persival.ferrummod.blocks.ores.HellariumOre;
import com.persival.ferrummod.blocks.ores.PoweredEnderiumOre;
import com.persival.ferrummod.init.SoundInit;
import com.persival.ferrummod.items.FerrumiumMusicDiscItem;
import com.persival.ferrummod.items.FoodApple;
import com.persival.ferrummod.items.FoodEnchantedApple;
import com.persival.ferrummod.items.itemsBase.ItemBase;
import com.persival.ferrummod.items.itemsBase.ItemNotBurnableBase;
import com.persival.ferrummod.items.toolsBase.ToolBase;
import com.persival.ferrummod.items.toolsBase.ToolType;
import com.persival.ferrummod.tools.FerrumiumItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static void initialize() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> ANCAPIUM_INGOT = ITEMS.register("ancapium_ingot",
            ItemNotBurnableBase::new);
    public static final RegistryObject<Item> HELLARIUM_INGOT = ITEMS.register("hellarium_ingot",
            ItemNotBurnableBase::new);
    public static final RegistryObject<Item> ANARCHINITE_INGOT = ITEMS.register("anarchinite_ingot",
            ItemNotBurnableBase::new);
    public static final RegistryObject<Item> ANCAPIUM_PLATING = ITEMS.register("ancapium_plating",
            ItemNotBurnableBase::new);
    public static final RegistryObject<Item> UNSTABLE_ENDERIUM_PLATING = ITEMS.register(
            "unstable_enderium_plating", ItemBase::new);
    public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot",
            ItemBase::new);
    public static final RegistryObject<Item> ANARCHINITE_PLATING = ITEMS.register("anarchinite_plating",
            ItemNotBurnableBase::new);
    public static final RegistryObject<Item> REINFORCED_STICK = ITEMS.register("reinforced_stick",
            ItemBase::new);
    public static final RegistryObject<Item> UNSTABLE_ENDERIUM_INGOT = ITEMS.register("unstable_enderium_ingot",
            ItemBase::new);
    public static final RegistryObject<Item> BLACK_GOLD_NUGGET = ITEMS.register("black_gold_nugget",
            ItemBase::new);
    public static final RegistryObject<Item> HELLARIUM_SCRAP = ITEMS.register("hellarium_scrap",
            ItemNotBurnableBase::new);

    // Blocks
    public static final RegistryObject<Block> ANARCHINITE_BLOCK = BLOCKS.register("anarchinite_block",
            EnderiumBlock::new);
    public static final RegistryObject<Block> HELLARIUM_BLOCK = BLOCKS.register("hellarium_block",
            HellariumBlock::new);
    public static final RegistryObject<Block> ENDERIUM_BLOCK = BLOCKS.register("enderium_block",
            EnderiumBlock::new);
    public static final RegistryObject<Block> ANCAPIUM_BLOCK = BLOCKS.register("ancapium_block",
            EnderiumBlock::new);
    public static final RegistryObject<Block> UNSTABLE_ENDERIUM_BLOCK = BLOCKS.register("unstable_enderium_block",
            UnstableEnderium::new);

    public static final RegistryObject<Block> POWERED_ENDERIUM_ORE = BLOCKS.register("powered_enderium_ore",
            PoweredEnderiumOre::new);
    public static final RegistryObject<Block> HELLARIUM_ORE = BLOCKS.register("hellarium_ore",
            HellariumOre::new);
    public static final RegistryObject<Block> BLACK_GOLD_ORE = BLOCKS.register("black_gold_ore",
            BlackGoldOre::new);
    public static final RegistryObject<Block> ENDERIUM_ORE = BLOCKS.register("enderium_ore",
            EnderiumOre::new);

    // Block Items
    public static final RegistryObject<Item> ANARCHINITE_BLOCK_ITEM = ITEMS.register("anarchinite_block",
            () -> new ItemNotBurnableBaseBlock(ANARCHINITE_BLOCK.get()));
    public static final RegistryObject<Item> HELLARIUM_BLOCK_ITEM = ITEMS.register("hellarium_block",
            () -> new ItemNotBurnableBaseBlock(HELLARIUM_BLOCK.get()));
    public static final RegistryObject<Item> ENDERIUM_BLOCK_ITEM = ITEMS.register("enderium_block",
            () -> new ItemBaseBlock(ENDERIUM_BLOCK.get()));
    public static final RegistryObject<Item> ANCAPIUM_BLOCK_ITEM = ITEMS.register("ancapium_block",
            () -> new ItemNotBurnableBaseBlock(ANCAPIUM_BLOCK.get()));
    public static final RegistryObject<Item> UNENDERIUM_BLOCK_ITEM = ITEMS.register("unstable_enderium_block",
            () -> new ItemBaseBlock(UNSTABLE_ENDERIUM_BLOCK.get()));

    public static final RegistryObject<Item> POWERED_ENDERIUM_ORE_ITEM = ITEMS.register("powered_enderium_ore",
            () -> new ItemBaseBlock(POWERED_ENDERIUM_ORE.get()));
    public static final RegistryObject<Item> HELLARIUM_ORE_ITEM = ITEMS.register("hellarium_ore",
            () -> new ItemNotBurnableBaseBlock(HELLARIUM_ORE.get()));
    public static final RegistryObject<Item> ENDERIUM_ORE_ITEM = ITEMS.register("enderium_ore",
            () -> new ItemBaseBlock(ENDERIUM_ORE.get()));
    public static final RegistryObject<Item> BLACK_GOLD_ORE_ITEM = ITEMS.register("black_gold_ore",
            () -> new ItemNotBurnableBaseBlock(BLACK_GOLD_ORE.get()));

    // Swords
    public static final RegistryObject<SwordItem> ANARCHINITE_SWORD = ITEMS.register("anarchinite_sword",
            () -> (SwordItem) ToolBase.createSword(FerrumiumItemTier.ANARCHINITE,
                    3, -2.4f, true));

    public static final RegistryObject<SwordItem> ANCAPIUM_SWORD = ITEMS.register("ancapium_sword",
            () -> (SwordItem) ToolBase.createSword(FerrumiumItemTier.ANCAPIUM,
                    3, -2.4f, true));

    public static final RegistryObject<SwordItem> ENDERIUM_SWORD = ITEMS.register("enderium_sword",
            () -> (SwordItem) ToolBase.createSword(FerrumiumItemTier.ENDERIUM,
                    4, -2.4f));

    public static final RegistryObject<SwordItem> HELLARIUM_SWORD = ITEMS.register("hellarium_sword",
            () -> (SwordItem) ToolBase.createSword(FerrumiumItemTier.HELLARIUM,
                    3, -2.4f, true));

    // Pickaxes
    public static final RegistryObject<PickaxeItem> ANARCHINITE_PICKAXE = ITEMS.register("anarchinite_pickaxe",
            () -> (PickaxeItem) ToolBase.createTool(ToolType.PICKAXE, FerrumiumItemTier.ANARCHINITE,
                    1, -2.8f, true));

    public static final RegistryObject<PickaxeItem> ANCAPIUM_PICKAXE = ITEMS.register("ancapium_pickaxe",
            () -> (PickaxeItem) ToolBase.createTool(ToolType.PICKAXE, FerrumiumItemTier.ANCAPIUM,
                    1, -2.8f, true));

    public static final RegistryObject<PickaxeItem> ENDERIUM_PICKAXE = ITEMS.register("enderium_pickaxe",
            () -> (PickaxeItem) ToolBase.createTool(ToolType.PICKAXE, FerrumiumItemTier.ENDERIUM,
                    2, -2.8f));

    public static final RegistryObject<PickaxeItem> HELLARIUM_PICKAXE = ITEMS.register("hellarium_pickaxe",
            () -> (PickaxeItem) ToolBase.createTool(ToolType.PICKAXE, FerrumiumItemTier.HELLARIUM,
                    1, -2.8f, true));

    // Shovels
    public static final RegistryObject<ShovelItem> ANARCHINITE_SHOVEL = ITEMS.register("anarchinite_shovel",
            () -> (ShovelItem) ToolBase.createTool(ToolType.SHOVEL, FerrumiumItemTier.ANARCHINITE,
                    1, -3.0f, true));

    public static final RegistryObject<ShovelItem> ANCAPIUM_SHOVEL = ITEMS.register("ancapium_shovel",
            () -> (ShovelItem) ToolBase.createTool(ToolType.SHOVEL, FerrumiumItemTier.ANCAPIUM,
                    1, -3.0f, true));

    public static final RegistryObject<ShovelItem> ENDERIUM_SHOVEL = ITEMS.register("enderium_shovel",
            () -> (ShovelItem) ToolBase.createTool(ToolType.SHOVEL, FerrumiumItemTier.ENDERIUM,
                    2, -3.0f));

    public static final RegistryObject<ShovelItem> HELLARIUM_SHOVEL = ITEMS.register("hellarium_shovel",
            () -> (ShovelItem) ToolBase.createTool(ToolType.SHOVEL, FerrumiumItemTier.HELLARIUM,
                    -1, -3.0f, true));

    // Axes
    public static final RegistryObject<AxeItem> ANARCHINITE_AXE = ITEMS.register("anarchinite_axe",
            () -> (AxeItem) ToolBase.createTool(ToolType.AXE, FerrumiumItemTier.ANARCHINITE,
                    5, -2.9f, true));

    public static final RegistryObject<AxeItem> ANCAPIUM_AXE = ITEMS.register("ancapium_axe",
            () -> (AxeItem) ToolBase.createTool(ToolType.AXE, FerrumiumItemTier.ANCAPIUM,
                    5, -3.0f, true));

    public static final RegistryObject<AxeItem> ENDERIUM_AXE = ITEMS.register("enderium_axe",
            () -> (AxeItem) ToolBase.createTool(ToolType.AXE, FerrumiumItemTier.ENDERIUM,
                    6, -3.0f));

    public static final RegistryObject<AxeItem> HELLARIUM_AXE = ITEMS.register("hellarium_axe",
            () -> (AxeItem) ToolBase.createTool(ToolType.AXE, FerrumiumItemTier.HELLARIUM,
                    6, -3.1f, true));

    // Hoes
    public static final RegistryObject<HoeItem> ANARCHINITE_HOE = ITEMS.register("anarchinite_hoe",
            () -> (HoeItem) ToolBase.createTool(ToolType.HOE, FerrumiumItemTier.ANARCHINITE,
                    1, 1.0f, true));

    public static final RegistryObject<HoeItem> ANCAPIUM_HOE = ITEMS.register("ancapium_hoe",
            () -> (HoeItem) ToolBase.createTool(ToolType.HOE, FerrumiumItemTier.ANCAPIUM,
                    1, 0.0f, true));

    public static final RegistryObject<HoeItem> ENDERIUM_HOE = ITEMS.register("enderium_hoe",
            () -> (HoeItem) ToolBase.createTool(ToolType.HOE, FerrumiumItemTier.ENDERIUM,
                    1, 0.0f));

    public static final RegistryObject<HoeItem> HELLARIUM_HOE = ITEMS.register("hellarium_hoe",
            () -> (HoeItem) ToolBase.createTool(ToolType.HOE, FerrumiumItemTier.ENDERIUM,
                    1, -1.0f, true));

    // Anarchinite armor
    public static final RegistryObject<ArmorItem> ANARCHINITE_HELM = ITEMS.register("anarchinite_helm",
            () -> ToolBase.createArmor(ArmorTier.ANARCHINITE, EquipmentSlotType.HEAD, true));

    public static final RegistryObject<ArmorItem> ANARCHINITE_CHEST = ITEMS.register("anarchinite_chest",
            () -> ToolBase.createArmor(ArmorTier.ANARCHINITE, EquipmentSlotType.CHEST, true));

    public static final RegistryObject<ArmorItem> ANARCHINITE_LEGS = ITEMS.register("anarchinite_legs",
            () -> ToolBase.createArmor(ArmorTier.ANARCHINITE, EquipmentSlotType.LEGS, true));

    public static final RegistryObject<ArmorItem> ANARCHINITE_FEET = ITEMS.register("anarchinite_feet",
            () -> ToolBase.createArmor(ArmorTier.ANARCHINITE, EquipmentSlotType.FEET, true));

    // Ancapium armor
    public static final RegistryObject<ArmorItem> ANCAPIUM_HELM = ITEMS.register("ancapium_helm",
            () -> ToolBase.createArmor(ArmorTier.ANCAPIUM, EquipmentSlotType.HEAD, true));

    public static final RegistryObject<ArmorItem> ANCAPIUM_CHEST = ITEMS.register("ancapium_chest",
            () -> ToolBase.createArmor(ArmorTier.ANCAPIUM, EquipmentSlotType.CHEST, true));

    public static final RegistryObject<ArmorItem> ANCAPIUM_LEGS = ITEMS.register("ancapium_legs",
            () -> ToolBase.createArmor(ArmorTier.ANCAPIUM, EquipmentSlotType.LEGS, true));

    public static final RegistryObject<ArmorItem> ANCAPIUM_FEET = ITEMS.register("ancapium_feet",
            () -> ToolBase.createArmor(ArmorTier.ANCAPIUM, EquipmentSlotType.FEET, true));

    // Enderium armor
    public static final RegistryObject<ArmorItem> ENDERIUM_HELM = ITEMS.register("enderium_helm",
            () -> ToolBase.createArmor(ArmorTier.ENDERIUM, EquipmentSlotType.HEAD));

    public static final RegistryObject<ArmorItem> ENDERIUM_CHEST = ITEMS.register("enderium_chest",
            () -> ToolBase.createArmor(ArmorTier.ENDERIUM, EquipmentSlotType.CHEST));

    public static final RegistryObject<ArmorItem> ENDERIUM_LEGS = ITEMS.register("enderium_legs",
            () -> ToolBase.createArmor(ArmorTier.ENDERIUM, EquipmentSlotType.LEGS));

    public static final RegistryObject<ArmorItem> ENDERIUM_FEET = ITEMS.register("enderium_feet",
            () -> ToolBase.createArmor(ArmorTier.ENDERIUM, EquipmentSlotType.FEET));

    // Hellarium armor
    public static final RegistryObject<ArmorItem> HELLARIUM_HELM = ITEMS.register("hellarium_helm",
            () -> ToolBase.createArmor(ArmorTier.HELLARIUM, EquipmentSlotType.HEAD, true));

    public static final RegistryObject<ArmorItem> HELLARIUM_CHEST = ITEMS.register("hellarium_chest",
            () -> ToolBase.createArmor(ArmorTier.HELLARIUM, EquipmentSlotType.CHEST, true));

    public static final RegistryObject<ArmorItem> HELLARIUM_LEGS = ITEMS.register("hellarium_legs",
            () -> ToolBase.createArmor(ArmorTier.HELLARIUM, EquipmentSlotType.LEGS, true));

    public static final RegistryObject<ArmorItem> HELLARIUM_FEET = ITEMS.register("hellarium_feet",
            () -> ToolBase.createArmor(ArmorTier.HELLARIUM, EquipmentSlotType.FEET, true));

    // Food
    public static final RegistryObject<FoodApple> ANCAPIUM_APPLE = ITEMS.register("ancapium_apple",
            FoodApple::new);
    public static final RegistryObject<FoodEnchantedApple> ENCHANTED_ANCAPIUM_APPLE =
            ITEMS.register("ench_ancapium_apple", FoodEnchantedApple::new);

    // Records
    public static final RegistryObject<Item> FAKE_TRIPLETS_DISC = ITEMS.register("fake_triplets_disc",
            () -> new FerrumiumMusicDiscItem(1, SoundInit.FAKE_TRIPLETS_LAZY.get()));
}