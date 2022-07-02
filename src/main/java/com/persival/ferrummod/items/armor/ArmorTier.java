package com.persival.ferrummod.items.armor;

import com.persival.ferrummod.Main;
import com.persival.ferrummod.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum ArmorTier implements IArmorMaterial {
    ANARCHINITE(Main.MOD_ID + ":anarchinite", 60, new int[] {6, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0f, () -> Ingredient.fromItems(RegistryHandler.ANARCHINITE_INGOT.get()), 0.5f),
    ANCAPIUM(Main.MOD_ID + ":ancapium", 25, new int[] {3, 5, 7, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0f, () -> Ingredient.fromItems(RegistryHandler.ANCAPIUM_INGOT.get()), 0.1f),
    HELLARIUM(Main.MOD_ID + ":hellarium", 40, new int[] {2, 4, 6, 2}, 6, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.2f, () -> Ingredient.fromItems(RegistryHandler.HELLARIUM_INGOT.get()), 0.5f),
    ENDERIUM(Main.MOD_ID + ":enderium", 15, new int[] {6, 8, 10, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, () -> Ingredient.fromItems(RegistryHandler.ENDERIUM_INGOT.get()), 0f);

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;
    private final float knockbackResistance;

    ArmorTier(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn, float knockbackResistance) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughnessIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override @Nonnull
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override @Nonnull
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    @Override @Nonnull
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}