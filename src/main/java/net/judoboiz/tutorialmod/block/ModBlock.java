package net.judoboiz.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.judoboiz.tutorialmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.judoboiz.tutorialmod.TutorialMod;

public class ModBlock {
    public static final Block MUM_BLOCK = registerBlock("mum_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(6f, 6f)
                    .requiresTool()
            ), ModItemGroup.MUM);

    public static final Block MUM_ORE = registerBlock("mum_ore",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(3f)
                    .requiresTool()
            ), ModItemGroup.MUM);

    public static final Block DEEPSLATE_MUM_ORE = registerBlock("deepslate_mum_ore",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(3f)
                    .requiresTool()
            ), ModItemGroup.MUM);
    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name , Block block , ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), new BlockItem(block , new FabricItemSettings().group(group)));
    }
    public static void registerModBlock(){
        TutorialMod.LOGGER.info("Register mod block from " + TutorialMod.MOD_ID);
    }
}
