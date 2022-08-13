package net.judoboiz.tutorialmod.world.feature;

import net.judoboiz.tutorialmod.TutorialMod;
import net.judoboiz.tutorialmod.block.ModBlock;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_MUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlock.MUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlock.DEEPSLATE_MUM_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_MUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlock.NETHERRACK_MUM_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_MUM_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlock.ENDSTONE_MUM_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MUM_ORE =
            ConfiguredFeatures.register("mum_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_MUM_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_MUM_ORE =
            ConfiguredFeatures.register("nether_mum_ore",Feature.ORE, new OreFeatureConfig(NETHER_MUM_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_MUM_ORE =
            ConfiguredFeatures.register("end_mum_ore",Feature.ORE, new OreFeatureConfig(END_MUM_ORES, 12));

    public static void registerConfiguredFeatures() {
        TutorialMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + TutorialMod.MOD_ID);
    }
}