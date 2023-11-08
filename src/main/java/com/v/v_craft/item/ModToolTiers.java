package com.v.v_craft.item;

import com.v.v_craft.V_craft;
import com.v.v_craft.tag.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 5.0F, 4.0F, 25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(V_craft.MODID, "sapphire"), List.of(Tiers.NETHERITE), List.of());


}
