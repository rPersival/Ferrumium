package com.persival.ferrummod.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlackGoldOre extends Block {
    public BlackGoldOre() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(2.5F, 10.0F)
                .sound(SoundType.NETHER_GOLD)
                .setRequiresTool()
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
    }
}
