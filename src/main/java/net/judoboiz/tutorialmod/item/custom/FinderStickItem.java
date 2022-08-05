package net.judoboiz.tutorialmod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;


public class FinderStickItem extends Item {
    public FinderStickItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient
                && context.getHand() == Hand.MAIN_HAND
                && !context.getPlayer().isCreative()
                && !context.getPlayer().isSpectator()){

            context.getPlayer().damage(DamageSource.GENERIC, 2140000000);
            context.getPlayer().getItemCooldownManager().set(this, 20);

        }

        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack,World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()){
            tooltip.add(Text.literal("Click block with item to revile a secret"+ "\n" +"You need to be in survival").formatted(Formatting.YELLOW));

        }else {
            tooltip.add(Text.literal("Press shift for more info").formatted(Formatting.YELLOW));
        }

        super.appendTooltip(stack, world, tooltip, context);

        super.appendTooltip(stack, world, tooltip, context);
    }
}
