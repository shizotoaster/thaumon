package jdlenl.thaumon.datagen.forge;

import jdlenl.thaumon.datagen.ThaumonRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ThaumonRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ThaumonRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> exporter) {
        ThaumonRecipes.addRecipes(exporter);
    }
}
