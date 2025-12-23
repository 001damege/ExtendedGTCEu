package com.egt.data.recipes;

import com.egt.common.data.EGTBlocks;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;

public class AssemblerRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        ASSEMBLER_RECIPES.recipeBuilder(id("coil_neutronium"))
                .inputItems(wireGtDouble, Europium, 8)
                .inputItems(foil, Tritanium, 8)
                .inputFluids(Neutronium, L)
                .outputItems(EGTBlocks.COIL_NEUTRONIUM)
                .duration(1000)
                .EUt(VA[UHV])
                .save(provider);
    }
}
