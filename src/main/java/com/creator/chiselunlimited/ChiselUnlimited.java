package com.creator.chiselunlimited;

import com.creator.chiselunlimited.Extra.AddToChisel;
import com.creator.chiselunlimited.block.ModAddedBlocks;
import com.creator.chiselunlimited.item.ModAddedCreativeTabs;
import com.creator.chiselunlimited.item.ModAddedItems;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(ChiselUnlimited.MOD_ID)
public class ChiselUnlimited
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "chisel_unlimited";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public ChiselUnlimited(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModAddedCreativeTabs.RegisterMyTabs(modEventBus);
        ModAddedItems.RegisterMyItems(modEventBus);
        ModAddedBlocks.RegisterMyBlocks(modEventBus);
        // Add our test Blocks to the Andesite Chisel Group
        AddToChisel.addToChisel("andesite", ModAddedBlocks.BISMUTH_BLOCK.getId());
        AddToChisel.addToChisel("andesite", ModAddedBlocks.BISMUTH_DEEPSLATE_ORE.getId());
        AddToChisel.addToChisel("andesite", ModAddedBlocks.BISMUTH_ORE.getId());

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        // Add BISMUTH to INGREDIENTS
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModAddedItems.FROSTFIRE_ICE.get());
            event.accept(ModAddedItems.STARLIGHT_ASHES.get());
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModAddedBlocks.BISMUTH_BLOCK.get());
            event.accept(ModAddedBlocks.BISMUTH_ORE.get());
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}