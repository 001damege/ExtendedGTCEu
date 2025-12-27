package com.egt.data.recipes.addon.mekanism;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class MekanismRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        ChemicalInfuserRecipes.init(provider);
        CrystallizerRecipes.init(provider);
        EnrichmentRecipes.init(provider);
        ExtractorRecipes.init(provider);
        FissileFuelRecipes.init(provider);
        NucleosynthesizingRecipes.init(provider);
        OxidizingRecipes.init(provider);
        ReactionRecipes.init(provider);
        ThermalEvaporationRecipes.init(provider);
        WasherRecipes.init(provider);
    }
}
