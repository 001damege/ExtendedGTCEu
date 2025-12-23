package com.egt.common.data;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.egt.EGT.REGISTRATE;

public class EGTItems {

    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {}

    // T8: VoidGate

    public static ItemEntry<Item> VOIDGATE_MAINFRAME_UEV = REGISTRATE
            .item("voidgate_processor_mainframe", Item::new)
            .lang("VoidGate Processor Mainframe")
            .tag(CustomTags.UEV_CIRCUITS)
            .register();

    public static ItemEntry<Item> VOIDGATE_SUPER_COMPUTER_UHV = REGISTRATE
            .item("voidgate_processor_computer", Item::new)
            .lang("VoidGate Processor SuperComputer")
            .tag(CustomTags.UHV_CIRCUITS)
            .register();

    public static ItemEntry<Item> VOIDGATE_PROCESSOR_ASSEMBLY_UV = REGISTRATE
            .item("voidgate_processor_assembly", Item::new)
            .lang("VoidGate Processor Assembly")
            .tag(CustomTags.UV_CIRCUITS)
            .register();

    public static ItemEntry<Item> VOIDGATE_PROCESSOR_ZPM = REGISTRATE
            .item("voidgate_processor", Item::new)
            .lang("VoidGate Processor")
            .tag(CustomTags.ZPM_CIRCUITS)
            .register();

    // T9: VoidForge

    public static ItemEntry<Item> VOIDFORGE_MAINFRAME_UIV = REGISTRATE
            .item("voidforge_processor_mainframe", Item::new)
            .lang("VoidForge Processor Mainframe")
            .tag(CustomTags.UIV_CIRCUITS)
            .register();

    public static ItemEntry<Item> VOIDFORGE_SUPER_COMPUTER_UEV = REGISTRATE
            .item("voidforge_processor_computer", Item::new)
            .lang("VoidForge Processor SuperComputer")
            .tag(CustomTags.UEV_CIRCUITS)
            .register();

    public static ItemEntry<Item> VOIDFORGE_PROCESSOR_ASSEMBLY_UHV = REGISTRATE
            .item("voidforge_processor_assembly", Item::new)
            .lang("VoidForge Processor Assembly")
            .tag(CustomTags.UHV_CIRCUITS)
            .register();

    public static ItemEntry<Item> VOIDFORGE_PROCESSOR_UV = REGISTRATE
            .item("voidforge_processor", Item::new)
            .lang("VoidForge Processor")
            .tag(CustomTags.UV_CIRCUITS)
            .register();

    // T10: Warp Nexus

    public static ItemEntry<Item> WARP_NEXUS_MAINFRAME_UXV = REGISTRATE
            .item("warp_nexus_mainframe", Item::new)
            .lang("WrapNexus Mainframe")
            .tag(CustomTags.UXV_CIRCUITS)
            .register();

    public static ItemEntry<Item> WARP_NEXUS_SUPER_COMPUTER_UIV = REGISTRATE
            .item("warp_nexus_processor_computer", Item::new)
            .lang("WarpNexus Processor SuperComputer")
            .tag(CustomTags.UIV_CIRCUITS)
            .register();

    public static ItemEntry<Item> WARP_NEXUS_PROCESSOR_ASSEMBLY_UEV = REGISTRATE
            .item("warp_nexus_processor_assembly", Item::new)
            .lang("WarpNexus Processor Assembly")
            .tag(CustomTags.UEV_CIRCUITS)
            .register();

    public static ItemEntry<Item> WARP_NEXUS_PROCESSOR_UHV = REGISTRATE
            .item("warp_nexus_processor", Item::new)
            .lang("WarpNexus Processor")
            .tag(CustomTags.UHV_CIRCUITS)
            .register();

    // T11: Entroflux

    public static ItemEntry<Item> ENTROFLUX_MAINFRAME_OpV = REGISTRATE
            .item("entroflux_mainframe", Item::new)
            .lang("EntroFlux Mainframe")
            .tag(CustomTags.OpV_CIRCUITS)
            .register();

    public static ItemEntry<Item> ENTROFLUX_SUPER_COMPUTER_UXV = REGISTRATE
            .item("entroflux_processor_computer", Item::new)
            .lang("EntroFlux Processor SuperComputer")
            .tag(CustomTags.UXV_CIRCUITS)
            .register();

    public static ItemEntry<Item> ENTROFLUX_PROCESSOR_ASSEMBLY_UIV = REGISTRATE
            .item("entroflux_processor_assembly", Item::new)
            .lang("EntroFlux Processor Assembly")
            .tag(CustomTags.UIV_CIRCUITS)
            .register();

    public static ItemEntry<Item> ENTROFLUX_PROCESSOR_UEV = REGISTRATE
            .item("entroflux_processor", Item::new)
            .lang("EntroFlux Processor")
            .tag(CustomTags.UEV_CIRCUITS)
            .register();

    // T12: Omniverse

    public static ItemEntry<Item> OMNIVERSE_MAINFRAME_MAX = REGISTRATE
            .item("omniverse_mainframe", Item::new)
            .lang("Omniverse Mainframe")
            .tag(CustomTags.MAX_CIRCUITS)
            .register();

    public static ItemEntry<Item> OMNIVERSE_SUPER_COMPUTER_OpV = REGISTRATE
            .item("omniverse_processor_computer", Item::new)
            .lang("Omniverse Processor SuperComputer")
            .tag(CustomTags.OpV_CIRCUITS)
            .register();

    public static ItemEntry<Item> OMNIVERSE_PROCESSOR_ASSEMBLY_UXV = REGISTRATE
            .item("omniverse_processor_assembly", Item::new)
            .lang("Omniverse Processor Assembly")
            .tag(CustomTags.UXV_CIRCUITS)
            .register();

    public static ItemEntry<Item> OMNIVERSE_PROCESSOR_UIV = REGISTRATE
            .item("omniverse_processor", Item::new)
            .lang("Omniverse Processor")
            .tag(CustomTags.UIV_CIRCUITS)
            .register();
}
