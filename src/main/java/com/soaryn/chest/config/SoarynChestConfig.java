package com.soaryn.chest.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class SoarynChestConfig {
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue INCLUDE_HOTBAR;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("Soaryn Chest Configuration");
        builder.push("general");

        INCLUDE_HOTBAR = builder
                .comment("If true, items in the hotbar (slots 0-8) will also be transferred into the chest on placement.")
                .define("includeHotbar", false);

        builder.pop();
        SPEC = builder.build();
    }
}
