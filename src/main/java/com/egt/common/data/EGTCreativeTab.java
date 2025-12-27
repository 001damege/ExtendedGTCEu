package com.egt.common.data;

import com.egt.EGT;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;

import net.minecraft.world.item.CreativeModeTab;

import com.tterrag.registrate.util.entry.RegistryEntry;

public class EGTCreativeTab {

    public static RegistryEntry<CreativeModeTab> MAIN = EGT.REGISTRATE.defaultCreativeTab("main",
            builder -> builder
                    .displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("main", EGT.REGISTRATE))
                    .icon(() -> EGTItems.OMNIVERSE_MAINFRAME_MAX.asStack())
                    .title(EGT.REGISTRATE.addLang("itemGroup", EGT.id("main"), "Extended: GTCEu"))
                    .build())
            .register();

    public static void init() {}
}
