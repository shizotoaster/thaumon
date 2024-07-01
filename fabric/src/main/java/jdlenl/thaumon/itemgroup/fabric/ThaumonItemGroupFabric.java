package jdlenl.thaumon.itemgroup.fabric;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.block.ThaumonBlocks;
import jdlenl.thaumon.itemgroup.ItemGroupUtils;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ThaumonItemGroupFabric {
    public static final CreativeModeTab THAUMON_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Thaumon.MOD_ID, "thaumon_item_group"),
            FabricItemGroup.builder().title(Component.translatable("itemgroup.thaumon.thaumon_item_group")).icon(() -> new ItemStack(ThaumonBlocks.ELDRITCH_LANTERN.get().asItem()))
            .displayItems(((displayContext, entries) -> ItemGroupUtils.addItem(entries))).build()
    );

    public static void init() {}
}
