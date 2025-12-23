package com.egt.data.recipes.addon.mekanismgenerators;

import com.gregtechceu.gtceu.common.data.GTMaterials;

import mekanism.common.registries.MekanismFluids;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.GAS_BURNING_RECIPES;
import static com.gregtechceu.gtceu.api.GTValues.*;

public class GasBurningRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        GAS_BURNING_RECIPES.recipeBuilder(id("ethylene_to_energy_output"))
                .inputFluids(GTMaterials.Ethylene.getFluid(1))
                .duration(1)
                .EUt(-VH[LuV])
                .save(provider);

        GAS_BURNING_RECIPES.recipeBuilder(id("ethylene_to_energy_output_alt"))
                .inputFluids(MekanismFluids.ETHENE.getFluidStack(1))
                .duration(1)
                .EUt(-VH[LuV])
                .save(provider);
    }
}
