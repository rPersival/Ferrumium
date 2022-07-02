package com.persival.ferrummod.util;

import com.persival.ferrummod.Main;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class EventHandler extends Event {

    // TODO: add event that change drops when block is harvested
    @SubscribeEvent
    public static void dropBonusNuggets(BlockEvent.HarvestDropsEvent event) {
        PlayerEntity harvester = event.getHarvester();
        if (harvester.getHeldItemMainhand().getItem() == RegistryHandler.ANCAPIUM_PICKAXE.get())
            event.getDrops().add(new ItemStack(Items.WITHER_ROSE));
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
                case "woodland_mansion":
                case "shipwreck_supply":
                case "shipwreck_map":
                case "shipwreck_treasure":
                case "buried_treasure":
                case "pillager_outpost":
                case "underwater_ruin_small":
                case "underwater_ruin_big":
                    event.getTable().addPool(ChestLootHandler.getInjectPool(Main.MOD_ID, "dungeon"));
                    break;
                case "nether_bridge":
                    event.getTable().addPool(ChestLootHandler.getInjectPool(Main.MOD_ID, "bridge"));
                    break;
                case "stronghold":
                case "village_weaponsmith":
                case "village_toolsmith":
                case "village_armorer":
                case "village_shepherd":
                case "village_mason":
                case "village_fletcher":
                case "abandoned_mineshaft":
                case "jungle_temple":
                case "spawn_bonus_chest":
                case "igloo_chest":
                    event.getTable().addPool(ChestLootHandler.getInjectPool(Main.MOD_ID, file));
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