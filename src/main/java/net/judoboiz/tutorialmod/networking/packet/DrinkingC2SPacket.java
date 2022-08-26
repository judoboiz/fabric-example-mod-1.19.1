package net.judoboiz.tutorialmod.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.block.Blocks;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class DrinkingC2SPacket {
    public static final String MESSAGE_DRINKING_WATER = "message.tutorialmod.drank_water";

    public static void receive(MinecraftServer server, ServerPlayerEntity player , ServerPlayNetworkHandler handler
            , PacketByteBuf buf , PacketSender responseSender){
        ServerWorld world = player.getWorld();
        if (isAroundWaterThem(player, world, 2)){
            player.sendMessage(Text.translatable(MESSAGE_DRINKING_WATER));
        }else {

        }
    }

    private static boolean isAroundWaterThem(ServerPlayerEntity player, ServerWorld world, int size) {
        return BlockPos.stream(player.getBoundingBox().expand(size))
                .map(world::getBlockState).filter(blockState -> blockState.isOf(Blocks.WATER)).toArray().length > 0;
    }
}
