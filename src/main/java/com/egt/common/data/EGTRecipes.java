package com.egt.common.data;

import com.egt.EGT;
import com.egt.data.recipes.AssemblerRecipes;
import com.egt.data.recipes.AssemblyLineRecipes;
import com.egt.data.recipes.NeutronSynthesisRecipes;
import com.egt.data.recipes.addon.ae2.PolarizerRecipes;
import com.egt.data.recipes.addon.draconicevolution.DraconicReactorRecipes;
import com.egt.data.recipes.addon.draconicevolution.FusionCraftingRecipes;
import com.egt.data.recipes.addon.enderio.AlloySmelterRecipes;
import com.egt.data.recipes.addon.mekanism.*;
import com.egt.data.recipes.addon.mekanismgenerators.FusionReactorRecipes;
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

        if (EGT.Mods.isMekLoaded()) {
            ExtractorRecipes.init(consumer);
            ReactionRecipes.init(consumer);
            NucleosynthesizingRecipes.init(consumer);
            OxidizingRecipes.init(consumer);
        }

        if (EGT.Mods.isMekGeneratorsLoaded()) {
            FusionReactorRecipes.init(consumer);
        }

        if (EGT.Mods.isDELoaded()) {
            FusionCraftingRecipes.init(consumer);
            DraconicReactorRecipes.init(consumer);
        }

        if (EGT.Mods.isEnderIOLoaded()) {
            AlloySmelterRecipes.init(consumer);
        }

        if (GTCEu.Mods.isAE2Loaded()) {
            PolarizerRecipes.init(consumer);
        }
    }
}
