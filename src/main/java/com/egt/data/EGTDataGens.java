package com.egt.data;

import com.egt.data.tags.ItemTagLoader;
import com.gregtechceu.gtceu.common.registry.GTRegistration;
import com.tterrag.registrate.providers.ProviderType;

public class EGTDataGens {

    public static void init() {
        GTRegistration.REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, ItemTagLoader::init);
    }
}
