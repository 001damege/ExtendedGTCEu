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

    public static ItemEntry<Item> UEV_CIRCUIT = REGISTRATE
            .item("uev_circuit", Item::new)
            .lang("UEV Circuit")
            .tag(CustomTags.UEV_CIRCUITS)
            .register();

    public static ItemEntry<Item> UIV_CIRCUIT = REGISTRATE
            .item("uiv_circuit", Item::new)
            .lang("UIV Circuit")
            .tag(CustomTags.UIV_CIRCUITS)
            .register();

    public static ItemEntry<Item> UXV_CIRCUIT = REGISTRATE
            .item("uxv_circuit", Item::new)
            .lang("UXV Circuit")
            .tag(CustomTags.UXV_CIRCUITS)
            .register();

    public static ItemEntry<Item> OpV_CIRCUIT = REGISTRATE
            .item("opv_circuit", Item::new)
            .lang("OpV Circuit")
            .tag(CustomTags.OpV_CIRCUITS)
            .register();

    public static ItemEntry<Item> MAX_CIRCUIT = REGISTRATE
            .item("max_circuit", Item::new)
            .lang("MAX Circuit")
            .tag(CustomTags.MAX_CIRCUITS)
            .register();


}
