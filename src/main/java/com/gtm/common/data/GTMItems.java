package com.gtm.common.data;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.gtm.GTMekanism.REGISTRATE;

public class GTMItems {
    static {
        REGISTRATE.creativeModeTab(() -> GTMCreativeTab.GTM);
    }

    public static ItemEntry<Item> ANTIMATTER_WAFER = REGISTRATE
            .item("antimatter_wafer", Item::new)
            .lang("Antimatter Wafer")
            .register();

    public static ItemEntry<Item> PLUTONIUM_WAFER = REGISTRATE
            .item("plutonium_wafer", Item::new)
            .lang("Plutonium Wafer")
            .register();

    public static ItemEntry<Item> POLONIUM_WAFER = REGISTRATE
            .item("polonium_wafer", Item::new)
            .lang("Polonium Wafer")
            .register();

    public static ItemEntry<Item> OPTICS_TRANSISTOR = REGISTRATE
            .item("optics_smd_transistor", Item::new)
            .lang("Optics SMD Transistor")
            .tag(CustomTags.TRANSISTORS)
            .register();

    public static ItemEntry<Item> OPTICS_RESISTOR = REGISTRATE
            .item("optics_smd_resistor", Item::new)
            .lang("Optics SMD Resistor")
            .tag(CustomTags.RESISTORS)
            .register();

    public static ItemEntry<Item> OPTICS_CAPACITOR = REGISTRATE
            .item("optics_smd_capacitor", Item::new)
            .lang("Optics SMD Capacitor")
            .tag(CustomTags.CAPACITORS)
            .register();

    public static ItemEntry<Item> OPTICS_DIODE = REGISTRATE
            .item("optics_smd_diode", Item::new)
            .lang("Optics SMD Diode")
            .tag(CustomTags.DIODES)
            .register();

    public static ItemEntry<Item> OPTICS_INDUCTOR = REGISTRATE
            .item("optics_smd_inductor", Item::new)
            .lang("Optics SMD Inductor")
            .tag(CustomTags.INDUCTORS)
            .register();


    public static void init() {}
}
