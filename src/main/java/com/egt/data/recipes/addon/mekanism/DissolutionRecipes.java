package com.egt.data.recipes.addon.mekanism;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.DISSOLUTION_RECIPES;
import static com.egt.common.data.addon.mekanism.MekMaterials.*;
import static com.gregtechceu.gtceu.api.GTValues.LV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class DissolutionRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        // Copper

        DISSOLUTION_RECIPES.recipeBuilder(id("copper/slurry/dirty/from_raw_ore"))
                .inputItems(rawOre, Copper, 3)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyCopperSlurry.getFluid(2000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("copper/slurry/dirty/from_ore"))
                .inputItems(ore, Copper)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyCopperSlurry.getFluid(1000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("copper/slurry/dirty/from_raw_block"))
                .inputItems(rawOreBlock, Copper)
                .inputFluids(SulfuricAcid.getFluid(200))
                .outputFluids(DirtyCopperSlurry.getFluid(6000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        // Gold

        DISSOLUTION_RECIPES.recipeBuilder(id("gold/slurry/dirty/from_raw_ore"))
                .inputItems(rawOre, Gold, 3)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyGoldSlurry.getFluid(2000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("gold/slurry/dirty/from_ore"))
                .inputItems(ore, Gold)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyGoldSlurry.getFluid(1000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("gold/slurry/dirty/from_raw_block"))
                .inputItems(rawOreBlock, Gold)
                .inputFluids(SulfuricAcid.getFluid(200))
                .outputFluids(DirtyGoldSlurry.getFluid(6000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        // Iron

        DISSOLUTION_RECIPES.recipeBuilder(id("iron/slurry/dirty/from_raw_ore"))
                .inputItems(rawOre, Iron, 3)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyIronSlurry.getFluid(2000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("iron/slurry/dirty/from_ore"))
                .inputItems(ore, Iron)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyIronSlurry.getFluid(1000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("iron/slurry/dirty/from_raw_block"))
                .inputItems(rawOreBlock, Iron)
                .inputFluids(SulfuricAcid.getFluid(200))
                .outputFluids(DirtyIronSlurry.getFluid(6000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        // Lead

        DISSOLUTION_RECIPES.recipeBuilder(id("lead/slurry/dirty/from_raw_ore"))
                .inputItems(rawOre, Lead, 3)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyCopperSlurry.getFluid(2000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("lead/slurry/dirty/from_ore"))
                .inputItems(ore, Lead)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyCopperSlurry.getFluid(1000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("lead/slurry/dirty/from_raw_block"))
                .inputItems(rawOreBlock, Lead)
                .inputFluids(SulfuricAcid.getFluid(200))
                .outputFluids(DirtyCopperSlurry.getFluid(6000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        // Osmium

        DISSOLUTION_RECIPES.recipeBuilder(id("osmium/slurry/dirty/from_raw_ore"))
                .inputItems(rawOre, Osmium, 3)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyOsmiumSlurry.getFluid(2000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("osmium/slurry/dirty/from_ore"))
                .inputItems(ore, Osmium)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyOsmiumSlurry.getFluid(1000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("osmium/slurry/dirty/from_raw_block"))
                .inputItems(rawOreBlock, Osmium)
                .inputFluids(SulfuricAcid.getFluid(200))
                .outputFluids(DirtyOsmiumSlurry.getFluid(6000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        // Tin

        DISSOLUTION_RECIPES.recipeBuilder(id("tin/slurry/dirty/from_raw_ore"))
                .inputItems(rawOre, Tin, 3)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyTinSlurry.getFluid(2000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("tin/slurry/dirty/from_ore"))
                .inputItems(ore, Tin)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyTinSlurry.getFluid(1000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("tin/slurry/dirty/from_raw_block"))
                .inputItems(rawOreBlock, Tin)
                .inputFluids(SulfuricAcid.getFluid(200))
                .outputFluids(DirtyTinSlurry.getFluid(6000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        // Uranium

        DISSOLUTION_RECIPES.recipeBuilder(id("uraninite/slurry/dirty/from_raw_ore"))
                .inputItems(rawOre, Uraninite, 3)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyUraniumSlurry.getFluid(2000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("uraninite/slurry/dirty/from_ore"))
                .inputItems(ore, Uraninite)
                .inputFluids(SulfuricAcid.getFluid(100))
                .outputFluids(DirtyUraniumSlurry.getFluid(1000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);

        DISSOLUTION_RECIPES.recipeBuilder(id("uraninite/slurry/dirty/from_raw_block"))
                .inputItems(rawOreBlock, Uraninite)
                .inputFluids(SulfuricAcid.getFluid(200))
                .outputFluids(DirtyUraniumSlurry.getFluid(6000))
                .duration(40)
                .EUt(VA[LV])
                .save(provider);
    }
}
