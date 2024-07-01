package jdlenl.thaumon.datagen.forge;

import jdlenl.thaumon.block.forge.ThaumonBlocksImpl;
import jdlenl.thaumon.datagen.ThaumonBlockLootTables;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ThaumonBlockLootTablesProvider extends BlockLootSubProvider {
    protected ThaumonBlockLootTablesProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        ThaumonBlockLootTables.addLoot(this);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ThaumonBlocksImpl.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
