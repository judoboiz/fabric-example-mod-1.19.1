package net.judoboiz.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.judoboiz.tutorialmod.TutorialMod;
import net.judoboiz.tutorialmod.item.custom.EightBallItem;
import net.judoboiz.tutorialmod.item.custom.FinderStickItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_MUM = registerItem("raw_mum",
            new Item(new FabricItemSettings().group(ModItemGroup.MUM)));
    public static final Item MUM_INGOT = registerItem("mum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MUM)));

    public static final Item MUM_NUGGET = registerItem("mum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MUM)));

    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.MUM).maxCount(1)));

    public static final Item FINDER_STICK = registerItem("finder_stick",
            new FinderStickItem(new FabricItemSettings().group(ModItemGroup.MUM).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Register mod item from " + TutorialMod.MOD_ID);
    }

}
