package com.soaryn.chest.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.soaryn.chest.block.entity.SoarynChestBlockEntity;
import com.soaryn.chest.init.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.model.geom.EntityModelSet;

public class SoarynChestItemRenderer extends BlockEntityWithoutLevelRenderer {
    private static SoarynChestItemRenderer instance;
    private final SoarynChestBlockEntity chestEntity;

    public SoarynChestItemRenderer(BlockEntityRenderDispatcher dispatcher, EntityModelSet modelSet) {
        super(dispatcher, modelSet);
        this.chestEntity = new SoarynChestBlockEntity(BlockPos.ZERO, ModBlocks.SOARYN_CHEST.get().defaultBlockState());
    }

    public static SoarynChestItemRenderer getInstance() {
        if (instance == null) {
            Minecraft mc = Minecraft.getInstance();
            instance = new SoarynChestItemRenderer(mc.getBlockEntityRenderDispatcher(), mc.getEntityModels());
        }
        return instance;
    }

    @Override
    public void renderByItem(ItemStack stack, ItemDisplayContext displayContext, PoseStack poseStack,
                             MultiBufferSource buffer, int packedLight, int packedOverlay) {
        Minecraft.getInstance().getBlockEntityRenderDispatcher().renderItem(chestEntity, poseStack, buffer, packedLight, packedOverlay);
    }
}
