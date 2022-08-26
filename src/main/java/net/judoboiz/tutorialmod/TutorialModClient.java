package net.judoboiz.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.judoboiz.tutorialmod.block.ModBlock;
import net.judoboiz.tutorialmod.event.KeyInputHandler;
import net.judoboiz.tutorialmod.networking.ModMessages;
import net.minecraft.client.render.RenderLayer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUM_CROP, RenderLayer.getCutout());

        KeyInputHandler.register();
        ModMessages.registerS2CPackets();
    }
}
