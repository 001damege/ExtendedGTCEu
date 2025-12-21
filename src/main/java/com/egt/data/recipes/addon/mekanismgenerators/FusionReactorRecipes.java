package com.egt.data.recipes.addon.mekanismgenerators;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import net.minecraft.data.recipes.FinishedRecipe;

import mekanism.generators.common.registries.GeneratorsFluids;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.FUSION_REACTOR_RECIPES;

public class FusionReactorRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        FUSION_REACTOR_RECIPES.recipeBuilder(id("deuterium_and_tritium_to_energy_output"))
                .inputFluids(GTMaterials.Deuterium.getFluid(2000))
                .inputFluids(GTMaterials.Tritium.getFluid(2000))
                .duration(1)
                .EUt(-GTValues.VA[GTValues.UHV])
                .save(provider);

        FUSION_REACTOR_RECIPES.recipeBuilder(id("fusion_fuel"))
                .inputFluids(GeneratorsFluids.FUSION_FUEL.getFluidStack(1000))
                .duration(1)
                .EUt(-GTValues.VA[GTValues.UHV])
                .save(provider);
    }
}
