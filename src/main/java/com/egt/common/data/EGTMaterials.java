package com.egt.common.data;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.METALLIC;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.RADIOACTIVE;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class EGTMaterials {

    public static void init() {}

    public static final Material Neodragonium = new Material.Builder(id("neodragonium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0x520E7D).secondaryColor(0x5B0A91)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Explosium = new Material.Builder(id("explosium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0x8B0000).secondaryColor(0x6D2C32)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Invinciblium = new Material.Builder(id("invinciblium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0x281C02).secondaryColor(0x1C1C1C)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Arcanium = new Material.Builder(id("arcanium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0x7C7096).secondaryColor(0x8A2CE2)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Hypervelocium = new Material.Builder(id("hypervelocium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0x204A9E).secondaryColor(0x04D9FF)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Quantanium = new Material.Builder(id("quantanium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0xCDF7FD).secondaryColor(0xF9F9F9)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Bionexium = new Material.Builder(id("bionexium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0x228B22).secondaryColor(0x32CD32)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Dimensium = new Material.Builder(id("dimensium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0x000000).secondaryColor(0x4B0082)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(RADIOACTIVE)
            .buildAndRegister();

    public static final Material Corrosium = new Material.Builder(id("corrosium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0x006400).secondaryColor(0x00FF00)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Chronosium = new Material.Builder(id("chronosium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0xDAA520).secondaryColor(0xFFD700)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Ununennium = new Material.Builder(id("ununennium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0xA9A9A9).secondaryColor(0x00BFFF)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Omnisingularum = new Material.Builder(id("omnisingularum"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0xFF0000).secondaryColor(0xFFFFFF)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material Metaomnium = new Material.Builder(id("metaomnium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0xFFFFFF).secondaryColor(0x808080)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(RADIOACTIVE)
            .buildAndRegister();

    public static final Material NaquadahPlasma = new Material.Builder(id("naquadah_plasma"))
            .color(0x323232).secondaryColor(0x1e251b)
            .colorAverage()
            .plasma()
            .buildAndRegister();

    public static final Material ExoticPlasma = new Material.Builder(id("exotic_plasma"))
            .color(0x1E90FF).secondaryColor(0x00FA9A)
            .colorAverage()
            .plasma()
            .buildAndRegister();

    public static final Material Taranium = new Material.Builder(id("taranium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0xFF4500).secondaryColor(0xFFA500)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .blast(b -> b.temp(7200, BlastProperty.GasTier.HIGHER)
                    .blastStats(VA[ZPM], 650)
                    .vacuumStats(VA[ZPM], 150))
            .buildAndRegister();

    public static final Material Destabilium = new Material.Builder(id("destabilium"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, IS_MAGNETIC)
            .color(0x4B0082).secondaryColor(0xFF00FF)
            .colorAverage()
            .ingot()
            .fluid()
            .dust()
            .iconSet(METALLIC)
            .blast(b -> b.temp(7400, BlastProperty.GasTier.HIGHER)
                    .blastStats(VA[ZPM], 600)
                    .vacuumStats(VA[ZPM], 150))
            .buildAndRegister();

    public static final Material Chaos = new Material.Builder(id("chaos"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND)
            .color(0x000000)
            .fluid()
            .dust()
            .ingot()
            .buildAndRegister();

    public static final Material Antimatter = new Material.Builder(id("antimatter"))
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND)
            .color(0xF5F5F5).secondaryColor(0xFF4040)
            .colorAverage()
            .dust()
            .ingot()
            .fluid()
            .buildAndRegister();



    public static final Material RutheniumTriniumAmericiumNeutroniumEnrichedNaquadahEuropiumDuranium = new Material.Builder(id("ruthenium_trinium_americium_neutronium_enriched_naquadah_europium_duranium"))
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .ingot()
            .liquid(new FluidBuilder().temperature(29621))
            .color(0xffffff).secondaryColor(0x000000)
            .components(Ruthenium, 1, Trinium, 4, Americium, 1, Neutronium, 2, Oxygen, 8, NaquadahEnriched, 4, Europium, 2, Duranium, 1)
            .cableProperties(V[UEV], 24, 0, true, 4)
            .blast(b -> b.temp(10800, BlastProperty.GasTier.HIGHEST)
                    .blastStats(VA[UV], 1200)
                    .vacuumStats(VA[UEV], 350))
            .iconSet(RADIOACTIVE)
            .buildAndRegister();
}
