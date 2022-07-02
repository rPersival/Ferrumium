package com.persival.ferrummod.blocks.metals;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBaseBlock extends BlockItem {

    public ItemBaseBlock(Block block, ItemGroup itemGroup) {
        super(block, new Item.Properties().group(itemGroup));
    }

    public ItemBaseBlock(Block block)
    {
        this(block, ItemGroup.BUILDING_BLOCKS);
    }
}