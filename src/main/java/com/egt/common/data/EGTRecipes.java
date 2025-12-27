package com.egt.common.data;

import com.egt.EGT;
import com.egt.data.recipes.*;
import com.egt.data.recipes.addon.ae2.AE2Recipes;
import com.egt.data.recipes.addon.avaritia.AvaritiaRecipes;
import com.egt.data.recipes.addon.draconicevolution.DERecipes;
import com.egt.data.recipes.addon.enderio.EIORecipes;
import com.egt.data.recipes.addon.mekanism.MekanismRecipes;
import com.egt.data.recipes.addon.mekanismgenerators.*;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.common.data.GTRecipes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class EGTRecipes {

    public static void recipeAddition(Consumer<FinishedRecipe> provider) {
        Consumer<FinishedRecipe> consumer = recipe -> {
            if (!GTRecipes.RECIPE_FILTERS.contains(recipe.getId())) {
                provider.accept(recipe);
            }
        };

        AssemblerRecipes.init(consumer);
        AssemblyLineRecipes.init(consumer);
        NeutronSynthesisRecipes.init(consumer);
        ParallelHatchRecipes.init(consumer);
        MatterFabricatorRecipes.init(consumer);
        HyperInstabilityColliderRecipes.init(consumer);
        MEGAFusionReactorRecipes.init(consumer);
        MixerRecipes.init(consumer);
        PlasmaRecipes.init(consumer);
        MachineTiersRecipes.init(consumer);
        VanillaRecipes.init(consumer);

        if (EGT.Mods.isMekLoaded()) {
            MekanismRecipes.init(consumer);
        }

        if (EGT.Mods.isMekGeneratorsLoaded()) {
            MekanismGeneratorsRecipes.init(consumer);
        }

        if (EGT.Mods.isDELoaded()) {
            DERecipes.init(consumer);
        }

        if (EGT.Mods.isEnderIOLoaded()) {
            EIORecipes.init(consumer);
        }

        if (GTCEu.Mods.isAE2Loaded()) {
            AE2Recipes.init(consumer);
        }

        if (EGT.Mods.isAvaritiaLoaded()) {
            AvaritiaRecipes.init(consumer);
        }
    }
}
