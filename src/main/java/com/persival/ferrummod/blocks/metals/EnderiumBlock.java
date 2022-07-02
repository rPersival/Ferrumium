package com.persival.ferrummod.blocks.metals;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EnderiumBlock extends Block {
    public EnderiumBlock() {
        super(Properties.create(Material.IRON)
            .hardnessAndResistance(8.0F, 40.0F)
            .sound(SoundType.METAL)
            .harvestLevel(3)
            .setRequiresTool()
            .harvestTool(ToolType.PICKAXE));
    }
}
