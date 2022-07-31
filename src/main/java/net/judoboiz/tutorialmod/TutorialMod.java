package net.judoboiz.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.judoboiz.tutorialmod.block.ModBlock;
import net.judoboiz.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlock.registerModBlock();
	}
}
