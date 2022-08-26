package net.judoboiz.tutorialmod.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import javax.swing.text.html.parser.Entity;

public class ExampleC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player , ServerPlayNetworkHandler handler
    , PacketByteBuf buf , PacketSender responseSender){
        EntityType.COW.spawn(((ServerWorld) player.world), null, null, player,player.getBlockPos(),
                SpawnReason.TRIGGERED, true , false);

    }
}
