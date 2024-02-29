package jdlenl.thaumon.item.neoforge;

import jdlenl.thaumon.Thaumon;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ThaumonItemsImpl {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Thaumon.MOD_ID);

    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> supplier) {
        //RegistryObject<T> object = ITEMS.register(id, supplier);
        DeferredHolder<Item, T> object = ITEMS.register(id, supplier);
        return (DeferredHolder<Item, T>) object;
    }
}
