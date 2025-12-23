package com.egt.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class LangHandler {

    public static void init(RegistrateLangProvider provider) {
        BlockLang.init(provider);
        ItemLang.init(provider);
    }
}
