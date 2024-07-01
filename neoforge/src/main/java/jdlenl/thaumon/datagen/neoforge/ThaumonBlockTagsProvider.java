package jdlenl.thaumon.datagen.neoforge;

import jdlenl.thaumon.datagen.ThaumonBlockTags;
import jdlenl.thaumon.datagen.ThaumonBlockTagsAdder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ThaumonBlockTagsProvider extends BlockTagsProvider {
    public ThaumonBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookup) {
        for (Block block : ThaumonBlockTagsAdder.MINEABLE_WITH_AXE) {
            tag(BlockTags.MINEABLE_WITH_AXE).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.SWORD_EFFICIENT) {
            tag(BlockTags.SWORD_EFFICIENT).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.MINEABLE_WITH_PICKAXE) {
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.STONE_BUTTONS) {
            tag(BlockTags.STONE_BUTTONS).add(block.builtInRegistryHolder().key());
            tag(BlockTags.BUTTONS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.WOODEN_BUTTONS) {
            tag(BlockTags.WOODEN_BUTTONS).add(block.builtInRegistryHolder().key());
            tag(BlockTags.BUTTONS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.WOODEN_DOORS) {
            tag(BlockTags.WOODEN_DOORS).add(block.builtInRegistryHolder().key());
            tag(BlockTags.DOORS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.NON_WOODEN_DOORS) {
            tag(BlockTags.DOORS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.ENCHANTMENT_POWER_PROVIDER) {
            tag(BlockTags.ENCHANTMENT_POWER_PROVIDER).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.FENCE_GATES) {
            tag(BlockTags.FENCE_GATES).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.WOODEN_FENCES) {
            tag(BlockTags.WOODEN_FENCES).add(block.builtInRegistryHolder().key());
            tag(BlockTags.FENCES).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.LEAVES) {
            tag(BlockTags.LEAVES).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.GREATWOOD_LOGS) {
            tag(BlockTags.LOGS_THAT_BURN).add(block.builtInRegistryHolder().key());
            tag(BlockTags.LOGS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.SILVERWOOD_LOGS) {
            tag(BlockTags.LOGS_THAT_BURN).add(block.builtInRegistryHolder().key());
            tag(BlockTags.LOGS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.WOODEN_SLABS) {
            tag(BlockTags.WOODEN_SLABS).add(block.builtInRegistryHolder().key());
            tag(BlockTags.SLABS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.NON_WOODEN_SLABS) {
            tag(BlockTags.SLABS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.WOODEN_STAIRS) {
            tag(BlockTags.WOODEN_STAIRS).add(block.builtInRegistryHolder().key());
            tag(BlockTags.STAIRS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.NON_WOODEN_STAIRS) {
            tag(BlockTags.STAIRS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.WOODEN_TRAPDOORS) {
            tag(BlockTags.WOODEN_TRAPDOORS).add(block.builtInRegistryHolder().key());
            tag(BlockTags.TRAPDOORS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.WALLS) {
            tag(BlockTags.WALLS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.WOODEN_PRESSURE_PLATES) {
            tag(BlockTags.WOODEN_PRESSURE_PLATES).add(block.builtInRegistryHolder().key());
            tag(BlockTags.PRESSURE_PLATES).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.STONE_PRESSURE_PLATES) {
            tag(BlockTags.STONE_PRESSURE_PLATES).add(block.builtInRegistryHolder().key());
            tag(BlockTags.PRESSURE_PLATES).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.PLANKS) {
            tag(BlockTags.PLANKS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.GREATWOOD_LOGS) {
            tag(ThaumonBlockTags.GREATWOOD_LOGS).add(block.builtInRegistryHolder().key());
        }

        for (Block block : ThaumonBlockTagsAdder.SILVERWOOD_LOGS) {
            tag(ThaumonBlockTags.SILVERWOOD_LOGS).add(block.builtInRegistryHolder().key());
        }
    }
}
