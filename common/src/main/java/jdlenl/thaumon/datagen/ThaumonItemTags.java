package jdlenl.thaumon.datagen;

import jdlenl.thaumon.Thaumon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ThaumonItemTags {
    public static final TagKey<Item> GREATWOOD_LOGS = tag("greatwood_logs");
    public static final TagKey<Item> SILVERWOOD_LOGS = tag("silverwood_logs");

    private static TagKey<Item> tag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Thaumon.MOD_ID, name));
    }
}
