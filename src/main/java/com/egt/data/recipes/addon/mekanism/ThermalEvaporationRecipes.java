package com.egt.data.recipes.addon.mekanism;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.EVAPORATING_RECIPES;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class ThermalEvaporationRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        EVAPORATING_RECIPES.recipeBuilder(id("water_to_salt_water"))
                .inputFluids(Water.getFluid(10))
                .outputFluids(SaltWater.getFluid(1))
                .blastFurnaceTemp(3000)
                .duration(1)
                .EUt(VA[MV])
                .save(provider);

        EVAPORATING_RECIPES.recipeBuilder(id("salt_water_to_lithium"))
                .inputFluids(SaltWater.getFluid(10))
                .outputFluids(Lithium.getFluid(1))
                .blastFurnaceTemp(3000)
                .duration(1)
                .EUt(VA[MV])
                .save(provider);
    }
}
