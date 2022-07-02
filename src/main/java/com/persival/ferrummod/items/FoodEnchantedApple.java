package com.persival.ferrummod.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import javax.annotation.Nonnull;

public class FoodEnchantedApple extends Item {
    public FoodEnchantedApple() {
        super(new Properties().group(ItemGroup.FOOD)
                .food(new Food.Builder().hunger(6).saturation(9.6f)
                .setAlwaysEdible()
                .effect(() -> new EffectInstance(Effects.HASTE, 5 * (60 * 20), 3), 1.0f)
                .effect(() -> new EffectInstance(Effects.SPEED, 5 * (60 * 20), 3), 1.0f)
                .effect(() -> new EffectInstance(Effects.NIGHT_VISION, 3 * (60 * 20), 0), 1.0f)
                .effect(() -> new EffectInstance(Effects.JUMP_BOOST, 3 * (60 * 20), 3), 1.0f)
                .build()));
    }
    public boolean hasEffect(@Nonnull ItemStack stack) {
        return true;
    }
}
