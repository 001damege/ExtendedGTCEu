package com.egt.data.recipes.addon.mekanismgenerators;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.CHEMICAL_INFUSING_RECIPES;
import static com.egt.common.data.addon.mekanismgenerators.MekGenMaterials.*;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class MekGenChemicalInfuserRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        CHEMICAL_INFUSING_RECIPES.recipeBuilder(id("fusion_fuel"))
                .inputFluids(Deuterium.getFluid(1))
                .inputFluids(Tritium.getFluid(1))
                .outputFluids(DTFuel.getFluid(2))
                .duration(100)
                .EUt(VA[LV])
                .save(provider);
    }
}
