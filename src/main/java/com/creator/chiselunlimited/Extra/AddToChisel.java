package com.creator.chiselunlimited.Extra;

import com.matthewperiut.chisel.block.ChiselGroupLookup;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class AddToChisel {
    public static void addToChisel(String string, ResourceLocation blockID) {
        ChiselGroupLookup.addItemToGroup(string, blockID);
    }
    public static void addGroupToChisel(String string) {
        ChiselGroupLookup.addGroup(string);
    }
}