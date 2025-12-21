package com.egt.common.data.addon.ae2;

import com.egt.common.data.EGTCreativeTab;

import static com.egt.EGT.REGISTRATE;

public class AEMachines {

    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {
        AEMultiMachines.init();
    }
}
