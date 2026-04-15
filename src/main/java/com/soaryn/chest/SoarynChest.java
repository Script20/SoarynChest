package com.soaryn.chest;

import com.soaryn.chest.client.SoarynChestConfigScreen;
import com.soaryn.chest.config.SoarynChestConfig;
import com.soaryn.chest.init.ModBlockEntities;
import com.soaryn.chest.init.ModBlocks;
import com.soaryn.chest.init.ModCreativeTabs;
import com.soaryn.chest.init.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(SoarynChest.MOD_ID)
public class SoarynChest {
    public static final String MOD_ID = "soarynchest";

    public SoarynChest(IEventBus modBus, ModContainer modContainer) {
        ModBlocks.BLOCKS.register(modBus);
        ModItems.ITEMS.register(modBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modBus);
        ModCreativeTabs.CREATIVE_TABS.register(modBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, SoarynChestConfig.SPEC, "soarynchest-common.toml");

        modContainer.registerExtensionPoint(IConfigScreenFactory.class, 
            (container, parent) -> new SoarynChestConfigScreen(parent));
    }
}
