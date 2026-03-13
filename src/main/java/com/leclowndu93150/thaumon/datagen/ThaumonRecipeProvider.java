package com.leclowndu93150.thaumon.datagen;

import com.leclowndu93150.thaumon.Thaumon;
import com.leclowndu93150.thaumon.block.ThaumonBlocks;
import com.leclowndu93150.thaumon.item.ThaumonItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class ThaumonRecipeProvider extends RecipeProvider {
    public ThaumonRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.AMETHYST_BLOCK), ThaumonItems.MUTAGEN.get(), 8)
                .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "mutagen_from_amethyst_block"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.AMETHYST_SHARD), ThaumonItems.MUTAGEN.get(), 2)
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "mutagen_from_amethyst_shard"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.AMBER.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.SHROOMLIGHT)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        stairRecipe(consumer, ThaumonBlocks.AMBER_STAIRS.get(), ThaumonBlocks.AMBER.get());
        slabRecipe(consumer, ThaumonBlocks.AMBER_SLAB.get(), ThaumonBlocks.AMBER.get());
        brickRecipe(consumer, ThaumonBlocks.AMBER_BRICKS.get(), ThaumonBlocks.AMBER.get());
        stairRecipe(consumer, ThaumonBlocks.AMBER_BRICK_STAIRS.get(), ThaumonBlocks.AMBER_BRICKS.get());
        slabRecipe(consumer, ThaumonBlocks.AMBER_BRICK_SLAB.get(), ThaumonBlocks.AMBER_BRICKS.get());

        stonecutterRecipe(consumer, ThaumonBlocks.AMBER_STAIRS.get(), ThaumonBlocks.AMBER.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.AMBER_SLAB.get(), ThaumonBlocks.AMBER.get(), 2);
        stonecutterRecipe(consumer, ThaumonBlocks.AMBER_BRICKS.get(), ThaumonBlocks.AMBER.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.AMBER_BRICK_STAIRS.get(), ThaumonBlocks.AMBER_BRICKS.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.AMBER_BRICK_SLAB.get(), ThaumonBlocks.AMBER_BRICKS.get(), 2);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.AMBERGLASS.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .define('B', ThaumonBlocks.AMBER.get())
                .define('G', Blocks.GLASS)
                .unlockedBy(getHasName(ThaumonBlocks.AMBER.get()), has(ThaumonBlocks.AMBER.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.AMBERGLASS_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonBlocks.AMBERGLASS.get())
                .unlockedBy(getHasName(ThaumonBlocks.AMBERGLASS.get()), has(ThaumonBlocks.AMBERGLASS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GREATWOOD_LOG.get())
                .requires(ThaumonItems.MUTAGEN.get())
                .requires(Blocks.OAK_LOG)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.GREATWOOD_WOOD.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', ThaumonItemTags.GREATWOOD_LOGS)
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get()), has(ThaumonBlocks.GREATWOOD_LOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.GREATWOOD_LOG_WALL.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonItemTags.GREATWOOD_LOGS)
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get()), has(ThaumonBlocks.GREATWOOD_LOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.GREATWOOD_LOG_POST.get(), 2)
                .pattern("B")
                .pattern("B")
                .define('B', ThaumonBlocks.GREATWOOD_LOG_WALL.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get()), has(ThaumonBlocks.GREATWOOD_LOG.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GREATWOOD_PLANKS.get(), 4)
                .requires(ThaumonItemTags.GREATWOOD_LOGS)
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get()), has(ThaumonBlocks.GREATWOOD_LOG.get()))
                .save(consumer);

        stairRecipe(consumer, ThaumonBlocks.GREATWOOD_STAIRS.get(), ThaumonBlocks.GREATWOOD_PLANKS.get());
        slabRecipe(consumer, ThaumonBlocks.GREATWOOD_SLAB.get(), ThaumonBlocks.GREATWOOD_PLANKS.get());

        ShapedRecipeBuilder.shaped(ThaumonBlocks.GREATWOOD_DOOR.get(), 3)
                .pattern("BB")
                .pattern("BB")
                .pattern("BB")
                .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get())
                .requires(ThaumonBlocks.GREATWOOD_DOOR.get())
                .requires(Items.GOLD_INGOT)
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get())
                .requires(ThaumonBlocks.GREATWOOD_TRAPDOOR.get())
                .requires(Items.GOLD_INGOT)
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.GREATWOOD_TRAPDOOR.get(), 3)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.GREATWOOD_FENCE.get(), 3)
                .pattern("SBS")
                .pattern("SBS")
                .define('S', Items.STICK)
                .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.GREATWOOD_FENCE_GATE.get())
                .pattern("BSB")
                .pattern("BSB")
                .define('S', Items.STICK)
                .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.GREATWOOD_WINDOW.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .define('G', Blocks.GLASS)
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.GREATWOOD_WINDOW_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonBlocks.GREATWOOD_WINDOW.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
                .pattern("BBB")
                .pattern("   ")
                .pattern("BBB")
                .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GREATWOOD_BOOKSHELF.get())
                .requires(Items.BOOK, 3)
                .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.CLASSIC_GREATWOOD_BOOKSHELF.get())
                .requires(Items.BOOK, 4)
                .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.DUSTY_GREATWOOD_BOOKSHELF.get())
                .requires(Items.STRING, 3)
                .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ALCHEMISTS_GREATWOOD_BOOKSHELF.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(Items.BONE)
                .requires(Items.BOOK)
                .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get())
                .requires(ThaumonBlocks.GRIMOIRE_STACK.get())
                .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "greatwood_grimoire_bookshelf_from_stack"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get())
                .requires(ThaumonBlocks.GRIMOIRE.get(), 3)
                .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "greatwood_grimoire_bookshelf_from_grimoire"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GREATWOOD_LEAVES.get())
                .requires(Blocks.OAK_LEAVES)
                .requires(ThaumonItems.MUTAGEN.get())
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GREATWOOD_BUTTON.get())
                .requires(ThaumonBlocks.GREATWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get()), has(ThaumonBlocks.GREATWOOD_LOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get())
                .pattern("BB")
                .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get()), has(ThaumonBlocks.GREATWOOD_LOG.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.SILVERWOOD_LOG.get())
                .requires(ThaumonItems.MUTAGEN.get())
                .requires(Blocks.BIRCH_LOG)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_WOOD.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', ThaumonItemTags.SILVERWOOD_LOGS)
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get()), has(ThaumonBlocks.SILVERWOOD_LOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_LOG_WALL.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonItemTags.SILVERWOOD_LOGS)
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get()), has(ThaumonBlocks.SILVERWOOD_LOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_LOG_POST.get(), 2)
                .pattern("B")
                .pattern("B")
                .define('B', ThaumonBlocks.SILVERWOOD_LOG_WALL.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get()), has(ThaumonBlocks.SILVERWOOD_LOG.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.SILVERWOOD_PLANKS.get(), 4)
                .requires(ThaumonItemTags.SILVERWOOD_LOGS)
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get()), has(ThaumonBlocks.SILVERWOOD_LOG.get()))
                .save(consumer);

        stairRecipe(consumer, ThaumonBlocks.SILVERWOOD_STAIRS.get(), ThaumonBlocks.SILVERWOOD_PLANKS.get());
        slabRecipe(consumer, ThaumonBlocks.SILVERWOOD_SLAB.get(), ThaumonBlocks.SILVERWOOD_PLANKS.get());

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_DOOR.get(), 3)
                .pattern("BB")
                .pattern("BB")
                .pattern("BB")
                .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get(), 3)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_FENCE.get(), 3)
                .pattern("SBS")
                .pattern("SBS")
                .define('S', Items.STICK)
                .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_FENCE_GATE.get())
                .pattern("BSB")
                .pattern("BSB")
                .define('S', Items.STICK)
                .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_WINDOW.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .define('G', Blocks.GLASS)
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_WINDOW_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonBlocks.SILVERWOOD_WINDOW.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
                .pattern("BBB")
                .pattern("   ")
                .pattern("BBB")
                .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.SILVERWOOD_BOOKSHELF.get())
                .requires(Items.BOOK, 3)
                .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.CLASSIC_SILVERWOOD_BOOKSHELF.get())
                .requires(Items.BOOK, 4)
                .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.DUSTY_SILVERWOOD_BOOKSHELF.get())
                .requires(Items.STRING, 3)
                .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ALCHEMISTS_SILVERWOOD_BOOKSHELF.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(Items.BONE)
                .requires(Items.BOOK)
                .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get())
                .requires(ThaumonBlocks.GRIMOIRE_STACK.get())
                .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "silverwood_grimoire_bookshelf_from_stack"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get())
                .requires(ThaumonBlocks.GRIMOIRE.get(), 3)
                .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "silverwood_grimoire_bookshelf_from_grimoire"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.SILVERWOOD_LEAVES.get())
                .requires(Blocks.BIRCH_LEAVES)
                .requires(ThaumonItems.MUTAGEN.get())
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.SILVERWOOD_BUTTON.get())
                .requires(ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get()), has(ThaumonBlocks.SILVERWOOD_LOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get())
                .pattern("BB")
                .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get()), has(ThaumonBlocks.SILVERWOOD_LOG.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ARCANE_STONE.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.DEEPSLATE)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "arcane_stone_from_deepslate"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ARCANE_STONE.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.TUFF)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "arcane_stone_from_tuff"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ARCANE_STONE.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.STONE)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "arcane_stone_from_stone"));

        stairRecipe(consumer, ThaumonBlocks.ARCANE_STONE_STAIRS.get(), ThaumonBlocks.ARCANE_STONE.get());
        slabRecipe(consumer, ThaumonBlocks.ARCANE_STONE_SLAB.get(), ThaumonBlocks.ARCANE_STONE.get());
        wallRecipe(consumer, ThaumonBlocks.ARCANE_STONE_WALL.get(), ThaumonBlocks.ARCANE_STONE.get());
        brickRecipe(consumer, ThaumonBlocks.ARCANE_STONE_BRICKS.get(), ThaumonBlocks.ARCANE_STONE.get());
        stairRecipe(consumer, ThaumonBlocks.ARCANE_BRICK_STAIRS.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get());
        slabRecipe(consumer, ThaumonBlocks.ARCANE_BRICK_SLAB.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get());
        wallRecipe(consumer, ThaumonBlocks.ARCANE_BRICK_WALL.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get());

        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_STONE_STAIRS.get(), ThaumonBlocks.ARCANE_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_STONE_SLAB.get(), ThaumonBlocks.ARCANE_STONE.get(), 2);
        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_STONE_WALL.get(), ThaumonBlocks.ARCANE_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_STONE_BRICKS.get(), ThaumonBlocks.ARCANE_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_BRICK_STAIRS.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_BRICK_SLAB.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_BRICK_WALL.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get(), 1);

        brickRecipe(consumer, ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get());
        stairRecipe(consumer, ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get(), ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get());
        slabRecipe(consumer, ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get(), ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get());
        wallRecipe(consumer, ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get(), ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get());

        stonecutterRecipe(consumer, ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get(), ThaumonBlocks.ARCANE_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get(), ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get(), ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, ThaumonBlocks.LARGE_ARCANE_BRICK_WALL.get(), ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get(), 1);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ARCANE_STONE_TILES.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE_BRICKS.get()), has(ThaumonBlocks.ARCANE_STONE_BRICKS.get()))
                .save(consumer);

        stairRecipe(consumer, ThaumonBlocks.ARCANE_TILE_STAIRS.get(), ThaumonBlocks.ARCANE_STONE_TILES.get());
        slabRecipe(consumer, ThaumonBlocks.ARCANE_TILE_SLAB.get(), ThaumonBlocks.ARCANE_STONE_TILES.get());

        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_STONE_TILES.get(), ThaumonBlocks.ARCANE_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_TILE_STAIRS.get(), ThaumonBlocks.ARCANE_STONE_TILES.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_TILE_SLAB.get(), ThaumonBlocks.ARCANE_STONE_TILES.get(), 2);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ARCANE_STONE_PILLAR.get())
                .pattern("B")
                .pattern("B")
                .define('B', ThaumonBlocks.ARCANE_STONE_SLAB.get())
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.ARCANE_STONE_PILLAR.get(), ThaumonBlocks.ARCANE_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.RUNIC_ARCANE_STONE.get())
                .requires(ThaumonBlocks.ARCANE_STONE.get())
                .requires(Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.RUNIC_ARCANE_STONE.get(), ThaumonBlocks.ARCANE_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.RUNIC_ARCANE_TILES.get())
                .requires(ThaumonBlocks.ARCANE_STONE_TILES.get())
                .requires(Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.RUNIC_ARCANE_TILES.get(), ThaumonBlocks.ARCANE_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.TILED_ARCANE_STONE.get())
                .requires(ThaumonBlocks.ARCANE_STONE.get())
                .requires(ThaumonBlocks.ARCANE_STONE_TILES.get())
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.TILED_ARCANE_STONE.get(), ThaumonBlocks.ARCANE_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.INLAID_ARCANE_STONE.get())
                .requires(ThaumonBlocks.ARCANE_STONE.get())
                .requires(Items.GOLD_INGOT)
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.INLAID_ARCANE_STONE.get(), ThaumonBlocks.ARCANE_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ARCANE_LANTERN.get())
                .requires(ThaumonBlocks.ARCANE_STONE.get())
                .requires(Items.TORCH)
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ARCANE_STONE_WINDOW.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .define('B', ThaumonBlocks.ARCANE_STONE.get())
                .define('G', Blocks.GLASS)
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonBlocks.ARCANE_STONE_WINDOW.get())
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ARCANE_STONE_BUTTON.get())
                .requires(ThaumonBlocks.ARCANE_STONE.get())
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get())
                .pattern("BB")
                .define('B', ThaumonBlocks.ARCANE_STONE.get())
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ELDRITCH_STONE.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.OBSIDIAN)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        stairRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE.get());
        slabRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE.get());
        wallRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_WALL.get(), ThaumonBlocks.ELDRITCH_STONE.get());
        brickRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), ThaumonBlocks.ELDRITCH_STONE.get());
        stairRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());
        slabRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());
        wallRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());

        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 2);
        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_WALL.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), 1);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ELDRITCH_STONE_TILES.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', ThaumonBlocks.ELDRITCH_STONE_BRICKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get()), has(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get()))
                .save(consumer);

        stairRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE_TILES.get());
        slabRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE_TILES.get());

        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_TILES.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE_TILES.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE_TILES.get(), 2);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ELDRITCH_STONE_PILLAR.get())
                .pattern("B")
                .pattern("B")
                .define('B', ThaumonBlocks.ELDRITCH_STONE_SLAB.get())
                .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get()), has(ThaumonBlocks.ELDRITCH_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_PILLAR.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get(), 2)
                .pattern("B")
                .pattern("B")
                .define('B', ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get())
                .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get()), has(ThaumonBlocks.ELDRITCH_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);

        stonecutterRecipe(consumer, ThaumonBlocks.ELDRITCH_STONE_FACADE.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);

        stonecutterRecipe(consumer, ThaumonBlocks.CHISELED_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.CARVED_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ENGRAVED_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.INLAID_ELDRITCH_STONE.get())
                .requires(ThaumonBlocks.ELDRITCH_STONE.get())
                .requires(Items.GOLD_INGOT)
                .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get()), has(ThaumonBlocks.ELDRITCH_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.INLAID_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ELDRITCH_LANTERN.get())
                .requires(ThaumonBlocks.ELDRITCH_STONE.get())
                .requires(Items.TORCH)
                .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get()), has(ThaumonBlocks.ELDRITCH_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ELDRITCH_STONE_WINDOW.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .define('B', ThaumonBlocks.ELDRITCH_STONE.get())
                .define('G', Blocks.GLASS)
                .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get()), has(ThaumonBlocks.ELDRITCH_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ELDRITCH_STONE_WINDOW_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonBlocks.ELDRITCH_STONE_WINDOW.get())
                .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get()), has(ThaumonBlocks.ELDRITCH_STONE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ANCIENT_STONE.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.COBBLESTONE)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "ancient_stone_from_cobblestone"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ANCIENT_STONE.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.COBBLED_DEEPSLATE)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "ancient_stone_from_cobbled_deepslate"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ANCIENT_STONE.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.ANDESITE)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "ancient_stone_from_andesite"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ANCIENT_STONE.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.DIORITE)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "ancient_stone_from_diorite"));

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ANCIENT_STONE.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.GRANITE)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "ancient_stone_from_granite"));

        stairRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE.get());
        slabRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_SLAB.get(), ThaumonBlocks.ANCIENT_STONE.get());
        wallRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_WALL.get(), ThaumonBlocks.ANCIENT_STONE.get());

        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_SLAB.get(), ThaumonBlocks.ANCIENT_STONE.get(), 2);
        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_WALL.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.POLISHED_ANCIENT_STONE.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', ThaumonBlocks.ANCIENT_STONE.get())
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer);

        stairRecipe(consumer, ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get(), ThaumonBlocks.POLISHED_ANCIENT_STONE.get());
        slabRecipe(consumer, ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get(), ThaumonBlocks.POLISHED_ANCIENT_STONE.get());

        stonecutterRecipe(consumer, ThaumonBlocks.POLISHED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get(), ThaumonBlocks.POLISHED_ANCIENT_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get(), ThaumonBlocks.POLISHED_ANCIENT_STONE.get(), 2);

        brickRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), ThaumonBlocks.POLISHED_ANCIENT_STONE.get());
        stairRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get());
        slabRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get());
        wallRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get());

        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), 1);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ANCIENT_STONE_TILES.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', ThaumonBlocks.ANCIENT_STONE_BRICKS.get())
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE_BRICKS.get()), has(ThaumonBlocks.ANCIENT_STONE_BRICKS.get()))
                .save(consumer);

        stairRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get());
        slabRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get());

        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_TILES.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get(), 1);
        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get(), 2);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ANCIENT_STONE_PILLAR.get())
                .pattern("B")
                .pattern("B")
                .define('B', ThaumonBlocks.ANCIENT_STONE_SLAB.get())
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.ANCIENT_STONE_PILLAR.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ThaumonBlocks.ANCIENT_STONE_BRICKS.get()), ThaumonBlocks.CRACKED_ANCIENT_STONE_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE_BRICKS.get()), has(ThaumonBlocks.ANCIENT_STONE_BRICKS.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "cracked_ancient_stone_bricks_from_smelting"));

        stonecutterRecipe(consumer, ThaumonBlocks.CRACKED_ANCIENT_STONE_BRICKS.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);

        stonecutterRecipe(consumer, ThaumonBlocks.ENGRAVED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);

        stonecutterRecipe(consumer, ThaumonBlocks.CHISELED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.RUNIC_ANCIENT_STONE.get())
                .requires(ThaumonBlocks.ANCIENT_STONE.get())
                .requires(Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID, "runic_ancient_stone"));

        stonecutterRecipe(consumer, ThaumonBlocks.RUNIC_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.TILED_ANCIENT_STONE.get())
                .requires(ThaumonBlocks.ANCIENT_STONE.get())
                .requires(ThaumonBlocks.ANCIENT_STONE_TILES.get())
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.TILED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.INLAID_ANCIENT_STONE.get())
                .requires(ThaumonBlocks.ANCIENT_STONE.get())
                .requires(Items.GOLD_INGOT)
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer);

        stonecutterRecipe(consumer, ThaumonBlocks.INLAID_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get(), 1);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ANCIENT_LANTERN.get())
                .requires(ThaumonBlocks.ANCIENT_STONE.get())
                .requires(Items.TORCH)
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ANCIENT_STONE_WINDOW.get(), 4)
                .pattern(" B ")
                .pattern("BGB")
                .pattern(" B ")
                .define('B', ThaumonBlocks.ANCIENT_STONE.get())
                .define('G', Blocks.GLASS)
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ANCIENT_STONE_WINDOW_PANE.get(), 16)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonBlocks.ANCIENT_STONE_WINDOW.get())
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ANCIENT_STONE_DOOR.get(), 3)
                .pattern("BB")
                .pattern("BB")
                .pattern("BB")
                .define('B', ThaumonBlocks.ANCIENT_STONE.get())
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.ANCIENT_STONE_BUTTON.get())
                .requires(ThaumonBlocks.ANCIENT_STONE.get())
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get())
                .pattern("BB")
                .define('B', ThaumonBlocks.ANCIENT_STONE.get())
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get()), has(ThaumonBlocks.ANCIENT_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonBlocks.SILVERWOOD_LEAVES.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LEAVES.get()), has(ThaumonBlocks.SILVERWOOD_LEAVES.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.SILVERWOOD_LEAF_POST.get(), 2)
                .pattern("B")
                .pattern("B")
                .define('B', ThaumonBlocks.SILVERWOOD_LEAVES.get())
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get()), has(ThaumonBlocks.SILVERWOOD_LOG.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GRIMOIRE.get())
                .requires(ThaumonItems.MUTAGEN.get()).requires(Items.BOOK)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.GRIMOIRE_STACK.get())
                .requires(ThaumonBlocks.GRIMOIRE.get(), 3)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ThaumonBlocks.RESEARCH_NOTES.get())
                .requires(Items.INK_SAC).requires(Items.PAPER).requires(Items.FEATHER)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.CRYSTAL_LAMP.get())
                .pattern("M")
                .pattern("A")
                .pattern("I")
                .define('M', ThaumonItems.MUTAGEN.get())
                .define('A', Items.AMETHYST_SHARD)
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.RETORT.get())
                .pattern(" G ")
                .pattern(" I ")
                .pattern("NFN")
                .define('G', Items.GLASS_BOTTLE)
                .define('I', Items.IRON_INGOT)
                .define('N', Items.IRON_NUGGET)
                .define('F', Items.FLINT)
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.VIAL_RACK.get())
                .pattern("GGG")
                .pattern("ISI")
                .define('G', Items.GLASS_BOTTLE)
                .define('I', Items.STICK)
                .define('S', ThaumonBlocks.GREATWOOD_SLAB.get())
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ThaumonBlocks.CRYSTAL_STAND.get())
                .pattern("M")
                .pattern("P")
                .pattern("G")
                .define('G', Items.GOLD_INGOT)
                .define('P', Items.PRISMARINE_SHARD)
                .define('M', ThaumonItems.MUTAGEN.get())
                .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
                .save(consumer);
    }

    private void stairRecipe(Consumer<FinishedRecipe> consumer, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(output, 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', input)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer);
    }

    private void slabRecipe(Consumer<FinishedRecipe> consumer, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(output, 6)
                .pattern("BBB")
                .define('B', input)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer);
    }

    private void wallRecipe(Consumer<FinishedRecipe> consumer, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(output, 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', input)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer);
    }

    private void brickRecipe(Consumer<FinishedRecipe> consumer, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(output, 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', input)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer);
    }

    private void stonecutterRecipe(Consumer<FinishedRecipe> consumer, ItemLike output, ItemLike input, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), output, count)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer, new ResourceLocation(Thaumon.MOD_ID,
                        getItemName(output) + "_from_" + getItemName(input) + "_stonecutting"));
    }
}
