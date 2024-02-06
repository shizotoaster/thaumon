package jdlenl.thaumon.datagen.fabric;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerators implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ThaumonLootTableProvider::new);
        pack.addProvider(ThaumonBlockTagsProvider::new);
        pack.addProvider(ThaumonItemTagsProvider::new);
        pack.addProvider(ThaumonRecipeProvider::new);
    }
}
