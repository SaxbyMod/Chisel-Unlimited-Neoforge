package com.creator.chiselunlimited.block;

import com.creator.chiselunlimited.ChiselUnlimited;
import com.creator.chiselunlimited.item.ModAddedItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModAddedBlocks {
    // Create a list of blocks for Neoforge
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ChiselUnlimited.MOD_ID);

    // Force Neoforge to Register my Blocks
    public static void RegisterMyBlocks(IEventBus blockBus) {
        BLOCKS.register(blockBus);
    }

    // Make My blocks have Items TOO
    private static <T extends Block> void RegisterMyBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}

    // Make A deferred Block so I can also Pass that Block to the BlockyItems Upon Creation
    private static <T extends Block> DeferredBlock<T> RegisterMyBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyBlockyItems(Name, toReturn); return toReturn;}

    // A list of blocks to Force-Feed Neoforge
    public static final DeferredBlock<Block> BISMUTH_BLOCK =  RegisterMyBlocksAgain("bismuth_block", () -> new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_block"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<Block> BISMUTH_ORE =  RegisterMyBlocksAgain("bismuth_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_ore"))).strength(3f).requiresCorrectToolForDrops().sound(SoundType.MUD)));
    public static final DeferredBlock<Block> BISMUTH_DEEPSLATE_ORE =  RegisterMyBlocksAgain("bismuth_deepslate_ore", () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_deepslate_ore"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
}
