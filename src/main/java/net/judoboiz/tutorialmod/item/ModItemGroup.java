package net.judoboiz.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.judoboiz.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class ModItemGroup {
    public static final ItemGroup MUM = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "mum"),
            () ->new ItemStack(ModItems.mum_ingot));
}
