package com.egt.data.recipes.addon.mekanism;

import mekanism.common.registries.MekanismItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.ENRICHING_RECIPES;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class EnrichmentRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        ENRICHING_RECIPES.recipeBuilder(id("enriched/carbon"))
                .inputItems(ItemTags.COALS)
                .outputItems(MekanismItems.ENRICHED_CARBON)
                .duration(100)
                .EUt(VA[LV])
                .save(provider);

        ENRICHING_RECIPES.recipeBuilder(id("enriched/redstone"))
                .inputItems(Tags.Items.DUSTS_REDSTONE)
                .outputItems(MekanismItems.ENRICHED_REDSTONE)
                .duration(100)
                .EUt(VA[LV])
                .save(provider);

        ENRICHING_RECIPES.recipeBuilder(id("enriched/diamond"))
                .inputItems(Tags.Items.GEMS_DIAMOND)
                .outputItems(MekanismItems.ENRICHED_DIAMOND)
                .duration(100)
                .EUt(VA[LV])
                .save(provider);

        ENRICHING_RECIPES.recipeBuilder(id("enriched/refined_obsidian"))
                .inputItems(MekanismItems.REFINED_OBSIDIAN_DUST)
                .outputItems(MekanismItems.ENRICHED_OBSIDIAN)
                .duration(100)
                .EUt(VA[LV])
                .save(provider);

        ENRICHING_RECIPES.recipeBuilder(id("enriched/gold"))
                .inputItems(dust, Gold)
                .outputItems(MekanismItems.ENRICHED_GOLD)
                .duration(100)
                .EUt(VA[LV])
                .save(provider);

        ENRICHING_RECIPES.recipeBuilder(id("enriched/tin"))
                .inputItems(dust, Tin)
                .outputItems(MekanismItems.ENRICHED_TIN)
                .duration(100)
                .EUt(VA[LV])
                .save(provider);
    }
}
