package com.v.v_craft.datagen;

import com.v.v_craft.V_craft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = V_craft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();


        generator.addProvider(event.includeClient(), new ModRecipeProvider(output));
        generator.addProvider(event.includeClient(), ModLootTableProvider.create(output));

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(output, helper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(output, helper));

        ModBlockTagProvider blockTagProvider = generator.addProvider(event.includeServer(),
                new ModBlockTagProvider(output, lookupProvider, helper));
        generator.addProvider(event.includeServer(), new ModItemTagProvider(output, lookupProvider, blockTagProvider.contentsGetter(), helper));

        generator.addProvider(event.includeServer(), new ModGlobalLootModifiersProvider(output));

        generator.addProvider(event.includeClient(), new ModLanguageProvider(output, "en_us"));


    }
}