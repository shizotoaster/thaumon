package com.leclowndu93150.thaumon.datagen;

import com.leclowndu93150.thaumon.Thaumon;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Thaumon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        gen.addProvider(new ThaumonRecipeProvider(gen));
        gen.addProvider(new ThaumonLootTableProvider(gen));
        ThaumonBlockTagsProvider blockTags = new ThaumonBlockTagsProvider(gen, helper);
        gen.addProvider(blockTags);
        gen.addProvider(new ThaumonItemTagsProvider(gen, blockTags, helper));
    }
}
