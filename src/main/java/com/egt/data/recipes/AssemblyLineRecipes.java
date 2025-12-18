package com.egt.data.recipes;

import com.egt.common.data.EGTMultiMachines;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.machines.GTMultiMachines;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.HIGHLY_ADVANCED_SOC;
import static com.gregtechceu.gtceu.common.data.GTMachines.ENERGY_INPUT_HATCH;
import static com.gregtechceu.gtceu.common.data.GTMachines.HULL;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;

public class AssemblyLineRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        ASSEMBLY_LINE_RECIPES.recipeBuilder(id("energy_hatch_uev"))
                .inputItems(HULL[UEV])
                .inputItems(cableGtSingle, Europium, 16)
                .inputItems(HIGHLY_ADVANCED_SOC, 32)
                .inputItems(CustomTags.UEV_CIRCUITS)
                .inputItems(wireGtHex, RutheniumTriniumAmericiumNeutronate, 32)
                .inputFluids(SodiumPotassium, 32000)
                .inputFluids(SolderingAlloy, 40 * L)
                .inputFluids(Neutronium, 1296)
                .outputItems(ENERGY_INPUT_HATCH[UEV])
                .stationResearch(b -> b
                        .researchStack(ENERGY_INPUT_HATCH[UHV].asStack())
                        .CWUt(288)
                        .EUt(VA[UHV]))
                .duration(2000)
                .EUt(VA[UEV])
                .save(provider);

        ASSEMBLY_LINE_RECIPES.recipeBuilder(id("extra_fusion_reactor"))
                .inputItems(GTMultiMachines.FUSION_REACTOR[UV], 8)
                .inputItems(CustomTags.UEV_CIRCUITS, 4)
                .inputItems(GTItems.GRAVI_STAR, 32)
                .inputItems(GTItems.NAN_CERTIFICATE)
                .inputItems(GTItems.FIELD_GENERATOR_UV)
                .inputItems(HIGHLY_ADVANCED_SOC, 64)
                .inputItems(HIGHLY_ADVANCED_SOC, 64)
                .inputItems(HIGHLY_ADVANCED_SOC, 64)
                .inputItems(HIGHLY_ADVANCED_SOC, 64)
                .inputItems(wireGtSingle, RutheniumTriniumAmericiumNeutronate, 64)
                .inputItems(wireGtSingle, EnrichedNaquadahTriniumEuropiumDuranide, 32)
                .inputFluids(Neutronium.getFluid(L * 16))
                .inputFluids(SolderingAlloy.getFluid(L * 32))
                .outputItems(EGTMultiMachines.FUSION_REACTOR[UHV])
                .stationResearch(b -> b
                        .researchStack(GTMultiMachines.FUSION_REACTOR[UV].asStack())
                        .CWUt(288)
                        .EUt(VA[UHV]))
                .duration(2000)
                .EUt(VA[UV])
                .save(provider);
    }
}
