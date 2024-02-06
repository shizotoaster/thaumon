package jdlenl.thaumon.itemgroup.fabric;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.block.ThaumonBlocks;
import jdlenl.thaumon.item.ThaumonItems;
import jdlenl.thaumon.itemgroup.ItemGroupUtils;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ThaumonItemGroupFabric {
    public static final ItemGroup THAUMON_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Thaumon.MOD_ID, "thaumon_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.thaumon.thaumon_item_group")).icon(() -> new ItemStack(ThaumonBlocks.ELDRITCH_LANTERN.get().asItem()))
            .entries(((displayContext, entries) -> {
                ItemGroupUtils.addItem(entries);
            })).build()
    );

    public static void init() {}
}
