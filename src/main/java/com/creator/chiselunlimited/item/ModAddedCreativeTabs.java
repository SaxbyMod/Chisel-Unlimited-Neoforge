package com.creator.chiselunlimited.item;

import com.creator.chiselunlimited.ChiselUnlimited;
import com.creator.chiselunlimited.block.ModAddedBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
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
    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_TABS.register("bismuth_items", () -> CreativeModeTab.builder()
            .icon(()-> new ItemStack(ModAddedItems.BISMUTH.get()))
            .title(Component.translatable("creativetab.chisel_unlimited.bismuth_items"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModAddedItems.BISMUTH.get());
                output.accept(ModAddedItems.RAW_BISMUTH.get());
                output.accept(ModAddedItems.CHISEL.get());
                output.accept(ModAddedItems.RADISH.get());
                output.accept(ModAddedItems.FROSTFIRE_ICE.get());
                output.accept(ModAddedItems.STARLIGHT_ASHES.get());
            })
            .build());

    public static final Supplier<CreativeModeTab> BISMUTH_BLOCK_TAB = CREATIVE_TABS.register("bismuth_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth_items"))
            .icon(()-> new ItemStack(ModAddedBlocks.BISMUTH_BLOCK.get()))
            .title(Component.translatable("creativetab.chisel_unlimited.bismuth_blocks"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModAddedBlocks.BISMUTH_BLOCK.get());
                output.accept(ModAddedBlocks.BISMUTH_ORE.get());
                output.accept(ModAddedBlocks.BISMUTH_DEEPSLATE_ORE.get());
                output.accept(ModAddedBlocks.MAGIC_BLOCK.get());
            })
            .build());
}