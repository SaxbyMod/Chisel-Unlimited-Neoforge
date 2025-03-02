package com.creator.chiselunlimited.block;

import com.creator.chiselunlimited.ChiselUnlimited;
import com.creator.chiselunlimited.item.ModAddedItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
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

    // Registries for Block Lists
    private static <T extends Block> void RegisterMyBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}
    private static <T extends SlabBlock> void RegisterMySlabbyBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}
    private static <T extends StairBlock> void RegisterMyStairyBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}
    private static <T extends FenceBlock> void RegisterMyFenceyBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}
    private static <T extends FenceGateBlock> void RegisterMyFenceyGateyBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}
    private static <T extends PressurePlateBlock> void RegisterMyPressuryPlateyBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}
    private static <T extends ButtonBlock> void RegisterMyButtonyBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}
    private static <T extends WallBlock> void RegisterMyWallyBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}
    private static <T extends LeverBlock> void RegisterMyLeveryBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}
    private static <T extends DoorBlock> void RegisterMyDooryBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}
    private static <T extends TrapDoorBlock> void RegisterMyTrapdooryBlockyItems(String Name, DeferredBlock<T> block) {ModAddedItems.ITEMS.register(Name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, Name)))));}

    // Registry Funcs for Block Lists
    private static <T extends Block> DeferredBlock<T> RegisterMyBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyBlockyItems(Name, toReturn); return toReturn;}
    private static <T extends SlabBlock> DeferredBlock<T> RegisterMySlabBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMySlabbyBlockyItems(Name, toReturn); return toReturn;}
    private static <T extends StairBlock> DeferredBlock<T> RegisterMyStairBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyStairyBlockyItems(Name, toReturn); return toReturn;}
    private static <T extends FenceBlock> DeferredBlock<T> RegisterMyFenceBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyFenceyBlockyItems(Name, toReturn); return toReturn;}
    private static <T extends FenceGateBlock> DeferredBlock<T> RegisterMyFenceGateBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyFenceyGateyBlockyItems(Name, toReturn); return toReturn;}
    private static <T extends PressurePlateBlock> DeferredBlock<T> RegisterMyPressurePlateBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyPressuryPlateyBlockyItems(Name, toReturn); return toReturn;}
    private static <T extends ButtonBlock> DeferredBlock<T> RegisterMyButtonBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyButtonyBlockyItems(Name, toReturn); return toReturn;}
    private static <T extends WallBlock> DeferredBlock<T> RegisterMyWallBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyWallyBlockyItems(Name, toReturn); return toReturn;}
    private static <T extends LeverBlock> DeferredBlock<T> RegisterMyLeverBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyLeveryBlockyItems(Name, toReturn); return toReturn;}
    private static <T extends DoorBlock> DeferredBlock<T> RegisterMyDoorBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyDooryBlockyItems(Name, toReturn); return toReturn;}
    private static <T extends TrapDoorBlock> DeferredBlock<T> RegisterMyTrapdoorBlocksAgain(String Name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(Name, block); RegisterMyTrapdooryBlockyItems(Name, toReturn); return toReturn;}

    // Debug Sets
    public static final DeferredBlock<Block> BISMUTH_BLOCK =  RegisterMyBlocksAgain("bismuth_block", () -> new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_block"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<SlabBlock> BISMUTH_SLAB =  RegisterMySlabBlocksAgain("bismuth_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_slab"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<StairBlock> BISMUTH_STAIR =  RegisterMyStairBlocksAgain("bismuth_stair", () -> new StairBlock(BISMUTH_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_stair"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<FenceBlock> BISMUTH_FENCE =  RegisterMyFenceBlocksAgain("bismuth_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_fence"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<FenceGateBlock> BISMUTH_FENCE_GATE =  RegisterMyFenceGateBlocksAgain("bismuth_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_fence_gate"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK), SoundType.BONE_BLOCK.getHitSound(),SoundType.BONE_BLOCK.getHitSound()));
    public static final DeferredBlock<PressurePlateBlock> BISMUTH_PRESSURE_PLATE =  RegisterMyPressurePlateBlocksAgain("bismuth_pressure_plate", () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_pressure_plate"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<ButtonBlock> BISMUTH_BUTTON =  RegisterMyButtonBlocksAgain("bismuth_button", () -> new ButtonBlock(BlockSetType.IRON, 8, BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_button"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<WallBlock> BISMUTH_WALL =  RegisterMyWallBlocksAgain("bismuth_wall", () -> new WallBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_wall"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<LeverBlock> BISMUTH_LEVER =  RegisterMyLeverBlocksAgain("bismuth_lever", () -> new LeverBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_lever"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<DoorBlock> BISMUTH_DOOR =  RegisterMyDoorBlocksAgain("bismuth_door", () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_door"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<TrapDoorBlock> BISMUTH_TRAPDOOR =  RegisterMyTrapdoorBlocksAgain("bismuth_trapdoor", () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_trapdoor"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    // Ores
    public static final DeferredBlock<Block> BISMUTH_ORE =  RegisterMyBlocksAgain("bismuth_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_ore"))).strength(3f).requiresCorrectToolForDrops().sound(SoundType.MUD)));
    public static final DeferredBlock<Block> BISMUTH_DEEPSLATE_ORE =  RegisterMyBlocksAgain("bismuth_deepslate_ore", () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_deepslate_ore"))).strength(4f).requiresCorrectToolForDrops().sound(SoundType.MUD_BRICKS)));
}
