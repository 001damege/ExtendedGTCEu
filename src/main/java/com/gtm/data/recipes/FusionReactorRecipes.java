package com.gtm.data.recipes;

import com.gregtechceu.gtceu.api.GTValues;
import mekanism.generators.common.registries.GeneratorsFluids;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gtm.common.data.GTMRecipeTypes.FUSION_REACTOR_RECIPES;

public class FusionReactorRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        FUSION_REACTOR_RECIPES.recipeBuilder("deuterium_and_tritium_to_energy_output")
                .inputFluids(GeneratorsFluids.DEUTERIUM.getFluidStack(1000))
                .inputFluids(GeneratorsFluids.TRITIUM.getFluidStack(1000))
                .outputEU(-GTValues.V[GTValues.UHV])
                .duration(18432000)
                .save(provider);

        FUSION_REACTOR_RECIPES.recipeBuilder("fusion_fuel_to_energy_output")
                .inputFluids(GeneratorsFluids.FUSION_FUEL.getFluidStack(2000))
                .outputEU(-GTValues.V[GTValues.UHV])
                .duration(36864000)
                .save(provider);
    }
}
