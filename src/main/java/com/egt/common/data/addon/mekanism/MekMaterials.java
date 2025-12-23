package com.egt.common.data.addon.mekanism;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import net.minecraft.world.level.material.MapColor;

import static com.egt.EGT.id;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;

public class MekMaterials {

    public static void init() {}

    public static final Material Antimatter = new Material.Builder(id("antimatter"))
            .dust()
            .ingot()
            .fluid()
            .color(0xA464B3)
            .flags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR,
                    GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_RING,
                    GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND)
            .buildAndRegister();

    public static final Material Diamond = new Material.Builder(id("diamond"))
            .fluid()
            .color(0x6CEDD8)
            .buildAndRegister();

    public static final Material FissileFuel = new Material.Builder(id("fissile_fuel"))
            .fluid()
            .color(0x2E332F)
            .buildAndRegister();

    public static final Material NuclearWaste = new Material.Builder(id("nuclear_waste"))
            .fluid()
            .color(0x4F412A)
            .buildAndRegister();

    public static final Material SpentNuclearWaster = new Material.Builder(id("spent_nuclear_waste"))
            .fluid()
            .color(0x262015)
            .buildAndRegister();

    public static final Material SuperHeatedSodium = new Material.Builder(id("superheated_sodium"))
            .fluid()
            .color(0xFFD19469)
            .buildAndRegister();

    public static final Material Sodium = new Material.Builder(id("sodium"))
            .fluid()
            .color(0xFFE9FEF4)
            .buildAndRegister();

    public static final Material DirtyIronSlurry = new Material.Builder(id("dirty_iron_slurry"))
            .fluid()
            .color(0xFFAF8E77)
            .buildAndRegister();

    public static final Material CleanIronSlurry = new Material.Builder(id("clean_iron_slurry"))
            .fluid()
            .color(MapColor.RAW_IRON.col)
            .buildAndRegister();

    public static final Material DirtyGoldSlurry = new Material.Builder(id("dirty_gold_slurry"))
            .fluid()
            .color(0xFFF2CD67)
            .buildAndRegister();

    public static final Material CleanGoldSlurry = new Material.Builder(id("clean_gold_slurry"))
            .fluid()
            .color(MapColor.GOLD.col)
            .buildAndRegister();

    public static final Material DirtyOsmiumSlurry = new Material.Builder(id("dirty_osmium_slurry"))
            .fluid()
            .color(0xFF1E79C3)
            .buildAndRegister();

    public static final Material CleanOsmiumSlurry = new Material.Builder(id("clean_osmium_slurry"))
            .fluid()
            .color(MapColor.COLOR_CYAN.col)
            .buildAndRegister();

    public static final Material DirtyCopperSlurry = new Material.Builder(id("dirty_copper_slurry"))
            .fluid()
            .color(0xFFAA4B19)
            .buildAndRegister();

    public static final Material CleanCopperSlurry = new Material.Builder(id("clean_copper_slurry"))
            .fluid()
            .color(0xBF694B)
            .buildAndRegister();

    public static final Material DirtyTinSlurry = new Material.Builder(id("dirty_tin_slurry"))
            .fluid()
            .color(0xFFCCCCD9)
            .buildAndRegister();

    public static final Material CleanTinSlurry = new Material.Builder(id("clean_tin_slurry"))
            .fluid()
            .color(MapColor.TERRACOTTA_WHITE.col)
            .buildAndRegister();

    public static final Material DirtyLeadSlurry = new Material.Builder(id("dirty_lead_slurry"))
            .fluid()
            .color(0xFF3A404A)
            .buildAndRegister();

    public static final Material CleanLeadSlurry = new Material.Builder(id("clean_lead_slurry"))
            .fluid()
            .color(MapColor.COLOR_LIGHT_GRAY.col)
            .buildAndRegister();

    public static final Material DirtyUraniumSlurry = new Material.Builder(id("dirty_uranium_slurry"))
            .fluid()
            .color(0xFF46664F)
            .buildAndRegister();

    public static final Material CleanUraniumSlurry = new Material.Builder(id("clean_uranium_slurry"))
            .fluid()
            .color(MapColor.GRASS.col)
            .buildAndRegister();

    public static final Material UraniumOxide = new Material.Builder(id("uranium_oxide"))
            .fluid()
            .color(0xFFE1F573)
            .buildAndRegister();

    public static final Material HydrogenChloride = new Material.Builder(id("hydrogen_chloride"))
            .fluid()
            .color(0xFFA8F1E)
            .buildAndRegister();
}
