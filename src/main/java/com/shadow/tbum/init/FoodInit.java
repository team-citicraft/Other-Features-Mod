package com.shadow.tbum.init;

import com.shadow.tbum.UtilitiesMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;

public class FoodInit {
    public static final Food CARMEL_APPLE = new Food.Builder()
                    .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 200, 1), 0.95f)
                    .nutrition(10).saturationMod(25f).alwaysEat().build();

    public static final Food CARMEL = new Food.Builder()
                    .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 100, 0), 0.95f)
                    .nutrition(4).saturationMod(0.4f).alwaysEat().build();

    public static final Food HAMBURGER = new Food.Builder().nutrition(30).saturationMod(50f).alwaysEat().build();

    public static final Food LETTUCE = new Food.Builder().nutrition(2).saturationMod(1f).alwaysEat().fast().build();
}
