package jdlenl.thaumon.datagen;

import jdlenl.thaumon.block.ThaumonBlocks;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;

public class ThaumonBlockTagsAdder {
    public static final ArrayList<Block> MINEABLE_WITH_AXE = new ArrayList<>();
    public static final ArrayList<Block> SWORD_EFFICIENT = new ArrayList<>();
    public static final ArrayList<Block> MINEABLE_WITH_PICKAXE = new ArrayList<>();
    public static final ArrayList<Block> STONE_BUTTONS = new ArrayList<>();
    public static final ArrayList<Block> WOODEN_BUTTONS = new ArrayList<>();
    public static final ArrayList<Block> WOODEN_DOORS = new ArrayList<>();
    public static final ArrayList<Block> NON_WOODEN_DOORS = new ArrayList<>();
    public static final ArrayList<Block> ENCHANTMENT_POWER_PROVIDER = new ArrayList<>();
    public static final ArrayList<Block> FENCE_GATES = new ArrayList<>();
    public static final ArrayList<Block> WOODEN_FENCES = new ArrayList<>();
    public static final ArrayList<Block> LEAVES = new ArrayList<>();
    public static final ArrayList<Block> WOODEN_SLABS = new ArrayList<>();
    public static final ArrayList<Block> NON_WOODEN_SLABS = new ArrayList<>();
    public static final ArrayList<Block> WOODEN_STAIRS = new ArrayList<>();
    public static final ArrayList<Block> NON_WOODEN_STAIRS = new ArrayList<>();
    public static final ArrayList<Block> WOODEN_TRAPDOORS = new ArrayList<>();
    public static final ArrayList<Block> WALLS = new ArrayList<>();
    public static final ArrayList<Block> WOODEN_PRESSURE_PLATES = new ArrayList<>();
    public static final ArrayList<Block> STONE_PRESSURE_PLATES = new ArrayList<>();
    public static final ArrayList<Block> PLANKS = new ArrayList<>();
    public static final ArrayList<Block> GREATWOOD_LOGS = new ArrayList<>();
    public static final ArrayList<Block> SILVERWOOD_LOGS = new ArrayList<>();

