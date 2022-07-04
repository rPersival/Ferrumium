package com.persival.ferrummod.world.gen;

import com.persival.ferrummod.Main;
import com.persival.ferrummod.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;

public class OreGen {

    private static final RuleTest OVERWORLD = OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD;
    private static final RuleTest THE_NETHER = OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER;
    private static final RuleTest THE_END = new BlockMatchRuleTest(Blocks.END_STONE);

    public static final ConfiguredFeature<?, ?> HELLARIUM_ORE = buildOreFeature(THE_NETHER, RegistryHandler.HELLARIUM_ORE.get(), 3, 255, 8);
    public static final ConfiguredFeature<?, ?> BLACK_GOLD_ORE = buildOreFeature(THE_NETHER, RegistryHandler.BLACK_GOLD_ORE.get(), 6, 255, 23);
    public static final ConfiguredFeature<?, ?> ENDERIUM_ORE = buildOreFeature(THE_END, RegistryHandler.ENDERIUM_ORE.get(), 4, 255, 8);
    public static final ConfiguredFeature<?, ?> POWERED_ENDERIUM_ORE = buildOreFeature(THE_END, RegistryHandler.POWERED_ENDERIUM_ORE.get(), 3, 255, 3);

    public static ConfiguredFeature<?, ?> buildOreFeature(RuleTest rule, Block block, int maxVeinSize, int maxHeight, int countInChunk) {
        return Feature.ORE.withConfiguration(new OreFeatureConfig(rule, block.getDefaultState(), maxVeinSize)).range(maxHeight).square().count(countInChunk);
    }

    public static void generateOres() {
        Registry<ConfiguredFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_FEATURE;

        Registry.register(registry, new ResourceLocation(Main.MOD_ID, "hellarium_ore"), HELLARIUM_ORE);
        Registry.register(registry, new ResourceLocation(Main.MOD_ID, "enderium_ore"), ENDERIUM_ORE);
        Registry.register(registry, new ResourceLocation(Main.MOD_ID, "powered_enderium_ore"), POWERED_ENDERIUM_ORE);
        Registry.register(registry, new ResourceLocation(Main.MOD_ID, "powered_enderium_ore"), BLACK_GOLD_ORE);
    }
}