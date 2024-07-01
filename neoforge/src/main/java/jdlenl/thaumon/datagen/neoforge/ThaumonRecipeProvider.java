package jdlenl.thaumon.datagen.neoforge;

import jdlenl.thaumon.datagen.ThaumonRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class ThaumonRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ThaumonRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(RecipeOutput exporter) {
        ThaumonRecipes.addRecipes(exporter);
    }
}
