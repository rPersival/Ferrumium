package com.persival.ferrummod.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PoweredEnderiumOre  extends Block {
    public PoweredEnderiumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(7.0F, 30.0F)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));
    }
}
