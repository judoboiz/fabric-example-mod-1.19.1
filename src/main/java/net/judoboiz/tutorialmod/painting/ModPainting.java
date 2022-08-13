package net.judoboiz.tutorialmod.painting;

import net.judoboiz.tutorialmod.TutorialMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPainting {
    public static final PaintingVariant SUNSET = registerPainting("sunset", new PaintingVariant(32 ,16));
    public static final PaintingVariant PLANT = registerPainting("plant", new PaintingVariant(16 ,16));
    public static final PaintingVariant WANDERER = registerPainting("wanderer", new PaintingVariant(16 ,32));
    public static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant){
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(TutorialMod.MOD_ID, name), paintingVariant);
    }
    public static void registerPaintings(){
        TutorialMod.LOGGER.debug("Registering paintings for " + TutorialMod.MOD_ID);
    }
}
