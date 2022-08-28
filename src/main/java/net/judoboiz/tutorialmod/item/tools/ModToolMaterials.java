package net.judoboiz.tutorialmod.item.tools;

import net.judoboiz.tutorialmod.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModToolMaterials implements ToolMaterial {

    public static final ModToolMaterials INSTANCE = new ModToolMaterials();

    @Override
    public int getDurability() {
        return 1000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 15.0F;
    }

    @Override
    public float getAttackDamage() {
        return 3.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.MUM_INGOT);
    }
}
