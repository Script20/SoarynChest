package com.soaryn.chest.client;

import com.soaryn.chest.SoarynChest;
import com.soaryn.chest.init.ModBlockEntities;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = SoarynChest.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.SOARYN_CHEST.get(), ChestRenderer::new);
    }
}
