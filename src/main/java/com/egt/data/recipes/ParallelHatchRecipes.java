package com.egt.data.recipes;

import com.egt.common.data.EGTMachines;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.egt.common.data.EGTItems.*;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class ParallelHatchRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        VanillaRecipeHelper.addShapedRecipe(provider, "parallel_hatch_mk5", EGTMachines.PARALLEL_HATCH[UHV].asStack(),
                "SZE", "ZHZ", "CZC",
                'S', SENSOR_UHV.asStack(),
                'E', EMITTER_UHV.asStack(),
                'Z', VOIDGATE_MAINFRAME_UEV.asStack(),
                'H', HULL[UHV].asStack(),
                'C', new MaterialEntry(wireGtDouble, RutheniumTriniumAmericiumNeutronate));

        VanillaRecipeHelper.addShapedRecipe(provider, "parallel_hatch_mk6", EGTMachines.PARALLEL_HATCH[UEV].asStack(),
                "SZE", "ZHZ", "CZC",
                'S', SENSOR_UEV.asStack(),
                'E', EMITTER_UEV.asStack(),
                'Z', VOIDFORGE_MAINFRAME_UIV.asStack(),
                'H', HULL[UEV].asStack(),
                'C', new MaterialEntry(wireGtDouble, RutheniumTriniumAmericiumNeutronate));

        VanillaRecipeHelper.addShapedRecipe(provider, "parallel_hatch_mk7", EGTMachines.PARALLEL_HATCH[UIV].asStack(),
                "SZE", "ZHZ", "CZC",
                'S', SENSOR_UIV.asStack(),
                'E', EMITTER_UIV.asStack(),
                'Z', WARP_NEXUS_MAINFRAME_UXV.asStack(),
                'H', HULL[UIV].asStack(),
                'C', new MaterialEntry(wireGtDouble, RutheniumTriniumAmericiumNeutronate));

        VanillaRecipeHelper.addShapedRecipe(provider, "parallel_hatch_mk8", EGTMachines.PARALLEL_HATCH[UXV].asStack(),
                "SZE", "ZHZ", "CZC",
                'S', SENSOR_UXV.asStack(),
                'E', EMITTER_UXV.asStack(),
                'Z', ENTROFLUX_MAINFRAME_OpV.asStack(),
                'H', HULL[UXV].asStack(),
                'C', new MaterialEntry(wireGtDouble, RutheniumTriniumAmericiumNeutronate));

        VanillaRecipeHelper.addShapedRecipe(provider, "parallel_hatch_mk9", EGTMachines.PARALLEL_HATCH[OpV].asStack(),
                "SZE", "ZHZ", "CZC",
                'S', SENSOR_OpV.asStack(),
                'E', EMITTER_OpV.asStack(),
                'Z', OMNIVERSE_MAINFRAME_MAX.asStack(),
                'H', HULL[OpV].asStack(),
                'C', new MaterialEntry(wireGtDouble, RutheniumTriniumAmericiumNeutronate));
    }
}
