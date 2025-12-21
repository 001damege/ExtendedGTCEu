package com.egt.data.recipes.addon.mekanismgenerators;

import com.egt.common.data.addon.mekanism.MekMaterials;

import com.gregtechceu.gtceu.common.data.GTMaterials;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.FISSION_REACTOR_RECIPES;

public class FissionReactorRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        FISSION_REACTOR_RECIPES.recipeBuilder(id("water_fission"))
                .inputFluids(GTMaterials.Water.getFluid(20000))
                .inputFluids(MekMaterials.FissileFuel.getFluid(1))
                .outputFluids(GTMaterials.Steam.getFluid(20000))
                .outputFluids(MekMaterials.NuclearWaste.getFluid(1))
                .duration(1)
                .save(provider);

        FISSION_REACTOR_RECIPES.recipeBuilder(id("sodium_fission"))
                .inputFluids(MekMaterials.Sodium.getFluid(200000))
                .inputFluids(MekMaterials.FissileFuel.getFluid(1))
                .outputFluids(MekMaterials.SuperHeatedSodium.getFluid(200000))
                .outputFluids(MekMaterials.NuclearWaste.getFluid(1))
                .duration(1)
                .save(provider);

        FISSION_REACTOR_RECIPES.recipeBuilder(id("water_fission_alt"))
                .inputFluids(GTMaterials.Water.getFluid(20000000))
                .inputFluids(MekMaterials.FissileFuel.getFluid(1000))
                .outputFluids(GTMaterials.Steam.getFluid(20000000))
                .outputFluids(MekMaterials.NuclearWaste.getFluid(1000))
                .duration(1)
                .circuitMeta(1)
                .save(provider);

        FISSION_REACTOR_RECIPES.recipeBuilder(id("sodium_fission_alt"))
                .inputFluids(MekMaterials.Sodium.getFluid(200000000))
                .inputFluids(MekMaterials.FissileFuel.getFluid(1000))
                .outputFluids(MekMaterials.SuperHeatedSodium.getFluid(200000000))
                .outputFluids(MekMaterials.NuclearWaste.getFluid(1000))
                .duration(1)
                .circuitMeta(1)
                .save(provider);
    }
}
