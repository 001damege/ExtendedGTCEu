package com.egt.common.data;

import com.egt.EGT;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;

import com.lowdragmc.lowdraglib.gui.texture.ProgressTexture;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeType;

import org.jetbrains.annotations.NotNull;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class EGTRecipeTypes {

    public static void init() {}

    // Extended: GTCEu

    public static final GTRecipeType NEUTRON_SYNTHESIS_RECIPES = register("neutron_synthesis", ELECTRIC)
            .setMaxIOSize(6, 1, 1, 0)
            .setEUIO(IO.IN)
            .prepareBuilder(builder -> builder.EUt(GTValues.VA[GTValues.LV]))
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType LARGE_NEUTRON_SYNTHESIS_RECIPES = register("large_neutron_synthesis", MULTIBLOCK)
            .setMaxIOSize(16, 5, 5, 0)
            .setEUIO(IO.IN)
            .prepareBuilder(builder -> builder.EUt(GTValues.VA[GTValues.LV]))
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC)
            .setSmallRecipeMap(NEUTRON_SYNTHESIS_RECIPES);

    // Draconic Evolution

    public static final GTRecipeType DRACONIC_REACTOR_RECIPES = register("draconic_reactor", MULTIBLOCK)
            .setMaxIOSize(1, 1, 0, 0)
            .setEUIO(IO.BOTH)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType FUSION_CRAFTING_RECIPES = register("fusion_crafting", MULTIBLOCK)
            .setMaxIOSize(9, 1, 4, 0)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.COMPUTATION);

    // Mekanism

    public static final GTRecipeType ENRICHING_RECIPES = register("enriching", MULTIBLOCK)
            .setMaxIOSize(2, 2, 0, 0)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType CHEMICAL_INFUSING_RECIPES = register("chemical_infusing", MULTIBLOCK)
            .setMaxIOSize(0, 0, 2, 1)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.MIXER);

    public static final GTRecipeType COMBINING_RECIPES = register("combining", MULTIBLOCK)
            .setMaxIOSize(2, 1, 0, 0)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.COMPRESSOR);

    public static final GTRecipeType SEPARATOR_RECIPES = register("separator", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 2)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.CHEMICAL);

    public static final GTRecipeType WASHING_RECIPES = register("washing", MULTIBLOCK)
            .setMaxIOSize(0, 0, 2, 1)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.BATH);

    public static final GTRecipeType EVAPORATING_RECIPES = register("evaporating", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType ACTIVATING_RECIPES = register("activating", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType CRYSTALLIZING_RECIPES = register("crystallizing", MULTIBLOCK)
            .setMaxIOSize(0, 1, 1, 0)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType DISSOLUTION_RECIPES = register("dissolution", MULTIBLOCK)
            .setMaxIOSize(1, 0, 1, 1)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType PURIFYING_RECIPES = register("purifying", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType INJECTING_RECIPES = register("injecting", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType NUCLEOSYNTHESIZING_RECIPES = register("nucleosynthesizing", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType OXIDIZING_RECIPES = register("oxidizing", MULTIBLOCK)
            .setMaxIOSize(1, 0, 0, 1)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_EXTRACT, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType METALLURGIC_INFUSING_RECIPES = register("metallurgic_infusing", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType REACTION_RECIPES = register("reaction", MULTIBLOCK)
            .setMaxIOSize(1, 1, 2, 1)
            .setEUIO(IO.IN)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType FUSION_REACTOR_RECIPES = register("fusion_reactor", MULTIBLOCK)
            .setMaxIOSize(1, 0, 2, 0)
            .setEUIO(IO.OUT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_FUSION, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    public static final GTRecipeType GAS_BURNING_RECIPES = register("gas_burning", ELECTRIC)
            .setMaxIOSize(0, 0, 1, 0)
            .setEUIO(IO.OUT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.TURBINE);

    public static final GTRecipeType STEAM_TURBINE_RECIPES = register("steam_turbine", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 0)
            .setEUIO(IO.OUT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.TURBINE)
            .setSmallRecipeMap(GAS_TURBINE_FUELS);

    public static final GTRecipeType FISSION_REACTOR_RECIPES = register("fission_reactor", MULTIBLOCK)
            .setMaxIOSize(1, 0, 2, 2)
            .setEUIO(IO.NONE)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ARC);

    // EnderIO

    public static final GTRecipeType ALLOY_SMELTER_RECIPES = register("alloy_smelter", ELECTRIC)
            .setMaxIOSize(3, 1, 0, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.FURNACE_OVERLAY_1)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.FURNACE)
            .setSmallRecipeMap(GTRecipeTypes.ALLOY_SMELTER_RECIPES);

    @SuppressWarnings("deprecation")
    @NotNull
    public static GTRecipeType register(String name, String group, RecipeType<?>... proxyRecipes) {
        var recipeType = new GTRecipeType(EGT.id(name), group, proxyRecipes);
        GTRegistries.register(BuiltInRegistries.RECIPE_TYPE, recipeType.registryName, recipeType);
        GTRegistries.register(BuiltInRegistries.RECIPE_SERIALIZER, recipeType.registryName, new GTRecipeSerializer());
        GTRegistries.RECIPE_TYPES.register(recipeType.registryName, recipeType);
        return recipeType;
    }
}
