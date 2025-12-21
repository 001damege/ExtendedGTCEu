package com.egt.data.recipes.addon.mekanismgenerators;

import com.egt.common.data.addon.mekanismgenerators.MekGenMultiMachines;

import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.CustomTags;

import net.minecraft.data.recipes.FinishedRecipe;

import mekanism.common.registries.MekanismItems;
import mekanism.generators.common.registries.GeneratorsBlocks;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.api.GTValues.LuV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.cableGtSingle;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.plateDouble;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;

public class MiscRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        ASSEMBLY_LINE_RECIPES.recipeBuilder(id("fission_reactor"))
                .inputItems(MekanismItems.POLONIUM_PELLET, 64)
                .inputItems(MekanismItems.PLUTONIUM_PELLET, 32)
                .inputItems(GeneratorsBlocks.FISSION_FUEL_ASSEMBLY, 64)
                .inputItems(GeneratorsBlocks.FISSION_FUEL_ASSEMBLY, 32)
                .inputItems(GeneratorsBlocks.CONTROL_ROD_ASSEMBLY, 16)
                .inputItems(CustomTags.UV_BATTERIES, 8)
                .inputItems(cableGtSingle, IndiumTinBariumTitaniumCuprate)
                .inputItems(plateDouble, Europium, 4)
                .inputItems(GTItems.FIELD_GENERATOR_UV)
                .inputItems(GTItems.ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 64)
                .inputFluids(SolderingAlloy.getFluid(1440))
                .outputItems(MekGenMultiMachines.FISSION_REACTOR)
                .stationResearch(b -> b
                        .researchStack(GeneratorsBlocks.FISSION_FUEL_ASSEMBLY.getItemStack())
                        .CWUt(16)
                        .EUt(VA[LuV]))
                .duration(1000)
                .EUt(VA[LuV])
                .save(provider);
    }
}
