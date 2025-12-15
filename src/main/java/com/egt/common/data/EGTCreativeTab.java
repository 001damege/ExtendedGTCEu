package com.egt.common.data;

import com.egt.EGT;
import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.tterrag.registrate.util.entry.RegistryEntry;
import mekanism.common.registries.MekanismItems;
import net.minecraft.world.item.CreativeModeTab;

public class EGTCreativeTab {
    public static RegistryEntry<CreativeModeTab> MAIN = EGT.REGISTRATE.defaultCreativeTab("main",
            builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("main", EGT.REGISTRATE))
                    .icon(MekanismItems.ANTIMATTER_PELLET::getItemStack)
                    .title(EGT.REGISTRATE.addLang("itemGroup", EGT.id("main"), "Extended: GTCEu"))
                    .build())
            .register();

    public static void init() {}
}
