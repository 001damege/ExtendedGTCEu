package com.egt.data.recipes;

import com.gregtechceu.gtceu.common.data.GTItems;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.NEUTRON_SYNTHESIS_RECIPES;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class NeutronSynthesisRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        NEUTRON_SYNTHESIS_RECIPES.recipeBuilder(id("nan_certificate"))
                .inputItems(block, Neutronium, 64)
                .inputItems(block, Neutronium, 64)
                .outputItems(GTItems.NAN_CERTIFICATE)
                .duration(20000)
                .EUt(V[UHV])
                .save(provider);

        NEUTRON_SYNTHESIS_RECIPES.recipeBuilder(id("nan_certificate_alt"))
                .inputItems(block, Neutronium, 64)
                .inputItems(block, Neutronium, 64)
                .inputFluids(Neutronium.getFluid(16000))
                .outputItems(GTItems.NAN_CERTIFICATE)
                .duration(10000)
                .EUt(V[UHV])
                .save(provider);
    }
}
