package jdlenl.thaumon.datagen;

import jdlenl.thaumon.block.ThaumonBlocks;
import net.minecraft.world.item.Item;

import java.util.ArrayList;

public class ThaumonItemTagsAdder {
    public static final ArrayList<Item> STONE_BUTTONS = new ArrayList<>();
    public static final ArrayList<Item> WOODEN_BUTTONS = new ArrayList<>();
    public static final ArrayList<Item> WOODEN_DOORS = new ArrayList<>();
    public static final ArrayList<Item> NON_WOODEN_DOORS = new ArrayList<>();
    public static final ArrayList<Item> FENCE_GATES = new ArrayList<>();
    public static final ArrayList<Item> WOODEN_FENCES = new ArrayList<>();
    public static final ArrayList<Item> LEAVES = new ArrayList<>();
    public static final ArrayList<Item> WOODEN_SLABS = new ArrayList<>();
    public static final ArrayList<Item> NON_WOODEN_SLABS = new ArrayList<>();
    public static final ArrayList<Item> WOODEN_STAIRS = new ArrayList<>();
    public static final ArrayList<Item> NON_WOODEN_STAIRS = new ArrayList<>();
    public static final ArrayList<Item> WOODEN_TRAPDOORS = new ArrayList<>();
    public static final ArrayList<Item> WALLS = new ArrayList<>();
    public static final ArrayList<Item> WOODEN_PRESSURE_PLATES = new ArrayList<>();
    public static final ArrayList<Item> PLANKS = new ArrayList<>();
    public static final ArrayList<Item> GREATWOOD_LOGS = new ArrayList<>();
    public static final ArrayList<Item> SILVERWOOD_LOGS = new ArrayList<>();

    static {
        /* Stone Buttons */

        STONE_BUTTONS.add(ThaumonBlocks.ANCIENT_STONE_BUTTON.get().asItem());
        STONE_BUTTONS.add(ThaumonBlocks.ARCANE_STONE_BUTTON.get().asItem());

        /* Wooden Buttons */

        WOODEN_BUTTONS.add(ThaumonBlocks.SILVERWOOD_BUTTON.get().asItem());
        WOODEN_BUTTONS.add(ThaumonBlocks.GREATWOOD_BUTTON.get().asItem());

        /* Wooden Doors */

        WOODEN_DOORS.add(ThaumonBlocks.SILVERWOOD_DOOR.get().asItem());
        WOODEN_DOORS.add(ThaumonBlocks.GREATWOOD_DOOR.get().asItem());
        WOODEN_DOORS.add(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get().asItem());

        /* Non-Wooden Doors */

        NON_WOODEN_DOORS.add(ThaumonBlocks.ANCIENT_STONE_DOOR.get().asItem());

        /* Fence Gates */

        FENCE_GATES.add(ThaumonBlocks.GREATWOOD_FENCE_GATE.get().asItem());
        FENCE_GATES.add(ThaumonBlocks.SILVERWOOD_FENCE_GATE.get().asItem());

        /* Wooden Fences */

        WOODEN_FENCES.add(ThaumonBlocks.GREATWOOD_FENCE.get().asItem());
        WOODEN_FENCES.add(ThaumonBlocks.SILVERWOOD_FENCE.get().asItem());

        /* Leaves */

        LEAVES.add(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get().asItem());
        LEAVES.add(ThaumonBlocks.GREATWOOD_LEAVES.get().asItem());
        LEAVES.add(ThaumonBlocks.SILVERWOOD_LEAVES.get().asItem());
        LEAVES.add(ThaumonBlocks.SILVERWOOD_LEAF_POST.get().asItem());

        /* Wooden Slabs */

        WOODEN_SLABS.add(ThaumonBlocks.GREATWOOD_SLAB.get().asItem());
        WOODEN_SLABS.add(ThaumonBlocks.SILVERWOOD_SLAB.get().asItem());

        /* Non-Wooden Slabs */

        NON_WOODEN_SLABS.add(ThaumonBlocks.ARCANE_STONE_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ANCIENT_STONE_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.AMBER_BRICK_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ELDRITCH_STONE_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ARCANE_BRICK_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ARCANE_TILE_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.ARCANE_TILE_SLAB.get().asItem());
        NON_WOODEN_SLABS.add(ThaumonBlocks.AMBER_SLAB.get().asItem());

        /* Wooden Stairs */

        WOODEN_STAIRS.add(ThaumonBlocks.GREATWOOD_STAIRS.get().asItem());
        WOODEN_STAIRS.add(ThaumonBlocks.SILVERWOOD_STAIRS.get().asItem());

        /* Non-Wooden Stairs */

        NON_WOODEN_STAIRS.add(ThaumonBlocks.ARCANE_STONE_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ANCIENT_STONE_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.AMBER_BRICK_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ELDRITCH_STONE_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ARCANE_BRICK_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ARCANE_TILE_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.ARCANE_TILE_STAIRS.get().asItem());
        NON_WOODEN_STAIRS.add(ThaumonBlocks.AMBER_STAIRS.get().asItem());

        /* Wooden Trapdoors */

        WOODEN_TRAPDOORS.add(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get().asItem());
        WOODEN_TRAPDOORS.add(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get().asItem());
        WOODEN_TRAPDOORS.add(ThaumonBlocks.GREATWOOD_TRAPDOOR.get().asItem());

        /* Walls */

        WALLS.add(ThaumonBlocks.ARCANE_STONE_WALL.get().asItem());
        WALLS.add(ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get().asItem());
        WALLS.add(ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get().asItem());
        WALLS.add(ThaumonBlocks.GREATWOOD_LOG_WALL.get().asItem());
        WALLS.add(ThaumonBlocks.ARCANE_BRICK_WALL.get().asItem());
        WALLS.add(ThaumonBlocks.ELDRITCH_STONE_WALL.get().asItem());
        WALLS.add(ThaumonBlocks.ANCIENT_STONE_WALL.get().asItem());
        WALLS.add(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get().asItem());
        WALLS.add(ThaumonBlocks.SILVERWOOD_LOG_WALL.get().asItem());
        WALLS.add(ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get().asItem());

        /* Wooden Pressure Plates */

        WOODEN_PRESSURE_PLATES.add(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get().asItem());
        WOODEN_PRESSURE_PLATES.add(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get().asItem());

        /* Planks */

        PLANKS.add(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem());
        PLANKS.add(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem());

        /* Greatwood Logs */

        GREATWOOD_LOGS.add(ThaumonBlocks.GREATWOOD_LOG.get().asItem());
        GREATWOOD_LOGS.add(ThaumonBlocks.GREATWOOD_WOOD.get().asItem());

        /* Silverwood Logs */

        SILVERWOOD_LOGS.add(ThaumonBlocks.SILVERWOOD_LOG.get().asItem());
        SILVERWOOD_LOGS.add(ThaumonBlocks.SILVERWOOD_WOOD.get().asItem());
    }
}
