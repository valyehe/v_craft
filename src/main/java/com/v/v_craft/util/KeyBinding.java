package com.v.v_craft.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {

    public static final String KEY_CATEGORY_V_CRAFT = "key.categories.v_craft";
    public static final String KEY_PLAYER_ABILITY = "key.v_craft.player_ability";

    public static final KeyMapping PLAYER_ABILITY_KEY = new KeyMapping(
            KEY_PLAYER_ABILITY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_V,
            KEY_CATEGORY_V_CRAFT
    );


}
