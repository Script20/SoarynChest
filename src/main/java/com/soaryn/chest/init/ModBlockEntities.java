package com.soaryn.chest.init;

import com.soaryn.chest.SoarynChest;
import com.soaryn.chest.block.entity.SoarynChestBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SoarynChest.MOD_ID);

    public static final RegistryObject<BlockEntityType<SoarynChestBlockEntity>> SOARYN_CHEST =
            BLOCK_ENTITIES.register("soaryn_chest",
                    () -> BlockEntityType.Builder.of(SoarynChestBlockEntity::new, ModBlocks.SOARYN_CHEST.get()).build(null));
}
