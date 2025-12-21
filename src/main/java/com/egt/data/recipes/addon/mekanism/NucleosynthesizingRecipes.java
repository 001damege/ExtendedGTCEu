package com.egt.data.recipes.addon.mekanism;

import com.egt.common.data.addon.mekanism.MekMaterials;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.NUCLEOSYNTHESIZING_RECIPES;

public class NucleosynthesizingRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        NUCLEOSYNTHESIZING_RECIPES.recipeBuilder(id("wither_skeleton_skull"))
                .inputItems(Blocks.SKELETON_SKULL)
                .inputFluids(MekMaterials.Antimatter.getFluid(5))
                .outputItems(Blocks.WITHER_SKELETON_SKULL)
                .duration(1250)
                .EUt(32)
                .save(provider);

        NUCLEOSYNTHESIZING_RECIPES.recipeBuilder(id("quartz_block"))
                .inputItems(Blocks.LIGHT_GRAY_WOOL)
                .inputFluids(MekMaterials.Antimatter.getFluid(2))
                .outputItems(Blocks.QUARTZ_BLOCK)
                .duration(500)
                .EUt(32)
                .save(provider);
    }
}
