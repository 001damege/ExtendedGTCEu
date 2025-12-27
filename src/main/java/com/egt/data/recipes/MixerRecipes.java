package com.egt.data.recipes;

import com.egt.common.data.EGTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MIXER_RECIPES;

public class MixerRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        MIXER_RECIPES.recipeBuilder(id("ruthenium_trinium_americium_neutronium_enriched_naquadah_europium_duranium"))
                .inputItems(dust, RutheniumTriniumAmericiumNeutronate, 14)
                .inputItems(dust, EnrichedNaquadahTriniumEuropiumDuranide, 10)
                .outputItems(dust, EGTMaterials.RutheniumTriniumAmericiumNeutroniumEnrichedNaquadahEuropiumDuranium, 7)
                .duration(200)
                .EUt(VA[UHV])
                .circuitMeta(14)
                .save(provider);

    }
}
