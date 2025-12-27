package com.egt.data.recipes;

import com.egt.common.data.EGTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.FUSION_RECIPES;

public class PlasmaRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        FUSION_RECIPES.recipeBuilder(id("helium3_and_tritium_to_naquadah_plasma"))
                .inputFluids(Helium3.getFluid(L * 3))
                .inputFluids(Tritium.getFluid(L * 2))
                .outputFluids(EGTMaterials.NaquadahPlasma.getFluid(144))
                .duration(20)
                .EUt(V[ZPM])
                .fusionStartEU(320_000_000)
                .save(provider);
    }
}
