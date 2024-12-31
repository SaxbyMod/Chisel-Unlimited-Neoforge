package com.creator.chiselunlimited.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.FuelValues;
import org.jetbrains.annotations.Nullable;

public class Fuel extends Item {
    // Create a burntime var
    private int burnTime = 0;

    // Get the Properties and Burntime
    public Fuel(int burnTime, Properties properties) {
        super(properties);
        this.burnTime = burnTime;
    }
    // Get the burn time and pass it to the furnace recipes and such
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType, FuelValues fuelValues) {
        return this.burnTime;
    }
}
