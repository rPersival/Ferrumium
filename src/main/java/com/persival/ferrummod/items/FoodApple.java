package com.persival.ferrummod.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodApple extends Item {
    public FoodApple() {
        super(new Properties().group(ItemGroup.FOOD)
                .food(new Food.Builder().hunger(6).saturation(9.6f)
                .setAlwaysEdible()
                .effect(() -> new EffectInstance(Effects.HASTE, 2 * (60 * 20), 2), 1.0f)
                .effect(() -> new EffectInstance(Effects.SPEED, 2 * (60 * 20), 1), 1.0f)
                .effect(() -> new EffectInstance(Effects.NIGHT_VISION, (60 * 20), 0), 1.0f)
                .effect(() -> new EffectInstance(Effects.JUMP_BOOST, (60 * 20), 1), 1.0f)
                .build()));
    }
}
