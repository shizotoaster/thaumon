package jdlenl.thaumon.block.neoforge;

import jdlenl.thaumon.Thaumon;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ThaumonBlocksImpl {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Thaumon.MOD_ID);

    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier, boolean genItem) {
        //RegistryObject<T> object = BLOCKS.register(id, supplier);
        DeferredHolder<Block, T> object = BLOCKS.register(id, supplier);
        if (genItem) {
            //ThaumonItemsImpl.ITEMS.register(id, () -> new BlockItem(object.get(), new Item.Settings()));
        }
        return (DeferredHolder<Block, T>) object;
    }
}
