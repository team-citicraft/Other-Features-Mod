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
            () -> new Item(new Item.Properties().group(UtilitiesMod.TAB).food(new Food.Builder()
                    .effect(() -> new EffectInstance(Effects.SPEED, 200, 1), 0.95f)
                    .hunger(10).saturation(20f).setAlwaysEdible().build())));

    public static final RegistryObject<Item> CARMEL = ITEMS.register("carmel",
            () -> new Item(new Item.Properties().group(UtilitiesMod.TAB).food(new Food.Builder()
                    .effect(() -> new EffectInstance(Effects.SPEED, 100, 0), 0.95f)
                    .hunger(4).saturation(0.4f).setAlwaysEdible().build())));
}
