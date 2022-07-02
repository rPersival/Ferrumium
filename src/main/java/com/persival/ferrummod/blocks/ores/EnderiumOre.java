package com.persival.ferrummod.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EnderiumOre extends Block {
    public EnderiumOre() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(5.0F, 25.0F)
                .sound(SoundType.STONE)
                .setRequiresTool()
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
    }
}
