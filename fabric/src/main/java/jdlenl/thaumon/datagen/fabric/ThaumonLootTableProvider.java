package jdlenl.thaumon.datagen.fabric;

import jdlenl.thaumon.datagen.ThaumonBlockLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ThaumonLootTableProvider extends FabricBlockLootTableProvider {
    public ThaumonLootTableProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generate() {
        ThaumonBlockLootTables.addLoot(this);
    }
}
