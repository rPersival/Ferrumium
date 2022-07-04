package com.persival.ferrummod.blocks.metals;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeBlock;

import javax.annotation.Nonnull;
import java.util.Random;

public class UnstableEnderium extends Block implements IForgeBlock {
    public UnstableEnderium() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(12.0F, 9000.0F)
                .tickRandomly()
                .sound(SoundType.METAL)
                .harvestLevel(4)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));
    }

    public void onEntityWalk(@Nonnull World worldIn, @Nonnull BlockPos pos, @Nonnull Entity entityIn) {
        this.activate(worldIn, pos);
        super.onEntityWalk(worldIn, pos, entityIn);
    }

    private void activate(World worldIn, BlockPos pos) {
        this.spawnParticles(worldIn, pos);
        worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.BLOCK_CHORUS_FLOWER_GROW, SoundCategory.BLOCKS, 0.3F, 2.0F, false);
    }

    private void spawnParticles(World worldIn, BlockPos pos) {
        Random random = worldIn.rand;
        double d0 = 0.0625D;

        for (int i = 0; i < 6; i++) {
            double d1 = (float) pos.getX() + random.nextFloat();
            double d2 = (float) pos.getY() + random.nextFloat();
            double d3 = (float) pos.getZ() + random.nextFloat();

            if (i == 0 && !worldIn.getBlockState(pos.up()).isOpaqueCube(worldIn, pos))
                d2 = (double) pos.getY() + d0 + 1.0D;

            if (i == 1 && !worldIn.getBlockState(pos.down()).isOpaqueCube(worldIn, pos))
                d2 = (double) pos.getY() - d0;

            if (i == 2 && !worldIn.getBlockState(pos.south()).isOpaqueCube(worldIn, pos))
                d3 = (double) pos.getZ() + d0 + 1.0D;

            if (i == 3 && !worldIn.getBlockState(pos.north()).isOpaqueCube(worldIn, pos))
                d3 = (double) pos.getZ() - d0;

            if (i == 4 && !worldIn.getBlockState(pos.east()).isOpaqueCube(worldIn, pos))
                d1 = (double) pos.getX() + d0 + 1.0D;

            if (i == 5 && !worldIn.getBlockState(pos.west()).isOpaqueCube(worldIn, pos))
                d1 = (double) pos.getX() - d0;

            if (d1 < (double) pos.getX() || d1 > (double) (pos.getX() + 1) || d2 < 0.0D || d2 > (double) (pos.getY() + 1) || d3 < (double) pos.getZ() || d3 > (double) (pos.getZ() + 1))
                worldIn.addParticle(ParticleTypes.PORTAL, d1, d2, d3, 0.0D, 0.0D, 0.0D);
        }
    }
}