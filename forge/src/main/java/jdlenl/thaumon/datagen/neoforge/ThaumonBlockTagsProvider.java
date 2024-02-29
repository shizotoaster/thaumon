package jdlenl.thaumon.datagen.neoforge;

import jdlenl.thaumon.block.ThaumonBlocks;
import net.minecraft.data.DataOutput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ThaumonBlockTagsProvider extends BlockTagsProvider {
    public ThaumonBlockTagsProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ThaumonBlocks.GREATWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.GREATWOOD_DOOR.get())
                .add(ThaumonBlocks.GREATWOOD_BUTTON.get())
                .add(ThaumonBlocks.GREATWOOD_FENCE.get())
                .add(ThaumonBlocks.GREATWOOD_FENCE_GATE.get())
                .add(ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get())
                .add(ThaumonBlocks.GREATWOOD_LOG.get())
                .add(ThaumonBlocks.GREATWOOD_LOG_POST.get())
                .add(ThaumonBlocks.GREATWOOD_LOG_WALL.get())
                .add(ThaumonBlocks.GREATWOOD_PLANKS.get())
                .add(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get())
                .add(ThaumonBlocks.GREATWOOD_SLAB.get())
                .add(ThaumonBlocks.GREATWOOD_STAIRS.get())
                .add(ThaumonBlocks.GREATWOOD_TRAPDOOR.get())
                .add(ThaumonBlocks.GREATWOOD_WOOD.get())
                .add(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get())
                .add(ThaumonBlocks.ALCHEMISTS_GREATWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.CLASSIC_GREATWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.DUSTY_GREATWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get())

                .add(ThaumonBlocks.SILVERWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.SILVERWOOD_BUTTON.get())
                .add(ThaumonBlocks.SILVERWOOD_DOOR.get())
                .add(ThaumonBlocks.SILVERWOOD_FENCE.get())
                .add(ThaumonBlocks.SILVERWOOD_FENCE_GATE.get())
                .add(ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get())
                .add(ThaumonBlocks.SILVERWOOD_LOG.get())
                .add(ThaumonBlocks.SILVERWOOD_LOG_POST.get())
                .add(ThaumonBlocks.SILVERWOOD_LOG_WALL.get())
                .add(ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .add(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get())
                .add(ThaumonBlocks.SILVERWOOD_SLAB.get())
                .add(ThaumonBlocks.SILVERWOOD_STAIRS.get())
                .add(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get())
                .add(ThaumonBlocks.SILVERWOOD_WOOD.get())
                .add(ThaumonBlocks.ALCHEMISTS_SILVERWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.CLASSIC_SILVERWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.DUSTY_SILVERWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())

                .add(ThaumonBlocks.GRIMOIRE.get())
                .add(ThaumonBlocks.GRIMOIRE_STACK.get())
                .add(ThaumonBlocks.VIAL_RACK.get());

        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT)
                .add(ThaumonBlocks.GREATWOOD_LEAVES.get())
                .add(ThaumonBlocks.SILVERWOOD_LEAVES.get())
                .add(ThaumonBlocks.SILVERWOOD_LEAF_POST.get())
                .add(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get());

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ThaumonBlocks.ANCIENT_STONE_WINDOW.get())
                .add(ThaumonBlocks.ANCIENT_STONE_WINDOW_PANE.get())
                .add(ThaumonBlocks.ARCANE_STONE_WINDOW.get())
                .add(ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_WINDOW.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_WINDOW_PANE.get())
                .add(ThaumonBlocks.GREATWOOD_WINDOW.get())
                .add(ThaumonBlocks.GREATWOOD_WINDOW_PANE.get())
                .add(ThaumonBlocks.SILVERWOOD_WINDOW.get())
                .add(ThaumonBlocks.SILVERWOOD_WINDOW_PANE.get())

                .add(ThaumonBlocks.ARCANE_STONE.get())
                .add(ThaumonBlocks.ARCANE_STONE_STAIRS.get())
                .add(ThaumonBlocks.ARCANE_STONE_SlAB.get())
                .add(ThaumonBlocks.ARCANE_STONE_WALL.get())
                .add(ThaumonBlocks.ARCANE_STONE_BRICKS.get())
                .add(ThaumonBlocks.ARCANE_BRICK_STAIRS.get())
                .add(ThaumonBlocks.ARCANE_BRICK_SLAB.get())
                .add(ThaumonBlocks.ARCANE_BRICK_WALL.get())
                .add(ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get())
                .add(ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get())
                .add(ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get())
                .add(ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get())
                .add(ThaumonBlocks.ARCANE_STONE_TILES.get())
                .add(ThaumonBlocks.ARCANE_TILE_STAIRS.get())
                .add(ThaumonBlocks.ARCANE_TILE_SLAB.get())
                .add(ThaumonBlocks.ARCANE_STONE_PILLAR.get())
                .add(ThaumonBlocks.RUNIC_ARCANE_STONE.get())
                .add(ThaumonBlocks.RUNIC_ARCANE_TILES.get())
                .add(ThaumonBlocks.TILED_ARCANE_STONE.get())
                .add(ThaumonBlocks.INLAID_ARCANE_STONE.get())
                .add(ThaumonBlocks.ARCANE_LANTERN.get())
                .add(ThaumonBlocks.ARCANE_STONE_WINDOW.get())
                .add(ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get())
                .add(ThaumonBlocks.ELDRITCH_STONE.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_STAIRS.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_SLAB.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_WALL.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_TILES.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_PILLAR.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_FACADE.get())
                .add(ThaumonBlocks.CHISELED_ELDRITCH_STONE.get())
                .add(ThaumonBlocks.CARVED_ELDRITCH_STONE.get())
                .add(ThaumonBlocks.ENGRAVED_ELDRITCH_STONE.get())
                .add(ThaumonBlocks.INLAID_ELDRITCH_STONE.get())
                .add(ThaumonBlocks.ELDRITCH_LANTERN.get())
                .add(ThaumonBlocks.ANCIENT_STONE.get())
                .add(ThaumonBlocks.ANCIENT_STONE_STAIRS.get())
                .add(ThaumonBlocks.ANCIENT_STONE_SLAB.get())
                .add(ThaumonBlocks.ANCIENT_STONE_WALL.get())
                .add(ThaumonBlocks.POLISHED_ANCIENT_STONE.get())
                .add(ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get())
                .add(ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get())
                .add(ThaumonBlocks.ANCIENT_STONE_BRICKS.get())
                .add(ThaumonBlocks.CRACKED_ANCIENT_STONE_BRICKS.get())
                .add(ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get())
                .add(ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get())
                .add(ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get())
                .add(ThaumonBlocks.ANCIENT_STONE_TILES.get())
                .add(ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get())
                .add(ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get())
                .add(ThaumonBlocks.ANCIENT_STONE_DOOR.get())
                .add(ThaumonBlocks.ANCIENT_STONE_PILLAR.get())
                .add(ThaumonBlocks.ENGRAVED_ANCIENT_STONE.get())
                .add(ThaumonBlocks.CHISELED_ANCIENT_STONE.get())
                .add(ThaumonBlocks.RUNIC_ANCIENT_STONE.get())
                .add(ThaumonBlocks.TILED_ANCIENT_STONE.get())
                .add(ThaumonBlocks.INLAID_ANCIENT_STONE.get())
                .add(ThaumonBlocks.ANCIENT_LANTERN.get())

                .add(ThaumonBlocks.ARCANE_STONE_BUTTON.get())
                .add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get())
                .add(ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get())
                .add(ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get())

                .add(ThaumonBlocks.CRYSTAL_LAMP.get())
                .add(ThaumonBlocks.CRYSTAL_STAND.get())
                .add(ThaumonBlocks.RETORT.get());

        getOrCreateTagBuilder(BlockTags.STONE_BUTTONS)
                .add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get())
                .add(ThaumonBlocks.ARCANE_STONE_BUTTON.get());

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ThaumonBlocks.SILVERWOOD_BUTTON.get())
                .add(ThaumonBlocks.GREATWOOD_BUTTON.get());

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get())
                .add(ThaumonBlocks.ARCANE_STONE_BUTTON.get())
                .add(ThaumonBlocks.SILVERWOOD_BUTTON.get())
                .add(ThaumonBlocks.GREATWOOD_BUTTON.get());

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ThaumonBlocks.SILVERWOOD_DOOR.get())
                .add(ThaumonBlocks.GREATWOOD_DOOR.get())
                .add(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get());

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ThaumonBlocks.SILVERWOOD_DOOR.get())
                .add(ThaumonBlocks.GREATWOOD_DOOR.get())
                .add(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get())
                .add(ThaumonBlocks.ANCIENT_STONE_DOOR.get());

        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(ThaumonBlocks.ALCHEMISTS_GREATWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.ALCHEMISTS_SILVERWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.DUSTY_GREATWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.CLASSIC_SILVERWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.GREATWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get())
                .add(ThaumonBlocks.SILVERWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.CLASSIC_GREATWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.DUSTY_SILVERWOOD_BOOKSHELF.get())
                .add(ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get());

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ThaumonBlocks.GREATWOOD_FENCE_GATE.get())
                .add(ThaumonBlocks.SILVERWOOD_FENCE_GATE.get());

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ThaumonBlocks.GREATWOOD_FENCE.get())
                .add(ThaumonBlocks.SILVERWOOD_FENCE.get());

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ThaumonBlocks.GREATWOOD_FENCE.get())
                .add(ThaumonBlocks.SILVERWOOD_FENCE.get());

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get())
                .add(ThaumonBlocks.GREATWOOD_LEAVES.get())
                .add(ThaumonBlocks.SILVERWOOD_LEAVES.get())
                .add(ThaumonBlocks.SILVERWOOD_LEAF_POST.get());

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ThaumonBlocks.GREATWOOD_LOG.get())
                .add(ThaumonBlocks.SILVERWOOD_LOG.get());

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ThaumonBlocks.GREATWOOD_LOG.get())
                .add(ThaumonBlocks.SILVERWOOD_LOG.get());

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ThaumonBlocks.GREATWOOD_SLAB.get())
                .add(ThaumonBlocks.SILVERWOOD_SLAB.get());

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ThaumonBlocks.GREATWOOD_SLAB.get())
                .add(ThaumonBlocks.SILVERWOOD_SLAB.get())
                .add(ThaumonBlocks.ARCANE_STONE_SlAB.get())
                .add(ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get())
                .add(ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get())
                .add(ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get())
                .add(ThaumonBlocks.ANCIENT_STONE_SLAB.get())
                .add(ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get())
                .add(ThaumonBlocks.AMBER_BRICK_SLAB.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_SLAB.get())
                .add(ThaumonBlocks.ARCANE_BRICK_SLAB.get())
                .add(ThaumonBlocks.ARCANE_TILE_SLAB.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get())
                .add(ThaumonBlocks.ARCANE_TILE_SLAB.get())
                .add(ThaumonBlocks.AMBER_SLAB.get());

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ThaumonBlocks.GREATWOOD_STAIRS.get())
                .add(ThaumonBlocks.SILVERWOOD_STAIRS.get());

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ThaumonBlocks.GREATWOOD_STAIRS.get())
                .add(ThaumonBlocks.SILVERWOOD_STAIRS.get())
                .add(ThaumonBlocks.ARCANE_STONE_STAIRS.get())
                .add(ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get())
                .add(ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get())
                .add(ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get())
                .add(ThaumonBlocks.ANCIENT_STONE_STAIRS.get())
                .add(ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get())
                .add(ThaumonBlocks.AMBER_BRICK_STAIRS.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_STAIRS.get())
                .add(ThaumonBlocks.ARCANE_BRICK_STAIRS.get())
                .add(ThaumonBlocks.ARCANE_TILE_STAIRS.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get())
                .add(ThaumonBlocks.ARCANE_TILE_STAIRS.get())
                .add(ThaumonBlocks.AMBER_STAIRS.get());

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ThaumonBlocks.GREATWOOD_BUTTON.get())
                .add(ThaumonBlocks.SILVERWOOD_BUTTON.get());

        getOrCreateTagBuilder(BlockTags.STONE_BUTTONS)
                .add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get())
                .add(ThaumonBlocks.ARCANE_STONE_BUTTON.get());

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ThaumonBlocks.GREATWOOD_BUTTON.get())
                .add(ThaumonBlocks.SILVERWOOD_BUTTON.get())
                .add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get())
                .add(ThaumonBlocks.ARCANE_STONE_BUTTON.get());

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get())
                .add(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get())
                .add(ThaumonBlocks.GREATWOOD_TRAPDOOR.get());

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get())
                .add(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get())
                .add(ThaumonBlocks.GREATWOOD_TRAPDOOR.get());

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ThaumonBlocks.ARCANE_STONE_WALL.get())
                .add(ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get())
                .add(ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get())
                .add(ThaumonBlocks.GREATWOOD_LOG_WALL.get())
                .add(ThaumonBlocks.ARCANE_BRICK_WALL.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_WALL.get())
                .add(ThaumonBlocks.ANCIENT_STONE_WALL.get())
                .add(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get())
                .add(ThaumonBlocks.SILVERWOOD_LOG_WALL.get())
                .add(ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get());

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get())
                .add(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get());

        getOrCreateTagBuilder(BlockTags.STONE_PRESSURE_PLATES)
                .add(ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get())
                .add(ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get());

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get())
                .add(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get())
                .add(ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get())
                .add(ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get());

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ThaumonBlocks.GREATWOOD_PLANKS.get())
                .add(ThaumonBlocks.SILVERWOOD_PLANKS.get());

    }
}
