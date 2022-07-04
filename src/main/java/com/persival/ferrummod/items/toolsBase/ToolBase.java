package com.persival.ferrummod.items.toolsBase;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

public class ToolBase {

    public static ToolItem createTool(ToolType type, IItemTier itemTier, float attackDamageIn, float attackSpeedIn, boolean isBurnable, ItemGroup itemGroup) {
        Item.Properties properties = isBurnable ? new Item.Properties().group(itemGroup).isImmuneToFire() : new Item.Properties().group(itemGroup);
        switch (type) {
            case SHOVEL:
                return new ShovelItem(itemTier, attackDamageIn, attackSpeedIn, properties);
            case AXE:
                return new AxeItem(itemTier, attackDamageIn, attackSpeedIn, properties);
            case HOE:
                return new HoeItem(itemTier, (int) attackDamageIn, attackSpeedIn, properties);
            case PICKAXE:
                return new PickaxeItem(itemTier, (int) attackDamageIn, attackSpeedIn, properties);
        }
        return null;
    }

    public static ToolItem createTool(ToolType type, IItemTier itemTier, float attackDamageIn, float attackSpeedIn, boolean isBurnable) {
        return ToolBase.createTool(type, itemTier, attackDamageIn, attackSpeedIn, isBurnable, ItemGroup.TOOLS);
    }

    public static ToolItem createTool(ToolType type, IItemTier itemTier, float attackDamageIn, float attackSpeedIn) {
        return ToolBase.createTool(type, itemTier, attackDamageIn, attackSpeedIn, false);
    }

    public static SwordItem createSword(IItemTier itemTier, int attackDamageIn, float attackSpeedIn, boolean isBurnable, ItemGroup itemGroup) {
        Item.Properties properties = isBurnable ? new Item.Properties().group(itemGroup).isImmuneToFire() : new Item.Properties().group(itemGroup);
        return new SwordItem(itemTier, attackDamageIn, attackSpeedIn, properties);
    }

    public static SwordItem createSword(IItemTier itemTier, int attackDamageIn, float attackSpeedIn, boolean isBurnable) {
        return ToolBase.createSword(itemTier, attackDamageIn, attackSpeedIn, isBurnable, ItemGroup.COMBAT);
    }

    public static SwordItem createSword(IItemTier itemTier, int attackDamageIn, float attackSpeedIn) {
        return ToolBase.createSword(itemTier, attackDamageIn, attackSpeedIn, false);
    }

    public static ArmorItem createArmor(IArmorMaterial itemTier, EquipmentSlotType equipmentSlotType, boolean isBurnable, ItemGroup itemGroup) {
        Item.Properties properties = isBurnable ? new Item.Properties().group(itemGroup).isImmuneToFire() : new Item.Properties().group(itemGroup);
        return new ArmorItem(itemTier, equipmentSlotType, properties);
    }

    public static ArmorItem createArmor(IArmorMaterial itemTier, EquipmentSlotType equipmentSlotType, boolean isBurnable) {
        return ToolBase.createArmor(itemTier, equipmentSlotType, isBurnable, ItemGroup.COMBAT);
    }

    public static ArmorItem createArmor(IArmorMaterial itemTier, EquipmentSlotType equipmentSlotType) {
        return ToolBase.createArmor(itemTier, equipmentSlotType, false);
    }
}
