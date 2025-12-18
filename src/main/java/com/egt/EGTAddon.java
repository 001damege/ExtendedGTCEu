package com.egt;

import com.egt.common.data.EGTRecipeTypes;
import com.egt.common.data.EGTRecipes;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@GTAddon
public class EGTAddon implements IGTAddon {
    @Override
    public GTRegistrate getRegistrate() {
        return EGT.REGISTRATE;
    }

    @Override
    public void initializeAddon() {
        EGT.LOGGER.info("Extended: GTCEu Additions addon has loaded!");
    }

    @Override
    public String addonModId() {
        return EGT.MODID;
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        EGTRecipes.recipeAddition(provider);
        EGTRecipeTypes.init();
    }
}
