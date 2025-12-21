package com.egt.data.recipes.addon.mekanism;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

import mekanism.common.registries.MekanismItems;
import mekanism.common.tags.MekanismTags;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.REACTION_RECIPES;

public class ReactionRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        REACTION_RECIPES.recipeBuilder(id("coal_gasification/blocks_coals"))
                .inputItems(Tags.Blocks.STORAGE_BLOCKS_COAL)
                .inputFluids(GTMaterials.Water.getFluid(1000))
                .inputFluids(GTMaterials.Oxygen.getFluid(1000))
                .outputItems(GTMaterials.Sulfur, 9)
                .outputFluids(GTMaterials.Hydrogen.getFluid(1000))
                .duration(200)
                .EUt(32)
                .save(provider);

        REACTION_RECIPES.recipeBuilder(id("wood_gasification/wooden_slabs"))
                .inputItems(TagPrefix.slab)
                .inputFluids(GTMaterials.Water.getFluid(10))
                .inputFluids(GTMaterials.Oxygen.getFluid(10))
                .outputFluids(GTMaterials.Hydrogen.getFluid(10))
                .duration(200)
                .EUt(32)
                .save(provider);

        REACTION_RECIPES.recipeBuilder(id("substrate/water_hydrogen"))
                .inputItems(MekanismItems.BIO_FUEL, 2)
                .inputFluids(GTMaterials.Water.getFluid(10))
                .inputFluids(GTMaterials.Hydrogen.getFluid(100))
                .outputItems(MekanismItems.SUBSTRATE)
                .outputFluids(GTMaterials.Ethylene.getFluid(100))
                .duration(200)
                .EUt(32)
                .save(provider);

        REACTION_RECIPES.recipeBuilder(id("substrate/ethene_oxygen"))
                .inputItems(MekanismItems.SUBSTRATE)
                .inputFluids(GTMaterials.Ethylene.getFluid(50))
                .inputFluids(GTMaterials.Oxygen.getFluid(10))
                .outputItems(MekanismItems.HDPE_PELLET)
                .duration(200)
                .EUt(32)
                .save(provider);

        REACTION_RECIPES.recipeBuilder(id("wood_gasification/wooden_stairs"))
                .inputItems(TagPrefix.stairs)
                .inputFluids(GTMaterials.Water.getFluid(15))
                .inputFluids(GTMaterials.Oxygen.getFluid(15))
                .outputFluids(GTMaterials.Hydrogen.getFluid(15))
                .duration(200)
                .EUt(32)
                .save(provider);

        REACTION_RECIPES.recipeBuilder(id("substrate/water_ethene"))
                .inputItems(MekanismItems.SUBSTRATE)
                .inputFluids(GTMaterials.Water.getFluid(200))
                .inputFluids(GTMaterials.Ethylene.getFluid(100))
                .outputItems(MekanismItems.SUBSTRATE, 8)
                .outputFluids(GTMaterials.Oxygen.getFluid(10))
                .duration(200)
                .EUt(32)
                .save(provider);

        REACTION_RECIPES.recipeBuilder(id("wood_gasification/dusts_wood"))
                .inputItems(MekanismTags.Items.DUSTS_WOOD, 8)
                .inputFluids(GTMaterials.Water.getFluid(25))
                .inputFluids(GTMaterials.Oxygen.getFluid(25))
                .outputFluids(GTMaterials.Hydrogen.getFluid(25))
                .duration(200)
                .EUt(32)
                .save(provider);

        REACTION_RECIPES.recipeBuilder(id("coal_gasification/dusts_coals"))
                .inputItems(MekanismTags.Items.DUSTS_COAL)
                .inputFluids(GTMaterials.Water.getFluid(100))
                .inputFluids(GTMaterials.Oxygen.getFluid(100))
                .outputItems(GTMaterials.Sulfur)
                .outputFluids(GTMaterials.Hydrogen.getFluid(100))
                .duration(200)
                .EUt(32)
                .save(provider);

        REACTION_RECIPES.recipeBuilder(id("wood_gasification/rods_wooden"))
                .inputItems(Tags.Items.RODS_WOODEN, 3)
                .inputFluids(GTMaterials.Water.getFluid(10))
                .inputFluids(GTMaterials.Oxygen.getFluid(10))
                .outputFluids(GTMaterials.Hydrogen.getFluid(10))
                .duration(200)
                .EUt(32)
                .save(provider);

        REACTION_RECIPES.recipeBuilder(id("coal_gasification/coals"))
                .inputItems(ItemTags.COALS)
                .inputFluids(GTMaterials.Water.getFluid(100))
                .inputFluids(GTMaterials.Oxygen.getFluid(100))
                .outputItems(GTMaterials.Sulfur)
                .outputFluids(GTMaterials.Hydrogen.getFluid(100))
                .duration(200)
                .EUt(32)
                .save(provider);

        REACTION_RECIPES.recipeBuilder(id("wood_gasification/planks"))
                .inputItems(TagPrefix.planks, 20)
                .inputFluids(GTMaterials.Water.getFluid(400))
                .inputFluids(GTMaterials.Oxygen.getFluid(400))
                .outputItems(MekanismTags.Items.DUSTS_COAL)
                .outputFluids(GTMaterials.Hydrogen.getFluid(400))
                .duration(200)
                .EUt(32)
                .save(provider);
    }
}
