package com.egt.data.recipes;

import com.egt.common.data.EGTMaterials;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.MATTER_FABRICATOR_RECIPES;
import static com.gregtechceu.gtceu.api.GTValues.*;

public class MatterFabricatorRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        MATTER_FABRICATOR_RECIPES.recipeBuilder(id("uu_matter"))
                .outputFluids(GTMaterials.UUMatter.getFluid(15))
                .circuitMeta(1)
                .duration(1)
                .EUt(V[ZPM])
                .save(provider);

        MATTER_FABRICATOR_RECIPES.recipeBuilder(id("anti_matter"))
                .outputFluids(EGTMaterials.Antimatter.getFluid(15))
                .circuitMeta(2)
                .duration(20)
                .EUt(V[UV])
                .save(provider);
    }
}
