package com.persival.ferrummod.tools;

import com.persival.ferrummod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum FerrumiumItemTier implements IItemTier {
    ANARCHINITE(4, 4683, 14.0f, 5.0f, 10, () -> Ingredient.fromItems(RegistryHandler.ANARCHINITE_INGOT.get())),
    ANCAPIUM(3, 1024, 6.0f, 3.0f, 25, () -> Ingredient.fromItems(RegistryHandler.ANCAPIUM_INGOT.get())),
    ENDERIUM(2, 250, 14.0f, 3.0f, 25, () -> Ingredient.fromItems(RegistryHandler.ANCAPIUM_INGOT.get())),
    HELLARIUM(2, 4683, 5.0f, 2.0f, 6, () -> Ingredient.fromItems(RegistryHandler.ANCAPIUM_INGOT.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    FerrumiumItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override @Nonnull
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}