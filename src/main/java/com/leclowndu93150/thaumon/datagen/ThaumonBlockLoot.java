package com.leclowndu93150.thaumon.datagen;

import com.leclowndu93150.thaumon.block.ThaumonBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.stream.Collectors;

public class ThaumonBlockLoot extends BlockLoot {
    @Override
    protected void addTables() {
        dropSelf(ThaumonBlocks.AMBER.get());
        dropSelf(ThaumonBlocks.AMBER_STAIRS.get());
        dropSelf(ThaumonBlocks.AMBER_SLAB.get());
        dropSelf(ThaumonBlocks.AMBER_BRICKS.get());
        dropSelf(ThaumonBlocks.AMBER_BRICK_STAIRS.get());
        dropSelf(ThaumonBlocks.AMBER_BRICK_SLAB.get());
        dropSelf(ThaumonBlocks.AMBERGLASS.get());
        dropSelf(ThaumonBlocks.AMBERGLASS_PANE.get());

        dropSelf(ThaumonBlocks.GREATWOOD_LOG.get());
        dropSelf(ThaumonBlocks.GREATWOOD_WOOD.get());
        dropSelf(ThaumonBlocks.GREATWOOD_LOG_WALL.get());
        dropSelf(ThaumonBlocks.GREATWOOD_LOG_POST.get());
        dropSelf(ThaumonBlocks.GREATWOOD_PLANKS.get());
        dropSelf(ThaumonBlocks.GREATWOOD_STAIRS.get());
        dropSelf(ThaumonBlocks.GREATWOOD_SLAB.get());
        add(ThaumonBlocks.GREATWOOD_DOOR.get(), createDoorTable(ThaumonBlocks.GREATWOOD_DOOR.get()));
        dropSelf(ThaumonBlocks.GREATWOOD_TRAPDOOR.get());
        add(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get(), createDoorTable(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get()));
        dropSelf(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get());
        dropSelf(ThaumonBlocks.GREATWOOD_FENCE.get());
        dropSelf(ThaumonBlocks.GREATWOOD_FENCE_GATE.get());
        dropSelf(ThaumonBlocks.GREATWOOD_WINDOW.get());
        dropSelf(ThaumonBlocks.GREATWOOD_WINDOW_PANE.get());
        dropSelf(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get());
        dropSelf(ThaumonBlocks.GREATWOOD_BOOKSHELF.get());
        dropSelf(ThaumonBlocks.CLASSIC_GREATWOOD_BOOKSHELF.get());
        dropSelf(ThaumonBlocks.DUSTY_GREATWOOD_BOOKSHELF.get());
        dropSelf(ThaumonBlocks.ALCHEMISTS_GREATWOOD_BOOKSHELF.get());
        dropSelf(ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get());

        dropSelf(ThaumonBlocks.SILVERWOOD_LOG.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_WOOD.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_LOG_WALL.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_LOG_POST.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_PLANKS.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_STAIRS.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_SLAB.get());
        add(ThaumonBlocks.SILVERWOOD_DOOR.get(), createDoorTable(ThaumonBlocks.SILVERWOOD_DOOR.get()));
        dropSelf(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_FENCE.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_FENCE_GATE.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_WINDOW.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_WINDOW_PANE.get());
        dropSelf(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_BOOKSHELF.get());
        dropSelf(ThaumonBlocks.CLASSIC_SILVERWOOD_BOOKSHELF.get());
        dropSelf(ThaumonBlocks.DUSTY_SILVERWOOD_BOOKSHELF.get());
        dropSelf(ThaumonBlocks.ALCHEMISTS_SILVERWOOD_BOOKSHELF.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get());

        dropSelf(ThaumonBlocks.ARCANE_STONE.get());
        dropSelf(ThaumonBlocks.ARCANE_STONE_STAIRS.get());
        dropSelf(ThaumonBlocks.ARCANE_STONE_SLAB.get());
        dropSelf(ThaumonBlocks.ARCANE_STONE_WALL.get());
        dropSelf(ThaumonBlocks.ARCANE_STONE_BRICKS.get());
        dropSelf(ThaumonBlocks.ARCANE_BRICK_STAIRS.get());
        dropSelf(ThaumonBlocks.ARCANE_BRICK_SLAB.get());
        dropSelf(ThaumonBlocks.ARCANE_BRICK_WALL.get());
        dropSelf(ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get());
        dropSelf(ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get());
        dropSelf(ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get());
        dropSelf(ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get());
        dropSelf(ThaumonBlocks.ARCANE_STONE_TILES.get());
        dropSelf(ThaumonBlocks.ARCANE_TILE_STAIRS.get());
        dropSelf(ThaumonBlocks.ARCANE_TILE_SLAB.get());
        dropSelf(ThaumonBlocks.ARCANE_STONE_PILLAR.get());
        dropSelf(ThaumonBlocks.RUNIC_ARCANE_STONE.get());
        dropSelf(ThaumonBlocks.RUNIC_ARCANE_TILES.get());
        dropSelf(ThaumonBlocks.TILED_ARCANE_STONE.get());
        dropSelf(ThaumonBlocks.INLAID_ARCANE_STONE.get());
        dropSelf(ThaumonBlocks.ARCANE_LANTERN.get());
        dropSelf(ThaumonBlocks.ARCANE_STONE_WINDOW.get());
        dropSelf(ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get());

        dropSelf(ThaumonBlocks.ELDRITCH_STONE.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_STAIRS.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_SLAB.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_WALL.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_TILES.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_PILLAR.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_FACADE.get());
        dropSelf(ThaumonBlocks.CHISELED_ELDRITCH_STONE.get());
        dropSelf(ThaumonBlocks.CARVED_ELDRITCH_STONE.get());
        dropSelf(ThaumonBlocks.ENGRAVED_ELDRITCH_STONE.get());
        dropSelf(ThaumonBlocks.INLAID_ELDRITCH_STONE.get());
        dropSelf(ThaumonBlocks.ELDRITCH_LANTERN.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_WINDOW.get());
        dropSelf(ThaumonBlocks.ELDRITCH_STONE_WINDOW_PANE.get());

        dropSelf(ThaumonBlocks.ANCIENT_STONE.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_STAIRS.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_SLAB.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_WALL.get());
        dropSelf(ThaumonBlocks.POLISHED_ANCIENT_STONE.get());
        dropSelf(ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get());
        dropSelf(ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_BRICKS.get());
        dropSelf(ThaumonBlocks.CRACKED_ANCIENT_STONE_BRICKS.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_TILES.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get());
        add(ThaumonBlocks.ANCIENT_STONE_DOOR.get(), createDoorTable(ThaumonBlocks.ANCIENT_STONE_DOOR.get()));
        dropSelf(ThaumonBlocks.ANCIENT_STONE_PILLAR.get());
        dropSelf(ThaumonBlocks.ENGRAVED_ANCIENT_STONE.get());
        dropSelf(ThaumonBlocks.CHISELED_ANCIENT_STONE.get());
        dropSelf(ThaumonBlocks.RUNIC_ANCIENT_STONE.get());
        dropSelf(ThaumonBlocks.TILED_ANCIENT_STONE.get());
        dropSelf(ThaumonBlocks.INLAID_ANCIENT_STONE.get());
        dropSelf(ThaumonBlocks.ANCIENT_LANTERN.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_WINDOW.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_WINDOW_PANE.get());

        dropSelf(ThaumonBlocks.GREATWOOD_LEAVES.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_LEAVES.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_LEAF_POST.get());

        dropSelf(ThaumonBlocks.GREATWOOD_BUTTON.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_BUTTON.get());
        dropSelf(ThaumonBlocks.ARCANE_STONE_BUTTON.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_BUTTON.get());

        dropSelf(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get());
        dropSelf(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get());
        dropSelf(ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get());
        dropSelf(ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get());

        dropSelf(ThaumonBlocks.GRIMOIRE.get());
        dropSelf(ThaumonBlocks.GRIMOIRE_STACK.get());
        dropSelf(ThaumonBlocks.RESEARCH_NOTES.get());
        dropSelf(ThaumonBlocks.CRYSTAL_LAMP.get());
        dropSelf(ThaumonBlocks.RETORT.get());
        dropSelf(ThaumonBlocks.VIAL_RACK.get());
        dropSelf(ThaumonBlocks.CRYSTAL_STAND.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ThaumonBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
    }
}
