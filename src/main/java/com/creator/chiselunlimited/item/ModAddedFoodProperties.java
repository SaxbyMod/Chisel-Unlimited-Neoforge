package com.creator.chiselunlimited.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.TeleportRandomlyConsumeEffect;
import net.neoforged.neoforge.registries.DeferredItem;

import static com.creator.chiselunlimited.item.ModAddedItems.ITEMS;

public class ModAddedFoodProperties {
    // Basic Food Properties for an Item
    public static final FoodProperties RADISH = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .build();
}
