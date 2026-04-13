package com.soaryn.chest;

import com.soaryn.chest.config.SoarynChestConfig;
import com.soaryn.chest.init.ModBlockEntities;
import com.soaryn.chest.init.ModBlocks;
import com.soaryn.chest.init.ModCreativeTabs;
import com.soaryn.chest.init.ModItems;
import com.soaryn.chest.client.SoarynChestConfigScreen;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SoarynChest.MOD_ID)
public class SoarynChest {
    public static final String MOD_ID = "soarynchest";

    public SoarynChest() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modBus);
        ModItems.ITEMS.register(modBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modBus);
        ModCreativeTabs.CREATIVE_TABS.register(modBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SoarynChestConfig.SPEC, "soarynchest-common.toml");

        ModLoadingContext.get().registerExtensionPoint(
                ConfigScreenHandler.ConfigScreenFactory.class,
                () -> new ConfigScreenHandler.ConfigScreenFactory((mc, parent) -> new SoarynChestConfigScreen(parent)));

        MinecraftForge.EVENT_BUS.register(this);
    }
}
