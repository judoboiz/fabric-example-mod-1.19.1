package net.judoboiz.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.judoboiz.tutorialmod.block.ModBlock;
import net.judoboiz.tutorialmod.item.ModItems;
import net.judoboiz.tutorialmod.painting.ModPainting;
import net.judoboiz.tutorialmod.util.ModLootTableModifiers;
import net.judoboiz.tutorialmod.util.ModRegistries;
import net.judoboiz.tutorialmod.villager.ModVillager;
import net.judoboiz.tutorialmod.world.feature.ModConfiguredFeatures;
import net.judoboiz.tutorialmod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlock.registerModBlock();

		ModVillager.registerVillagers();
		ModVillager.registerTrades();
		ModRegistries.registerModStuffs();
		ModPainting.registerPaintings();
		ModLootTableModifiers.modifyLootTables();

		ModOreGeneration.generateOres();
	}
}
