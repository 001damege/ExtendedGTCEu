package com.egt.common.data.addon.mekanism;

import com.egt.EGT;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;

public class MekMaterials {
    public static void init() {}

    public static final Material Antimatter = new Material.Builder(EGT.id("antimatter"))
            .fluid()
            .color(0xA464B3)
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND)
            .buildAndRegister();

    public static final Material Diamond = new Material.Builder(EGT.id("diamond"))
            .fluid()
            .color(0x6CEDD8)
            .buildAndRegister();
}
