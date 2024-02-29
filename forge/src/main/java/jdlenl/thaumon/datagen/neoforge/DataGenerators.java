package jdlenl.thaumon.datagen.neoforge;

import jdlenl.thaumon.Thaumon;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataOutput;
import net.minecraft.registry.RegistryWrapper;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Thaumon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator datagen = event.getGenerator();
        DataOutput output = datagen.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<RegistryWrapper.WrapperLookup> lookup = event.getLookupProvider();

        datagen.addProvider(event.includeServer(), ThaumonLootTableProvider.create(output));
        BlockTagsProvider blocksProvider = datagen.addProvider(event.includeServer(), new ThaumonBlockTagsProvider(output, lookup, Thaumon.MOD_ID, helper));
        datagen.addProvider(event.includeServer(), new ThaumonItemTagsProvider(output, lookup, blocksProvider.getTagLookupFuture(), Thaumon.MOD_ID, helper));
        datagen.addProvider(event.includeServer(), new ThaumonRecipeProvider(output));
    }
}
