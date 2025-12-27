package com.egt.data.recipes.addon.ae2;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class AE2Recipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        PolarizerRecipes.init(provider);
    }
}
