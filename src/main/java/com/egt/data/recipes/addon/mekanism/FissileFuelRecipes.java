package com.egt.data.recipes.addon.mekanism;

import com.egt.common.data.addon.mekanism.MekMaterials;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CENTRIFUGE_RECIPES;

public class FissileFuelRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        CENTRIFUGE_RECIPES.recipeBuilder(id("uranium_hexafluoride_to_fissile_fuel"))
                .inputFluids(GTMaterials.UraniumHexafluoride.getFluid(1000))
                .outputFluids(MekMaterials.FissileFuel.getFluid(1000))
                .circuitMeta(1)
                .duration(200)
                .EUt(VA[LV])
                .save(provider);
    }
}
