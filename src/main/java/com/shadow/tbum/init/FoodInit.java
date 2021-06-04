package com.shadow.tbum.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {
    public static final Food CARMEL_APPLE = new Food.Builder()
                    .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 200, 1), 0.95f)
                    .nutrition(10).saturationMod(25f).alwaysEat().build();

    public static final Food CARMEL = new Food.Builder()
                    .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 100, 0), 0.95f)
                    .nutrition(4).saturationMod(0.4f).alwaysEat().build();

    public static final Food HAMBURGER = new Food.Builder().nutrition(30).saturationMod(50f).alwaysEat().build();
    public static final Food LETTUCE = new Food.Builder().nutrition(2).saturationMod(1f).alwaysEat().fast().build();

    public static final Food BLUEBERRY = new Food.Builder().nutrition(2).saturationMod(0.2F).build();
    public static final Food STRAWBERRY = new Food.Builder().nutrition(2).saturationMod(0.275F).build();
    public static final Food BANANA = new Food.Builder().nutrition(2).saturationMod(0.3f).build();
    public static final Food CHERRY = new Food.Builder().nutrition(2).saturationMod(0.275f).build();
    public static final Food PEAR = new Food.Builder().nutrition(3).saturationMod(0.375f).build();
    public static final Food ORANGE = new Food.Builder().nutrition(3).saturationMod(0.375f).build();
}
