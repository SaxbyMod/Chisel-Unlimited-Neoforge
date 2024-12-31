package com.creator.chiselunlimited.item;


import com.creator.chiselunlimited.ChiselUnlimited;
import com.creator.chiselunlimited.item.custom.Chisel;
import com.creator.chiselunlimited.item.custom.Fuel;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
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

    // My List of Items to Force-Feed NEOFORGE
    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth", () -> new Item(new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "bismuth")))
    ));
    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth", () -> new Item(new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "raw_bismuth")))
    ));
    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel", () -> new Chisel(new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "chisel")))
            .durability(32)
    ));
    public static final DeferredItem<Item> RADISH = ITEMS.register("radish", () -> new Chisel(new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "radish")))
            .food(ModAddedFoodProperties.RADISH)
            // Required for a Consumable to have an Effect and a proper animation
            .component(
                    DataComponents.CONSUMABLE,
                    Consumable.builder()
                            .consumeSeconds(2f)
                            .animation(ItemUseAnimation.EAT)
                            .hasConsumeParticles(false)
                            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 0.35F))
                            .build())
    ));
    // Method 1 [Only works with Items]
    public static final DeferredItem<Item> FROSTFIRE_ICE = ITEMS.register("frostfire_ice", () -> new Fuel(800, new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "frostfire_ice")))
            .durability(32)
    ));
    // Method 2 [Works with Items and Blocks Code is in data/neoforged/data_maps/item/furnace_fuels.json]
    public static final DeferredItem<Item> STARLIGHT_ASHES = ITEMS.register("starlight_ashes", () -> new Item(new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ChiselUnlimited.MOD_ID, "starlight_ashes")))
    ));
}