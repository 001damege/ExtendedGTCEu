package com.egt.common.data.addon.mekanismgenerators;

import com.egt.common.data.EGTCreativeTab;
import com.egt.common.data.EGTRecipeTypes;
import com.egt.common.data.addon.mekanismgenerators.part.FusionFuelHatch;

import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.utils.FormattingUtil;

import net.minecraft.network.chat.Component;

import static com.egt.EGT.REGISTRATE;
import static com.egt.common.data.EGTMachineUtils.registerSimpleMachines;
import static com.gregtechceu.gtceu.api.machine.property.GTMachineModelProperties.IS_FORMED;

public class MekGenMachines {

    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {}

    public static final MachineDefinition[] GAS_BURNING = registerSimpleMachines("gas_burning",
            EGTRecipeTypes.GAS_BURNING_RECIPES);

    public static final MachineDefinition FUSION_FUEL_HATCH = REGISTRATE
            .machine("fusion_fuel_hatch", FusionFuelHatch::new)
            .langValue("D-T Fuel Hatch")
            .rotationState(RotationState.ALL)
            .abilities(PartAbility.IMPORT_FLUIDS)
            .modelProperty(IS_FORMED, false)
            .tooltips(Component.translatable("gtceu.universal.tooltip.fluid_storage_capacity",
                    FormattingUtil.formatNumbers(FusionFuelHatch.FLUID_AMOUNT)),
                    Component.translatable("gtceu.part_sharing.enabled"))
            .overlayTieredHullModel("fusion_fuel_hatch")
            .register();
}
