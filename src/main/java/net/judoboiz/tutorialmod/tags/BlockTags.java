package net.judoboiz.tutorialmod.tags;

import net.judoboiz.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockTags {
    public static TagKey<Block> MUM_BLOCK = createCommonTag("mum_block");

    private BlockTags() {
    }

    private static TagKey<Block> createTag(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(TutorialMod.MOD_ID, id));
    }

    private static TagKey<Block> createCommonTag(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", id));
    }
}

