package com.persival.ferrummod.blocks.metals;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HellariumBlock extends Block {
    public HellariumBlock() {
        super(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(8.0F, 40.0F)
            .sound(SoundType.NETHERITE)
            .harvestLevel(3)
            .setRequiresTool()
            .harvestTool(ToolType.PICKAXE));
    }
}