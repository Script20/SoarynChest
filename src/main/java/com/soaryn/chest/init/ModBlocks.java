package com.soaryn.chest.init;

import com.soaryn.chest.SoarynChest;
import com.soaryn.chest.block.SoarynChestBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SoarynChest.MOD_ID);

    public static final RegistryObject<SoarynChestBlock> SOARYN_CHEST = BLOCKS.register("soaryn_chest",
            () -> new SoarynChestBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHEST)));
}
