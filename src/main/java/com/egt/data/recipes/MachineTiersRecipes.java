package com.egt.data.recipes;

import com.egt.common.data.EGTMachines;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.data.recipe.GTCraftingComponents.*;
import static com.gregtechceu.gtceu.data.recipe.misc.MetaTileEntityLoader.registerMachineRecipe;

public class MachineTiersRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        registerMachineRecipe(provider, EGTMachines.MATTER_FABRICATOR, "121", "343", "555",
                '1', GTBlocks.FUSION_GLASS,
                '2', FIELD_GENERATOR,
                '3', MOTOR,
                '4', HULL,
                '5', CIRCUIT);
    }
}
