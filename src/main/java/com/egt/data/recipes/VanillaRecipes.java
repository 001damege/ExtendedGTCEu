package com.egt.data.recipes;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.common.data.EGTMaterials.*;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.plateDense;

public class VanillaRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        VanillaRecipeHelper.addShapedRecipe(provider, true, "quantum_tank_uev", GTMachines.QUANTUM_TANK[UEV].asStack(),
                "CGC", "PHP", "CUC",
                'C', CustomTags.UEV_CIRCUITS,
                'P', new MaterialEntry(plateDense, Neodragonium),
                'U', GTItems.ELECTRIC_PUMP_UHV.asStack(),
                'G', GTItems.FIELD_GENERATOR_UV.asStack(),
                'H', GTBlocks.HERMETIC_CASING_UHV.asStack());

        VanillaRecipeHelper.addShapedRecipe(provider, true, "quantum_tank_uiv", GTMachines.QUANTUM_TANK[UIV].asStack(),
                "CGC", "PHP", "CUC",
                'C', CustomTags.UIV_CIRCUITS,
                'P', new MaterialEntry(plateDense, Explosium),
                'U', GTItems.ELECTRIC_PUMP_UEV.asStack(),
                'G', GTItems.FIELD_GENERATOR_UHV.asStack(),
                'H', GTBlocks.HERMETIC_CASING_UHV.asStack());

        VanillaRecipeHelper.addShapedRecipe(provider, true, "quantum_tank_uxv", GTMachines.QUANTUM_TANK[UXV].asStack(),
                "CGC", "PHP", "CUC",
                'C', CustomTags.UXV_CIRCUITS,
                'P', new MaterialEntry(plateDense, Invinciblium),
                'U', GTItems.ELECTRIC_PUMP_UIV.asStack(),
                'G', GTItems.FIELD_GENERATOR_UEV.asStack(),
                'H', GTBlocks.HERMETIC_CASING_UHV.asStack());

        VanillaRecipeHelper.addShapedRecipe(provider, true, "quantum_tank_opv", GTMachines.QUANTUM_TANK[OpV].asStack(),
                "CGC", "PHP", "CUC",
                'C', CustomTags.OpV_CIRCUITS,
                'P', new MaterialEntry(plateDense, Arcanium),
                'U', GTItems.ELECTRIC_PUMP_UXV.asStack(),
                'G', GTItems.FIELD_GENERATOR_UXV.asStack(),
                'H', GTBlocks.HERMETIC_CASING_UHV.asStack());
    }
}
