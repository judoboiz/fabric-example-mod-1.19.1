package net.judoboiz.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.judoboiz.tutorialmod.TutorialMod;
import net.judoboiz.tutorialmod.block.ModBlock;
import net.judoboiz.tutorialmod.item.custom.EightBallItem;
import net.judoboiz.tutorialmod.item.custom.FinderStickItem;
import net.minecraft.item.*;
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

    public static final Item JUDOBOIZ_SWORD = registerItem("judoboiz_sword",
            new SwordItem(ToolMaterials.DIAMOND, 10  ,5f ,
                    new FabricItemSettings().group(ModItemGroup.MUM).maxCount(1)));

    public static final Item MUM_SEEDS = registerItem("mum_seeds",
            new AliasedBlockItem(ModBlock.MUM_CROP,
                    new FabricItemSettings().group(ModItemGroup.MUM)));

    public static final Item MUM_FRUIT = registerItem("mum_fruit",
            new Item(new FabricItemSettings().group(ModItemGroup.MUM).
                    food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())));

    public static final Item FINDER_STICK = registerItem("finder_stick",
            new FinderStickItem(new FabricItemSettings().group(ModItemGroup.MUM).maxCount(1).maxDamage(14)));

    public static final Item MUS_SUPER_FUEL = registerItem("mum_super_fuel",
            new Item(new FabricItemSettings().group(ModItemGroup.MUM)));

    public static final Item GRAPE = registerItem("grape",
            new Item(new FabricItemSettings().group(ModItemGroup.MUM).food(ModFoodComponents.GRAPE)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Register mod item from " + TutorialMod.MOD_ID);
    }

}
