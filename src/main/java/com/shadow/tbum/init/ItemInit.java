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

    //food
    public static final RegistryObject<Item> CARMEL_APPLE = ITEMS.register("carmel_apple",
            () -> new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(new Food.Builder()
                    .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 200, 1), 0.95f)
                    .nutrition(10).saturationMod(25f).alwaysEat().build())));

    public static final RegistryObject<Item> CARMEL = ITEMS.register("carmel",
            () -> new Item(new Item.Properties().tab(UtilitiesMod.TAB).food(new Food.Builder()
                    .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 100, 0), 0.95f)
                    .nutrition(4).saturationMod(0.4f).alwaysEat().build())));
}
