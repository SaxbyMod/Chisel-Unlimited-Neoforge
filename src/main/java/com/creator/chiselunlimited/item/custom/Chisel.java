package com.creator.chiselunlimited.item.custom;

import com.creator.chiselunlimited.block.ModAddedBlocks;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class Chisel extends Item {
    // Create A map of block that can be clicked, to a block to turn into
    private static final Map<Block, Block> Chisel_Map =
            Map.of(
                    Blocks.STONE, Blocks.STONE_BRICKS,
                    Blocks.END_STONE, Blocks.END_STONE_BRICKS,
                    Blocks.DEEPSLATE, Blocks.DEEPSLATE_BRICKS,
                    Blocks.POLISHED_BLACKSTONE, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,
                    Blocks.GOLD_BLOCK, Blocks.IRON_BLOCK,
                    Blocks.IRON_BLOCK, Blocks.STONE,
                    Blocks.NETHERRACK, ModAddedBlocks.BISMUTH_BLOCK.get()
            );
    // Required for Extending an item
    public Chisel(Properties properties) {
        super(properties);
    }
    // Create an InteractionResult
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block click = level.getBlockState(context.getClickedPos()).getBlock();
    // If I right click do the following
        // Set Block for Click than Update it to the matching Value for the Click
        // Get the item in hand and hurt it
        // Play A sound on Usage
    if (Chisel_Map.containsKey(click)) {
        if (!level.isClientSide()) {
            // Only on Server
            level.setBlockAndUpdate(context.getClickedPos(), Chisel_Map.get(click).defaultBlockState());

            context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), context.getPlayer(), item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

            level.playSound(null, context.getClickedPos(), SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS);
        }
    }

        return InteractionResult.SUCCESS;
    }
}
