package com.leclowndu93150.thaumon.datagen;

import com.leclowndu93150.thaumon.Thaumon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ThaumonItemTags {
    public static final TagKey<Item> GREATWOOD_LOGS = ItemTags.create(new ResourceLocation(Thaumon.MOD_ID, "greatwood_logs"));
    public static final TagKey<Item> SILVERWOOD_LOGS = ItemTags.create(new ResourceLocation(Thaumon.MOD_ID, "silverwood_logs"));
}
