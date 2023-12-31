package jdlenl.thaumon.block.forge;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.item.forge.ThaumonItemsImpl;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ThaumonBlocksImpl {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Thaumon.MOD_ID);

    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier, boolean genItem) {
        RegistryObject<T> object = BLOCKS.register(id, supplier);
        if (genItem) {
            ThaumonItemsImpl.ITEMS.register(id, () -> new BlockItem(object.get(), new Item.Settings()));
        }
        return (Supplier<T>) object;
    }
}
