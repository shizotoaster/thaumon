package jdlenl.thaumon.block.fabric;

import jdlenl.thaumon.Thaumon;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import java.util.function.Supplier;

public class ThaumonBlocksImpl {
    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier, boolean genItem) {
        Block registeredBlock = Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Thaumon.MOD_ID, id), supplier.get());
        if (genItem) {
            Item registeredItem = Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Thaumon.MOD_ID, id), new BlockItem(registeredBlock, new Item.Properties()));
        }
        return () -> (T) registeredBlock;
    }
}
