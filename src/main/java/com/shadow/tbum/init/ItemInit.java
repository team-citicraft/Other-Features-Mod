package com.shadow.tbum.init;

import com.shadow.tbum.UtilitiesMod;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UtilitiesMod.MOD_ID);
}
