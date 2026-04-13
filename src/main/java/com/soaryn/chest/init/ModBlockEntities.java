package com.soaryn.chest.init;

import com.soaryn.chest.SoarynChest;
import com.soaryn.chest.block.entity.SoarynChestBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, SoarynChest.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SoarynChestBlockEntity>> SOARYN_CHEST =
            BLOCK_ENTITIES.register("soaryn_chest",
                    () -> BlockEntityType.Builder.of(SoarynChestBlockEntity::new, ModBlocks.SOARYN_CHEST.get()).build(null));
}
