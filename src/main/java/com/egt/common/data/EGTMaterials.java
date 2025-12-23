package com.egt.common.data;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.METALLIC;

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
            .langValue("Neodragonium")
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
            .langValue("Explosium")
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
            .langValue("Invinciblium")
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
            .langValue("Arcanium")
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
            .langValue("Hypervelocium")
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
            .langValue("Quantanium")
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
            .langValue("Bionexium")
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
            .iconSet(METALLIC)
            .langValue("Dimensium")
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
            .langValue("Corrosium")
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
            .langValue("Chronosium")
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
            .langValue("Ununennium")
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
            .langValue("Omnisingularum")
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
            .color(0xffffff)
            .iconSet(METALLIC)
            .langValue("Metaomnium")
            .buildAndRegister();
}
