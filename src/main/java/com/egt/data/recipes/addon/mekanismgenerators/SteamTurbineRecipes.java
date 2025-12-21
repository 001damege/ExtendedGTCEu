package com.egt.data.recipes.addon.mekanismgenerators;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.STEAM_TURBINE_RECIPES;

public class SteamTurbineRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        STEAM_TURBINE_RECIPES.recipeBuilder(id("steam_to_energy_output"))
                .inputFluids(GTMaterials.Steam.getFluid(1))
                .duration(1)
                .EUt(-GTValues.VA[GTValues.UHV])
                .save(provider);
    }
}
