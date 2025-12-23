package com.egt.data.tags;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.providers.RegistrateItemTagsProvider;

import static com.egt.common.data.EGTItems.*;

public class ItemTagLoader {

    public static void init(RegistrateItemTagsProvider provider) {
        provider.addTag(CustomTags.ZPM_CIRCUITS)
                .add(VOIDGATE_PROCESSOR_ZPM.asItem());

        provider.addTag(CustomTags.UHV_CIRCUITS)
                .add(VOIDGATE_SUPER_COMPUTER_UHV.asItem(), VOIDFORGE_PROCESSOR_ASSEMBLY_UHV.asItem(), WARP_NEXUS_PROCESSOR_UHV.asItem());

        provider.addTag(CustomTags.UEV_CIRCUITS)
                .add(VOIDGATE_MAINFRAME_UEV.asItem(), VOIDFORGE_SUPER_COMPUTER_UEV.asItem(), WARP_NEXUS_PROCESSOR_ASSEMBLY_UEV.asItem(), ENTROFLUX_PROCESSOR_UEV.asItem());

        provider.addTag(CustomTags.UIV_CIRCUITS)
                .add(VOIDFORGE_MAINFRAME_UIV.asItem(), WARP_NEXUS_SUPER_COMPUTER_UIV.asItem(), ENTROFLUX_PROCESSOR_ASSEMBLY_UIV.asItem(), OMNIVERSE_PROCESSOR_UIV.asItem());

        provider.addTag(CustomTags.UXV_CIRCUITS)
                .add(WARP_NEXUS_MAINFRAME_UXV.asItem(), ENTROFLUX_SUPER_COMPUTER_UXV.asItem(), OMNIVERSE_PROCESSOR_ASSEMBLY_UXV.asItem());

        provider.addTag(CustomTags.OpV_CIRCUITS)
                .add(ENTROFLUX_MAINFRAME_OpV.asItem(), OMNIVERSE_SUPER_COMPUTER_OpV.asItem());

        provider.addTag(CustomTags.MAX_CIRCUITS)
                .add(WARP_NEXUS_MAINFRAME_UXV.asItem());
    }
}
