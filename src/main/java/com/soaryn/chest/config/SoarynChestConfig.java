package com.soaryn.chest.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class SoarynChestConfig {
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.BooleanValue INCLUDE_HOTBAR;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("Soaryn Chest Configuration");
        builder.push("general");

        INCLUDE_HOTBAR = builder
                .comment("If true, items in the hotbar (slots 0-8) will also be transferred into the chest on placement.")
                .define("includeHotbar", false);

        builder.pop();
        SPEC = builder.build();
    }
}
