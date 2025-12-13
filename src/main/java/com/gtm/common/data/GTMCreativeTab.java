package com.gtm.common.data;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.gtm.GTMekanism;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.CreativeModeTab;

public class GTMCreativeTab {
    public static RegistryEntry<CreativeModeTab> GTM = GTMekanism.REGISTRATE.defaultCreativeTab("main",
            builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("main", GTMekanism.REGISTRATE))
                    .icon(GTMItems.ANTIMATTER_WAFER::asStack)
                    .title(GTMekanism.REGISTRATE.addLang("itemGroup", GTMekanism.id("main"), "GTMekanism"))
                    .build())
            .register();

    public static void init() {}
}
