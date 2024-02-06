package jdlenl.thaumon.datagen.fabric;

import jdlenl.thaumon.block.ThaumonBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ThaumonItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ThaumonItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.STONE_BUTTONS)
                .add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get().asItem())
                .add(ThaumonBlocks.ARCANE_STONE_BUTTON.get().asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ThaumonBlocks.SILVERWOOD_BUTTON.get().asItem())
                .add(ThaumonBlocks.GREATWOOD_BUTTON.get().asItem());

        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get().asItem())
                .add(ThaumonBlocks.ARCANE_STONE_BUTTON.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_BUTTON.get().asItem())
                .add(ThaumonBlocks.GREATWOOD_BUTTON.get().asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ThaumonBlocks.SILVERWOOD_DOOR.get().asItem())
                .add(ThaumonBlocks.GREATWOOD_DOOR.get().asItem())
                .add(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get().asItem());

        getOrCreateTagBuilder(ItemTags.DOORS)
                .add(ThaumonBlocks.SILVERWOOD_DOOR.get().asItem())
                .add(ThaumonBlocks.GREATWOOD_DOOR.get().asItem())
                .add(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get().asItem())
                .add(ThaumonBlocks.ANCIENT_STONE_DOOR.get().asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ThaumonBlocks.GREATWOOD_FENCE_GATE.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_FENCE_GATE.get().asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ThaumonBlocks.GREATWOOD_FENCE.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_FENCE.get().asItem());

        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(ThaumonBlocks.GREATWOOD_FENCE.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_FENCE.get().asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get().asItem())
                .add(ThaumonBlocks.GREATWOOD_LEAVES.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_LEAVES.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_LEAF_POST.get().asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ThaumonBlocks.GREATWOOD_LOG.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_LOG.get().asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ThaumonBlocks.GREATWOOD_LOG.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_LOG.get().asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ThaumonBlocks.GREATWOOD_SLAB.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_SLAB.get().asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ThaumonBlocks.GREATWOOD_SLAB.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_SLAB.get().asItem())
                .add(ThaumonBlocks.ARCANE_STONE_SlAB.get().asItem())
                .add(ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get().asItem())
                .add(ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get().asItem())
                .add(ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get().asItem())
                .add(ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get().asItem())
                .add(ThaumonBlocks.ANCIENT_STONE_SLAB.get().asItem())
                .add(ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get().asItem())
                .add(ThaumonBlocks.AMBER_BRICK_SLAB.get().asItem())
                .add(ThaumonBlocks.ELDRITCH_STONE_SLAB.get().asItem())
                .add(ThaumonBlocks.ARCANE_BRICK_SLAB.get().asItem())
                .add(ThaumonBlocks.ARCANE_TILE_SLAB.get().asItem())
                .add(ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get().asItem())
                .add(ThaumonBlocks.ARCANE_TILE_SLAB.get().asItem())
                .add(ThaumonBlocks.AMBER_SLAB.get().asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ThaumonBlocks.GREATWOOD_STAIRS.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_STAIRS.get().asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ThaumonBlocks.GREATWOOD_STAIRS.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_STAIRS.get().asItem())
                .add(ThaumonBlocks.ARCANE_STONE_STAIRS.get().asItem())
                .add(ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get().asItem())
                .add(ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get().asItem())
                .add(ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get().asItem())
                .add(ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get().asItem())
                .add(ThaumonBlocks.ANCIENT_STONE_STAIRS.get().asItem())
                .add(ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get().asItem())
                .add(ThaumonBlocks.AMBER_BRICK_STAIRS.get().asItem())
                .add(ThaumonBlocks.ELDRITCH_STONE_STAIRS.get().asItem())
                .add(ThaumonBlocks.ARCANE_BRICK_STAIRS.get().asItem())
                .add(ThaumonBlocks.ARCANE_TILE_STAIRS.get().asItem())
                .add(ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get().asItem())
                .add(ThaumonBlocks.ARCANE_TILE_STAIRS.get().asItem())
                .add(ThaumonBlocks.AMBER_STAIRS.get().asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ThaumonBlocks.GREATWOOD_BUTTON.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_BUTTON.get().asItem());

        getOrCreateTagBuilder(ItemTags.STONE_BUTTONS)
                .add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get().asItem())
                .add(ThaumonBlocks.ARCANE_STONE_BUTTON.get().asItem());

        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(ThaumonBlocks.GREATWOOD_BUTTON.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_BUTTON.get().asItem())
                .add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get().asItem())
                .add(ThaumonBlocks.ARCANE_STONE_BUTTON.get().asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get().asItem())
                .add(ThaumonBlocks.GREATWOOD_TRAPDOOR.get().asItem());

        getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get().asItem())
                .add(ThaumonBlocks.GREATWOOD_TRAPDOOR.get().asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ThaumonBlocks.ARCANE_STONE_WALL.get().asItem())
                .add(ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get().asItem())
                .add(ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get().asItem())
                .add(ThaumonBlocks.GREATWOOD_LOG_WALL.get().asItem())
                .add(ThaumonBlocks.ARCANE_BRICK_WALL.get().asItem())
                .add(ThaumonBlocks.ELDRITCH_STONE_WALL.get().asItem())
                .add(ThaumonBlocks.ANCIENT_STONE_WALL.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_LOG_WALL.get().asItem())
                .add(ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get().asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get().asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem())
                .add(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem());

    }
}
