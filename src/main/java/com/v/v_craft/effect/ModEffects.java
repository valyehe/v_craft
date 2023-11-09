package com.v.v_craft.effect;

import com.v.v_craft.V_craft;
import com.v.v_craft.effect.custom.CrazyEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {


    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, V_craft.MODID);

    public static final RegistryObject<MobEffect> CRAZY_EFFECT = MOB_EFFECTS.register("crazy_effect",
            () -> new CrazyEffect(MobEffectCategory.BENEFICIAL, 0x333333)
    );

    //注册总线
    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }

}
