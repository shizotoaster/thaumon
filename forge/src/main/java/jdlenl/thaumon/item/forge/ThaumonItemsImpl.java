package jdlenl.thaumon.item.forge;

import jdlenl.thaumon.Thaumon;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ThaumonItemsImpl {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Thaumon.MOD_ID);

    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> supplier) {
        RegistryObject<T> object = ITEMS.register(id, supplier);
        return (Supplier<T>) object;
    }
}
