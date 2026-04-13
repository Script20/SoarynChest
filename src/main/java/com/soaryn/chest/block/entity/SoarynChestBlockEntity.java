package com.soaryn.chest.block.entity;

import com.soaryn.chest.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SoarynChestBlockEntity extends ChestBlockEntity {

    public SoarynChestBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SOARYN_CHEST.get(), pos, state);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.soarynchest.soaryn_chest");
    }
}
