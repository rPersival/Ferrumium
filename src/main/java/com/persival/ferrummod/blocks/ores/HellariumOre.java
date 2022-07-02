package com.persival.ferrummod.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nonnull;

public class HellariumOre extends Block {
    public HellariumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(5.0F, 25.0F)
                .sound(SoundType.NETHER_ORE)
                .setRequiresTool()
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
    }

    @Override
    public void harvestBlock(@Nonnull World world, @Nonnull PlayerEntity player, @Nonnull BlockPos pos, @Nonnull BlockState state, TileEntity te, @Nonnull ItemStack stack) {
        super.harvestBlock(world, player, pos, state, te, stack);
        world.setBlockState(pos, Blocks.LAVA.getDefaultState());
    }
}
