package jdlenl.thaumon.block;

import dev.architectury.injectables.annotations.ExpectPlatform;
import jdlenl.thaumon.block.blocks.*;
import jdlenl.thaumon.block.blocks.mojangLovesBreakingThings.*;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ThaumonBlocks {
    public static Supplier<Block> AMBER;
    public static Supplier<Block> AMBER_STAIRS;
    public static Supplier<Block> AMBER_SLAB;
    public static Supplier<Block> AMBER_BRICKS;
    public static Supplier<Block> AMBER_BRICK_STAIRS;
    public static Supplier<Block> AMBER_BRICK_SLAB;
    public static Supplier<Block> AMBERGLASS;
    public static Supplier<Block> AMBERGLASS_PANE;
    public static Supplier<Block> GREATWOOD_LOG;
    public static Supplier<Block> GREATWOOD_WOOD;
    public static Supplier<Block> GREATWOOD_LOG_WALL;
    public static Supplier<Block> GREATWOOD_LOG_POST;
    public static Supplier<Block> GREATWOOD_PLANKS;
    public static Supplier<Block> GREATWOOD_STAIRS;
    public static Supplier<Block> GREATWOOD_SLAB;
    public static Supplier<Block> GREATWOOD_DOOR;
    public static Supplier<Block> GREATWOOD_TRAPDOOR;
    public static Supplier<Block> GILDED_GREATWOOD_DOOR;
    public static Supplier<Block> GILDED_GREATWOOD_TRAPDOOR;
    public static Supplier<Block> GREATWOOD_FENCE;
    public static Supplier<Block> GREATWOOD_FENCE_GATE;
    public static Supplier<Block> GREATWOOD_WINDOW;
    public static Supplier<Block> GREATWOOD_WINDOW_PANE;
    public static Supplier<Block> EMPTY_GREATWOOD_BOOKSHELF;
    public static Supplier<Block> GREATWOOD_BOOKSHELF;
    public static Supplier<Block> CLASSIC_GREATWOOD_BOOKSHELF;
    public static Supplier<Block> DUSTY_GREATWOOD_BOOKSHELF;
    public static Supplier<Block> ALCHEMISTS_GREATWOOD_BOOKSHELF;
    public static Supplier<Block> GREATWOOD_GRIMOIRE_BOOKSHELF;
    public static Supplier<Block> SILVERWOOD_LOG;
    public static Supplier<Block> SILVERWOOD_WOOD;
    public static Supplier<Block> SILVERWOOD_LOG_WALL;
    public static Supplier<Block> SILVERWOOD_LOG_POST;
    public static Supplier<Block> SILVERWOOD_PLANKS;
    public static Supplier<Block> SILVERWOOD_STAIRS;
    public static Supplier<Block> SILVERWOOD_SLAB;
    public static Supplier<Block> SILVERWOOD_DOOR;
    public static Supplier<Block> SILVERWOOD_TRAPDOOR;
    public static Supplier<Block> SILVERWOOD_FENCE;
    public static Supplier<Block> SILVERWOOD_FENCE_GATE;
    public static Supplier<Block> SILVERWOOD_WINDOW;
    public static Supplier<Block> SILVERWOOD_WINDOW_PANE;
    public static Supplier<Block> EMPTY_SILVERWOOD_BOOKSHELF;
    public static Supplier<Block> SILVERWOOD_BOOKSHELF;
    public static Supplier<Block> CLASSIC_SILVERWOOD_BOOKSHELF;
    public static Supplier<Block> DUSTY_SILVERWOOD_BOOKSHELF;
    public static Supplier<Block> ALCHEMISTS_SILVERWOOD_BOOKSHELF;
    public static Supplier<Block> SILVERWOOD_GRIMOIRE_BOOKSHELF;
    public static Supplier<Block> ARCANE_STONE;
    public static Supplier<Block> ARCANE_STONE_STAIRS;
    public static Supplier<Block> ARCANE_STONE_SlAB;
    public static Supplier<Block> ARCANE_STONE_WALL;
    public static Supplier<Block> ARCANE_STONE_BRICKS;
    public static Supplier<Block> ARCANE_BRICK_STAIRS;
    public static Supplier<Block> ARCANE_BRICK_SLAB;
    public static Supplier<Block> ARCANE_BRICK_WALL;
    public static Supplier<Block> LARGE_ARCANE_STONE_BRICKS;
    public static Supplier<Block> LARGE_ARCANE_BRICK_STAIRS;
    public static Supplier<Block> LARGE_ARCANE_BRICK_SLAB;
    public static Supplier<Block> LARGE_ARCANE_BRICK_WALL;
    public static Supplier<Block> ARCANE_STONE_TILES;
    public static Supplier<Block> ARCANE_TILE_STAIRS;
    public static Supplier<Block> ARCANE_TILE_SLAB;
    public static Supplier<Block> ARCANE_STONE_PILLAR;
    public static Supplier<Block> RUNIC_ARCANE_STONE;
    public static Supplier<Block> RUNIC_ARCANE_TILES;
    public static Supplier<Block> TILED_ARCANE_STONE;
    public static Supplier<Block> INLAID_ARCANE_STONE;
    public static Supplier<Block> ARCANE_LANTERN;
    public static Supplier<Block> ARCANE_STONE_WINDOW;
    public static Supplier<Block> ARCANE_STONE_WINDOW_PANE;
    public static Supplier<Block> ELDRITCH_STONE;
    public static Supplier<Block> ELDRITCH_STONE_STAIRS;
    public static Supplier<Block> ELDRITCH_STONE_SLAB;
    public static Supplier<Block> ELDRITCH_STONE_WALL;
    public static Supplier<Block> ELDRITCH_STONE_BRICKS;
    public static Supplier<Block> ELDRITCH_STONE_BRICK_STAIRS;
    public static Supplier<Block> ELDRITCH_STONE_BRICK_SLAB;
    public static Supplier<Block> ELDRITCH_STONE_BRICK_WALL;
    public static Supplier<Block> ELDRITCH_STONE_TILES;
    public static Supplier<Block> ELDRITCH_STONE_TILE_STAIRS;
    public static Supplier<Block> ELDRITCH_STONE_TILE_SLAB;
    public static Supplier<Block> ELDRITCH_STONE_PILLAR;
    public static Supplier<Block> ELDRITCH_STONE_CAPSTONE;
    public static Supplier<Block> ELDRITCH_STONE_FACADE;
    public static Supplier<Block> CHISELED_ELDRITCH_STONE;
    public static Supplier<Block> CARVED_ELDRITCH_STONE;
    public static Supplier<Block> ENGRAVED_ELDRITCH_STONE;
    public static Supplier<Block> INLAID_ELDRITCH_STONE;
    public static Supplier<Block> ELDRITCH_LANTERN;
    public static Supplier<Block> ELDRITCH_STONE_WINDOW;
    public static Supplier<Block> ELDRITCH_STONE_WINDOW_PANE;
    public static Supplier<Block> ANCIENT_STONE;
    public static Supplier<Block> ANCIENT_STONE_STAIRS;
    public static Supplier<Block> ANCIENT_STONE_SLAB;
    public static Supplier<Block> ANCIENT_STONE_WALL;
    public static Supplier<Block> POLISHED_ANCIENT_STONE;
    public static Supplier<Block> POLISHED_ANCIENT_STONE_STAIRS;
    public static Supplier<Block> POLISHED_ANCIENT_STONE_SLAB;
    public static Supplier<Block> ANCIENT_STONE_BRICKS;
    public static Supplier<Block> CRACKED_ANCIENT_STONE_BRICKS;
    public static Supplier<Block> ANCIENT_STONE_BRICK_STAIRS;
    public static Supplier<Block> ANCIENT_STONE_BRICK_SLAB;
    public static Supplier<Block> ANCIENT_STONE_BRICK_WALL;
    public static Supplier<Block> ANCIENT_STONE_TILES;
    public static Supplier<Block> ANCIENT_STONE_TILE_STAIRS;
    public static Supplier<Block> ANCIENT_STONE_TILE_SLAB;
    public static Supplier<Block> ANCIENT_STONE_DOOR;
    public static Supplier<Block> ANCIENT_STONE_PILLAR;
    public static Supplier<Block> ENGRAVED_ANCIENT_STONE;
    public static Supplier<Block> CHISELED_ANCIENT_STONE;
    public static Supplier<Block> RUNIC_ANCIENT_STONE;
    public static Supplier<Block> TILED_ANCIENT_STONE;
    public static Supplier<Block> INLAID_ANCIENT_STONE;
    public static Supplier<Block> ANCIENT_LANTERN;
    public static Supplier<Block> ANCIENT_STONE_WINDOW;
    public static Supplier<Block> ANCIENT_STONE_WINDOW_PANE;
    public static Supplier<Block> GREATWOOD_LEAVES;
    public static Supplier<Block> SILVERWOOD_LEAVES;
    public static Supplier<Block> SILVERWOOD_LEAF_WALL;
    public static Supplier<Block> SILVERWOOD_LEAF_POST;
    public static Supplier<Block> GREATWOOD_BUTTON;
    public static Supplier<Block> SILVERWOOD_BUTTON;
    public static Supplier<Block> ARCANE_STONE_BUTTON;
    public static Supplier<Block> ANCIENT_STONE_BUTTON;
    public static Supplier<Block> GREATWOOD_PRESSURE_PLATE;
    public static Supplier<Block> SILVERWOOD_PRESSURE_PLATE;
    public static Supplier<Block> ARCANE_STONE_PRESSURE_PLATE;
    public static Supplier<Block> ANCIENT_STONE_PRESSURE_PLATE;
    public static Supplier<Block> GRIMOIRE;
    public static Supplier<Block> GRIMOIRE_STACK;
    public static Supplier<Block> RESEARCH_NOTES;
    public static Supplier<Block> CRYSTAL_LAMP;
    public static Supplier<Block> RETORT;
    public static Supplier<Block> VIAL_RACK;
    public static Supplier<Block> CRYSTAL_STAND;
    // TODO:
    public static Supplier<Block> WITCH_CAULDRON;

    public static void init() {
        AMBER = registerBlock("amber", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).strength(0.3F).luminance(
                (state) -> {
                    return 5;
                }
        ).sounds(BlockSoundGroup.SHROOMLIGHT).emissiveLighting(
                (state, view, pos) -> {
                    return true;
                }
        ).postProcess(
                (state, view, pos) -> {
                    return true;
                }
        )));

        AMBER_STAIRS = registerBlock("amber_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.SHROOMLIGHT).strength(1.0F).luminance(
                (state) -> {
                    return 5;
                }
        ).sounds(BlockSoundGroup.FROGLIGHT).emissiveLighting(
                (state, view, pos) -> {
                    return true;
                }
        ).postProcess(
                (state, view, pos) -> {
                    return true;
                }
        )));

        AMBER_SLAB = registerBlock("amber_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.SHROOMLIGHT).strength(1.0F).luminance(
                (state) -> {
                    return 5;
                }
        ).postProcess(
                (state, view, pos) -> {
                    return true;
                }
        ).emissiveLighting(
                (state, view, pos) -> {
                    return true;
                }
        ).dynamicBounds()));

        AMBER_BRICKS = registerBlock("amber_bricks", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.SHROOMLIGHT).strength(1.0F).luminance(
                (state) -> {
                    return 5;
                }
        ).postProcess(
                (state, view, pos) -> {
                    return true;
                }
        ).emissiveLighting(
                (state, view, pos) -> {
                    return true;
                }
        ).dynamicBounds()));

        AMBER_BRICK_STAIRS = registerBlock("amber_brick_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.SHROOMLIGHT).strength(1.0F).luminance(
                (state) -> {
                    return 5;
                }
        ).sounds(BlockSoundGroup.FROGLIGHT).emissiveLighting(
                (state, view, pos) -> {
                    return true;
                }
        ).postProcess(
                (state, view, pos) -> {
                    return true;
                }
        )));

        AMBER_BRICK_SLAB = registerBlock("amber_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.SHROOMLIGHT).strength(1.0F).luminance(
                (state) -> {
                    return 5;
                }
        ).postProcess(
                (state, view, pos) -> {
                    return true;
                }
        ).emissiveLighting(
                (state, view, pos) -> {
                    return true;
                }
        ).dynamicBounds()));

        AMBERGLASS = registerBlock("amberglass", () -> new ThaumonTransparentBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.SHROOMLIGHT).strength(1.0F).luminance(
                (state) -> {
                    return 5;
                }
        ).nonOpaque().postProcess(
                (state, view, pos) -> {
                    return true;
                }
        ).emissiveLighting(
                (state, view, pos) -> {
                    return true;
                }
        ).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        AMBERGLASS_PANE = registerBlock("amberglass_pane", () -> new PaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.SHROOMLIGHT).strength(1.0F).luminance(
                (state) -> {
                    return 5;
                }
        ).nonOpaque().postProcess(
                (state, view, pos) -> {
                    return true;
                }
        ).emissiveLighting(
                (state, view, pos) -> {
                    return true;
                }
        ).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        GREATWOOD_LOG = registerBlock("greatwood_log", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_WOOD = registerBlock("greatwood_wood", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_LOG_WALL = registerBlock("greatwood_log_wall", () -> new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_LOG_POST = registerBlock("greatwood_log_post", () -> new FenceBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_PLANKS = registerBlock("greatwood_planks", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_STAIRS = registerBlock("greatwood_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_SLAB = registerBlock("greatwood_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_DOOR = registerBlock("greatwood_door", () -> new ThaumonDoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        GREATWOOD_TRAPDOOR = registerBlock("greatwood_trapdoor", () -> new ThaumonTrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        GILDED_GREATWOOD_DOOR = registerBlock("gilded_greatwood_door", () -> new ThaumonDoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        GILDED_GREATWOOD_TRAPDOOR = registerBlock("gilded_greatwood_trapdoor", () -> new ThaumonTrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        GREATWOOD_FENCE = registerBlock("greatwood_fence", () -> new FenceBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).dynamicBounds().solid()));

        GREATWOOD_FENCE_GATE = registerBlock("greatwood_fence_gate", () -> new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).dynamicBounds().solid()));

        GREATWOOD_WINDOW = registerBlock("greatwood_window", () -> new ThaumonTransparentBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.HAT).sounds(BlockSoundGroup.GLASS).strength(0.5F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        GREATWOOD_WINDOW_PANE = registerBlock("greatwood_window_pane", () -> new PaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.HAT).sounds(BlockSoundGroup.GLASS).strength(0.5F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        EMPTY_GREATWOOD_BOOKSHELF = registerBlock("empty_greatwood_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        GREATWOOD_BOOKSHELF = registerBlock("greatwood_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        CLASSIC_GREATWOOD_BOOKSHELF = registerBlock("classic_greatwood_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        DUSTY_GREATWOOD_BOOKSHELF = registerBlock("dusty_greatwood_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        ALCHEMISTS_GREATWOOD_BOOKSHELF = registerBlock("alchemists_greatwood_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        GREATWOOD_GRIMOIRE_BOOKSHELF = registerBlock("greatwood_grimoire_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        SILVERWOOD_LOG = registerBlock("silverwood_log", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_WOOD = registerBlock("silverwood_wood", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_LOG_WALL = registerBlock("silverwood_log_wall", () -> new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_LOG_POST = registerBlock("silverwood_log_post", () -> new FenceBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_PLANKS = registerBlock("silverwood_planks", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_STAIRS = registerBlock("silverwood_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_SLAB = registerBlock("silverwood_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_DOOR = registerBlock("silverwood_door", () -> new ThaumonDoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        SILVERWOOD_TRAPDOOR = registerBlock("silverwood_trapdoor", () -> new ThaumonTrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        SILVERWOOD_FENCE = registerBlock("silverwood_fence", () -> new FenceBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).dynamicBounds().solid()));

        SILVERWOOD_FENCE_GATE = registerBlock("silverwood_fence_gate", () -> new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).dynamicBounds().solid()));

        SILVERWOOD_WINDOW = registerBlock("silverwood_window", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.HAT).sounds(BlockSoundGroup.GLASS).strength(0.5F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        SILVERWOOD_WINDOW_PANE = registerBlock("silverwood_window_pane", () -> new PaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.HAT).sounds(BlockSoundGroup.GLASS).strength(0.5F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        EMPTY_SILVERWOOD_BOOKSHELF = registerBlock("empty_silverwood_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        SILVERWOOD_BOOKSHELF = registerBlock("silverwood_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        CLASSIC_SILVERWOOD_BOOKSHELF = registerBlock("classic_silverwood_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        DUSTY_SILVERWOOD_BOOKSHELF = registerBlock("dusty_silverwood_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        ALCHEMISTS_SILVERWOOD_BOOKSHELF = registerBlock("alchemists_silverwood_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        SILVERWOOD_GRIMOIRE_BOOKSHELF = registerBlock("silverwood_grimoire_bookshelf",
                () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F)));

        ARCANE_STONE = registerBlock("arcane_stone", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ARCANE_STONE_STAIRS = registerBlock("arcane_stone_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool().dynamicBounds()));

        ARCANE_STONE_SlAB = registerBlock("arcane_stone_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ARCANE_STONE_WALL = registerBlock("arcane_stone_wall", () -> new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ARCANE_STONE_BRICKS = registerBlock("arcane_stone_bricks", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ARCANE_BRICK_STAIRS = registerBlock("arcane_brick_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool().dynamicBounds()));

        ARCANE_BRICK_SLAB = registerBlock("arcane_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ARCANE_BRICK_WALL = registerBlock("arcane_brick_wall", () -> new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        LARGE_ARCANE_STONE_BRICKS = registerBlock("large_arcane_stone_bricks", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        LARGE_ARCANE_BRICK_STAIRS = registerBlock("large_arcane_brick_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool().dynamicBounds()));

        LARGE_ARCANE_BRICK_SLAB = registerBlock("large_arcane_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        LARGE_ARCANE_BRICK_WALL = registerBlock("large_arcane_brick_wall", () -> new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ARCANE_STONE_TILES = registerBlock("arcane_stone_tiles", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ARCANE_TILE_STAIRS = registerBlock("arcane_tile_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool().dynamicBounds()));

        ARCANE_TILE_SLAB = registerBlock("arcane_tile_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ARCANE_STONE_PILLAR = registerBlock("arcane_stone_pillar", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        RUNIC_ARCANE_STONE = registerBlock("runic_arcane_stone", () -> new ThaumonFacingBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        RUNIC_ARCANE_TILES = registerBlock("runic_arcane_tiles", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        TILED_ARCANE_STONE = registerBlock("tiled_arcane_stone", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        INLAID_ARCANE_STONE = registerBlock("inlaid_arcane_stone", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ARCANE_LANTERN = registerBlock("arcane_lantern", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).luminance(
                (state) -> {
                    return 15;
                }
        ).requiresTool()));

        ARCANE_STONE_WINDOW = registerBlock("arcane_stone_window", () -> new ThaumonTransparentBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.HAT).sounds(BlockSoundGroup.GLASS).strength(0.5F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        ARCANE_STONE_WINDOW_PANE = registerBlock("arcane_stone_window_pane", () -> new PaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.HAT).sounds(BlockSoundGroup.GLASS).strength(0.5F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        ELDRITCH_STONE = registerBlock("eldritch_stone", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ELDRITCH_STONE_STAIRS = registerBlock("eldritch_stone_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool().dynamicBounds()));

        ELDRITCH_STONE_SLAB = registerBlock("eldritch_stone_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ELDRITCH_STONE_WALL = registerBlock("eldritch_stone_wall", () -> new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ELDRITCH_STONE_BRICKS = registerBlock("eldritch_stone_bricks", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ELDRITCH_STONE_BRICK_STAIRS = registerBlock("eldritch_stone_brick_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool().dynamicBounds()));

        ELDRITCH_STONE_BRICK_SLAB = registerBlock("eldritch_stone_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ELDRITCH_STONE_BRICK_WALL = registerBlock("eldritch_stone_brick_wall", () -> new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ELDRITCH_STONE_TILES = registerBlock("eldritch_stone_tiles", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ELDRITCH_STONE_TILE_STAIRS = registerBlock("eldritch_stone_tile_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool().dynamicBounds()));

        ELDRITCH_STONE_TILE_SLAB = registerBlock("eldritch_stone_tile_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ELDRITCH_STONE_PILLAR = registerBlock("eldritch_stone_pillar", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ELDRITCH_STONE_CAPSTONE = registerBlock("eldritch_stone_capstone", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ELDRITCH_STONE_FACADE = registerBlock("eldritch_stone_facade", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        CHISELED_ELDRITCH_STONE = registerBlock("chiseled_eldritch_stone", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        CARVED_ELDRITCH_STONE = registerBlock("carved_eldritch_stone", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ENGRAVED_ELDRITCH_STONE = registerBlock("engraved_eldritch_stone", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        INLAID_ELDRITCH_STONE = registerBlock("inlaid_eldritch_stone", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ELDRITCH_LANTERN = registerBlock("eldritch_lantern", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).luminance(
                (state) -> {
                    return 15;
                }
        ).requiresTool()));

        ELDRITCH_STONE_WINDOW = registerBlock("eldritch_stone_window", () -> new ThaumonTransparentBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.HAT).sounds(BlockSoundGroup.GLASS).strength(0.5F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        ELDRITCH_STONE_WINDOW_PANE = registerBlock("eldritch_stone_window_pane", () -> new PaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.HAT).sounds(BlockSoundGroup.GLASS).strength(0.5F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        ANCIENT_STONE = registerBlock("ancient_stone", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ANCIENT_STONE_STAIRS = registerBlock("ancient_stone_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool().dynamicBounds()));

        ANCIENT_STONE_SLAB = registerBlock("ancient_stone_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ANCIENT_STONE_WALL = registerBlock("ancient_stone_wall", () -> new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ANCIENT_STONE_BRICKS = registerBlock("ancient_stone_bricks", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        CRACKED_ANCIENT_STONE_BRICKS = registerBlock("cracked_ancient_stone_bricks", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ANCIENT_STONE_DOOR = registerBlock("ancient_stone_door", () -> new ThaumonDoorBlock(BlockSetType.STONE, AbstractBlock.Settings.create().instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.BASALT).strength(4.0F, 10.0F).requiresTool().dynamicBounds()));

        POLISHED_ANCIENT_STONE = registerBlock("polished_ancient_stone", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        POLISHED_ANCIENT_STONE_STAIRS = registerBlock("polished_ancient_stone_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool().dynamicBounds()));

        POLISHED_ANCIENT_STONE_SLAB = registerBlock("polished_ancient_stone_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ANCIENT_STONE_BRICK_STAIRS = registerBlock("ancient_stone_brick_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool().dynamicBounds()));

        ANCIENT_STONE_BRICK_SLAB = registerBlock("ancient_stone_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ANCIENT_STONE_BRICK_WALL = registerBlock("ancient_stone_brick_wall", () -> new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ANCIENT_STONE_TILES = registerBlock("ancient_stone_tiles", () -> new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ANCIENT_STONE_TILE_STAIRS = registerBlock("ancient_stone_tile_stairs", () -> new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool().dynamicBounds()));

        ANCIENT_STONE_TILE_SLAB = registerBlock("ancient_stone_tile_slab", () -> new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ANCIENT_STONE_PILLAR = registerBlock("ancient_stone_pillar", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 10.0F).requiresTool()));

        ENGRAVED_ANCIENT_STONE = registerBlock("engraved_ancient_stone", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        CHISELED_ANCIENT_STONE = registerBlock("chiseled_ancient_stone", () -> new ThaumonFacingBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        RUNIC_ANCIENT_STONE = registerBlock("runic_ancient_stone", () -> new ThaumonFacingBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        TILED_ANCIENT_STONE = registerBlock("tiled_ancient_stone", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        INLAID_ANCIENT_STONE = registerBlock("inlaid_ancient_stone", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool()));

        ANCIENT_LANTERN = registerBlock("ancient_lantern", () -> new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).luminance(
                (state) -> {
                    return 15;
                }
        ).requiresTool()));

        ANCIENT_STONE_WINDOW = registerBlock("ancient_stone_window", () -> new ThaumonTransparentBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.HAT).sounds(BlockSoundGroup.GLASS).strength(0.5F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        ANCIENT_STONE_WINDOW_PANE = registerBlock("ancient_stone_window_pane", () -> new PaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.HAT).sounds(BlockSoundGroup.GLASS).strength(0.5F).nonOpaque().solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds()));

        GREATWOOD_LEAVES = registerBlock("greatwood_leaves", () -> new LeavesBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque().suffocates(
                (state, view, pos) -> {
                    return false;
                }
        ).blockVision(
                (state, view, pos) -> {
                    return false;
                }
        ).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        SILVERWOOD_LEAVES = registerBlock("silverwood_leaves", () -> new LeavesBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_CYAN).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque().suffocates(
                (state, view, pos) -> {
                    return false;
                }
        ).blockVision(
                (state, view, pos) -> {
                    return false;
                }
        ).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        SILVERWOOD_LEAF_POST = registerBlock("silverwood_leaf_post", () -> new FenceBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_CYAN).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque().suffocates(
                (state, view, pos) -> {
                    return false;
                }
        ).blockVision(
                (state, view, pos) -> {
                    return false;
                }
        ).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        SILVERWOOD_LEAF_WALL = registerBlock("silverwood_leaf_wall", () -> new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_CYAN).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque().suffocates(
                (state, view, pos) -> {
                    return false;
                }
        ).blockVision(
                (state, view, pos) -> {
                    return false;
                }
        ).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        GREATWOOD_BUTTON = registerBlock("greatwood_button", () -> new ThaumonButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.create().burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).dynamicBounds()));

        SILVERWOOD_BUTTON = registerBlock("silverwood_button", () -> new ThaumonButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.create().burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).dynamicBounds()));

        ARCANE_STONE_BUTTON = registerBlock("arcane_stone_button", () -> new ThaumonButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool().dynamicBounds()));

        ANCIENT_STONE_BUTTON = registerBlock("ancient_stone_button", () -> new ThaumonButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool().dynamicBounds()));

        GREATWOOD_PRESSURE_PLATE = registerBlock("greatwood_pressure_plate", () -> new ThaumonPressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create().burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).dynamicBounds().solid()));

        SILVERWOOD_PRESSURE_PLATE = registerBlock("silverwood_pressure_plate", () -> new ThaumonPressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create().burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHERRY_WOOD).strength(2.0F, 3.0F).dynamicBounds().solid()));

        ARCANE_STONE_PRESSURE_PLATE = registerBlock("arcane_stone_pressure_plate", () -> new ThaumonPressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.create().instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool().dynamicBounds().solid()));

        ANCIENT_STONE_PRESSURE_PLATE = registerBlock("ancient_stone_pressure_plate", () -> new ThaumonPressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.create().instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(3.0F, 7.0F).requiresTool().dynamicBounds().solid()));

        GRIMOIRE = registerBlock("grimoire", () -> new GrimoireBlock(AbstractBlock.Settings.create().burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.NETHER_WOOD).strength(0.5F, 0.2F).noCollision().nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds().offset(AbstractBlock.OffsetType.XZ)));

        GRIMOIRE_STACK = registerBlock("grimoire_stack", () -> new GrimoireBlock(AbstractBlock.Settings.create().burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.NETHER_WOOD).strength(0.5F, 0.2F).noCollision().nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        ).dynamicBounds().offset(AbstractBlock.OffsetType.XZ)));

        RESEARCH_NOTES = registerBlock("research_notes", () -> new ResearchNotesBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).sounds(BlockSoundGroup.CANDLE).strength(0.05F, 0.1F).noCollision().nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        CRYSTAL_LAMP = registerBlock("crystal_lamp", () -> new CrystalLampBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).sounds(
                new BlockSoundGroup(1.0F, 1.0F,
                        //TODO: Move to a separate class
                        SoundEvent.of(new Identifier("block.lantern.break")),
                        SoundEvent.of(new Identifier("block.amethyst_cluster.step")),
                        SoundEvent.of(new Identifier("block.amethyst_cluster.place")),
                        SoundEvent.of(new Identifier("block.lantern.hit")),
                        SoundEvent.of(new Identifier("block.amethyst_cluster.fall"))
        )).strength(0.05F, 0.3F).luminance(
                (state) -> {
                    return 8;
                }
        ).noCollision().nonOpaque().pistonBehavior(PistonBehavior.DESTROY).postProcess(
                (state, view, pos) -> {
                    return true;
                }
        ).emissiveLighting(
                (state, view, pos) -> {
                    return true;
                }
        ).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        RETORT = registerBlock("retort", () -> new RetortBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).sounds(
                new BlockSoundGroup(1.0F, 1.0F,
                        //TODO: Move to a separate class
                        SoundEvent.of(new Identifier("block.glass.break")),
                        SoundEvent.of(new Identifier("block.glass.step")),
                        SoundEvent.of(new Identifier("block.lantern.place")),
                        SoundEvent.of(new Identifier("block.lantern.hit")),
                        SoundEvent.of(new Identifier("block.glass.fall"))
        )).strength(0.1F, 0.5F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        VIAL_RACK = registerBlock("vial_rack", () -> new VialRackBlock(AbstractBlock.Settings.create().burnable().instrument(Instrument.BASS).sounds(BlockSoundGroup.CHISELED_BOOKSHELF).strength(0.2F).noCollision().nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));

        CRYSTAL_STAND = registerBlock("crystal_stand", () -> new CrystalStandBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).sounds(
                new BlockSoundGroup(1.0F, 1.0F,
                        //TODO: Move to a separate class
                        SoundEvent.of(new Identifier("block.lantern.break")),
                        SoundEvent.of(new Identifier("block.amethyst_cluster.step")),
                        SoundEvent.of(new Identifier("block.amethyst_cluster.place")),
                        SoundEvent.of(new Identifier("block.lantern.hit")),
                        SoundEvent.of(new Identifier("block.amethyst_cluster.fall"))
        )).strength(0.05F, 0.3F).luminance(
                (state) -> {
                    return 2;
                }
        ).noCollision().nonOpaque().pistonBehavior(PistonBehavior.DESTROY).postProcess(
                (state, view, pos) -> {
                    return true;
                }
        ).emissiveLighting(
                (state, view, pos) -> {
                    return true;
                }
        ).solidBlock(
                (state, view, pos) -> {
                    return false;
                }
        )));
    }

    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier) {
        return registerBlock(id, supplier, true);
    }
    @ExpectPlatform
    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier, boolean genItem) {
        throw new AssertionError();
    }
}
