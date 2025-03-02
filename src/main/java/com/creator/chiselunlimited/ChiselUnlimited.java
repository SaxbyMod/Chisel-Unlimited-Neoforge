package com.creator.chiselunlimited;

import com.creator.chiselunlimited.Extra.AddToChisel;
import com.creator.chiselunlimited.block.ModAddedBlocks;
import com.creator.chiselunlimited.item.ModAddedCreativeTabs;
import com.creator.chiselunlimited.item.ModAddedItems;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
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
        // Create a test group of blocks and add items to it.
        AddToChisel.addGroupToChisel("bismuth");
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_BLOCK.getId());
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_BUTTON.getId());
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_STAIR.getId());
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_PRESSURE_PLATE.getId());
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_FENCE.getId());
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_FENCE_GATE.getId());
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_SLAB.getId());
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_WALL.getId());
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_LEVER.getId());
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_DOOR.getId());
        AddToChisel.addToChisel("bismuth", ModAddedBlocks.BISMUTH_TRAPDOOR.getId());

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