package net.judoboiz.tutorialmod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Scanner;

public class EightBallItem extends Item {
    public EightBallItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND){
            outputRandomNumber(user);
            user.getItemCooldownManager().set(this,20);

        }
        return super.use(world, user, hand);
    }
    private void  outputRandomNumber(PlayerEntity player){
        player.sendMessage(Text.literal("Your number is"+ getRandomNumber()));

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()){
            tooltip.add(Text.literal("Right click to get random number").formatted(Formatting.YELLOW));

        }else {
            tooltip.add(Text.literal("Press shift for more info").formatted(Formatting.YELLOW));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }

    private int getRandomNumber(){
        return Random.createLocal().nextInt(10);
    }
}
