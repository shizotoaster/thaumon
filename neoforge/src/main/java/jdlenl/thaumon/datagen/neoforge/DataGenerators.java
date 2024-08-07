package jdlenl.thaumon.datagen.neoforge;

import jdlenl.thaumon.Thaumon;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Thaumon.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator datagen = event.getGenerator();
        PackOutput output = datagen.getPackOutput();
        CompletableFuture<HolderLookup.Provider> future = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookup = event.getLookupProvider();

        datagen.addProvider(event.includeServer(), ThaumonLootTableProvider.create(output, future));
        BlockTagsProvider blocksProvider = datagen.addProvider(event.includeServer(), new ThaumonBlockTagsProvider(output, lookup, Thaumon.MOD_ID, helper));
        datagen.addProvider(event.includeServer(), new ThaumonItemTagsProvider(output, lookup, blocksProvider.contentsGetter(), Thaumon.MOD_ID, helper));
        datagen.addProvider(event.includeServer(), new ThaumonRecipeProvider(output, future));
    }
}
