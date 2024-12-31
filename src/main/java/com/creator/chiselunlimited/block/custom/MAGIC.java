package com.creator.chiselunlimited.block.custom;

import com.creator.chiselunlimited.item.ModAddedItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;


public class MAGIC extends Block {
    // Required to extend a Block
    public MAGIC(Properties properties) {
        super(properties);
    }
    // When Right click play a Sound
    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        level.playSound(player, pos, SoundEvents.AMETHYST_CLUSTER_STEP, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }
    // When a item is placed upon the block do the following
        // If the entity is a Item entity do the following
            // If the Item Stack of an Item is equal to a defined Item do the following
                // Set the Item Stack to a new Item as defined in position one with the same stack amount as item entity
    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof ItemEntity itemEntity) {
            if (itemEntity.getItem().getItem() == ModAddedItems.RAW_BISMUTH.get()) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DANDELION) {
                itemEntity.setItem(new ItemStack(Items.WITHER_ROSE, itemEntity.getItem().getCount()));
            }
        }

        super.stepOn(level, pos, state, entity);
    }
}
