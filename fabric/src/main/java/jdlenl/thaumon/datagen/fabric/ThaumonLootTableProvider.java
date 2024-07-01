package jdlenl.thaumon.datagen.fabric;

import jdlenl.thaumon.datagen.ThaumonBlockLootTables;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ThaumonLootTableProvider extends FabricBlockLootTableProvider {
    public ThaumonLootTableProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate() {
        ThaumonBlockLootTables.addLoot(this);
    }
}
