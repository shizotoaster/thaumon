package jdlenl.thaumon.item.fabric;

import jdlenl.thaumon.Thaumon;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import java.util.function.Supplier;

public class ThaumonItemsImpl {
    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> supplier) {
        Item registeredItem = Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Thaumon.MOD_ID, id), supplier.get());
        return () -> (T) registeredItem;
    }
}
