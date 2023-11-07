package com.v.v_craft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

/**
 * @author Admin
 * date 2023/11/07
 * description:模组食物
 */
public class ModFoods {

    /**
     * 草莓
     */
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder()
            .nutrition(2).fast().saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 200), 1.0f)
            .build();

}
