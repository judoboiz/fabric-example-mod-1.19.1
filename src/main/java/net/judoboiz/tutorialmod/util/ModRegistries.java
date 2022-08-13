package net.judoboiz.tutorialmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.judoboiz.tutorialmod.TutorialMod;
import net.judoboiz.tutorialmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();

    }
    private static void registerFuels(){
        TutorialMod.LOGGER.info("Registering fuels for"+ TutorialMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.MUS_SUPER_FUEL, 200);
    }
}
