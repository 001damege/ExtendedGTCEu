package com.gtm.common.data;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.lowdragmc.lowdraglib.gui.texture.ProgressTexture;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class GTMRecipeTypes {
    public static void init() {}

    public static final GTRecipeType ENRICHING_RECIPES = register("enriching", MULTIBLOCK)
            .setMaxIOSize(1, 1, 0, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType METALLURGIC_INFUSER_RECIPES = register("metallurgic_infuser", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.MOLECULAR_OVERLAY_1)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType PURIFICATION_RECIPES = register("purification", MULTIBLOCK)
            .setMaxIOSize(1, 2, 1, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.BOX_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType ELECTRIC_PUMP_RECIPES = register("electric_pump", ELECTRIC)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType CHEMICAL_OXIDIZER_RECIPES = register("chemical_oxidizer", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType CHEMICAL_INFUSER_RECIPES = register("chemical_infuser", MULTIBLOCK)
            .setMaxIOSize(0, 0, 2, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType CHEMICAL_INJECTION_RECIPES = register("chemical_injection", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType ELECTROLYTIC_SEPARATOR_RECIPES = register("electrolytic_separator", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 2)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType CHEMICAL_DISSOLUTION_RECIPES = register("chemical_dissolution", MULTIBLOCK)
            .setMaxIOSize(1, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType CHEMICAL_WASHER_RECIPES = register("chemical_washer", MULTIBLOCK)
            .setMaxIOSize(0, 0, 2, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType PRESSURIZED_REACTION_RECIPES = register("pressurized_reaction", MULTIBLOCK)
            .setMaxIOSize(1, 1, 2, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType ISOTOPIC_CENTRIFUGE_RECIPES = register("isotopic_centrifuge", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_EXTRACT, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.CENTRIFUGE);

    public static final GTRecipeType SOLAR_NEUTRON_ACTIVATOR_RECIPES = register("solar_neutron_activator", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType ANTIPROTONIC_NUCLEOSYNTHESIZER_RECIPES = register("antiprotonic_nucleosynthesizer", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType SPS_RECIPES = register("sps", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType THERMAL_EVAPORATION_RECIPES = register("thermal_evaporation", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 1)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType FISSION_REACTOR_RECIPES = register("fission_reactor", MULTIBLOCK)
            .setMaxIOSize(0, 0, 2, 2)
            .setEUIO(IO.NONE)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType GAS_BURNING_GENERATOR_RECIPES = register("gas_burning_generator", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType BIO_GENERATOR_RECIPES = register("bio_generator", MULTIBLOCK)
            .setMaxIOSize(1, 0, 1, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType TURBINE_RECIPES = register("turbine", MULTIBLOCK)
            .setMaxIOSize(0, 0, 1, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, true, GuiTextures.FLUID_SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

    public static final GTRecipeType FUSION_REACTOR_RECIPES = register("fusion_reactor", MULTIBLOCK)
            .setMaxIOSize(1, 0, 2, 1)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, false, GuiTextures.SLOT)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT);

}
