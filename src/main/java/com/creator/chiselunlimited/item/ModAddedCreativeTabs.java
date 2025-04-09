package com.creator.chiselunlimited.item;

import com.creator.chiselunlimited.ChiselUnlimited;
import com.creator.chiselunlimited.block.ModAddedBlocks;
import com.periut.chisel.Chisel;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModAddedCreativeTabs {
    // Create a Registry Bind for Creative Tabs
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChiselUnlimited.MOD_ID);
    // Register My Tabs please Neoforge
    public static void RegisterMyTabs(IEventBus tabBus) {
        CREATIVE_TABS.register(tabBus);
    }
    // List of Tabs to Force-Feed Neoforge
    public static final Supplier<CreativeModeTab> CHISEL_UNLIMITED = CREATIVE_TABS.register("chisel_unlimited", () -> CreativeModeTab.builder()
            .icon(()-> new ItemStack(Chisel.chiselSupplier.get()))
            .title(Component.translatable("creativetab.chisel_unlimited.chisel_unlimited"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModAddedItems.FROSTFIRE_ICE.get());
                output.accept(ModAddedItems.STARLIGHT_ASHES.get());
                output.accept(ModAddedBlocks.BISMUTH_DEEPSLATE_ORE.get());
                output.accept(ModAddedBlocks.BISMUTH_BLOCK.get());
                output.accept(ModAddedBlocks.BISMUTH_ORE.get());
                output.accept(ModAddedBlocks.BISMUTH_SLAB.get());
                output.accept(ModAddedBlocks.BISMUTH_STAIR.get());
                output.accept(ModAddedBlocks.BISMUTH_FENCE.get());
                output.accept(ModAddedBlocks.BISMUTH_FENCE_GATE.get());
                output.accept(ModAddedBlocks.BISMUTH_PRESSURE_PLATE.get());
                output.accept(ModAddedBlocks.BISMUTH_BUTTON.get());
                output.accept(ModAddedBlocks.BISMUTH_WALL.get());
                output.accept(ModAddedBlocks.BISMUTH_LEVER.get());
                output.accept(ModAddedBlocks.BISMUTH_DOOR.get());
                output.accept(ModAddedBlocks.BISMUTH_TRAPDOOR.get());
                output.accept(ModAddedItems.ACCACIA_STICK.get());
                output.accept(ModAddedItems.BAMBOO_STICK.get());
                output.accept(ModAddedItems.BIRCH_STICK.get());
                output.accept(ModAddedItems.CHERRY_STICK.get());
                output.accept(ModAddedItems.CRIMSON_STICK.get());
                output.accept(ModAddedItems.DARK_OAK_STICK.get());
                output.accept(ModAddedItems.JUNGLE_STICK.get());
                output.accept(ModAddedItems.MANGROVE_STICK.get());
                output.accept(ModAddedItems.OAK_STICK.get());
                output.accept(ModAddedItems.SPRUCE_STICK.get());
                output.accept(ModAddedItems.WARPED_STICK.get());
            })
            .build());
}
