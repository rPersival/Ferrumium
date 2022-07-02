package com.persival.ferrummod.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Rarity;
import net.minecraft.util.SoundEvent;

public class FerrumiumMusicDiscItem extends MusicDiscItem {

    public FerrumiumMusicDiscItem(int comparatorValueIn, SoundEvent soundIn) {
        super(comparatorValueIn, () -> soundIn, new Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
    }

    public FerrumiumMusicDiscItem(int comparatorValueIn, SoundEvent soundIn, Properties properties) {
        super(comparatorValueIn, () -> soundIn, properties);
    }
}