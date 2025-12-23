package com.egt.data.recipes.addon.mekanism;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.WASHING_RECIPES;
import static com.egt.common.data.addon.mekanism.MekMaterials.*;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class WasherRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        WASHING_RECIPES.recipeBuilder(id("copper/slurry/clean"))
                .inputFluids(Water.getFluid(5))
                .inputFluids(DirtyCopperSlurry.getFluid(1))
                .outputFluids(CleanCopperSlurry.getFluid(1))
                .duration(80)
                .EUt(VA[LV])
                .save(provider);

        WASHING_RECIPES.recipeBuilder(id("gold/slurry/clean"))
                .inputFluids(Water.getFluid(5))
                .inputFluids(DirtyGoldSlurry.getFluid(1))
                .outputFluids(CleanGoldSlurry.getFluid(1))
                .duration(80)
                .EUt(VA[LV])
                .save(provider);

        WASHING_RECIPES.recipeBuilder(id("iron/slurry/clean"))
                .inputFluids(Water.getFluid(5))
                .inputFluids(DirtyIronSlurry.getFluid(1))
                .outputFluids(CleanIronSlurry.getFluid(1))
                .duration(80)
                .EUt(VA[LV])
                .save(provider);

        WASHING_RECIPES.recipeBuilder(id("lead/slurry/clean"))
                .inputFluids(Water.getFluid(5))
                .inputFluids(DirtyLeadSlurry.getFluid(1))
                .outputFluids(CleanLeadSlurry.getFluid(1))
                .duration(80)
                .EUt(VA[LV])
                .save(provider);

        WASHING_RECIPES.recipeBuilder(id("osmium/slurry/clean"))
                .inputFluids(Water.getFluid(5))
                .inputFluids(DirtyOsmiumSlurry.getFluid(1))
                .outputFluids(CleanOsmiumSlurry.getFluid(1))
                .duration(80)
                .EUt(VA[LV])
                .save(provider);

        WASHING_RECIPES.recipeBuilder(id("tin/slurry/clean"))
                .inputFluids(Water.getFluid(5))
                .inputFluids(DirtyTinSlurry.getFluid(1))
                .outputFluids(CleanTinSlurry.getFluid(1))
                .duration(80)
                .EUt(VA[LV])
                .save(provider);

        WASHING_RECIPES.recipeBuilder(id("uranium/slurry/clean"))
                .inputFluids(Water.getFluid(5))
                .inputFluids(DirtyUraniumSlurry.getFluid(1))
                .outputFluids(CleanUraniumSlurry.getFluid(1))
                .duration(80)
                .EUt(VA[LV])
                .save(provider);
    }
}
