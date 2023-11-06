package com.v.v_craft.tab;

import com.v.v_craft.V_craft;
import com.v.v_craft.block.ModBlocks;
import com.v.v_craft.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author Admin
 * date 2023/11/06
 * description: 创造模式物品栏
 */
public class ModCreativeModTabs {

    //构造注册器
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, V_craft.MODID);

    //创建物品栏
    public static final RegistryObject<CreativeModeTab> V_CRAFT_TAB = CREATIVE_MOD_TABS.register("v_craft_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creative.mod.tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //物品
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        //方块
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                    })
                    .build());


    //注册总线
    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }

}
