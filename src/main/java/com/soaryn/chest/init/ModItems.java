package com.soaryn.chest.init;

import com.soaryn.chest.SoarynChest;
import com.soaryn.chest.block.SoarynChestBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SoarynChest.MOD_ID);

    public static final RegistryObject<BlockItem> SOARYN_CHEST = ITEMS.register("soaryn_chest",
            () -> new SoarynChestBlockItem(ModBlocks.SOARYN_CHEST.get(), new Item.Properties()));
}
