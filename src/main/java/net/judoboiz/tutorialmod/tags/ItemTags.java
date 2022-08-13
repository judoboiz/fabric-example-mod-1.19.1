package net.judoboiz.tutorialmod.tags;

import net.judoboiz.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemTags {
    public static TagKey<Item> MUM_INGOT = createCommonTag("mum_ingot");

    private ItemTags() {
    }

    private static TagKey<Item> createTag(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(TutorialMod.MOD_ID, id));
    }

    private static TagKey<Item> createCommonTag(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier("c", id));
    }
}

