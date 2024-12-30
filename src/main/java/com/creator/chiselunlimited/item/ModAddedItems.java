package com.creator.chiselunlimited.item;


import com.creator.chiselunlimited.ChiselUnlimited;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModAddedItems {
    // Make a List of Registries for NeoForge
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChiselUnlimited.MOD_ID);

    // Force Neoforge to REGISTER my Items
    public static void RegisterMyItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // My List of Items to Force-Feed NEOFORGE
    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(
                    new Item.Properties().setId(
                            ResourceKey.create(
                                    Registries.ITEM,
                                    ResourceLocation.fromNamespaceAndPath(
                                            ChiselUnlimited.MOD_ID,
                                            "bismuth")))));
}