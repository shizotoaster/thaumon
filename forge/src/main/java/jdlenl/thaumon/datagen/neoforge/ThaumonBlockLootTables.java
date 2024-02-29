package jdlenl.thaumon.datagen.neoforge;

import jdlenl.thaumon.block.ThaumonBlocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.resource.featuretoggle.FeatureFlags;

import java.util.Set;

public class ThaumonBlockLootTables extends BlockLootTableGenerator {
    protected ThaumonBlockLootTables() {
        super(Set.of(), FeatureFlags.FEATURE_MANAGER.getFeatureSet());
    }

    @Override
    protected void generate() {
        this.addDrop(ThaumonBlocks.AMBER.get());
        this.addDrop(ThaumonBlocks.AMBER_STAIRS.get());
        this.addDrop(ThaumonBlocks.AMBER_SLAB.get());
        this.addDrop(ThaumonBlocks.AMBER_BRICKS.get());
        this.addDrop(ThaumonBlocks.AMBER_BRICK_SLAB.get());
        this.addDrop(ThaumonBlocks.AMBER_BRICK_STAIRS.get());
        this.addDrop(ThaumonBlocks.AMBERGLASS.get());
        this.addDrop(ThaumonBlocks.AMBERGLASS_PANE.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_LOG.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_WOOD.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_LOG_WALL.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_LOG_POST.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_PLANKS.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_STAIRS.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_SLAB.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_DOOR.get(), block -> doorDrops(ThaumonBlocks.GREATWOOD_DOOR.get()));
        this.addDrop(ThaumonBlocks.GREATWOOD_TRAPDOOR.get());
        this.addDrop(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get(), block -> doorDrops(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get()));
        this.addDrop(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_FENCE.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_FENCE_GATE.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_WINDOW.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_WINDOW_PANE.get());
        this.addDrop(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.CLASSIC_GREATWOOD_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.DUSTY_GREATWOOD_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.ALCHEMISTS_GREATWOOD_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_LOG.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_WOOD.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_LOG_WALL.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_LOG_POST.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_PLANKS.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_STAIRS.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_SLAB.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_DOOR.get(), block -> doorDrops(ThaumonBlocks.SILVERWOOD_DOOR.get()));
        this.addDrop(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_FENCE.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_FENCE_GATE.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_WINDOW.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_WINDOW_PANE.get());
        this.addDrop(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.CLASSIC_SILVERWOOD_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.DUSTY_SILVERWOOD_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.ALCHEMISTS_SILVERWOOD_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE_STAIRS.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE_SlAB.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE_WALL.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE_BRICKS.get());
        this.addDrop(ThaumonBlocks.ARCANE_BRICK_STAIRS.get());
        this.addDrop(ThaumonBlocks.ARCANE_BRICK_SLAB.get());
        this.addDrop(ThaumonBlocks.ARCANE_BRICK_WALL.get());
        this.addDrop(ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get());
        this.addDrop(ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get());
        this.addDrop(ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get());
        this.addDrop(ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE_TILES.get());
        this.addDrop(ThaumonBlocks.ARCANE_TILE_STAIRS.get());
        this.addDrop(ThaumonBlocks.ARCANE_TILE_SLAB.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE_PILLAR.get());
        this.addDrop(ThaumonBlocks.RUNIC_ARCANE_STONE.get());
        this.addDrop(ThaumonBlocks.INLAID_ARCANE_STONE.get());
        this.addDrop(ThaumonBlocks.ARCANE_LANTERN.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE_WINDOW.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_STAIRS.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_SLAB.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_WALL.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_TILES.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_PILLAR.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_FACADE.get());
        this.addDrop(ThaumonBlocks.CHISELED_ELDRITCH_STONE.get());
        this.addDrop(ThaumonBlocks.CARVED_ELDRITCH_STONE.get());
        this.addDrop(ThaumonBlocks.ENGRAVED_ELDRITCH_STONE.get());
        this.addDrop(ThaumonBlocks.INLAID_ELDRITCH_STONE.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_LANTERN.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_WINDOW.get());
        this.addDrop(ThaumonBlocks.ELDRITCH_STONE_WINDOW_PANE.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_STAIRS.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_SLAB.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_WALL.get());
        this.addDrop(ThaumonBlocks.POLISHED_ANCIENT_STONE.get());
        this.addDrop(ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get());
        this.addDrop(ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_BRICKS.get());
        this.addDrop(ThaumonBlocks.CRACKED_ANCIENT_STONE_BRICKS.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_TILES.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_DOOR.get(), block -> doorDrops(ThaumonBlocks.ANCIENT_STONE_DOOR.get()));
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_PILLAR.get());
        this.addDrop(ThaumonBlocks.ENGRAVED_ANCIENT_STONE.get());
        this.addDrop(ThaumonBlocks.CHISELED_ANCIENT_STONE.get());
        this.addDrop(ThaumonBlocks.RUNIC_ANCIENT_STONE.get());
        this.addDrop(ThaumonBlocks.TILED_ANCIENT_STONE.get());
        this.addDrop(ThaumonBlocks.INLAID_ANCIENT_STONE.get());
        this.addDrop(ThaumonBlocks.ANCIENT_LANTERN.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_WINDOW.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_WINDOW_PANE.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_LEAVES.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_LEAVES.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_LEAF_POST.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_BUTTON.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_BUTTON.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE_BUTTON.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_BUTTON.get());
        this.addDrop(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get());
        this.addDrop(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get());
        this.addDrop(ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get());
        this.addDrop(ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get());
        this.addDrop(ThaumonBlocks.GRIMOIRE.get());
        this.addDrop(ThaumonBlocks.GRIMOIRE_STACK.get());
        this.addDrop(ThaumonBlocks.RESEARCH_NOTES.get());
        this.addDrop(ThaumonBlocks.CRYSTAL_LAMP.get());
        this.addDrop(ThaumonBlocks.RETORT.get());
        this.addDrop(ThaumonBlocks.VIAL_RACK.get());
        this.addDrop(ThaumonBlocks.CRYSTAL_STAND.get());
        this.addDrop(ThaumonBlocks.TILED_ARCANE_STONE.get());
        this.addDrop(ThaumonBlocks.RUNIC_ARCANE_TILES.get());
    }

    /*@Override
    protected Iterable<Block> getKnownBlocks() {
        return ThaumonBlocksImpl.BLOCKS.getEntries().stream().map(DeferredHolder::get)::iterator;
    }*/
}
