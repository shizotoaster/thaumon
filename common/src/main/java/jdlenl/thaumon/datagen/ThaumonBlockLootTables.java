package jdlenl.thaumon.datagen;

import jdlenl.thaumon.block.ThaumonBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;

import java.util.Set;

public abstract class ThaumonBlockLootTables extends BlockLootSubProvider {
    protected ThaumonBlockLootTables(Set<Item> explosionResistant, FeatureFlagSet enabledFeatures, HolderLookup.Provider registries) {
        super(explosionResistant, enabledFeatures, registries);
    }

    public static <T extends BlockLootSubProvider> void addLoot(T provider) {
        provider.dropSelf(ThaumonBlocks.AMBER.get());
        provider.dropSelf(ThaumonBlocks.AMBER_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.AMBER_SLAB.get());
        provider.dropSelf(ThaumonBlocks.AMBER_BRICKS.get());
        provider.dropSelf(ThaumonBlocks.AMBER_BRICK_SLAB.get());
        provider.dropSelf(ThaumonBlocks.AMBER_BRICK_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.AMBERGLASS.get());
        provider.dropSelf(ThaumonBlocks.AMBERGLASS_PANE.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_LOG.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_WOOD.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_LOG_WALL.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_LOG_POST.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_PLANKS.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_SLAB.get());
        provider.add(ThaumonBlocks.GREATWOOD_DOOR.get(), block -> provider.createDoorTable(ThaumonBlocks.GREATWOOD_DOOR.get()));
        provider.dropSelf(ThaumonBlocks.GREATWOOD_TRAPDOOR.get());
        provider.add(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get(), block -> provider.createDoorTable(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get()));
        provider.dropSelf(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_FENCE.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_FENCE_GATE.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_WINDOW.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_WINDOW_PANE.get());
        provider.dropSelf(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.CLASSIC_GREATWOOD_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.DUSTY_GREATWOOD_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.ALCHEMISTS_GREATWOOD_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_LOG.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_WOOD.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_LOG_WALL.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_LOG_POST.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_PLANKS.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_SLAB.get());
        provider.add(ThaumonBlocks.SILVERWOOD_DOOR.get(), block -> provider.createDoorTable(ThaumonBlocks.SILVERWOOD_DOOR.get()));
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_FENCE.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_FENCE_GATE.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_WINDOW.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_WINDOW_PANE.get());
        provider.dropSelf(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.CLASSIC_SILVERWOOD_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.DUSTY_SILVERWOOD_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.ALCHEMISTS_SILVERWOOD_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE_SLAB.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE_WALL.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE_BRICKS.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_BRICK_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_BRICK_SLAB.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_BRICK_WALL.get());
        provider.dropSelf(ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get());
        provider.dropSelf(ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get());
        provider.dropSelf(ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE_TILES.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_TILE_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_TILE_SLAB.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE_PILLAR.get());
        provider.dropSelf(ThaumonBlocks.RUNIC_ARCANE_STONE.get());
        provider.dropSelf(ThaumonBlocks.INLAID_ARCANE_STONE.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_LANTERN.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE_WINDOW.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_SLAB.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_WALL.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_TILES.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_PILLAR.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_FACADE.get());
        provider.dropSelf(ThaumonBlocks.CHISELED_ELDRITCH_STONE.get());
        provider.dropSelf(ThaumonBlocks.CARVED_ELDRITCH_STONE.get());
        provider.dropSelf(ThaumonBlocks.ENGRAVED_ELDRITCH_STONE.get());
        provider.dropSelf(ThaumonBlocks.INLAID_ELDRITCH_STONE.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_LANTERN.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_WINDOW.get());
        provider.dropSelf(ThaumonBlocks.ELDRITCH_STONE_WINDOW_PANE.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_SLAB.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_WALL.get());
        provider.dropSelf(ThaumonBlocks.POLISHED_ANCIENT_STONE.get());
        provider.dropSelf(ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_BRICKS.get());
        provider.dropSelf(ThaumonBlocks.CRACKED_ANCIENT_STONE_BRICKS.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_TILES.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get());
        provider.add(ThaumonBlocks.ANCIENT_STONE_DOOR.get(), block -> provider.createDoorTable(ThaumonBlocks.ANCIENT_STONE_DOOR.get()));
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_PILLAR.get());
        provider.dropSelf(ThaumonBlocks.ENGRAVED_ANCIENT_STONE.get());
        provider.dropSelf(ThaumonBlocks.CHISELED_ANCIENT_STONE.get());
        provider.dropSelf(ThaumonBlocks.RUNIC_ANCIENT_STONE.get());
        provider.dropSelf(ThaumonBlocks.TILED_ANCIENT_STONE.get());
        provider.dropSelf(ThaumonBlocks.INLAID_ANCIENT_STONE.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_LANTERN.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_WINDOW.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_WINDOW_PANE.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_LEAVES.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_LEAVES.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_LEAF_POST.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_BUTTON.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_BUTTON.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE_BUTTON.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_BUTTON.get());
        provider.dropSelf(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get());
        provider.dropSelf(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get());
        provider.dropSelf(ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get());
        provider.dropSelf(ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get());
        provider.dropSelf(ThaumonBlocks.GRIMOIRE.get());
        provider.dropSelf(ThaumonBlocks.GRIMOIRE_STACK.get());
        provider.dropSelf(ThaumonBlocks.RESEARCH_NOTES.get());
        provider.dropSelf(ThaumonBlocks.CRYSTAL_LAMP.get());
        provider.dropSelf(ThaumonBlocks.RETORT.get());
        provider.dropSelf(ThaumonBlocks.VIAL_RACK.get());
        provider.dropSelf(ThaumonBlocks.CRYSTAL_STAND.get());
        provider.dropSelf(ThaumonBlocks.TILED_ARCANE_STONE.get());
        provider.dropSelf(ThaumonBlocks.RUNIC_ARCANE_TILES.get());
    }
}
