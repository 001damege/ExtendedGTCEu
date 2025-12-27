package com.egt.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class LangProvider {

    public static void init(RegistrateLangProvider provider) {
        ItemLangProvider.init(provider);
        BlockLangProvider.init(provider);
    }
}
