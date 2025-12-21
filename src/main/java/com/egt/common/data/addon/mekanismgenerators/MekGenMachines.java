package com.egt.common.data.addon.mekanismgenerators;

import com.egt.common.data.EGTCreativeTab;
import com.egt.common.data.EGTRecipeTypes;

import com.gregtechceu.gtceu.api.machine.MachineDefinition;

import static com.egt.EGT.REGISTRATE;
import static com.egt.common.data.EGTMachineUtils.registerSimpleMachines;

public class MekGenMachines {

    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {}

    public static final MachineDefinition[] GAS_BURNING = registerSimpleMachines("gas_burning",
            EGTRecipeTypes.GAS_BURNING_RECIPES);
}
