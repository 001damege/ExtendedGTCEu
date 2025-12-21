package com.egt.data.recipes.addon.draconicevolution;

import net.minecraft.data.recipes.FinishedRecipe;

import com.brandon3055.draconicevolution.init.DEContent;
import com.brandon3055.draconicevolution.init.DETags;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.DRACONIC_REACTOR_RECIPES;

public class DraconicReactorRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        DRACONIC_REACTOR_RECIPES.recipeBuilder(id("chaos_shard"))
                .inputItems(DETags.Blocks.STORAGE_BLOCKS_DRACONIUM_AWAKENED, 8)
                .outputItems(DEContent.CHAOS_SHARD, 4)
                .duration(1200)
                .EUt(16384)
                .outputEU(262144)
                .save(provider);
    }
}
