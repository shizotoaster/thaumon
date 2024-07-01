package jdlenl.thaumon.datagen.neoforge;

import jdlenl.thaumon.datagen.ThaumonItemTags;
import jdlenl.thaumon.datagen.ThaumonItemTagsAdder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ThaumonItemTagsProvider extends ItemTagsProvider {


    public ThaumonItemTagsProvider(PackOutput arg, CompletableFuture<HolderLookup.Provider> completableFuture, CompletableFuture<TagLookup<Block>> completableFuture2, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(arg, completableFuture, completableFuture2, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookup) {
        for (Item item : ThaumonItemTagsAdder.STONE_BUTTONS) {
            tag(ItemTags.STONE_BUTTONS).add(item.builtInRegistryHolder().key());
            tag(ItemTags.BUTTONS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.WOODEN_BUTTONS) {
            tag(ItemTags.WOODEN_BUTTONS).add(item.builtInRegistryHolder().key());
            tag(ItemTags.BUTTONS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.WOODEN_DOORS) {
            tag(ItemTags.WOODEN_DOORS).add(item.builtInRegistryHolder().key());
            tag(ItemTags.DOORS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.NON_WOODEN_DOORS) {
            tag(ItemTags.DOORS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.FENCE_GATES) {
            tag(ItemTags.FENCE_GATES).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.WOODEN_FENCES) {
            tag(ItemTags.WOODEN_FENCES).add(item.builtInRegistryHolder().key());
            tag(ItemTags.FENCES).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.LEAVES) {
            tag(ItemTags.LEAVES).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.GREATWOOD_LOGS) {
            tag(ItemTags.LOGS_THAT_BURN).add(item.builtInRegistryHolder().key());
            tag(ItemTags.LOGS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.SILVERWOOD_LOGS) {
            tag(ItemTags.LOGS_THAT_BURN).add(item.builtInRegistryHolder().key());
            tag(ItemTags.LOGS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.WOODEN_SLABS) {
            tag(ItemTags.WOODEN_SLABS).add(item.builtInRegistryHolder().key());
            tag(ItemTags.SLABS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.NON_WOODEN_SLABS) {
            tag(ItemTags.SLABS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.WOODEN_STAIRS) {
            tag(ItemTags.WOODEN_STAIRS).add(item.builtInRegistryHolder().key());
            tag(ItemTags.STAIRS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.NON_WOODEN_STAIRS) {
            tag(ItemTags.STAIRS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.WOODEN_TRAPDOORS) {
            tag(ItemTags.WOODEN_TRAPDOORS).add(item.builtInRegistryHolder().key());
            tag(ItemTags.TRAPDOORS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.WALLS) {
            tag(ItemTags.WALLS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.WOODEN_PRESSURE_PLATES) {
            tag(ItemTags.WOODEN_PRESSURE_PLATES).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.PLANKS) {
            tag(ItemTags.PLANKS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.GREATWOOD_LOGS) {
            tag(ThaumonItemTags.GREATWOOD_LOGS).add(item.builtInRegistryHolder().key());
        }

        for (Item item : ThaumonItemTagsAdder.SILVERWOOD_LOGS) {
            tag(ThaumonItemTags.SILVERWOOD_LOGS).add(item.builtInRegistryHolder().key());
        }
    }
}
