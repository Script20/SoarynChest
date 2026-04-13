package com.soaryn.chest.init;

import com.soaryn.chest.SoarynChest;
import com.soaryn.chest.block.SoarynChestBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SoarynChest.MOD_ID);

    public static final DeferredBlock<SoarynChestBlock> SOARYN_CHEST = BLOCKS.register("soaryn_chest",
            () -> new SoarynChestBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHEST)));
}
