package com.egt.data;

import com.egt.data.lang.LangProvider;
import com.egt.data.tags.ItemTagsProvider;
import com.tterrag.registrate.providers.ProviderType;

import static com.egt.EGT.REGISTRATE;

public class EGTDataGen {

    public static void init() {
        REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, ItemTagsProvider::init);
        REGISTRATE.addDataGenerator(ProviderType.LANG, LangProvider::init);
    }
}
