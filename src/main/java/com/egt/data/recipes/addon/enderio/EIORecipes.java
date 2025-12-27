package com.egt.data.recipes.addon.enderio;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class EIORecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        AlloySmelterRecipes.init(provider);
    }
}
