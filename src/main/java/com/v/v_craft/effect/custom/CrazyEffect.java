package com.v.v_craft.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class CrazyEffect extends MobEffect {

    public CrazyEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
        addAttributeModifier(Attributes.MOVEMENT_SPEED, "409c0f40-2d2a-4a6c-91bd-623e6380c084", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.ATTACK_DAMAGE, "409c0f40-2d2a-4a6c-91bd-623e6380c084", 2.0, AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.ATTACK_SPEED, "409c0f40-2d2a-4a6c-91bd-623e6380c084", 2.0, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

}
