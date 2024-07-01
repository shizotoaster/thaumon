package jdlenl.thaumon.block;

import dev.architectury.injectables.annotations.ExpectPlatform;
import jdlenl.thaumon.block.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
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
    public static Supplier<Block> ARCANE_STONE_SLAB;
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
    // public static Supplier<Block> WITCH_CAULDRON;

    public static void init() {
        AMBER = registerBlock("amber",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(0.3F).lightLevel(
                (state) -> 5
        ).sound(SoundType.SHROOMLIGHT).emissiveRendering(
                (state, view, pos) -> true
        ).hasPostProcess(
                (state, view, pos) -> true
        )));

        AMBER_STAIRS = registerBlock("amber_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.SHROOMLIGHT).strength(1.0F).lightLevel(
                (state) -> 5
        ).sound(SoundType.FROGLIGHT).emissiveRendering(
                (state, view, pos) -> true
        ).hasPostProcess(
                (state, view, pos) -> true
        )));

        AMBER_SLAB = registerBlock("amber_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.SHROOMLIGHT).strength(1.0F).lightLevel(
                (state) -> 5
        ).hasPostProcess(
                (state, view, pos) -> true
        ).emissiveRendering(
                (state, view, pos) -> true
        )));

        AMBER_BRICKS = registerBlock("amber_bricks",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.SHROOMLIGHT).strength(1.0F).lightLevel(
                (state) -> 5
        ).hasPostProcess(
                (state, view, pos) -> true
        ).emissiveRendering(
                (state, view, pos) -> true
        )));

        AMBER_BRICK_STAIRS = registerBlock("amber_brick_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.SHROOMLIGHT).strength(1.0F).lightLevel(
                (state) -> 5
        ).sound(SoundType.FROGLIGHT).emissiveRendering(
                (state, view, pos) -> true
        ).hasPostProcess(
                (state, view, pos) -> true
        )));

        AMBER_BRICK_SLAB = registerBlock("amber_brick_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.SHROOMLIGHT).strength(1.0F).lightLevel(
                (state) -> 5
        ).hasPostProcess(
                (state, view, pos) -> true
        ).emissiveRendering(
                (state, view, pos) -> true
        )));

        AMBERGLASS = registerBlock("amberglass",
                () -> new GlassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.SHROOMLIGHT).strength(1.0F).lightLevel(
                (state) -> 5
        ).noOcclusion().hasPostProcess(
                (state, view, pos) -> true
        ).emissiveRendering(
                (state, view, pos) -> true
        ).isRedstoneConductor(
                (state, view, pos) -> false
        )));

        AMBERGLASS_PANE = registerBlock("amberglass_pane",
                () -> new IronBarsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.SHROOMLIGHT).strength(1.0F).lightLevel(
                (state) -> 5
        ).noOcclusion().hasPostProcess(
                (state, view, pos) -> true
        ).emissiveRendering(
                (state, view, pos) -> true
        ).isRedstoneConductor(
                (state, view, pos) -> false
        )));

        GREATWOOD_LOG = registerBlock("greatwood_log",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_WOOD = registerBlock("greatwood_wood",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_LOG_WALL = registerBlock("greatwood_log_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_LOG_POST = registerBlock("greatwood_log_post",
                () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_PLANKS = registerBlock("greatwood_planks",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_STAIRS = registerBlock("greatwood_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_SLAB = registerBlock("greatwood_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        GREATWOOD_DOOR = registerBlock("greatwood_door",
                () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        ), BlockSetType.OAK));

        GREATWOOD_TRAPDOOR = registerBlock("greatwood_trapdoor",
                () -> new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        ), BlockSetType.OAK));

        GILDED_GREATWOOD_DOOR = registerBlock("gilded_greatwood_door",
                () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        ), BlockSetType.OAK));

        GILDED_GREATWOOD_TRAPDOOR = registerBlock("gilded_greatwood_trapdoor",
                () -> new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        ), BlockSetType.OAK));

        GREATWOOD_FENCE = registerBlock("greatwood_fence",
                () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).forceSolidOn()));

        GREATWOOD_FENCE_GATE = registerBlock("greatwood_fence_gate",
                () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).forceSolidOn(), WoodType.OAK));

        GREATWOOD_WINDOW = registerBlock("greatwood_window",
                () -> new GlassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        )));

        GREATWOOD_WINDOW_PANE = registerBlock("greatwood_window_pane",
                () -> new IronBarsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        )));

        EMPTY_GREATWOOD_BOOKSHELF = registerBlock("empty_greatwood_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        GREATWOOD_BOOKSHELF = registerBlock("greatwood_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        CLASSIC_GREATWOOD_BOOKSHELF = registerBlock("classic_greatwood_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        DUSTY_GREATWOOD_BOOKSHELF = registerBlock("dusty_greatwood_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        ALCHEMISTS_GREATWOOD_BOOKSHELF = registerBlock("alchemists_greatwood_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        GREATWOOD_GRIMOIRE_BOOKSHELF = registerBlock("greatwood_grimoire_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        SILVERWOOD_LOG = registerBlock("silverwood_log",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_WOOD = registerBlock("silverwood_wood",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_LOG_WALL = registerBlock("silverwood_log_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_LOG_POST = registerBlock("silverwood_log_post",
                () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_PLANKS = registerBlock("silverwood_planks",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_STAIRS = registerBlock("silverwood_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_SLAB = registerBlock("silverwood_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F)));

        SILVERWOOD_DOOR = registerBlock("silverwood_door",
                () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        ), BlockSetType.OAK));

        SILVERWOOD_TRAPDOOR = registerBlock("silverwood_trapdoor",
                () -> new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        ), BlockSetType.OAK));

        SILVERWOOD_FENCE = registerBlock("silverwood_fence",
                () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).forceSolidOn()));

        SILVERWOOD_FENCE_GATE = registerBlock("silverwood_fence_gate",
                () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).forceSolidOn(), WoodType.OAK));

        SILVERWOOD_WINDOW = registerBlock("silverwood_window",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        )));

        SILVERWOOD_WINDOW_PANE = registerBlock("silverwood_window_pane",
                () -> new IronBarsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        )));

        EMPTY_SILVERWOOD_BOOKSHELF = registerBlock("empty_silverwood_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        SILVERWOOD_BOOKSHELF = registerBlock("silverwood_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        CLASSIC_SILVERWOOD_BOOKSHELF = registerBlock("classic_silverwood_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        DUSTY_SILVERWOOD_BOOKSHELF = registerBlock("dusty_silverwood_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        ALCHEMISTS_SILVERWOOD_BOOKSHELF = registerBlock("alchemists_silverwood_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        SILVERWOOD_GRIMOIRE_BOOKSHELF = registerBlock("silverwood_grimoire_bookshelf",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F)));

        ARCANE_STONE = registerBlock("arcane_stone",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ARCANE_STONE_STAIRS = registerBlock("arcane_stone_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ARCANE_STONE_SLAB = registerBlock("arcane_stone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ARCANE_STONE_WALL = registerBlock("arcane_stone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ARCANE_STONE_BRICKS = registerBlock("arcane_stone_bricks",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ARCANE_BRICK_STAIRS = registerBlock("arcane_brick_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ARCANE_BRICK_SLAB = registerBlock("arcane_brick_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ARCANE_BRICK_WALL = registerBlock("arcane_brick_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        LARGE_ARCANE_STONE_BRICKS = registerBlock("large_arcane_stone_bricks",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        LARGE_ARCANE_BRICK_STAIRS = registerBlock("large_arcane_brick_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        LARGE_ARCANE_BRICK_SLAB = registerBlock("large_arcane_brick_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        LARGE_ARCANE_BRICK_WALL = registerBlock("large_arcane_brick_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ARCANE_STONE_TILES = registerBlock("arcane_stone_tiles",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ARCANE_TILE_STAIRS = registerBlock("arcane_tile_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ARCANE_TILE_SLAB = registerBlock("arcane_tile_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ARCANE_STONE_PILLAR = registerBlock("arcane_stone_pillar",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        RUNIC_ARCANE_STONE = registerBlock("runic_arcane_stone",
                () -> new ThaumonFacingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        RUNIC_ARCANE_TILES = registerBlock("runic_arcane_tiles",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        TILED_ARCANE_STONE = registerBlock("tiled_arcane_stone",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        INLAID_ARCANE_STONE = registerBlock("inlaid_arcane_stone",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ARCANE_LANTERN = registerBlock("arcane_lantern",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).lightLevel(
                (state) -> 15
        ).requiresCorrectToolForDrops()));

        ARCANE_STONE_WINDOW = registerBlock("arcane_stone_window",
                () -> new GlassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        )));

        ARCANE_STONE_WINDOW_PANE = registerBlock("arcane_stone_window_pane",
                () -> new IronBarsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        )));

        ELDRITCH_STONE = registerBlock("eldritch_stone",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_STAIRS = registerBlock("eldritch_stone_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_SLAB = registerBlock("eldritch_stone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_WALL = registerBlock("eldritch_stone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_BRICKS = registerBlock("eldritch_stone_bricks",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_BRICK_STAIRS = registerBlock("eldritch_stone_brick_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_BRICK_SLAB = registerBlock("eldritch_stone_brick_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_BRICK_WALL = registerBlock("eldritch_stone_brick_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_TILES = registerBlock("eldritch_stone_tiles",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_TILE_STAIRS = registerBlock("eldritch_stone_tile_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_TILE_SLAB = registerBlock("eldritch_stone_tile_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_PILLAR = registerBlock("eldritch_stone_pillar",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_CAPSTONE = registerBlock("eldritch_stone_capstone",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_FACADE = registerBlock("eldritch_stone_facade",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        CHISELED_ELDRITCH_STONE = registerBlock("chiseled_eldritch_stone",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        CARVED_ELDRITCH_STONE = registerBlock("carved_eldritch_stone",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ENGRAVED_ELDRITCH_STONE = registerBlock("engraved_eldritch_stone",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        INLAID_ELDRITCH_STONE = registerBlock("inlaid_eldritch_stone",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ELDRITCH_LANTERN = registerBlock("eldritch_lantern",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).lightLevel(
                (state) -> 15
        ).requiresCorrectToolForDrops()));

        ELDRITCH_STONE_WINDOW = registerBlock("eldritch_stone_window",
                () -> new GlassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        )));

        ELDRITCH_STONE_WINDOW_PANE = registerBlock("eldritch_stone_window_pane",
                () -> new IronBarsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        )));

        ANCIENT_STONE = registerBlock("ancient_stone",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_STAIRS = registerBlock("ancient_stone_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_SLAB = registerBlock("ancient_stone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_WALL = registerBlock("ancient_stone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_BRICKS = registerBlock("ancient_stone_bricks",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        CRACKED_ANCIENT_STONE_BRICKS = registerBlock("cracked_ancient_stone_bricks",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_DOOR = registerBlock("ancient_stone_door",
                () -> new DoorBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.BASALT).strength(4.0F, 10.0F).requiresCorrectToolForDrops(), BlockSetType.STONE));

        POLISHED_ANCIENT_STONE = registerBlock("polished_ancient_stone",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        POLISHED_ANCIENT_STONE_STAIRS = registerBlock("polished_ancient_stone_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        POLISHED_ANCIENT_STONE_SLAB = registerBlock("polished_ancient_stone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_BRICK_STAIRS = registerBlock("ancient_stone_brick_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_BRICK_SLAB = registerBlock("ancient_stone_brick_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_BRICK_WALL = registerBlock("ancient_stone_brick_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_TILES = registerBlock("ancient_stone_tiles",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_TILE_STAIRS = registerBlock("ancient_stone_tile_stairs",
                () -> new StairBlock(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_TILE_SLAB = registerBlock("ancient_stone_tile_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ANCIENT_STONE_PILLAR = registerBlock("ancient_stone_pillar",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 10.0F).requiresCorrectToolForDrops()));

        ENGRAVED_ANCIENT_STONE = registerBlock("engraved_ancient_stone",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        CHISELED_ANCIENT_STONE = registerBlock("chiseled_ancient_stone",
                () -> new ThaumonFacingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        RUNIC_ANCIENT_STONE = registerBlock("runic_ancient_stone",
                () -> new ThaumonFacingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        TILED_ANCIENT_STONE = registerBlock("tiled_ancient_stone",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        INLAID_ANCIENT_STONE = registerBlock("inlaid_ancient_stone",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops()));

        ANCIENT_LANTERN = registerBlock("ancient_lantern",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).lightLevel(
                (state) -> 15
        ).requiresCorrectToolForDrops()));

        ANCIENT_STONE_WINDOW = registerBlock("ancient_stone_window",
                () -> new GlassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        )));

        ANCIENT_STONE_WINDOW_PANE = registerBlock("ancient_stone_window_pane",
                () -> new IronBarsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5F).noOcclusion().isRedstoneConductor(
                (state, view, pos) -> false
        )));

        GREATWOOD_LEAVES = registerBlock("greatwood_leaves",
                () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isSuffocating(
                (state, view, pos) -> false
        ).isViewBlocking(
                (state, view, pos) -> false
        ).ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor(
                (state, view, pos) -> false
        )));

        SILVERWOOD_LEAVES = registerBlock("silverwood_leaves",
                () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_CYAN).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isSuffocating(
                (state, view, pos) -> false
        ).isViewBlocking(
                (state, view, pos) -> false
        ).ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor(
                (state, view, pos) -> false
        )));

        SILVERWOOD_LEAF_POST = registerBlock("silverwood_leaf_post",
                () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_CYAN).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isSuffocating(
                (state, view, pos) -> false
        ).isViewBlocking(
                (state, view, pos) -> false
        ).ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor(
                (state, view, pos) -> false
        )));

        SILVERWOOD_LEAF_WALL = registerBlock("silverwood_leaf_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_CYAN).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isSuffocating(
                (state, view, pos) -> false
        ).isViewBlocking(
                (state, view, pos) -> false
        ).ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor(
                (state, view, pos) -> false
        )));

        GREATWOOD_BUTTON = registerBlock("greatwood_button",
                () -> new ButtonBlock(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F), BlockSetType.OAK, 30, true));

        SILVERWOOD_BUTTON = registerBlock("silverwood_button",
                () -> new ButtonBlock(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F), BlockSetType.OAK, 30, true));

        ARCANE_STONE_BUTTON = registerBlock("arcane_stone_button",
                () -> new ButtonBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops(), BlockSetType.STONE, 20, false));

        ANCIENT_STONE_BUTTON = registerBlock("ancient_stone_button",
                () -> new ButtonBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops(), BlockSetType.STONE, 20, false));

        GREATWOOD_PRESSURE_PLATE = registerBlock("greatwood_pressure_plate",
                () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).forceSolidOn(), BlockSetType.OAK));

        SILVERWOOD_PRESSURE_PLATE = registerBlock("silverwood_pressure_plate",
                () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHERRY_WOOD).strength(2.0F, 3.0F).forceSolidOn(), BlockSetType.OAK));

        ARCANE_STONE_PRESSURE_PLATE = registerBlock("arcane_stone_pressure_plate",
                () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops().forceSolidOn(), BlockSetType.IRON));

        ANCIENT_STONE_PRESSURE_PLATE = registerBlock("ancient_stone_pressure_plate",
                () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(3.0F, 7.0F).requiresCorrectToolForDrops().forceSolidOn(), BlockSetType.IRON));

        GRIMOIRE = registerBlock("grimoire",
                () -> new GrimoireBlock(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.NETHER_WOOD).strength(0.5F, 0.2F).noCollission().noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor(
                (state, view, pos) -> false
        ).offsetType(BlockBehaviour.OffsetType.XZ)));

        GRIMOIRE_STACK = registerBlock("grimoire_stack",
                () -> new GrimoireBlock(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.NETHER_WOOD).strength(0.5F, 0.2F).noCollission().noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor(
                (state, view, pos) -> false
        ).offsetType(BlockBehaviour.OffsetType.XZ)));

        RESEARCH_NOTES = registerBlock("research_notes",
                () -> new ResearchNotesBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).sound(SoundType.CANDLE).strength(0.05F, 0.1F).noCollission().noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor(
                (state, view, pos) -> false
        )));

        CRYSTAL_LAMP = registerBlock("crystal_lamp",
                () -> new CrystalLampBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT)
                .strength(0.05F, 0.3F).lightLevel(
                (state) -> 8
        ).noCollission().noOcclusion().pushReaction(PushReaction.DESTROY).hasPostProcess(
                (state, view, pos) -> true
        ).emissiveRendering(
                (state, view, pos) -> true
        ).isRedstoneConductor(
                (state, view, pos) -> false
        )));

        RETORT = registerBlock("retort",
                () -> new RetortBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT)
                .strength(0.1F, 0.5F).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor(
                (state, view, pos) -> false
        )));

        VIAL_RACK = registerBlock("vial_rack",
                () -> new VialRackBlock(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.CHISELED_BOOKSHELF).strength(0.2F).noCollission().noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor(
                (state, view, pos) -> false
        )));

        CRYSTAL_STAND = registerBlock("crystal_stand",
                () -> new CrystalStandBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT)
                .strength(0.05F, 0.3F).lightLevel(
                (state) -> 2
        ).noCollission().noOcclusion().pushReaction(PushReaction.DESTROY).hasPostProcess(
                (state, view, pos) -> true
        ).emissiveRendering(
                (state, view, pos) -> true
        ).isRedstoneConductor(
                (state, view, pos) -> false
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
