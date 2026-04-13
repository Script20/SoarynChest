package com.soaryn.chest.init;

import com.soaryn.chest.SoarynChest;
import com.soaryn.chest.block.SoarynChestBlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SoarynChest.MOD_ID);

    public static final DeferredItem<SoarynChestBlockItem> SOARYN_CHEST = ITEMS.register("soaryn_chest",
            () -> new SoarynChestBlockItem(ModBlocks.SOARYN_CHEST.get(), new Item.Properties()));
}
