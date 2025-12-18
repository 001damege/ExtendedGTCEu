package com.egt.common.data.addon.enderio;

import com.egt.common.data.EGTCreativeTab;
import com.egt.common.data.EGTRecipeTypes;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;

import static com.egt.EGT.REGISTRATE;
import static com.egt.common.data.EGTMachineUtils.registerSimpleMachines;

public class EIOMachines {
    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {}

    public static final MachineDefinition[] ALLOY_SMELTER = registerSimpleMachines("alloy_smelter", EGTRecipeTypes.ALLOY_SMELTER_RECIPES);
}
