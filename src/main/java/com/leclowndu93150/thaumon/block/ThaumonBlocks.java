package com.leclowndu93150.thaumon.block;

import com.leclowndu93150.thaumon.Thaumon;
import com.leclowndu93150.thaumon.block.blocks.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ThaumonBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Thaumon.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Thaumon.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> obj = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(obj.get(), new Item.Properties().tab(Thaumon.TAB)));
        return obj;
    }

    // Amber
    public static final RegistryObject<Block> AMBER = registerBlock("amber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.3F).lightLevel(s -> 2).sound(SoundType.SHROOMLIGHT)));
    public static final RegistryObject<Block> AMBER_STAIRS = registerBlock("amber_stairs",
            () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0F).lightLevel(s -> 2).sound(SoundType.SHROOMLIGHT)));
    public static final RegistryObject<Block> AMBER_SLAB = registerBlock("amber_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F).lightLevel(s -> 2).sound(SoundType.SHROOMLIGHT)));
    public static final RegistryObject<Block> AMBER_BRICKS = registerBlock("amber_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F).lightLevel(s -> 2).sound(SoundType.SHROOMLIGHT)));
    public static final RegistryObject<Block> AMBER_BRICK_STAIRS = registerBlock("amber_brick_stairs",
            () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.0F).lightLevel(s -> 2).sound(SoundType.SHROOMLIGHT)));
    public static final RegistryObject<Block> AMBER_BRICK_SLAB = registerBlock("amber_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F).lightLevel(s -> 2).sound(SoundType.SHROOMLIGHT)));
    public static final RegistryObject<Block> AMBERGLASS = registerBlock("amberglass",
            () -> new ThaumonGlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(1.0F).lightLevel(s -> 2).sound(SoundType.SHROOMLIGHT).noOcclusion()));
    public static final RegistryObject<Block> AMBERGLASS_PANE = registerBlock("amberglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(1.0F).lightLevel(s -> 2).sound(SoundType.SHROOMLIGHT).noOcclusion()));

    // Greatwood
    public static final RegistryObject<Block> GREATWOOD_LOG = registerBlock("greatwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_WOOD = registerBlock("greatwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_LOG_WALL = registerBlock("greatwood_log_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_LOG_POST = registerBlock("greatwood_log_post",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_PLANKS = registerBlock("greatwood_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_STAIRS = registerBlock("greatwood_stairs",
            () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_SLAB = registerBlock("greatwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_DOOR = registerBlock("greatwood_door",
            () -> new ThaumonDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> GREATWOOD_TRAPDOOR = registerBlock("greatwood_trapdoor",
            () -> new ThaumonTrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> GILDED_GREATWOOD_DOOR = registerBlock("gilded_greatwood_door",
            () -> new ThaumonDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> GILDED_GREATWOOD_TRAPDOOR = registerBlock("gilded_greatwood_trapdoor",
            () -> new ThaumonTrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> GREATWOOD_FENCE = registerBlock("greatwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_FENCE_GATE = registerBlock("greatwood_fence_gate",
            () -> new ThaumonFenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_WINDOW = registerBlock("greatwood_window",
            () -> new ThaumonGlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> GREATWOOD_WINDOW_PANE = registerBlock("greatwood_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> EMPTY_GREATWOOD_BOOKSHELF = registerBlock("empty_greatwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_BOOKSHELF = registerBlock("greatwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CLASSIC_GREATWOOD_BOOKSHELF = registerBlock("classic_greatwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DUSTY_GREATWOOD_BOOKSHELF = registerBlock("dusty_greatwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ALCHEMISTS_GREATWOOD_BOOKSHELF = registerBlock("alchemists_greatwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREATWOOD_GRIMOIRE_BOOKSHELF = registerBlock("greatwood_grimoire_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Silverwood
    public static final RegistryObject<Block> SILVERWOOD_LOG = registerBlock("silverwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_WOOD = registerBlock("silverwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_LOG_WALL = registerBlock("silverwood_log_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_LOG_POST = registerBlock("silverwood_log_post",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_PLANKS = registerBlock("silverwood_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_STAIRS = registerBlock("silverwood_stairs",
            () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_SLAB = registerBlock("silverwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_DOOR = registerBlock("silverwood_door",
            () -> new ThaumonDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SILVERWOOD_TRAPDOOR = registerBlock("silverwood_trapdoor",
            () -> new ThaumonTrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SILVERWOOD_FENCE = registerBlock("silverwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_FENCE_GATE = registerBlock("silverwood_fence_gate",
            () -> new ThaumonFenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_WINDOW = registerBlock("silverwood_window",
            () -> new ThaumonGlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> SILVERWOOD_WINDOW_PANE = registerBlock("silverwood_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> EMPTY_SILVERWOOD_BOOKSHELF = registerBlock("empty_silverwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_BOOKSHELF = registerBlock("silverwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CLASSIC_SILVERWOOD_BOOKSHELF = registerBlock("classic_silverwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DUSTY_SILVERWOOD_BOOKSHELF = registerBlock("dusty_silverwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ALCHEMISTS_SILVERWOOD_BOOKSHELF = registerBlock("alchemists_silverwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVERWOOD_GRIMOIRE_BOOKSHELF = registerBlock("silverwood_grimoire_bookshelf",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Arcane Stone
    public static final RegistryObject<Block> ARCANE_STONE = registerBlock("arcane_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ARCANE_STONE_STAIRS = registerBlock("arcane_stone_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ARCANE_STONE_SLAB = registerBlock("arcane_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ARCANE_STONE_WALL = registerBlock("arcane_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ARCANE_STONE_BRICKS = registerBlock("arcane_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ARCANE_BRICK_STAIRS = registerBlock("arcane_brick_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ARCANE_BRICK_SLAB = registerBlock("arcane_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ARCANE_BRICK_WALL = registerBlock("arcane_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> LARGE_ARCANE_STONE_BRICKS = registerBlock("large_arcane_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> LARGE_ARCANE_BRICK_STAIRS = registerBlock("large_arcane_brick_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> LARGE_ARCANE_BRICK_SLAB = registerBlock("large_arcane_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> LARGE_ARCANE_BRICK_WALL = registerBlock("large_arcane_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ARCANE_STONE_TILES = registerBlock("arcane_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> ARCANE_TILE_STAIRS = registerBlock("arcane_tile_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE_TILES.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> ARCANE_TILE_SLAB = registerBlock("arcane_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> ARCANE_STONE_PILLAR = registerBlock("arcane_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> RUNIC_ARCANE_STONE = registerBlock("runic_arcane_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> RUNIC_ARCANE_TILES = registerBlock("runic_arcane_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> TILED_ARCANE_STONE = registerBlock("tiled_arcane_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> INLAID_ARCANE_STONE = registerBlock("inlaid_arcane_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ARCANE_LANTERN = registerBlock("arcane_lantern",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.LANTERN).lightLevel(s -> 15)));
    public static final RegistryObject<Block> ARCANE_STONE_WINDOW = registerBlock("arcane_stone_window",
            () -> new ThaumonGlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> ARCANE_STONE_WINDOW_PANE = registerBlock("arcane_stone_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).sound(SoundType.GLASS).noOcclusion()));

    // Eldritch Stone
    public static final RegistryObject<Block> ELDRITCH_STONE = registerBlock("eldritch_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ELDRITCH_STONE_STAIRS = registerBlock("eldritch_stone_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ELDRITCH_STONE_SLAB = registerBlock("eldritch_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ELDRITCH_STONE_WALL = registerBlock("eldritch_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ELDRITCH_STONE_BRICKS = registerBlock("eldritch_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ELDRITCH_STONE_BRICK_STAIRS = registerBlock("eldritch_stone_brick_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ELDRITCH_STONE_BRICK_SLAB = registerBlock("eldritch_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ELDRITCH_STONE_BRICK_WALL = registerBlock("eldritch_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ELDRITCH_STONE_TILES = registerBlock("eldritch_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> ELDRITCH_STONE_TILE_STAIRS = registerBlock("eldritch_stone_tile_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE_TILES.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> ELDRITCH_STONE_TILE_SLAB = registerBlock("eldritch_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> ELDRITCH_STONE_PILLAR = registerBlock("eldritch_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ELDRITCH_STONE_CAPSTONE = registerBlock("eldritch_stone_capstone",
            () -> new ThaumonFacingBlock(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ELDRITCH_STONE_FACADE = registerBlock("eldritch_stone_facade",
            () -> new ThaumonFacingBlock(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_ELDRITCH_STONE = registerBlock("chiseled_eldritch_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CARVED_ELDRITCH_STONE = registerBlock("carved_eldritch_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ENGRAVED_ELDRITCH_STONE = registerBlock("engraved_eldritch_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> INLAID_ELDRITCH_STONE = registerBlock("inlaid_eldritch_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ELDRITCH_LANTERN = registerBlock("eldritch_lantern",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(50.0F, 1200.0F).sound(SoundType.LANTERN).lightLevel(s -> 15)));
    public static final RegistryObject<Block> ELDRITCH_STONE_WINDOW = registerBlock("eldritch_stone_window",
            () -> new ThaumonGlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> ELDRITCH_STONE_WINDOW_PANE = registerBlock("eldritch_stone_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).sound(SoundType.GLASS).noOcclusion()));

    // Ancient Stone
    public static final RegistryObject<Block> ANCIENT_STONE = registerBlock("ancient_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ANCIENT_STONE_STAIRS = registerBlock("ancient_stone_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ANCIENT_STONE_SLAB = registerBlock("ancient_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ANCIENT_STONE_WALL = registerBlock("ancient_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_ANCIENT_STONE = registerBlock("polished_ancient_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_ANCIENT_STONE_STAIRS = registerBlock("polished_ancient_stone_stairs",
            () -> new StairBlock(Blocks.POLISHED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_ANCIENT_STONE_SLAB = registerBlock("polished_ancient_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE)));
    public static final RegistryObject<Block> ANCIENT_STONE_BRICKS = registerBlock("ancient_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_ANCIENT_STONE_BRICKS = registerBlock("cracked_ancient_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ANCIENT_STONE_BRICK_STAIRS = registerBlock("ancient_stone_brick_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ANCIENT_STONE_BRICK_SLAB = registerBlock("ancient_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ANCIENT_STONE_BRICK_WALL = registerBlock("ancient_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> ANCIENT_STONE_TILES = registerBlock("ancient_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> ANCIENT_STONE_TILE_STAIRS = registerBlock("ancient_stone_tile_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE_TILES.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> ANCIENT_STONE_TILE_SLAB = registerBlock("ancient_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> ANCIENT_STONE_DOOR = registerBlock("ancient_stone_door",
            () -> new ThaumonDoorBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
    public static final RegistryObject<Block> ANCIENT_STONE_PILLAR = registerBlock("ancient_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ENGRAVED_ANCIENT_STONE = registerBlock("engraved_ancient_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_ANCIENT_STONE = registerBlock("chiseled_ancient_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> RUNIC_ANCIENT_STONE = registerBlock("runic_ancient_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> TILED_ANCIENT_STONE = registerBlock("tiled_ancient_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> INLAID_ANCIENT_STONE = registerBlock("inlaid_ancient_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ANCIENT_LANTERN = registerBlock("ancient_lantern",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).sound(SoundType.LANTERN).lightLevel(s -> 15)));
    public static final RegistryObject<Block> ANCIENT_STONE_WINDOW = registerBlock("ancient_stone_window",
            () -> new ThaumonGlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> ANCIENT_STONE_WINDOW_PANE = registerBlock("ancient_stone_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).sound(SoundType.GLASS).noOcclusion()));

    // Leaves
    public static final RegistryObject<Block> GREATWOOD_LEAVES = registerBlock("greatwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).sound(SoundType.GRASS).noOcclusion().randomTicks()));
    public static final RegistryObject<Block> SILVERWOOD_LEAVES = registerBlock("silverwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).sound(SoundType.GRASS).noOcclusion().randomTicks()));
    public static final RegistryObject<Block> SILVERWOOD_LEAF_WALL = registerBlock("silverwood_leaf_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> SILVERWOOD_LEAF_POST = registerBlock("silverwood_leaf_post",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).sound(SoundType.GRASS)));

    // Buttons
    public static final RegistryObject<Block> GREATWOOD_BUTTON = registerBlock("greatwood_button",
            () -> new ThaumonWoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.5F).sound(SoundType.WOOD).noCollission()));
    public static final RegistryObject<Block> SILVERWOOD_BUTTON = registerBlock("silverwood_button",
            () -> new ThaumonWoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.5F).sound(SoundType.WOOD).noCollission()));
    public static final RegistryObject<Block> ARCANE_STONE_BUTTON = registerBlock("arcane_stone_button",
            () -> new ThaumonStoneButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.5F).sound(SoundType.STONE).noCollission()));
    public static final RegistryObject<Block> ANCIENT_STONE_BUTTON = registerBlock("ancient_stone_button",
            () -> new ThaumonStoneButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.5F).sound(SoundType.STONE).noCollission()));

    // Pressure Plates
    public static final RegistryObject<Block> GREATWOOD_PRESSURE_PLATE = registerBlock("greatwood_pressure_plate",
            () -> new ThaumonPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noCollission()));
    public static final RegistryObject<Block> SILVERWOOD_PRESSURE_PLATE = registerBlock("silverwood_pressure_plate",
            () -> new ThaumonPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noCollission()));
    public static final RegistryObject<Block> ARCANE_STONE_PRESSURE_PLATE = registerBlock("arcane_stone_pressure_plate",
            () -> new ThaumonPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).sound(SoundType.STONE).noCollission()));
    public static final RegistryObject<Block> ANCIENT_STONE_PRESSURE_PLATE = registerBlock("ancient_stone_pressure_plate",
            () -> new ThaumonPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).sound(SoundType.STONE).noCollission()));

    // Decorative / Misc
    public static final RegistryObject<Block> GRIMOIRE = registerBlock("grimoire",
            () -> new GrimoireBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion().noCollission()));
    public static final RegistryObject<Block> GRIMOIRE_STACK = registerBlock("grimoire_stack",
            () -> new GrimoireStackBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion().noCollission()));
    public static final RegistryObject<Block> RESEARCH_NOTES = registerBlock("research_notes",
            () -> new ResearchNotesBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CRYSTAL_LAMP = registerBlock("crystal_lamp",
            () -> new CrystalLampBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).noOcclusion().noCollission().lightLevel(s -> 10)));
    public static final RegistryObject<Block> RETORT = registerBlock("retort",
            () -> new RetortBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F).noOcclusion().noCollission()));
    public static final RegistryObject<Block> VIAL_RACK = registerBlock("vial_rack",
            () -> new VialRackBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CRYSTAL_STAND = registerBlock("crystal_stand",
            () -> new CrystalStandBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5F).noOcclusion().noCollission().lightLevel(s -> 7)));

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
