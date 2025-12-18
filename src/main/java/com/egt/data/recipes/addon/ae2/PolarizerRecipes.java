package com.egt.data.recipes.addon.ae2;

import appeng.core.definitions.AEItems;
import appeng.datagen.providers.tags.ConventionTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.POLARIZER_RECIPES;

public class PolarizerRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        POLARIZER_RECIPES.recipeBuilder(id("charged_certus_quartz_crystal"))
                .inputItems(ConventionTags.CERTUS_QUARTZ)
                .outputItems(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED)
                .duration(200)
                .EUt(32)
                .save(provider);

        POLARIZER_RECIPES.recipeBuilder(id("meteorite_compass"))
                .inputItems(Items.COMPASS)
                .outputItems(AEItems.METEORITE_COMPASS)
                .duration(200)
                .EUt(32)
                .save(provider);

        POLARIZER_RECIPES.recipeBuilder(id("guide"))
                .inputItems(Items.BOOK)
                .outputItems(AEItems.TABLET)
                .duration(200)
                .EUt(32)
                .save(provider);
    }
}
