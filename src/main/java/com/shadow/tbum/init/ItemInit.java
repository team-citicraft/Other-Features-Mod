package com.shadow.tbum.init;

import com.shadow.tbum.UtilitiesMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UtilitiesMod.MOD_ID);

    // Food

    public static final RegistryObject<Item> CARMEL_APPLE = ITEMS.register("carmel_apple", () ->
            new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(FoodInit.CARMEL_APPLE)));
    public static final RegistryObject<Item> CARMEL = ITEMS.register("carmel", () ->
            new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(FoodInit.CARMEL)));
    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger", () ->
            new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(FoodInit.HAMBURGER)));
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce", () ->
            new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(FoodInit.LETTUCE)));

}
