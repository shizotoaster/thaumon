package com.leclowndu93150.thaumon.datagen;

import com.leclowndu93150.thaumon.Thaumon;
import com.leclowndu93150.thaumon.block.ThaumonBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ThaumonBlockTagsProvider extends BlockTagsProvider {
    public ThaumonBlockTagsProvider(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, Thaumon.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(ThaumonBlockTags.GREATWOOD_LOGS).add(
                ThaumonBlocks.GREATWOOD_LOG.get(),
                ThaumonBlocks.GREATWOOD_WOOD.get()
        );

        tag(ThaumonBlockTags.SILVERWOOD_LOGS).add(
                ThaumonBlocks.SILVERWOOD_LOG.get(),
                ThaumonBlocks.SILVERWOOD_WOOD.get()
        );

        tag(BlockTags.LOGS_THAT_BURN)
                .addTag(ThaumonBlockTags.GREATWOOD_LOGS)
                .addTag(ThaumonBlockTags.SILVERWOOD_LOGS);

        tag(BlockTags.MINEABLE_WITH_AXE).add(
                ThaumonBlocks.GREATWOOD_LOG.get(),
                ThaumonBlocks.GREATWOOD_WOOD.get(),
                ThaumonBlocks.GREATWOOD_LOG_WALL.get(),
                ThaumonBlocks.GREATWOOD_LOG_POST.get(),
                ThaumonBlocks.GREATWOOD_PLANKS.get(),
                ThaumonBlocks.GREATWOOD_STAIRS.get(),
                ThaumonBlocks.GREATWOOD_SLAB.get(),
                ThaumonBlocks.GREATWOOD_DOOR.get(),
                ThaumonBlocks.GREATWOOD_TRAPDOOR.get(),
                ThaumonBlocks.GILDED_GREATWOOD_DOOR.get(),
                ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get(),
                ThaumonBlocks.GREATWOOD_FENCE.get(),
                ThaumonBlocks.GREATWOOD_FENCE_GATE.get(),
                ThaumonBlocks.GREATWOOD_BUTTON.get(),
                ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get(),
                ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get(),
                ThaumonBlocks.GREATWOOD_BOOKSHELF.get(),
                ThaumonBlocks.CLASSIC_GREATWOOD_BOOKSHELF.get(),
                ThaumonBlocks.DUSTY_GREATWOOD_BOOKSHELF.get(),
                ThaumonBlocks.ALCHEMISTS_GREATWOOD_BOOKSHELF.get(),
                ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get(),
                ThaumonBlocks.SILVERWOOD_LOG.get(),
                ThaumonBlocks.SILVERWOOD_WOOD.get(),
                ThaumonBlocks.SILVERWOOD_LOG_WALL.get(),
                ThaumonBlocks.SILVERWOOD_LOG_POST.get(),
                ThaumonBlocks.SILVERWOOD_PLANKS.get(),
                ThaumonBlocks.SILVERWOOD_STAIRS.get(),
                ThaumonBlocks.SILVERWOOD_SLAB.get(),
                ThaumonBlocks.SILVERWOOD_DOOR.get(),
                ThaumonBlocks.SILVERWOOD_TRAPDOOR.get(),
                ThaumonBlocks.SILVERWOOD_FENCE.get(),
                ThaumonBlocks.SILVERWOOD_FENCE_GATE.get(),
                ThaumonBlocks.SILVERWOOD_BUTTON.get(),
                ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get(),
                ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get(),
                ThaumonBlocks.SILVERWOOD_BOOKSHELF.get(),
                ThaumonBlocks.CLASSIC_SILVERWOOD_BOOKSHELF.get(),
                ThaumonBlocks.DUSTY_SILVERWOOD_BOOKSHELF.get(),
                ThaumonBlocks.ALCHEMISTS_SILVERWOOD_BOOKSHELF.get(),
                ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get(),
                ThaumonBlocks.GRIMOIRE.get(),
                ThaumonBlocks.GRIMOIRE_STACK.get(),
                ThaumonBlocks.VIAL_RACK.get()
        );

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ThaumonBlocks.AMBER.get(),
                ThaumonBlocks.AMBER_STAIRS.get(),
                ThaumonBlocks.AMBER_SLAB.get(),
                ThaumonBlocks.AMBER_BRICKS.get(),
                ThaumonBlocks.AMBER_BRICK_STAIRS.get(),
                ThaumonBlocks.AMBER_BRICK_SLAB.get(),
                ThaumonBlocks.AMBERGLASS.get(),
                ThaumonBlocks.AMBERGLASS_PANE.get(),
                ThaumonBlocks.GREATWOOD_WINDOW.get(),
                ThaumonBlocks.GREATWOOD_WINDOW_PANE.get(),
                ThaumonBlocks.SILVERWOOD_WINDOW.get(),
                ThaumonBlocks.SILVERWOOD_WINDOW_PANE.get(),
                ThaumonBlocks.ARCANE_STONE.get(),
                ThaumonBlocks.ARCANE_STONE_STAIRS.get(),
                ThaumonBlocks.ARCANE_STONE_SLAB.get(),
                ThaumonBlocks.ARCANE_STONE_WALL.get(),
                ThaumonBlocks.ARCANE_STONE_BRICKS.get(),
                ThaumonBlocks.ARCANE_BRICK_STAIRS.get(),
                ThaumonBlocks.ARCANE_BRICK_SLAB.get(),
                ThaumonBlocks.ARCANE_BRICK_WALL.get(),
                ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get(),
                ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get(),
                ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get(),
                ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get(),
                ThaumonBlocks.ARCANE_STONE_TILES.get(),
                ThaumonBlocks.ARCANE_TILE_STAIRS.get(),
                ThaumonBlocks.ARCANE_TILE_SLAB.get(),
                ThaumonBlocks.ARCANE_STONE_PILLAR.get(),
                ThaumonBlocks.RUNIC_ARCANE_STONE.get(),
                ThaumonBlocks.RUNIC_ARCANE_TILES.get(),
                ThaumonBlocks.TILED_ARCANE_STONE.get(),
                ThaumonBlocks.INLAID_ARCANE_STONE.get(),
                ThaumonBlocks.ARCANE_LANTERN.get(),
                ThaumonBlocks.ARCANE_STONE_WINDOW.get(),
                ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get(),
                ThaumonBlocks.ARCANE_STONE_BUTTON.get(),
                ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get(),
                ThaumonBlocks.ELDRITCH_STONE.get(),
                ThaumonBlocks.ELDRITCH_STONE_STAIRS.get(),
                ThaumonBlocks.ELDRITCH_STONE_SLAB.get(),
                ThaumonBlocks.ELDRITCH_STONE_WALL.get(),
                ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(),
                ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get(),
                ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get(),
                ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get(),
                ThaumonBlocks.ELDRITCH_STONE_TILES.get(),
                ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get(),
                ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get(),
                ThaumonBlocks.ELDRITCH_STONE_PILLAR.get(),
                ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get(),
                ThaumonBlocks.ELDRITCH_STONE_FACADE.get(),
                ThaumonBlocks.CHISELED_ELDRITCH_STONE.get(),
                ThaumonBlocks.CARVED_ELDRITCH_STONE.get(),
                ThaumonBlocks.ENGRAVED_ELDRITCH_STONE.get(),
                ThaumonBlocks.INLAID_ELDRITCH_STONE.get(),
                ThaumonBlocks.ELDRITCH_LANTERN.get(),
                ThaumonBlocks.ELDRITCH_STONE_WINDOW.get(),
                ThaumonBlocks.ELDRITCH_STONE_WINDOW_PANE.get(),
                ThaumonBlocks.ANCIENT_STONE.get(),
                ThaumonBlocks.ANCIENT_STONE_STAIRS.get(),
                ThaumonBlocks.ANCIENT_STONE_SLAB.get(),
                ThaumonBlocks.ANCIENT_STONE_WALL.get(),
                ThaumonBlocks.POLISHED_ANCIENT_STONE.get(),
                ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get(),
                ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get(),
                ThaumonBlocks.ANCIENT_STONE_BRICKS.get(),
                ThaumonBlocks.CRACKED_ANCIENT_STONE_BRICKS.get(),
                ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get(),
                ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get(),
                ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get(),
                ThaumonBlocks.ANCIENT_STONE_TILES.get(),
                ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get(),
                ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get(),
                ThaumonBlocks.ANCIENT_STONE_DOOR.get(),
                ThaumonBlocks.ANCIENT_STONE_PILLAR.get(),
                ThaumonBlocks.ENGRAVED_ANCIENT_STONE.get(),
                ThaumonBlocks.CHISELED_ANCIENT_STONE.get(),
                ThaumonBlocks.RUNIC_ANCIENT_STONE.get(),
                ThaumonBlocks.TILED_ANCIENT_STONE.get(),
                ThaumonBlocks.INLAID_ANCIENT_STONE.get(),
                ThaumonBlocks.ANCIENT_LANTERN.get(),
                ThaumonBlocks.ANCIENT_STONE_WINDOW.get(),
                ThaumonBlocks.ANCIENT_STONE_WINDOW_PANE.get(),
                ThaumonBlocks.ANCIENT_STONE_BUTTON.get(),
                ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get(),
                ThaumonBlocks.CRYSTAL_LAMP.get(),
                ThaumonBlocks.CRYSTAL_STAND.get(),
                ThaumonBlocks.RETORT.get()
        );

        tag(BlockTags.MINEABLE_WITH_HOE).add(
                ThaumonBlocks.GREATWOOD_LEAVES.get(),
                ThaumonBlocks.SILVERWOOD_LEAVES.get(),
                ThaumonBlocks.SILVERWOOD_LEAF_WALL.get(),
                ThaumonBlocks.SILVERWOOD_LEAF_POST.get()
        );

        tag(BlockTags.WOODEN_BUTTONS).add(
                ThaumonBlocks.GREATWOOD_BUTTON.get(),
                ThaumonBlocks.SILVERWOOD_BUTTON.get()
        );

        tag(BlockTags.BUTTONS).add(
                ThaumonBlocks.GREATWOOD_BUTTON.get(),
                ThaumonBlocks.SILVERWOOD_BUTTON.get(),
                ThaumonBlocks.ARCANE_STONE_BUTTON.get(),
                ThaumonBlocks.ANCIENT_STONE_BUTTON.get()
        );

        tag(BlockTags.WOODEN_DOORS).add(
                ThaumonBlocks.GREATWOOD_DOOR.get(),
                ThaumonBlocks.GILDED_GREATWOOD_DOOR.get(),
                ThaumonBlocks.SILVERWOOD_DOOR.get()
        );

        tag(BlockTags.DOORS).add(
                ThaumonBlocks.GREATWOOD_DOOR.get(),
                ThaumonBlocks.GILDED_GREATWOOD_DOOR.get(),
                ThaumonBlocks.SILVERWOOD_DOOR.get(),
                ThaumonBlocks.ANCIENT_STONE_DOOR.get()
        );

        tag(BlockTags.FENCE_GATES).add(
                ThaumonBlocks.GREATWOOD_FENCE_GATE.get(),
                ThaumonBlocks.SILVERWOOD_FENCE_GATE.get()
        );

        tag(BlockTags.WOODEN_FENCES).add(
                ThaumonBlocks.GREATWOOD_FENCE.get(),
                ThaumonBlocks.SILVERWOOD_FENCE.get()
        );

        tag(BlockTags.FENCES).add(
                ThaumonBlocks.GREATWOOD_FENCE.get(),
                ThaumonBlocks.SILVERWOOD_FENCE.get()
        );

        tag(BlockTags.LEAVES).add(
                ThaumonBlocks.GREATWOOD_LEAVES.get(),
                ThaumonBlocks.SILVERWOOD_LEAVES.get(),
                ThaumonBlocks.SILVERWOOD_LEAF_WALL.get(),
                ThaumonBlocks.SILVERWOOD_LEAF_POST.get()
        );

        tag(BlockTags.WOODEN_SLABS).add(
                ThaumonBlocks.GREATWOOD_SLAB.get(),
                ThaumonBlocks.SILVERWOOD_SLAB.get()
        );

        tag(BlockTags.SLABS).add(
                ThaumonBlocks.GREATWOOD_SLAB.get(),
                ThaumonBlocks.SILVERWOOD_SLAB.get(),
                ThaumonBlocks.AMBER_SLAB.get(),
                ThaumonBlocks.AMBER_BRICK_SLAB.get(),
                ThaumonBlocks.ARCANE_STONE_SLAB.get(),
                ThaumonBlocks.ARCANE_BRICK_SLAB.get(),
                ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get(),
                ThaumonBlocks.ARCANE_TILE_SLAB.get(),
                ThaumonBlocks.ELDRITCH_STONE_SLAB.get(),
                ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get(),
                ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get(),
                ThaumonBlocks.ANCIENT_STONE_SLAB.get(),
                ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get(),
                ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get(),
                ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get()
        );

        tag(BlockTags.WOODEN_STAIRS).add(
                ThaumonBlocks.GREATWOOD_STAIRS.get(),
                ThaumonBlocks.SILVERWOOD_STAIRS.get()
        );

        tag(BlockTags.STAIRS).add(
                ThaumonBlocks.GREATWOOD_STAIRS.get(),
                ThaumonBlocks.SILVERWOOD_STAIRS.get(),
                ThaumonBlocks.AMBER_STAIRS.get(),
                ThaumonBlocks.AMBER_BRICK_STAIRS.get(),
                ThaumonBlocks.ARCANE_STONE_STAIRS.get(),
                ThaumonBlocks.ARCANE_BRICK_STAIRS.get(),
                ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get(),
                ThaumonBlocks.ARCANE_TILE_STAIRS.get(),
                ThaumonBlocks.ELDRITCH_STONE_STAIRS.get(),
                ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get(),
                ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get(),
                ThaumonBlocks.ANCIENT_STONE_STAIRS.get(),
                ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get(),
                ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get(),
                ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get()
        );

        tag(BlockTags.WOODEN_TRAPDOORS).add(
                ThaumonBlocks.GREATWOOD_TRAPDOOR.get(),
                ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get(),
                ThaumonBlocks.SILVERWOOD_TRAPDOOR.get()
        );

        tag(BlockTags.TRAPDOORS).add(
                ThaumonBlocks.GREATWOOD_TRAPDOOR.get(),
                ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get(),
                ThaumonBlocks.SILVERWOOD_TRAPDOOR.get()
        );

        tag(BlockTags.WALLS).add(
                ThaumonBlocks.GREATWOOD_LOG_WALL.get(),
                ThaumonBlocks.SILVERWOOD_LOG_WALL.get(),
                ThaumonBlocks.SILVERWOOD_LEAF_WALL.get(),
                ThaumonBlocks.ARCANE_STONE_WALL.get(),
                ThaumonBlocks.ARCANE_BRICK_WALL.get(),
                ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get(),
                ThaumonBlocks.ELDRITCH_STONE_WALL.get(),
                ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get(),
                ThaumonBlocks.ANCIENT_STONE_WALL.get(),
                ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get()
        );

        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(
                ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get(),
                ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get()
        );

        tag(BlockTags.STONE_PRESSURE_PLATES).add(
                ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get(),
                ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get()
        );

        tag(BlockTags.PLANKS).add(
                ThaumonBlocks.GREATWOOD_PLANKS.get(),
                ThaumonBlocks.SILVERWOOD_PLANKS.get()
        );
    }
}
