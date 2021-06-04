package com.shadow.tbum.init;

import com.shadow.tbum.UtilitiesMod;
import net.minecraft.item.Item;
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

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry", () ->
            new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(FoodInit.BLUEBERRY)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () ->
            new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(FoodInit.STRAWBERRY)));
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana", () ->
            new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(FoodInit.BANANA)));
    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry", () ->
            new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(FoodInit.CHERRY)));
    public static final RegistryObject<Item> PEAR = ITEMS.register("pear", () ->
            new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(FoodInit.PEAR)));
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange", () ->
            new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(FoodInit.ORANGE)));

}
