package com.egt.common.data.addon.ae2;

import com.egt.common.data.EGTCreativeTab;

import static com.egt.EGT.REGISTRATE;

public class AEMultiMachines {

    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {}
}
