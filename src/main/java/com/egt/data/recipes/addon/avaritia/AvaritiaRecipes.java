package com.egt.data.recipes.addon.avaritia;

import committee.nova.mods.avaritia.init.registry.ModItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.*;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class AvaritiaRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        ASSEMBLER_RECIPES.recipeBuilder(id("infinity_ingot"))
                .inputItems(ModItems.neutron_ingot, 24)
                .inputItems(ModItems.crystal_matrix_ingot, 10)
                .inputItems(ModItems.infinity_catalyst, 11)
                .outputItems(ModItems.infinity_ingot)
                .duration(200)
                .EUt(VA[LV])
                .save(provider);

        NEUTRONIUM_COLLECTOR_RECIPES.recipeBuilder(id("neutron_pile"))
                .outputItems(ModItems.neutron_pile)
                .duration(1200)
                .save(provider);
    }
}
