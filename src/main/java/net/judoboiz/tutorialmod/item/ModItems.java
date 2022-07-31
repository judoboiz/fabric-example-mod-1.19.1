package net.judoboiz.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.judoboiz.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item mum_ingot = registerItem("mum_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item nuget_ingot = registerItem("nuget_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Register mod item from " + TutorialMod.MOD_ID);
    }

}
