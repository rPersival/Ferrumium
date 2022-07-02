package com.persival.ferrummod.util;

import net.minecraft.loot.LootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;

public final class ChestLootHandler {
    public static LootPool getInjectPool(String modId, String entryName) {
        return LootPool.builder()
                .addEntry(getInjectEntry(modId, entryName))
                .bonusRolls(0, 1)
                .name(modId + "_inject")
                .build();
    }

    private static LootEntry.Builder<?> getInjectEntry(String modid, String name) {
        ResourceLocation resourceLocation = new ResourceLocation(modid, "inject/" + name);
        return TableLootEntry.builder(resourceLocation).weight(1);
    }
}
