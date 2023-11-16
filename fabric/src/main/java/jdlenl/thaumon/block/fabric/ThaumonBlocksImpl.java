package jdlenl.thaumon.block.fabric;

import jdlenl.thaumon.Thaumon;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ThaumonBlocksImpl {
    public static final <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier, boolean genItem) {
        Block registeredBlock = Registry.register(Registries.BLOCK, new Identifier(Thaumon.MOD_ID, id), supplier.get());
        if (genItem) {
            Item registeredItem = Registry.register(Registries.ITEM, new Identifier(Thaumon.MOD_ID, id), new BlockItem(registeredBlock, new FabricItemSettings()));
        }
        return () -> (T) registeredBlock;
    }
}
