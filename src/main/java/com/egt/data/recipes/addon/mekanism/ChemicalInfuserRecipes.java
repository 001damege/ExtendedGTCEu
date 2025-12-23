package com.egt.data.recipes.addon.mekanism;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.CHEMICAL_INFUSING_RECIPES;
import static com.egt.common.data.addon.mekanism.MekMaterials.HydrogenChloride;
import static com.egt.common.data.addon.mekanism.MekMaterials.UraniumOxide;
import static com.gregtechceu.gtceu.api.GTValues.LV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class ChemicalInfuserRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        CHEMICAL_INFUSING_RECIPES.recipeBuilder(id("uranium/sulfuric_acid"))
                .inputFluids(HydrochloricAcid.getFluid(1))
                .inputFluids(UraniumOxide.getFluid(1))
                .outputFluids(UraniumHexafluoride.getFluid(2))
                .duration(100)
                .EUt(VA[LV])
                .save(provider);

        CHEMICAL_INFUSING_RECIPES.recipeBuilder(id("sulfur_trioxide"))
                .inputFluids(Oxygen.getFluid(1))
                .inputFluids(SulfurDioxide.getFluid(2))
                .outputFluids(SulfurTrioxide.getFluid(2))
                .duration(100)
                .EUt(VA[LV])
                .save(provider);

        CHEMICAL_INFUSING_RECIPES.recipeBuilder(id("sulfuric_acid"))
                .inputFluids(SulfurTrioxide.getFluid(1))
                .inputFluids(Steam.getFluid(1))
                .outputFluids(SulfuricAcid.getFluid(1))
                .duration(100)
                .EUt(VA[LV])
                .save(provider);

        CHEMICAL_INFUSING_RECIPES.recipeBuilder(id("hydrogen_chloride"))
                .inputFluids(Hydrogen.getFluid(1))
                .inputFluids(Chlorine.getFluid(1))
                .outputFluids(HydrogenChloride.getFluid(1))
                .duration(100)
                .EUt(VA[LV])
                .save(provider);
    }
}
