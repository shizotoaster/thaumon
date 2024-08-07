package jdlenl.thaumon.block.neoforge;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.item.neoforge.ThaumonItemsImpl;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ThaumonBlocksImpl {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Thaumon.MOD_ID);

    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier, boolean genItem) {
        DeferredHolder<Block, T> object = BLOCKS.register(id, supplier);
        if (genItem) {
            ThaumonItemsImpl.ITEMS.register(id, () -> new BlockItem(object.get(), new Item.Properties()));
        }
        return (DeferredHolder<Block, T>) object;
    }
}
