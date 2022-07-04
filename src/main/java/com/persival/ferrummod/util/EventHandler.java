package com.persival.ferrummod.util;

import com.persival.ferrummod.Main;
import com.persival.ferrummod.world.gen.OreGen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class EventHandler extends Event {

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onBiomeLoading(BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.Category.NETHER) {
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreGen.BLACK_GOLD_ORE);
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreGen.HELLARIUM_ORE);
        } else if (event.getCategory() == Biome.Category.THEEND) {
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreGen.ENDERIUM_ORE);
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, OreGen.POWERED_ENDERIUM_ORE);
        }
    }

    @SubscribeEvent
    public static void loadLoot(final LootTableLoadEvent event) {
        String prefix = "minecraft:chests/";
        String name = event.getName().toString();
        String file = name.substring(name.indexOf(prefix) + prefix.length());

        if (name.startsWith(prefix)) {

            if (file.startsWith("village/village_")) {
                String village = "village/";
                file = file.substring(file.indexOf(village) + village.length());
            }
            else if (file.startsWith("stronghold_"))
                file = "stronghold";

            switch (file) {
                case "simple_dungeon":
                case "shipwreck_treasure":
                case "buried_treasure":
                case "pillager_outpost":
                case "underwater_ruin_small":
                case "underwater_ruin_big":
                    event.getTable().addPool(ChestLootHandler.getInjectPool(Main.MOD_ID, "dungeon"));
                    break;
                case "ruined_portal":
                    event.getTable().addPool(ChestLootHandler.getInjectPool(Main.MOD_ID, "ruined_portal"));
                    break;
                case "nether_bridge":
                    event.getTable().addPool(ChestLootHandler.getInjectPool(Main.MOD_ID, "bridge"));
                    break;
                case "end_city_treasure":
                    event.getTable().addPool(ChestLootHandler.getInjectPool(Main.MOD_ID, "end_treasure"));
                    break;
                case "desert_pyramid":
                    event.getTable().addPool(ChestLootHandler.getInjectPool(Main.MOD_ID, "pyramid"));
                    break;
                default:
                    break;
            }
        }
    }
}