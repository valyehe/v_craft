package com.v.v_craft.event;

import com.v.v_craft.V_craft;
import com.v.v_craft.util.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvent {
    @Mod.EventBusSubscriber(modid = V_craft.MODID, value = Dist.CLIENT)
    public static class clientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent event) {
            if (KeyBinding.PLAYER_ABILITY_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("you press it"));
            }
        }

    }

    @Mod.EventBusSubscriber(modid = V_craft.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.PLAYER_ABILITY_KEY);
        }

    }


}
