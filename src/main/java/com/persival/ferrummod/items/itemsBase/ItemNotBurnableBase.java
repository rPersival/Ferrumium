package com.persival.ferrummod.items.itemsBase;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemNotBurnableBase extends Item {
    public ItemNotBurnableBase(ItemGroup itemGroup) {
        super(new Properties().group(itemGroup).isImmuneToFire());
    }

    public ItemNotBurnableBase() {
        this(ItemGroup.MATERIALS);
    }
}
