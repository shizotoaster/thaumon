package jdlenl.thaumon.datagen.forge;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.block.ThaumonBlocks;
import jdlenl.thaumon.item.ThaumonItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ThaumonRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ThaumonRecipeProvider(DataOutput output) {
        super(output);
    }

    @Override
    protected void generate(Consumer<RecipeJsonProvider> exporter) {
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ThaumonItems.MUTAGEN.get(), Blocks.AMETHYST_BLOCK);

        // Amber
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER.get())
                .input(ThaumonItems.MUTAGEN.get()).input(Blocks.SHROOMLIGHT)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.AMBER.get())
                .criterion(hasItem(ThaumonBlocks.AMBER.get().asItem()), conditionsFromItem(ThaumonBlocks.AMBER.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_STAIRS.get(), ThaumonBlocks.AMBER.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.AMBER.get())
                .criterion(hasItem(ThaumonBlocks.AMBER.get().asItem()), conditionsFromItem(ThaumonBlocks.AMBER.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_SLAB.get(), ThaumonBlocks.AMBER.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICKS.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ThaumonBlocks.AMBER.get())
                .criterion(hasItem(ThaumonBlocks.AMBER.get().asItem()), conditionsFromItem(ThaumonBlocks.AMBER.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICKS.get(), ThaumonBlocks.AMBER.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICK_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.AMBER_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.AMBER_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.AMBER_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICK_STAIRS.get(), ThaumonBlocks.AMBER_BRICKS.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICK_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.AMBER_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.AMBER_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.AMBER_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICK_SLAB.get(), ThaumonBlocks.AMBER_BRICKS.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBERGLASS.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .input('B', ThaumonBlocks.AMBER.get())
                .input('G', Blocks.GLASS)
                .criterion(hasItem(ThaumonBlocks.AMBER.get().asItem()), conditionsFromItem(ThaumonBlocks.AMBER.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBERGLASS_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.AMBER.get())
                .criterion(hasItem(ThaumonBlocks.AMBER.get().asItem()), conditionsFromItem(ThaumonBlocks.AMBER.get().asItem()))
                .offerTo(exporter);
        // Greatwood
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_WOOD.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ThaumonBlocks.GREATWOOD_LOG.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_LOG_WALL.get(), ThaumonBlocks.GREATWOOD_LOG.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_LOG_POST.get(), 2)
                .pattern("B")
                .pattern("B")
                .input('B', ThaumonBlocks.GREATWOOD_LOG_WALL.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_PLANKS.get(), 4)
                .input(ThaumonBlocks.GREATWOOD_LOG.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_PLANKS.get(), 4)
                .input(ThaumonBlocks.GREATWOOD_WOOD.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_WOOD.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_WOOD.get().asItem()))
                .offerTo(exporter, new Identifier(Thaumon.MOD_ID, "greatwood_planks_from_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_DOOR.get(), 3)
                .pattern("BB")
                .pattern("BB")
                .pattern("BB")
                .input('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_TRAPDOOR.get(), 3)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_FENCE.get(), 3)
                .pattern("SBS")
                .pattern("SBS")
                .input('S', Items.STICK)
                .input('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_FENCE_GATE.get())
                .pattern("BSB")
                .pattern("BSB")
                .input('S', Items.STICK)
                .input('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_WINDOW.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .input('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .input('G', Blocks.GLASS)
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_WINDOW_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.GREATWOOD_WINDOW.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);
        // Silverwood
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_WOOD.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ThaumonBlocks.SILVERWOOD_LOG.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_LOG_WALL.get(), ThaumonBlocks.SILVERWOOD_LOG.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_LOG_POST.get(), 2)
                .pattern("B")
                .pattern("B")
                .input('B', ThaumonBlocks.SILVERWOOD_LOG_WALL.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_PLANKS.get(), 4)
                .input(ThaumonBlocks.SILVERWOOD_LOG.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_PLANKS.get(), 4)
                .input(ThaumonBlocks.SILVERWOOD_WOOD.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_WOOD.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_WOOD.get().asItem()))
                .offerTo(exporter, new Identifier(Thaumon.MOD_ID, "silverwoodwood_planks_from_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_DOOR.get(), 3)
                .pattern("BB")
                .pattern("BB")
                .pattern("BB")
                .input('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_TRAPDOOR.get(), 3)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_FENCE.get(), 3)
                .pattern("SBS")
                .pattern("SBS")
                .input('S', Items.STICK)
                .input('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_FENCE_GATE.get())
                .pattern("BSB")
                .pattern("BSB")
                .input('S', Items.STICK)
                .input('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_WINDOW.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .input('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .input('G', Blocks.GLASS)
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_WINDOW_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.SILVERWOOD_WINDOW.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        // Arcane stone
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE.get())
                .input(ThaumonItems.MUTAGEN.get()).input(Blocks.DEEPSLATE)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter, new Identifier(Thaumon.MOD_ID, "arcane_stone_from_deepslate"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE.get())
                .input(ThaumonItems.MUTAGEN.get()).input(Blocks.TUFF)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter, new Identifier(Thaumon.MOD_ID, "arcane_stone_from_tuff"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE.get())
                .input(ThaumonItems.MUTAGEN.get()).input(Blocks.STONE)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter, new Identifier(Thaumon.MOD_ID, "arcane_stone_from_stone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ARCANE_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_STAIRS.get(), ThaumonBlocks.ARCANE_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_SlAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.ARCANE_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_SlAB.get(), ThaumonBlocks.ARCANE_STONE.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_WALL.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ARCANE_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_WALL.get(), ThaumonBlocks.ARCANE_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_BRICKS.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ThaumonBlocks.ARCANE_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_BRICKS.get(), ThaumonBlocks.ARCANE_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ARCANE_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_STAIRS.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.ARCANE_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_SLAB.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_WALL.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ARCANE_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_WALL.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_TILES.get(), 6)
                .pattern("BB")
                .input('B', ThaumonBlocks.ARCANE_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_TILES.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_TILE_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ARCANE_STONE_TILES.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_TILE_STAIRS.get(), ThaumonBlocks.ARCANE_STONE_TILES.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_TILE_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.ARCANE_STONE_TILES.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_TILE_SLAB.get(), ThaumonBlocks.ARCANE_STONE_TILES.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_PILLAR.get(), 2)
                .pattern("B")
                .pattern("B")
                .input('B', ThaumonBlocks.ARCANE_STONE_TILES.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_PILLAR.get(), ThaumonBlocks.ARCANE_STONE_TILES.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.RUNIC_ARCANE_STONE.get(), ThaumonBlocks.ARCANE_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.RUNIC_ARCANE_TILES.get(), ThaumonBlocks.ARCANE_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.TILED_ARCANE_STONE.get())
                .pattern("B")
                .pattern("B")
                .input('B', ThaumonBlocks.ARCANE_STONE_SlAB.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.RUNIC_ARCANE_TILES.get(), ThaumonBlocks.TILED_ARCANE_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.INLAID_ARCANE_STONE.get(), ThaumonBlocks.TILED_ARCANE_STONE.get());

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_LANTERN.get())
                .input(ThaumonBlocks.INLAID_ARCANE_STONE.get()).input(Items.GLOW_BERRIES)
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_WINDOW.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .input('B', ThaumonBlocks.ARCANE_STONE.get())
                .input('G', Blocks.GLASS)
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ARCANE_STONE_WINDOW.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        // Eldritch stone
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE.get())
                .input(ThaumonItems.MUTAGEN.get()).input(Blocks.OBSIDIAN)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_WALL.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_WALL.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILES.get(), 6)
                .pattern("BB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILES.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE_TILES.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE_TILES.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE_TILES.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE_TILES.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_PILLAR.get(), 2)
                .pattern("B")
                .pattern("B")
                .input('B', ThaumonBlocks.ELDRITCH_STONE_TILES.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_PILLAR.get(), ThaumonBlocks.ELDRITCH_STONE_TILES.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get(), 2)
                .pattern("B")
                .pattern("B")
                .input('B', ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_FACADE.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_PILLAR.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.CARVED_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.CHISELED_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ENGRAVED_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.INLAID_ELDRITCH_STONE.get())
                .input(ThaumonBlocks.ELDRITCH_STONE.get()).input(ThaumonItems.MUTAGEN.get())
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_LANTERN.get())
                .input(ThaumonBlocks.INLAID_ELDRITCH_STONE.get()).input(Items.GLOW_BERRIES)
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_WINDOW.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .input('B', ThaumonBlocks.ELDRITCH_STONE.get())
                .input('G', Blocks.GLASS)
                .criterion(hasItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_WINDOW_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ELDRITCH_STONE_WINDOW.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        // Ancient stone
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE.get())
                .input(ThaumonItems.MUTAGEN.get()).input(Blocks.DRIPSTONE_BLOCK)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter, new Identifier(Thaumon.MOD_ID, "ancient_stone_from_dripstone"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE.get())
                .input(ThaumonItems.MUTAGEN.get()).input(Blocks.GRANITE)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter, new Identifier(Thaumon.MOD_ID, "ancient_stone_from_granite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ANCIENT_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.ANCIENT_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_SLAB.get(), ThaumonBlocks.ANCIENT_STONE.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_WALL.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ANCIENT_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_WALL.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ThaumonBlocks.ANCIENT_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ANCIENT_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.ANCIENT_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ANCIENT_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILES.get(), 6)
                .pattern("BB")
                .input('B', ThaumonBlocks.ANCIENT_STONE_BRICKS.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILES.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ANCIENT_STONE_TILES.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.ANCIENT_STONE_TILES.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get(), 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_PILLAR.get(), 2)
                .pattern("B")
                .pattern("B")
                .input('B', ThaumonBlocks.ANCIENT_STONE_TILES.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_PILLAR.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_PILLAR.get(), ThaumonBlocks.ANCIENT_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.CHISELED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ENGRAVED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.CRACKED_ANCIENT_STONE_BRICKS.get(), ThaumonBlocks.ANCIENT_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.RUNIC_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.TILED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .input('B', ThaumonBlocks.POLISHED_ANCIENT_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get(), 6)
                .pattern("BBB")
                .input('B', ThaumonBlocks.POLISHED_ANCIENT_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE_TILES.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE_TILES.get().asItem()))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get(), 2);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.INLAID_ANCIENT_STONE.get())
                .input(ThaumonBlocks.ANCIENT_STONE.get()).input(ThaumonItems.MUTAGEN.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_LANTERN.get())
                .input(ThaumonBlocks.INLAID_ANCIENT_STONE.get()).input(Items.GLOW_BERRIES)
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_WINDOW.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .input('B', ThaumonBlocks.ANCIENT_STONE.get())
                .input('G', Blocks.GLASS)
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_WINDOW_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ThaumonBlocks.ANCIENT_STONE_WINDOW.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_DOOR.get(), 3)
                .pattern("BB")
                .pattern("BB")
                .pattern("BB")
                .input('B', ThaumonBlocks.ANCIENT_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
                .offerTo(exporter);

        // Silverwood leaves
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_LEAF_WALL.get(), ThaumonBlocks.SILVERWOOD_LEAVES.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_LEAF_POST.get(), 2)
                .pattern("B")
                .pattern("B")
                .input('B', ThaumonBlocks.SILVERWOOD_LEAVES.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
                .offerTo(exporter);
        // Buttons
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_BUTTON.get())
                .input(ThaumonBlocks.GREATWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_BUTTON.get())
                .input(ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_BUTTON.get())
                .input(ThaumonBlocks.ARCANE_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BUTTON.get())
                .input(ThaumonBlocks.ANCIENT_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
                .offerTo(exporter);

        // Pressure plates
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get())
                .pattern("BB")
                .input('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get())
                .pattern("BB")
                .input('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .criterion(hasItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), conditionsFromItem(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get())
                .pattern("BB")
                .input('B', ThaumonBlocks.ARCANE_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ARCANE_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ARCANE_STONE.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get())
                .pattern("BB")
                .input('B', ThaumonBlocks.ANCIENT_STONE.get())
                .criterion(hasItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()), conditionsFromItem(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
                .offerTo(exporter);

        // Misc
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GRIMOIRE.get())
                .input(ThaumonItems.MUTAGEN.get()).input(Items.BOOK)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.GRIMOIRE_STACK.get())
                .input(ThaumonBlocks.GRIMOIRE.get()).input(ThaumonBlocks.GRIMOIRE.get()).input(ThaumonBlocks.GRIMOIRE.get())
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.RESEARCH_NOTES.get())
                .input(Items.INK_SAC).input(Items.PAPER).input(Items.FEATHER)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.CRYSTAL_LAMP.get())
                .pattern("M")
                .pattern("A")
                .pattern("I")
                .input('M', ThaumonItems.MUTAGEN.get())
                .input('A', Items.AMETHYST_SHARD)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.RETORT.get())
                .pattern(" G ")
                .pattern(" I ")
                .pattern("NFN")
                .input('G', Items.GLASS_BOTTLE)
                .input('I', Items.IRON_INGOT)
                .input('N', Items.IRON_NUGGET)
                .input('F', Items.FLINT)
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.VIAL_RACK.get())
                .pattern("GGG")
                .pattern("ISI")
                .input('G', Items.GLASS_BOTTLE)
                .input('I', Items.STICK)
                .input('S', ThaumonBlocks.GREATWOOD_SLAB.get())
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ThaumonBlocks.CRYSTAL_STAND.get())
                .pattern("M")
                .pattern("P")
                .pattern("G")
                .input('G', Items.GOLD_INGOT)
                .input('P', Items.PRISMARINE)
                .input('M', ThaumonItems.MUTAGEN.get())
                .criterion(hasItem(ThaumonItems.MUTAGEN.get().asItem()), conditionsFromItem(ThaumonItems.MUTAGEN.get().asItem()))
                .offerTo(exporter);
    }
}
