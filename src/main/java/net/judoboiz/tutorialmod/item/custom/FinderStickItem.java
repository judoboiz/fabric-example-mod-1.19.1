package net.judoboiz.tutorialmod.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.*;



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

            context.getPlayer().sendMessage(Text.literal("hello"));
            context.getPlayer().damage(DamageSource.GENERIC, 10);
            context.getPlayer().getItemCooldownManager().set(this, 20);
        }

        return super.useOnBlock(context);
    }
}
