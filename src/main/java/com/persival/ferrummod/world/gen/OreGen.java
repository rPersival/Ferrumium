package com.persival.ferrummod.world.gen;

import com.persival.ferrummod.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
                ConfiguredPlacement<CountRangeConfig> customConfigHellarium = Placement.COUNT_RANGE.configure(new CountRangeConfig(4, 5, 1, 65));
                ConfiguredPlacement<CountRangeConfig> customConfigBGold = Placement.COUNT_RANGE.configure(new CountRangeConfig(15, 5, 128, 255));
                ConfiguredPlacement<CountRangeConfig> customConfigEnderium = Placement.COUNT_RANGE.configure(new CountRangeConfig(50, 5, 1, 256));
                ConfiguredPlacement<CountRangeConfig> customConfigUnEnderium = Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 5, 1, 256));

                // Hellarium
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.HELLARIUM_ORE.get().getDefaultState(), 4))
                        .withPlacement(customConfigHellarium));

                // Black Gold
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.BLACK_GOLD_ORE.get().getDefaultState(), 8))
                        .withPlacement(customConfigBGold));

                // Enderium
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), RegistryHandler.ENDERIUM_ORE.get().getDefaultState(), 3))
                        .withPlacement(customConfigEnderium));

                // Powered Enderium
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), RegistryHandler.POWERED_ENDERIUM_ORE.get().getDefaultState(), 3))
                        .withPlacement(customConfigUnEnderium));
        }
    }
}