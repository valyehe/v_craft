package com.v.v_craft.datagen;

import com.v.v_craft.V_craft;
import com.v.v_craft.block.ModBlocks;
import com.v.v_craft.item.ModItems;
import com.v.v_craft.tab.ModCreativeModTabs;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

/**
 * @author V
 * @date 2023/11/07
 */
public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, V_craft.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        //KEY
        add("creative.mod.tab", "Sapphire Craft");
        add("tooltip.v_craft.metal_detector.tooltip", "Find Valuables UnderGround!");
        add("tooltip.v_craft.sound_block.tooltip", "Makes sounds when right-clicked!");
        //item
        add(ModItems.SAPPHIRE.get(), "Sapphire");
        add(ModItems.RAW_SAPPHIRE.get(), "Raw Sapphire");
        add(ModItems.STRAWBERRY.get(), "Strawberry");
        add(ModItems.METAL_DETECTOR.get(), "Metal Detector");
        add(ModItems.PINE_CONE.get(), "Pine Cone");
        //block
        add(ModBlocks.SAPPHIRE_BLOCK.get(), "Block Of Sapphire");
        add(ModBlocks.RAW_SAPPHIRE_BLOCK.get(), "Block Of Raw Sapphire");
        add(ModBlocks.SAPPHIRE_ORE.get(), "Sapphire Ore");
        add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), "DeepSlate Sapphire Ore");
        add(ModBlocks.NETHER_SAPPHIRE_ORE.get(), "Nether Sapphire Ore");
        add(ModBlocks.END_STONE_SAPPHIRE_ORE.get(), "End Stone Sapphire Ore");
        add(ModBlocks.SOUND_BLOCK.get(), "Sound Block");

    }
}
