package jdlenl.thaumon.itemgroup.forge;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.block.ThaumonBlocks;
import jdlenl.thaumon.item.ThaumonItems;
import jdlenl.thaumon.itemgroup.ItemGroupUtils;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ThaumonItemGroupForge {
    public static final DeferredRegister<ItemGroup> ITEM_GROUPS = DeferredRegister.create(RegistryKeys.ITEM_GROUP, Thaumon.MOD_ID);

    public static final Supplier<ItemGroup> THAUMON_GROUP = ITEM_GROUPS.register("thaumon_item_group",
            () -> ItemGroup.builder().displayName(Text.translatable("itemgroup.thaumon.thaumon_item_group")).icon(() -> new ItemStack(ThaumonBlocks.ELDRITCH_LANTERN.get().asItem()))
            .entries(((displayContext, entries) -> {
                ItemGroupUtils.addItem(entries);
            })).build()
    );
}
