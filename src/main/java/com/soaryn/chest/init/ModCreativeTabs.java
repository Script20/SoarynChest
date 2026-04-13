package com.soaryn.chest.init;

import com.soaryn.chest.SoarynChest;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SoarynChest.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SOARYN_TAB = CREATIVE_TABS.register("soaryn_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + SoarynChest.MOD_ID))
                    .icon(() -> new ItemStack(ModItems.SOARYN_CHEST.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.SOARYN_CHEST.get());
                    })
                    .build());
}
