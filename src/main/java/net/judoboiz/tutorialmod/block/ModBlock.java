package net.judoboiz.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.judoboiz.tutorialmod.block.custom.*;
import net.judoboiz.tutorialmod.item.ModItemGroup;
import net.minecraft.block.*;
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
    public static final Block NETHERRACK_MUM_ORE = registerBlock("netherrack_mum_ore",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(3f)
                    .requiresTool()
            ), ModItemGroup.MUM);

    public static final Block ENDSTONE_MUM_ORE = registerBlock("end_mum_ore",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(3f)
                    .requiresTool()
            ), ModItemGroup.MUM);

    public static final Block DEEPSLATE_MUM_ORE = registerBlock("deepslate_mum_ore",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(3f)
                    .requiresTool()
            ), ModItemGroup.MUM);

    public static final Block MUM_LAMP = registerBlock("mum_lamp",
            new MumLampBlock(FabricBlockSettings.of(Material.GLASS)
                    .luminance(state ->state.get(MumLampBlock.LIT)? 15: 0)
            ), ModItemGroup.MUM);

    public static final Block MUM_CROP = registerBlockWithOutItem("mum_crop",
            new MumCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)
            ));

    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
            new JumpyBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(2f, 3f)
            ), ModItemGroup.MUM);

    public static final Block MUM_BUTTON= registerBlock("mum_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
                    .noCollision()
            ), ModItemGroup.MUM);

    public static final Block MUM_PRESSURE_PLATE= registerBlock("mum_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING ,FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.MUM);

    public static final Block MUM_FENCE = registerBlock("mum_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.MUM);

    public static final Block MUM_FENCE_GATE= registerBlock("mum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.MUM);

    public static final Block MUM_WALL= registerBlock("mum_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.MUM);
    public static final Block GEM_INFUSING_STATION = registerBlock("gem_infusing_station",
            new GemInfusingStationBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(2f, 3f).nonOpaque()
            ), ModItemGroup.MUM);


    private static Block registerBlockWithOutItem(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }
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
