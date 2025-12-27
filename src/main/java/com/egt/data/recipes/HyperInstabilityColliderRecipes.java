package com.egt.data.recipes;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTMaterials.*;
import static com.egt.common.data.EGTRecipeTypes.HYPER_INSTABILITY_COLLIDER_RECIPES;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class HyperInstabilityColliderRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        HYPER_INSTABILITY_COLLIDER_RECIPES.recipeBuilder(id("neodragonium_dust"))
                .inputItems(dust, Neutronium, 4096)
                .inputItems(ingot, Naquadah, 1024)
                .inputFluids(ExoticPlasma.getFluid(1000))
                .inputFluids(Antimatter.getFluid(100))
                .outputItems(dust, Neodragonium, 128)
                .outputFluids(Tritanium.getFluid(L * 8))
                .outputFluids(Neutronium.getFluid(L * 64))
                .duration(24000)
                .EUt(V[UEV])
                .save(provider);
    }
}
