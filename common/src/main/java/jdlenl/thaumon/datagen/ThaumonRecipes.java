package jdlenl.thaumon.datagen;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.block.ThaumonBlocks;
import jdlenl.thaumon.item.ThaumonItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public abstract class ThaumonRecipes extends RecipeProvider {
    public ThaumonRecipes(PackOutput output) {
        super(output);
    }

    public static void addRecipes(RecipeOutput exporter) {
        stonecutterResultFromBase(exporter, RecipeCategory.MISC, ThaumonItems.MUTAGEN.get(), Blocks.AMETHYST_BLOCK, 8);
        stonecutterResultFromBase(exporter, RecipeCategory.MISC, ThaumonItems.MUTAGEN.get(), Items.AMETHYST_SHARD, 2);

        // Amber
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER.get())
            .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.SHROOMLIGHT)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.AMBER.get())
            .unlockedBy(getHasName(ThaumonBlocks.AMBER.get().asItem()), has(ThaumonBlocks.AMBER.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_STAIRS.get(), ThaumonBlocks.AMBER.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.AMBER.get())
            .unlockedBy(getHasName(ThaumonBlocks.AMBER.get().asItem()), has(ThaumonBlocks.AMBER.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_SLAB.get(), ThaumonBlocks.AMBER.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICKS.get(), 4)
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.AMBER.get())
            .unlockedBy(getHasName(ThaumonBlocks.AMBER.get().asItem()), has(ThaumonBlocks.AMBER.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICKS.get(), ThaumonBlocks.AMBER.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICK_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.AMBER_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.AMBER_BRICKS.get().asItem()), has(ThaumonBlocks.AMBER_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICK_STAIRS.get(), ThaumonBlocks.AMBER_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICK_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.AMBER_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.AMBER_BRICKS.get().asItem()), has(ThaumonBlocks.AMBER_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.AMBER_BRICK_SLAB.get(), ThaumonBlocks.AMBER_BRICKS.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBERGLASS.get(), 4)
            .pattern(" B ")
            .pattern("BGB")
            .pattern(" B ")
            .define('B', ThaumonBlocks.AMBER.get())
            .define('G', Blocks.GLASS)
            .unlockedBy(getHasName(ThaumonBlocks.AMBER.get().asItem()), has(ThaumonBlocks.AMBER.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.AMBERGLASS_PANE.get(), 16)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.AMBER.get())
            .unlockedBy(getHasName(ThaumonBlocks.AMBER.get().asItem()), has(ThaumonBlocks.AMBER.get().asItem()))
            .save(exporter);
        
        // Greatwood
        
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_LOG.get())
            .requires(ThaumonItems.MUTAGEN.get())
            .requires(Blocks.OAK_LOG)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_WOOD.get(), 4)
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonItemTags.GREATWOOD_LOGS)
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), has(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_LOG_WALL.get(), 6)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonItemTags.GREATWOOD_LOGS)
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), has(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_LOG_POST.get(), 2)
            .pattern("B")
            .pattern("B")
            .define('B', ThaumonBlocks.GREATWOOD_LOG_WALL.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), has(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_PLANKS.get(), 4)
            .requires(ThaumonItemTags.GREATWOOD_LOGS)
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), has(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_DOOR.get(), 3)
            .pattern("BB")
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GILDED_GREATWOOD_DOOR.get())
            .requires(ThaumonBlocks.GREATWOOD_DOOR.get())
            .requires(Items.GOLD_INGOT)
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get())
            .requires(ThaumonBlocks.GREATWOOD_TRAPDOOR.get())
            .requires(Items.GOLD_INGOT)
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_TRAPDOOR.get(), 3)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_FENCE.get(), 3)
            .pattern("SBS")
            .pattern("SBS")
            .define('S', Items.STICK)
            .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_FENCE_GATE.get())
            .pattern("BSB")
            .pattern("BSB")
            .define('S', Items.STICK)
            .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_WINDOW.get(), 4)
            .pattern(" B ")
            .pattern("BGB")
            .pattern(" B ")
            .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
            .define('G', Blocks.GLASS)
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_WINDOW_PANE.get(), 16)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.GREATWOOD_WINDOW.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
            .pattern("BBB")
            .pattern("   ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.GREATWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_BOOKSHELF.get())
            .requires(Items.BOOK, 3)
            .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.CLASSIC_GREATWOOD_BOOKSHELF.get())
            .requires(Items.BOOK, 4)
            .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.DUSTY_GREATWOOD_BOOKSHELF.get())
            .requires(Items.STRING, 3)
            .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ALCHEMISTS_GREATWOOD_BOOKSHELF.get())
            .requires(Items.GLASS_BOTTLE)
            .requires(Items.BONE)
            .requires(Items.BOOK)
            .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get())
            .requires(ThaumonBlocks.GRIMOIRE_STACK.get())
            .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
            .save(exporter, new ResourceLocation(Thaumon.MOD_ID, "greatwood_grimoire_bookshelf_from_stack"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_GRIMOIRE_BOOKSHELF.get())
            .requires(ThaumonBlocks.GRIMOIRE.get(), 3)
            .requires(ThaumonBlocks.EMPTY_GREATWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_PLANKS.get()), has(ThaumonBlocks.GREATWOOD_PLANKS.get()))
            .save(exporter, new ResourceLocation(Thaumon.MOD_ID, "greatwood_grimoire_bookshelf_from_grimoire"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_LEAVES.get())
            .requires(Blocks.OAK_LEAVES)
            .requires(ThaumonItems.MUTAGEN.get())
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
            .save(exporter);
        
        // Silverwood

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_LOG.get())
            .requires(ThaumonItems.MUTAGEN.get())
            .requires(Blocks.BIRCH_LOG)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);
        
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_WOOD.get(), 4)
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonItemTags.SILVERWOOD_LOGS)
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), has(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_LOG_WALL.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ThaumonItemTags.SILVERWOOD_LOGS)
                .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), has(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_LOG_POST.get(), 2)
            .pattern("B")
            .pattern("B")
            .define('B', ThaumonBlocks.SILVERWOOD_LOG_WALL.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), has(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_PLANKS.get(), 4)
            .requires(ThaumonItemTags.SILVERWOOD_LOGS)
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), has(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_DOOR.get(), 3)
            .pattern("BB")
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_TRAPDOOR.get(), 3)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_FENCE.get(), 3)
            .pattern("SBS")
            .pattern("SBS")
            .define('S', Items.STICK)
            .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_FENCE_GATE.get())
            .pattern("BSB")
            .pattern("BSB")
            .define('S', Items.STICK)
            .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_WINDOW.get(), 4)
            .pattern(" B ")
            .pattern("BGB")
            .pattern(" B ")
            .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
            .define('G', Blocks.GLASS)
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_WINDOW_PANE.get(), 16)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.SILVERWOOD_WINDOW.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
            .pattern("BBB")
            .pattern("   ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_BOOKSHELF.get())
            .requires(Items.BOOK, 3)
            .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.CLASSIC_SILVERWOOD_BOOKSHELF.get())
            .requires(Items.BOOK, 4)
            .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.DUSTY_SILVERWOOD_BOOKSHELF.get())
            .requires(Items.STRING, 3)
            .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ALCHEMISTS_SILVERWOOD_BOOKSHELF.get())
            .requires(Items.GLASS_BOTTLE)
            .requires(Items.BONE)
            .requires(Items.BOOK)
            .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get())
            .requires(ThaumonBlocks.GRIMOIRE_STACK.get())
            .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
            .save(exporter, new ResourceLocation(Thaumon.MOD_ID, "silverwood_grimoire_bookshelf_from_stack"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_GRIMOIRE_BOOKSHELF.get())
            .requires(ThaumonBlocks.GRIMOIRE.get(), 3)
            .requires(ThaumonBlocks.EMPTY_SILVERWOOD_BOOKSHELF.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get()))
            .save(exporter, new ResourceLocation(Thaumon.MOD_ID, "silverwood_grimoire_bookshelf_from_grimoire"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_LEAVES.get())
            .requires(Blocks.BIRCH_LEAVES)
            .requires(ThaumonItems.MUTAGEN.get())
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get()), has(ThaumonItems.MUTAGEN.get()))
            .save(exporter);

        // Arcane stone
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE.get())
            .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.DEEPSLATE)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter, new ResourceLocation(Thaumon.MOD_ID, "arcane_stone_from_deepslate"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE.get())
            .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.TUFF)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter, new ResourceLocation(Thaumon.MOD_ID, "arcane_stone_from_tuff"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE.get())
            .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.STONE)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter, new ResourceLocation(Thaumon.MOD_ID, "arcane_stone_from_stone"));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ARCANE_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_STAIRS.get(), ThaumonBlocks.ARCANE_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.ARCANE_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_SLAB.get(), ThaumonBlocks.ARCANE_STONE.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_WALL.get(), 6)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ARCANE_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_WALL.get(), ThaumonBlocks.ARCANE_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_BRICKS.get(), 4)
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.ARCANE_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_BRICKS.get(), ThaumonBlocks.ARCANE_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ARCANE_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_STAIRS.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.ARCANE_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_SLAB.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_WALL.get(), 6)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ARCANE_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_BRICK_WALL.get(), ThaumonBlocks.ARCANE_STONE_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_TILES.get(), 4)
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_TILES.get(), ThaumonBlocks.ARCANE_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_TILE_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ARCANE_STONE_TILES.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_TILE_STAIRS.get(), ThaumonBlocks.ARCANE_STONE_TILES.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_TILE_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.ARCANE_STONE_TILES.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_TILE_SLAB.get(), ThaumonBlocks.ARCANE_STONE_TILES.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_PILLAR.get())
            .pattern("B")
            .pattern("B")
            .define('B', ThaumonBlocks.ARCANE_STONE_SLAB.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get(), 4)
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.ARCANE_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ARCANE_STONE_BRICKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.LARGE_ARCANE_BRICK_STAIRS.get(), ThaumonBlocks.ARCANE_STONE_TILES.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.LARGE_ARCANE_BRICK_SLAB.get(), ThaumonBlocks.ARCANE_STONE_TILES.get(), 2);


        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.LARGE_ARCANE_STONE_BRICKS.get(), ThaumonBlocks.ARCANE_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_PILLAR.get(), ThaumonBlocks.ARCANE_STONE_SLAB.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.RUNIC_ARCANE_STONE.get(), ThaumonBlocks.ARCANE_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.RUNIC_ARCANE_TILES.get(), ThaumonBlocks.ARCANE_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.TILED_ARCANE_STONE.get(), ThaumonBlocks.ARCANE_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.RUNIC_ARCANE_TILES.get(), ThaumonBlocks.TILED_ARCANE_STONE.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.INLAID_ARCANE_STONE.get())
                .requires(ThaumonItems.MUTAGEN.get())
                .requires(ThaumonBlocks.ARCANE_STONE.get())
                .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get()), has(ThaumonBlocks.ARCANE_STONE.get()))
                .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.INLAID_ARCANE_STONE.get(), ThaumonBlocks.ARCANE_STONE.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_LANTERN.get())
            .requires(ThaumonBlocks.INLAID_ARCANE_STONE.get()).requires(Items.GLOW_BERRIES)
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_WINDOW.get(), 4)
            .pattern(" B ")
            .pattern("BGB")
            .pattern(" B ")
            .define('B', ThaumonBlocks.ARCANE_STONE.get())
            .define('G', Blocks.GLASS)
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get(), 16)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ARCANE_STONE_WINDOW.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        // Eldritch stone
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE.get())
            .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.OBSIDIAN)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_WALL.get(), 6)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_WALL.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), 4)
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get(), 6)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_BRICK_WALL.get(), ThaumonBlocks.ELDRITCH_STONE_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILES.get(), 4)
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILES.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE_TILES.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILE_STAIRS.get(), ThaumonBlocks.ELDRITCH_STONE_TILES.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE_TILES.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get(), ThaumonBlocks.ELDRITCH_STONE_TILES.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_PILLAR.get())
            .pattern("B")
            .pattern("B")
            .define('B', ThaumonBlocks.ELDRITCH_STONE_SLAB.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get(), 2)
            .pattern("B")
            .pattern("B")
            .define('B', ThaumonBlocks.ELDRITCH_STONE_TILE_SLAB.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_CAPSTONE.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_FACADE.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_PILLAR.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.CARVED_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.CHISELED_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ENGRAVED_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.INLAID_ELDRITCH_STONE.get())
            .requires(ThaumonBlocks.ELDRITCH_STONE.get()).requires(ThaumonItems.MUTAGEN.get())
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.INLAID_ELDRITCH_STONE.get(), ThaumonBlocks.ELDRITCH_STONE.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_LANTERN.get())
            .requires(ThaumonBlocks.INLAID_ELDRITCH_STONE.get()).requires(Items.AMETHYST_SHARD)
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_WINDOW.get(), 4)
            .pattern(" B ")
            .pattern("BGB")
            .pattern(" B ")
            .define('B', ThaumonBlocks.ELDRITCH_STONE.get())
            .define('G', Blocks.GLASS)
            .unlockedBy(getHasName(ThaumonBlocks.ELDRITCH_STONE.get().asItem()), has(ThaumonBlocks.ELDRITCH_STONE.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ELDRITCH_STONE_WINDOW_PANE.get(), 16)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ELDRITCH_STONE_WINDOW.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        // Ancient stone
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE.get())
            .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.DRIPSTONE_BLOCK)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter, new ResourceLocation(Thaumon.MOD_ID, "ancient_stone_from_dripstone"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE.get())
            .requires(ThaumonItems.MUTAGEN.get()).requires(Blocks.GRANITE)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter, new ResourceLocation(Thaumon.MOD_ID, "ancient_stone_from_granite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ANCIENT_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.ANCIENT_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_SLAB.get(), ThaumonBlocks.ANCIENT_STONE.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_WALL.get(), 6)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ANCIENT_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_WALL.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), 4)
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.ANCIENT_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ANCIENT_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.ANCIENT_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_SLAB.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get(), 6)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ANCIENT_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BRICK_WALL.get(), ThaumonBlocks.ANCIENT_STONE_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILES.get(), 4)
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.ANCIENT_STONE_BRICKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILES.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ANCIENT_STONE_TILES.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILE_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.ANCIENT_STONE_TILES.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_TILE_SLAB.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get(), 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_PILLAR.get())
            .pattern("B")
            .pattern("B")
            .define('B', ThaumonBlocks.ANCIENT_STONE_SLAB.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_PILLAR.get(), ThaumonBlocks.ANCIENT_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.CHISELED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.ENGRAVED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.CRACKED_ANCIENT_STONE_BRICKS.get(), ThaumonBlocks.ANCIENT_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.RUNIC_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.TILED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', ThaumonBlocks.ANCIENT_STONE.get())
                .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE_BRICKS.get().asItem()))
                .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get(), 4)
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .define('B', ThaumonBlocks.POLISHED_ANCIENT_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE_STAIRS.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get(), 6)
            .pattern("BBB")
            .define('B', ThaumonBlocks.POLISHED_ANCIENT_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.POLISHED_ANCIENT_STONE_SLAB.get(), ThaumonBlocks.ANCIENT_STONE_TILES.get(), 2);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.INLAID_ANCIENT_STONE.get())
            .requires(ThaumonBlocks.ANCIENT_STONE.get()).requires(ThaumonItems.MUTAGEN.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.INLAID_ARCANE_STONE.get(), ThaumonBlocks.ANCIENT_STONE.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_LANTERN.get())
            .requires(ThaumonBlocks.INLAID_ANCIENT_STONE.get()).requires(Items.ENDER_PEARL)
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_WINDOW.get(), 4)
            .pattern(" B ")
            .pattern("BGB")
            .pattern(" B ")
            .define('B', ThaumonBlocks.ANCIENT_STONE.get())
            .define('G', Blocks.GLASS)
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_WINDOW_PANE.get(), 16)
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ThaumonBlocks.ANCIENT_STONE_WINDOW.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()), has(ThaumonBlocks.SILVERWOOD_PLANKS.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_DOOR.get(), 3)
            .pattern("BB")
            .pattern("BB")
            .pattern("BB")
            .define('B', ThaumonBlocks.ANCIENT_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        // Silverwood leaves
        wall(exporter, RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_LEAF_WALL.get(), ThaumonBlocks.SILVERWOOD_LEAVES.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_LEAF_POST.get(), 2)
            .pattern("B")
            .pattern("B")
            .define('B', ThaumonBlocks.SILVERWOOD_LEAVES.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), has(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
            .save(exporter);
        // Buttons
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_BUTTON.get())
            .requires(ThaumonBlocks.GREATWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), has(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_BUTTON.get())
            .requires(ThaumonBlocks.SILVERWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), has(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_BUTTON.get())
            .requires(ThaumonBlocks.ARCANE_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_BUTTON.get())
            .requires(ThaumonBlocks.ANCIENT_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        // Pressure plates
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.GREATWOOD_PRESSURE_PLATE.get())
            .pattern("BB")
            .define('B', ThaumonBlocks.GREATWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.GREATWOOD_LOG.get().asItem()), has(ThaumonBlocks.GREATWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.SILVERWOOD_PRESSURE_PLATE.get())
            .pattern("BB")
            .define('B', ThaumonBlocks.SILVERWOOD_PLANKS.get())
            .unlockedBy(getHasName(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()), has(ThaumonBlocks.SILVERWOOD_LOG.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ARCANE_STONE_PRESSURE_PLATE.get())
            .pattern("BB")
            .define('B', ThaumonBlocks.ARCANE_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ARCANE_STONE.get().asItem()), has(ThaumonBlocks.ARCANE_STONE.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.ANCIENT_STONE_PRESSURE_PLATE.get())
            .pattern("BB")
            .define('B', ThaumonBlocks.ANCIENT_STONE.get())
            .unlockedBy(getHasName(ThaumonBlocks.ANCIENT_STONE.get().asItem()), has(ThaumonBlocks.ANCIENT_STONE.get().asItem()))
            .save(exporter);

        // Misc
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GRIMOIRE.get())
            .requires(ThaumonItems.MUTAGEN.get()).requires(Items.BOOK)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.GRIMOIRE_STACK.get())
            .requires(ThaumonBlocks.GRIMOIRE.get()).requires(ThaumonBlocks.GRIMOIRE.get()).requires(ThaumonBlocks.GRIMOIRE.get())
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ThaumonBlocks.RESEARCH_NOTES.get())
            .requires(Items.INK_SAC).requires(Items.PAPER).requires(Items.FEATHER)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.CRYSTAL_LAMP.get())
            .pattern("M")
            .pattern("A")
            .pattern("I")
            .define('M', ThaumonItems.MUTAGEN.get())
            .define('A', Items.AMETHYST_SHARD)
            .define('I', Items.IRON_INGOT)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.RETORT.get())
            .pattern(" G ")
            .pattern(" I ")
            .pattern("NFN")
            .define('G', Items.GLASS_BOTTLE)
            .define('I', Items.IRON_INGOT)
            .define('N', Items.IRON_NUGGET)
            .define('F', Items.FLINT)
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.VIAL_RACK.get())
            .pattern("GGG")
            .pattern("ISI")
            .define('G', Items.GLASS_BOTTLE)
            .define('I', Items.STICK)
            .define('S', ThaumonBlocks.GREATWOOD_SLAB.get())
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ThaumonBlocks.CRYSTAL_STAND.get())
            .pattern("M")
            .pattern("P")
            .pattern("G")
            .define('G', Items.GOLD_INGOT)
            .define('P', Items.PRISMARINE)
            .define('M', ThaumonItems.MUTAGEN.get())
            .unlockedBy(getHasName(ThaumonItems.MUTAGEN.get().asItem()), has(ThaumonItems.MUTAGEN.get().asItem()))
            .save(exporter);
    }
}
