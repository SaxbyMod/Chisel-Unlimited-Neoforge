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

    // Sticks
    public static final DeferredItem<Item> ACCACIA_STICK = ITEMS.register("accacia_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "accacia_stick")))));
    public static final DeferredItem<Item> BAMBOO_STICK = ITEMS.register("bamboo_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bamboo_stick")))));
    public static final DeferredItem<Item> BIRCH_STICK = ITEMS.register("birch_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "birch_stick")))));
    public static final DeferredItem<Item> CHERRY_STICK = ITEMS.register("cherry_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "cherry_stick")))));
    public static final DeferredItem<Item> CRIMSON_STICK = ITEMS.register("crimson_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "crimson_stick")))));
    public static final DeferredItem<Item> DARK_OAK_STICK = ITEMS.register("dark_oak_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "dark_oak_stick")))));
    public static final DeferredItem<Item> JUNGLE_STICK = ITEMS.register("jungle_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "jungle_stick")))));
    public static final DeferredItem<Item> MANGROVE_STICK = ITEMS.register("mangrove_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "mangrove_stick")))));
    public static final DeferredItem<Item> OAK_STICK = ITEMS.register("oak_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "oak_stick")))));
    public static final DeferredItem<Item> SPRUCE_STICK = ITEMS.register("spruce_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "spruce_stick")))));
    public static final DeferredItem<Item> WARPED_STICK = ITEMS.register("warped_stick", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "warped_stick")))));

    // Fuel Methods
    // Method 2 [Fuel]
    public static final DeferredItem<Item> FROSTFIRE_ICE = ITEMS.register("frostfire_ice", () -> new Fuel(800, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "frostfire_ice"))).durability(32)));
    // Method 2 [Fuel]
    public static final DeferredItem<Item> STARLIGHT_ASHES = ITEMS.register("starlight_ashes", () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "starlight_ashes")))));
}