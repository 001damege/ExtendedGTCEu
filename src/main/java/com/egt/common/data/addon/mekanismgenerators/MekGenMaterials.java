package com.egt.common.data.addon.mekanismgenerators;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import static com.egt.EGT.id;

public class MekGenMaterials {

    public static void init() {}

    public static final Material DTFuel = new Material.Builder(id("fusion_fuel"))
            .fluid()
            .color(0x7E007D)
            .buildAndRegister();
}
