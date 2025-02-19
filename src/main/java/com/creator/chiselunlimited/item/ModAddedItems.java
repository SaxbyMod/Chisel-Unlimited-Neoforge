package com.creator.chiselunlimited.item;


import com.creator.chiselunlimited.ChiselUnlimited;
import com.creator.chiselunlimited.item.custom.Fuel;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModAddedItems {
    // Make a List of Registries for NeoForge
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChiselUnlimited.MOD_ID);

    // Force Neoforge to REGISTER my Items
    public static void RegisterMyItems(IEventBus itemBus) {
        ITEMS.register(itemBus);
    }

    // Fuel Methods
    // Method 2 [Fuel]
    public static final DeferredItem<Item> FROSTFIRE_ICE = ITEMS.register("frostfire_ice", () -> new Fuel(800, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "frostfire_ice"))).durability(32)));
    // Method 2 [Fuel]
    public static final DeferredItem<Item> STARLIGHT_ASHES = ITEMS.register("starlight_ashes", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "starlight_ashes")))));
}