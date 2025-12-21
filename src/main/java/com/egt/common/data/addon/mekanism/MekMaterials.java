package com.egt.common.data.addon.mekanism;

import com.egt.EGT;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;

public class MekMaterials {

    public static void init() {}

    public static final Material Antimatter = new Material.Builder(EGT.id("antimatter"))
            .fluid()
            .color(0xA464B3)
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND)
            .buildAndRegister();

    public static final Material Diamond = new Material.Builder(EGT.id("diamond"))
            .fluid()
            .color(0x6CEDD8)
            .buildAndRegister();

    public static final Material FissileFuel = new Material.Builder(EGT.id("fissile_fuel"))
            .fluid()
            .color(0x2E332F)
            .buildAndRegister();

    public static final Material NuclearWaste = new Material.Builder(EGT.id("nuclear_waste"))
            .fluid()
            .color(0x4F412A)
            .buildAndRegister();

    public static final Material SpentNuclearWaster = new Material.Builder(EGT.id("spent_nuclear_waste"))
            .fluid()
            .color(0x262015)
            .buildAndRegister();

    public static final Material SuperHeatedSodium = new Material.Builder(EGT.id("superheated_sodium"))
            .fluid()
            .color(0xFFD19469)
            .buildAndRegister();

    public static final Material Sodium = new Material.Builder(EGT.id("sodium"))
            .fluid()
            .color(0xFFE9FEF4)
            .buildAndRegister();
}
