package net.judoboiz.tutorialmod.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.judoboiz.tutorialmod.util.IEntityDataSaver;
import net.judoboiz.tutorialmod.util.ThirstData;
import net.minecraft.block.Blocks;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;

public class DrinkingC2SPacket {
    public static final String MESSAGE_DRINKING_WATER = "message.tutorialmod.drank_water";
    public static final String MESSAGE_NOT_WATER_NEARBY = "message.tutorialmod.no_water";

    public static void receive(MinecraftServer server, ServerPlayerEntity player , ServerPlayNetworkHandler handler
            , PacketByteBuf buf , PacketSender responseSender){

        ServerWorld world = player.getWorld();

        if (isAroundWaterThem(player, world, 2)){
            player.sendMessage(Text.translatable(MESSAGE_DRINKING_WATER).fillStyle(Style.EMPTY.withColor(Formatting.DARK_AQUA)), false);

            world.playSound(null, player.getBlockPos(), SoundEvents.ENTITY_GENERIC_DRINK, SoundCategory.PLAYERS,
                    0.5F, world.random.nextFloat() * 0.1F + 0.5F);

            ThirstData.addThirst(((IEntityDataSaver) player), 1);

            player.sendMessage(Text.literal("Thirst" + ((IEntityDataSaver) player).getPersistentData().getInt("thirst"))
                    .fillStyle(Style.EMPTY.withColor(Formatting.AQUA)), false);


            ThirstData.syncThirst(((IEntityDataSaver) player).getPersistentData().getInt("thirst"), player);
        }else {
            player.sendMessage(Text.translatable(MESSAGE_NOT_WATER_NEARBY).fillStyle(Style.EMPTY.withColor(Formatting.RED)), false);

            player.sendMessage(Text.literal("Thirst" + ((IEntityDataSaver) player).getPersistentData().getInt("thirst"))
                    .fillStyle(Style.EMPTY.withColor(Formatting.AQUA)), false);
        }
    }

    private static boolean isAroundWaterThem(ServerPlayerEntity player, ServerWorld world, int size) {
        return BlockPos.stream(player.getBoundingBox().expand(size))
                .map(world::getBlockState).filter(blockState -> blockState.isOf(Blocks.WATER)).toArray().length > 0;
    }
}
