package com.persival.ferrummod.blocks.metals;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class ItemNotBurnableBaseBlock extends BlockItem {

    public ItemNotBurnableBaseBlock(Block block, ItemGroup itemGroup) {
        super(block, new Properties().group(itemGroup).isImmuneToFire());
    }

    public ItemNotBurnableBaseBlock(Block block) {
        this(block, ItemGroup.BUILDING_BLOCKS);
    }
}