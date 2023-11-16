package jdlenl.thaumon.item.fabric;

import jdlenl.thaumon.Thaumon;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ThaumonItemsImpl {
    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> supplier) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(Thaumon.MOD_ID, id), supplier.get());
        return () -> (T) registeredItem;
    }
}
