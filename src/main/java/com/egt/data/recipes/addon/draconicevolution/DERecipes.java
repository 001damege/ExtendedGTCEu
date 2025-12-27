package com.egt.data.recipes.addon.draconicevolution;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class DERecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        DraconicReactorRecipes.init(provider);
        FusionCraftingRecipes.init(provider);
    }
}
