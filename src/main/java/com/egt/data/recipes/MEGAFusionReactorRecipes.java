package com.egt.data.recipes;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTMaterials.*;
import static com.egt.common.data.EGTRecipeTypes.MEGA_FUSION_REACTOR_RECIPES;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class MEGAFusionReactorRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        MEGA_FUSION_REACTOR_RECIPES.recipeBuilder(id("exotic_plasma"))
                .inputFluids(Helium3.getFluid((int) M))
                .inputFluids(NaquadahPlasma.getFluid((int) M / 2))
                .inputFluids(Antimatter.getFluid(50))
                .inputFluids(UUMatter.getFluid(50))
                .outputFluids(ExoticPlasma.getFluid(1000))
                .EUt(V[UHV])
                .duration(12000)
                .save(provider);
    }
}
