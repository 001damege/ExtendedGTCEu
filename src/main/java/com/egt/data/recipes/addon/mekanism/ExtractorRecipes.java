package com.egt.data.recipes.addon.mekanism;

import com.egt.common.data.addon.mekanism.MekMaterials;
import mekanism.common.tags.MekanismTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.EXTRACTOR_RECIPES;

public class ExtractorRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        EXTRACTOR_RECIPES.recipeBuilder(id("extract_diamond"))
                .inputItems(Tags.Items.GEMS_DIAMOND)
                .outputFluids(MekMaterials.Diamond.getFluid(144))
                .duration(85)
                .EUt(30)
                .save(provider);

        EXTRACTOR_RECIPES.recipeBuilder(id("extract_dust_diamond"))
                .inputItems(MekanismTags.Items.DUSTS_DIAMOND)
                .outputFluids(MekMaterials.Diamond.getFluid(144))
                .duration(85)
                .EUt(30)
                .save(provider);

        EXTRACTOR_RECIPES.recipeBuilder(id("extract_diamond_block"))
                .inputItems(Tags.Blocks.STORAGE_BLOCKS_DIAMOND)
                .outputFluids(MekMaterials.Diamond.getFluid(1296))
                .duration(765)
                .EUt(30)
                .save(provider);
    }
}
