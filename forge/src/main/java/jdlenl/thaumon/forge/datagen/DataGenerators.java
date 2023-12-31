package jdlenl.thaumon.forge.datagen;

import jdlenl.thaumon.Thaumon;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataOutput;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.event.listener.GameEventListener;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

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
    }
}
