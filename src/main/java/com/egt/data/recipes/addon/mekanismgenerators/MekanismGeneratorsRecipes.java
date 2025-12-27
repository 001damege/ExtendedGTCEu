package com.egt.data.recipes.addon.mekanismgenerators;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class MekanismGeneratorsRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        FissionReactorRecipes.init(provider);
        FusionReactorRecipes.init(provider);
        GasBurningRecipes.init(provider);
        MekGenAssemblyLineRecipes.init(provider);
        MekGenChemicalInfuserRecipes.init(provider);
        MiscRecipes.init(provider);
        SteamTurbineRecipes.init(provider);
    }
}
