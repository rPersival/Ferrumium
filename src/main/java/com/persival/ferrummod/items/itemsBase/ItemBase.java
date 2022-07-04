package com.persival.ferrummod.items.itemsBase;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase(ItemGroup itemGroup) {
        super(new Properties().group(itemGroup));
    }

    public ItemBase() {
        this(ItemGroup.MATERIALS);
    }
}
