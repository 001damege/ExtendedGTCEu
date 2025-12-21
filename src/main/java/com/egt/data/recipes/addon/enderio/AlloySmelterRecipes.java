package com.egt.data.recipes.addon.enderio;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

import com.enderio.base.common.init.EIOItems;
import com.enderio.base.common.tag.EIOTags;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.ALLOY_SMELTER_RECIPES;

public class AlloySmelterRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        ALLOY_SMELTER_RECIPES.recipeBuilder(id("copper_alloy_ingot"))
                .inputItems(Tags.Items.INGOTS_COPPER)
                .inputItems(EIOTags.Items.SILICON)
                .outputItems(EIOItems.COPPER_ALLOY_INGOT)
                .duration(100)
                .EUt(16)
                .save(provider);

        ALLOY_SMELTER_RECIPES.recipeBuilder(id("energetic_alloy_ingot"))
                .inputItems(Tags.Items.DUSTS_REDSTONE)
                .inputItems(Tags.Items.INGOTS_GOLD)
                .inputItems(Tags.Items.DUSTS_GLOWSTONE)
                .outputItems(EIOItems.ENERGETIC_ALLOY_INGOT)
                .duration(100)
                .EUt(16)
                .save(provider);

        ALLOY_SMELTER_RECIPES.recipeBuilder(id("vibrant_alloy_ingot"))
                .inputItems(EIOTags.Items.INGOTS_ENERGETIC_ALLOY)
                .inputItems(Tags.Items.ENDER_PEARLS)
                .outputItems(EIOItems.VIBRANT_ALLOY_INGOT)
                .duration(100)
                .EUt(16)
                .save(provider);

        ALLOY_SMELTER_RECIPES.recipeBuilder(id("redstone_alloy_ingot"))
                .inputItems(Tags.Items.DUSTS_REDSTONE)
                .inputItems(EIOTags.Items.SILICON)
                .outputItems(EIOItems.REDSTONE_ALLOY_INGOT)
                .duration(100)
                .EUt(16)
                .save(provider);

        ALLOY_SMELTER_RECIPES.recipeBuilder(id("conductive_alloy_ingot"))
                .inputItems(EIOTags.Items.INGOTS_COPPER_ALLOY)
                .inputItems(Tags.Items.INGOTS_IRON)
                .inputItems(Tags.Items.DUSTS_REDSTONE)
                .outputItems(EIOItems.CONDUCTIVE_ALLOY_INGOT)
                .duration(100)
                .EUt(16)
                .save(provider);

        ALLOY_SMELTER_RECIPES.recipeBuilder(id("pulsating_alloy_ingot"))
                .inputItems(Tags.Items.INGOTS_IRON)
                .inputItems(Tags.Items.ENDER_PEARLS)
                .outputItems(EIOItems.PULSATING_ALLOY_INGOT)
                .duration(100)
                .EUt(16)
                .save(provider);

        ALLOY_SMELTER_RECIPES.recipeBuilder(id("dark_steel_ingot"))
                .inputItems(Tags.Items.INGOTS_IRON)
                .inputItems(EIOTags.Items.DUSTS_COAL)
                .inputItems(Tags.Blocks.OBSIDIAN)
                .outputItems(EIOItems.DARK_STEEL_INGOT)
                .duration(100)
                .EUt(16)
                .save(provider);

        ALLOY_SMELTER_RECIPES.recipeBuilder(id("soularium_ingot"))
                .inputItems(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .inputItems(Tags.Items.INGOTS_GOLD)
                .outputItems(EIOItems.SOULARIUM_INGOT)
                .duration(100)
                .EUt(16)
                .save(provider);

        ALLOY_SMELTER_RECIPES.recipeBuilder(id("end_steel_ingot"))
                .inputItems(Tags.Blocks.END_STONES)
                .inputItems(EIOItems.DARK_STEEL_INGOT)
                .inputItems(Tags.Blocks.OBSIDIAN)
                .outputItems(EIOItems.END_STEEL_INGOT)
                .duration(100)
                .EUt(16)
                .save(provider);

        ALLOY_SMELTER_RECIPES.recipeBuilder(id("nethercotta"))
                .inputItems(Tags.Items.INGOTS_NETHERITE)
                .inputItems(Tags.Items.CROPS_NETHER_WART)
                .inputItems(Items.CLAY_BALL)
                .outputItems(EIOItems.NETHERCOTTA)
                .duration(100)
                .EUt(16)
                .save(provider);
    }
}
