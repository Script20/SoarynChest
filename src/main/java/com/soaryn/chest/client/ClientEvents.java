package com.soaryn.chest.client;

import com.soaryn.chest.SoarynChest;
import com.soaryn.chest.init.ModBlockEntities;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SoarynChest.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.SOARYN_CHEST.get(), ChestRenderer::new);
    }
}
