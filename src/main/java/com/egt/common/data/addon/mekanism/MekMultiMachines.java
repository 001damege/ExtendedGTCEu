package com.egt.common.data.addon.mekanism;

import com.egt.common.data.EGTCreativeTab;

import static com.egt.EGT.REGISTRATE;

public class MekMultiMachines {

    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {}
}
