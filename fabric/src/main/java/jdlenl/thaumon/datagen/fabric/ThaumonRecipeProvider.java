package jdlenl.thaumon.datagen.fabric;

import jdlenl.thaumon.datagen.ThaumonRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import java.util.function.Consumer;

public class ThaumonRecipeProvider extends FabricRecipeProvider {
    public ThaumonRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        ThaumonRecipes.addRecipes(exporter);
    }
}
