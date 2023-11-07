package com.v.v_craft.tag;

import com.v.v_craft.V_craft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * MOD标签
 *
 * @author V
 * date 2023/11/07
 */
public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> METAL_DETECTOR_VALUABLE = tag("metal_detector_valuable");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(V_craft.MODID, name));
        }

    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(V_craft.MODID, name));
        }
    }


}
