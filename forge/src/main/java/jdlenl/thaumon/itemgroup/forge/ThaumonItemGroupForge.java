package jdlenl.thaumon.itemgroup.forge;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.block.ThaumonBlocks;
import jdlenl.thaumon.itemgroup.ItemGroupUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ThaumonItemGroupForge {
    public static final DeferredRegister<CreativeModeTab> ITEM_GROUPS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Thaumon.MOD_ID);

    public static final Supplier<CreativeModeTab> THAUMON_GROUP = ITEM_GROUPS.register("thaumon_item_group",
            () -> CreativeModeTab.builder().title(Component.translatable("itemgroup.thaumon.thaumon_item_group")).icon(() -> new ItemStack(ThaumonBlocks.ELDRITCH_LANTERN.get().asItem()))
            .displayItems(((displayContext, entries) -> ItemGroupUtils.addItem(entries))).build()
    );
}
