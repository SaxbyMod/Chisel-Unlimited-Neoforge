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
    public static final Supplier<CreativeModeTab> CHISEL_UNLIMITED = CREATIVE_TABS.register("chisel_unlimited", () -> CreativeModeTab.builder()
            .icon(()-> new ItemStack(ModAddedBlocks.BISMUTH_BLOCK.get()))
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
            })
            .build());
}
