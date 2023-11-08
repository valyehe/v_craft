package com.v.v_craft.datagen;

import com.v.v_craft.V_craft;
import com.v.v_craft.block.ModBlocks;
import com.v.v_craft.item.ModItems;
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
        //decoration block
        add(ModBlocks.SAPPHIRE_STAIRS.get(), "Sapphire Stairs");
        add(ModBlocks.SAPPHIRE_BUTTON.get(), "Sapphire Button");
        add(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get(), "Sapphire Pressure plate");
        add(ModBlocks.SAPPHIRE_SLAB.get(), "Sapphire Slab");
        add(ModBlocks.SAPPHIRE_FENCE.get(), "Sapphire Fence");
        add(ModBlocks.SAPPHIRE_FENCE_GATE.get(), "Sapphire Fence Gate");
        add(ModBlocks.SAPPHIRE_WALL.get(), "Sapphire Wall");
        add(ModBlocks.SAPPHIRE_DOOR.get(), "Sapphire Door");
        add(ModBlocks.SAPPHIRE_TRAPDOOR.get(), "Sapphire Trapdoor");
        //tool
        add(ModItems.SAPPHIRE_STAFF.get(), "Sapphire Staff");
        add(ModItems.SAPPHIRE_SWORD.get(), "Sapphire Sword");
        add(ModItems.SAPPHIRE_PICKAXE.get(), "Sapphire PickAxe");
        add(ModItems.SAPPHIRE_AXE.get(), "Sapphire Axe");
        add(ModItems.SAPPHIRE_SHOVEL.get(), "Sapphire Shovel");
        add(ModItems.SAPPHIRE_HOE.get(), "Sapphire Hoe");
        //armor
        add(ModItems.SAPPHIRE_HELMET.get(), "Sapphire Helmet");
        add(ModItems.SAPPHIRE_CHESTPLATE.get(), "Sapphire ChestPlate");
        add(ModItems.SAPPHIRE_LEGGINGS.get(), "Sapphire Leggings");
        add(ModItems.SAPPHIRE_BOOTS.get(), "Sapphire Boots");


    }
}
