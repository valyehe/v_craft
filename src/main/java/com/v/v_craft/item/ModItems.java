package com.v.v_craft.item;

import com.v.v_craft.V_craft;
import com.v.v_craft.item.custom.FuelItem;
import com.v.v_craft.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author Admin
 * date 2023/11/06
 * description: 物品注册
 */
public class ModItems {

    //构造注册器
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, V_craft.MODID);

    //注册物品

    //蓝宝石
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));

    //粗蓝宝石
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));

    //探测器
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(20)));

    //注册食物
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    //注册燃料
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone", () -> new FuelItem(new Item.Properties(), 400));


    //注册总线
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
