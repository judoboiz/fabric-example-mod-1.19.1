package net.judoboiz.tutorialmod.networking;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.judoboiz.tutorialmod.TutorialMod;
import net.judoboiz.tutorialmod.networking.packet.ExampleC2SPacket;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.core.jmx.Server;
import org.spongepowered.asm.mixin.transformer.ext.IDecompiler;

import java.time.temporal.TemporalUnit;

public class ModMessages {
    public static final Identifier DRINKING_ID  = new Identifier(TutorialMod.MOD_ID ,"drinking");
    public static final Identifier THIRST_SYNC_ID  = new Identifier(TutorialMod.MOD_ID ,"drinking");
    public static final Identifier EXAMPLE_ID  = new Identifier(TutorialMod.MOD_ID ,"drinking");

    public static void registerC2SPackets(){
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2SPacket::receive);
    }
    public static void registerS2CPackets(){

    }
}
