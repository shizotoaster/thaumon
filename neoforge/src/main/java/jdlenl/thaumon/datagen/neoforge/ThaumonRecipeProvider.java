package jdlenl.thaumon.datagen.neoforge;

import jdlenl.thaumon.datagen.ThaumonRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ThaumonRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ThaumonRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput exporter) {
        ThaumonRecipes.addRecipes(exporter);
    }
}