    static {
        /* Mineable With Axe */
        
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_DOOR.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_BUTTON.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_FENCE.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_FENCE_GATE.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_LOG.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_LOG_POST.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_LOG_WALL.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_PLANKS.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_SLAB.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_STAIRS.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_TRAPDOOR.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GREATWOOD_WOOD.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.ALCHEMISTS_GREATWOOD_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.CLASSIC_GREATWOOD_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.DUSTY_GREATWOOD_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get());

        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_BUTTON.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_DOOR.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_FENCE.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_FENCE_GATE.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_LOG.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_LOG_POST.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_LOG_WALL.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_PLANKS.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_SLAB.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_STAIRS.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.SILVERWOOD_WOOD.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.ALCHEMISTS_SILVERWOOD_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.CLASSIC_SILVERWOOD_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.DUSTY_SILVERWOOD_BOOKSHELF.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get());

        MINEABLE_WITH_AXE.add(ThaumonBlocks.GRIMOIRE.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.GRIMOIRE_STACK.get());
        MINEABLE_WITH_AXE.add(ThaumonBlocks.VIAL_RACK.get());

        /* Sword Efficient */

        SWORD_EFFICIENT.add(ThaumonBlocks.GREATWOOD_LEAVES.get());
        SWORD_EFFICIENT.add(ThaumonBlocks.SILVERWOOD_LEAVES.get());
        SWORD_EFFICIENT.add(ThaumonBlocks.SILVERWOOD_LEAF_POST.get());
        SWORD_EFFICIENT.add(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get());

        /* Mineable With Pickaxe */
        
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_WINDOW.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_WINDOW_PANE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_WINDOW.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_WINDOW.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_WINDOW_PANE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.GREATWOOD_WINDOW.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.GREATWOOD_WINDOW_PANE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.SILVERWOOD_WINDOW.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.SILVERWOOD_WINDOW_PANE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_WALL.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_BRICKS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_BRICK_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_BRICK_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_BRICK_WALL.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_TILES.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_TILE_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_TILE_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_PILLAR.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.RUNIC_ARCANE_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.RUNIC_ARCANE_TILES.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.TILED_ARCANE_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.INLAID_ARCANE_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_LANTERN.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_WINDOW.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_WALL.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_TILES.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_PILLAR.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_STONE_FACADE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.CHISELED_ELDRITCH_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.CARVED_ELDRITCH_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ENGRAVED_ELDRITCH_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.INLAID_ELDRITCH_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ELDRITCH_LANTERN.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_WALL.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.POLISHED_ANCIENT_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_BRICKS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.CRACKED_ANCIENT_STONE_BRICKS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_TILES.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_DOOR.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_PILLAR.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ENGRAVED_ANCIENT_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.CHISELED_ANCIENT_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.RUNIC_ANCIENT_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.TILED_ANCIENT_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.INLAID_ANCIENT_STONE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_LANTERN.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_BUTTON.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.CRYSTAL_LAMP.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.CRYSTAL_STAND.get());
        MINEABLE_WITH_PICKAXE.add(ThaumonBlocks.RETORT.get());

        /* Stone Buttons */

        STONE_BUTTONS.add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get());
        STONE_BUTTONS.add(ThaumonBlocks.ARCANE_STONE_BUTTON.get());

        /* Wooden Buttons */

        WOODEN_BUTTONS.add(ThaumonBlocks.SILVERWOOD_BUTTON.get());
        WOODEN_BUTTONS.add(ThaumonBlocks.GREATWOOD_BUTTON.get());

        /* Wooden Doors */

        WOODEN_DOORS.add(ThaumonBlocks.SILVERWOOD_DOOR.get());
        WOODEN_DOORS.add(ThaumonBlocks.GREATWOOD_DOOR.get());
        WOODEN_DOORS.add(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get());

        /* Non-Wooden Doors */

        NON_WOODEN_DOORS.add(ThaumonBlocks.ANCIENT_STONE_DOOR.get());

        /* Enchantment Power Provider */

        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.ALCHEMISTS_GREATWOOD_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.ALCHEMISTS_SILVERWOOD_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.DUSTY_GREATWOOD_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.CLASSIC_SILVERWOOD_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.GREATWOOD_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.SILVERWOOD_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.CLASSIC_GREATWOOD_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.DUSTY_SILVERWOOD_BOOKSHELF.get());
        ENCHANTMENT_POWER_PROVIDER.add(ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get());
        
        /* Fence Gates */
        
        FENCE_GATES.add(ThaumonBlocks.GREATWOOD_FENCE_GATE.get());
        FENCE_GATES.add(ThaumonBlocks.SILVERWOOD_FENCE_GATE.get());
        
        /* Wooden Fences */
        
        WOODEN_FENCES.add(ThaumonBlocks.GREATWOOD_FENCE.get());
        WOODEN_FENCES.add(ThaumonBlocks.SILVERWOOD_FENCE.get());
        
        /* Leaves */
        
        LEAVES.add(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get());
        LEAVES.add(ThaumonBlocks.GREATWOOD_LEAVES.get());
        LEAVES.add(ThaumonBlocks.SILVERWOOD_LEAVES.get());
        LEAVES.add(ThaumonBlocks.SILVERWOOD_LEAF_POST.get());
        
        /* Wooden Slabs */
        
        WOODEN_SLABS.add(ThaumonBlocks.GREATWOOD_SLAB.get());
        WOODEN_SLABS.add(ThaumonBlocks.SILVERWOOD_SLAB.get());
        
        /* Non-Wooden Slabs */
        
        NON_WOODEN_SLABS.add(ThaumonBlocks.ARCANE_STONE_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ANCIENT_STONE_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.AMBER_BRICK_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ELDRITCH_STONE_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ARCANE_BRICK_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ARCANE_TILE_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ARCANE_TILE_SLAB.get());
        NON_WOODEN_SLABS.add(ThaumonBlocks.AMBER_SLAB.get());
        
        /* Wooden Stairs */
        
        WOODEN_STAIRS.add(ThaumonBlocks.GREATWOOD_STAIRS.get());
        WOODEN_STAIRS.add(ThaumonBlocks.SILVERWOOD_STAIRS.get());
        
        /* Non-Wooden Stairs */
        
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ARCANE_STONE_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ANCIENT_STONE_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.AMBER_BRICK_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ELDRITCH_STONE_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ARCANE_BRICK_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ARCANE_TILE_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ARCANE_TILE_STAIRS.get());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.AMBER_STAIRS.get());
        
        /* Wooden Trapdoors */
        
        WOODEN_TRAPDOORS.add(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get());
        WOODEN_TRAPDOORS.add(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get());
        WOODEN_TRAPDOORS.add(ThaumonBlocks.GREATWOOD_TRAPDOOR.get());

        /* Walls */
        
        WALLS.add(ThaumonBlocks.ARCANE_STONE_WALL.get());
        WALLS.add(ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get());
        WALLS.add(ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get());
        WALLS.add(ThaumonBlocks.GREATWOOD_LOG_WALL.get());
        WALLS.add(ThaumonBlocks.ARCANE_BRICK_WALL.get());
        WALLS.add(ThaumonBlocks.ELDRITCH_STONE_WALL.get());
        WALLS.add(ThaumonBlocks.ANCIENT_STONE_WALL.get());
        WALLS.add(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get());
        WALLS.add(ThaumonBlocks.SILVERWOOD_LOG_WALL.get());
        WALLS.add(ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get());
        
        /* Wooden Pressure Plates */
        
        WOODEN_PRESSURE_PLATES.add(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get());
        WOODEN_PRESSURE_PLATES.add(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get());
        
        /* Stone Pressure Plates */
        
        STONE_PRESSURE_PLATES.add(ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get());
        STONE_PRESSURE_PLATES.add(ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get());
        
        /* Planks */
        
        PLANKS.add(ThaumonBlocks.GREATWOOD_PLANKS.get());
        PLANKS.add(ThaumonBlocks.SILVERWOOD_PLANKS.get());

        /* Greatwood Logs */

        GREATWOOD_LOGS.add(ThaumonBlocks.GREATWOOD_LOG.get());
        GREATWOOD_LOGS.add(ThaumonBlocks.GREATWOOD_WOOD.get());

        /* Silverwood Logs */

        SILVERWOOD_LOGS.add(ThaumonBlocks.SILVERWOOD_LOG.get());
        SILVERWOOD_LOGS.add(ThaumonBlocks.SILVERWOOD_WOOD.get());
    }
}
