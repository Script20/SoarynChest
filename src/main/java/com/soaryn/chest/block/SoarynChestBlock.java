package com.soaryn.chest.block;

import com.mojang.serialization.MapCodec;
import com.soaryn.chest.block.entity.SoarynChestBlockEntity;
import com.soaryn.chest.config.SoarynChestConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;

import java.util.function.Supplier;
import javax.annotation.Nullable;

public class SoarynChestBlock extends ChestBlock {

    public SoarynChestBlock(Supplier<BlockEntityType<? extends ChestBlockEntity>> blockEntityType,
                            SoundEvent openSound, SoundEvent closeSound, Properties properties) {
        super(blockEntityType, openSound, closeSound, properties);
    }

    @Override
    public MapCodec<? extends ChestBlock> codec() {
        return ChestBlock.CODEC;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SoarynChestBlockEntity(pos, state);
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.setPlacedBy(level, pos, state, placer, stack);

        if (level.isClientSide() || !(placer instanceof Player player)) {
            return;
        }

        BlockEntity be = level.getBlockEntity(pos);
        if (!(be instanceof SoarynChestBlockEntity chestEntity)) {
            return;
        }

        Inventory playerInv = player.getInventory();
        boolean includeHotbar = SoarynChestConfig.INCLUDE_HOTBAR.get();

        int startSlot = includeHotbar ? 0 : 9;
        int chestSlot = 0;

        for (int i = startSlot; i < 36 && chestSlot < 27; i++) {
            ItemStack invStack = playerInv.getItem(i);
            if (!invStack.isEmpty()) {
                chestEntity.setItem(chestSlot, invStack.copy());
                playerInv.setItem(i, ItemStack.EMPTY);
                chestSlot++;
            }
        }

        chestEntity.setChanged();
    }
}
