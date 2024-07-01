package jdlenl.thaumon.datagen.neoforge;

import jdlenl.thaumon.block.neoforge.ThaumonBlocksImpl;
import jdlenl.thaumon.datagen.ThaumonBlockLootTables;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ThaumonBlockLootTablesProvider extends BlockLootSubProvider {
    protected ThaumonBlockLootTablesProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        ThaumonBlockLootTables.addLoot(this);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ThaumonBlocksImpl.BLOCKS.getEntries().stream().map(Holder::value).toList();
    }
}
