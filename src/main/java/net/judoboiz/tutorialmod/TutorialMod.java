package net.judoboiz.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.judoboiz.tutorialmod.block.ModBlock;
import net.judoboiz.tutorialmod.block.entity.ModBlockEntities;
import net.judoboiz.tutorialmod.event.PlayerTickHandler;
import net.judoboiz.tutorialmod.fluid.ModFluids;
import net.judoboiz.tutorialmod.item.ModItems;
import net.judoboiz.tutorialmod.networking.ModMessages;
import net.judoboiz.tutorialmod.painting.ModPainting;
import net.judoboiz.tutorialmod.screen.ModScreenHandlers;
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

		ModPainting.registerPaintings();
		ModOreGeneration.generateOres();

		ModLootTableModifiers.modifyLootTables();
		ModMessages.registerC2SPackets();

		ModFluids.register();
		ModBlockEntities.registerBlockEntities();

		ModScreenHandlers.registerAllScreenHandlers();

		ModRegistries.registerModStuffs();

		ServerTickEvents.START_SERVER_TICK.register(new PlayerTickHandler());
	}
}
