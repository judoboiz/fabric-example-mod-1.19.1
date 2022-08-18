package net.judoboiz.tutorialmod.event;


import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_TUTORIAL = "key.category.tutorialmod.tutorial";
    public static final String KEY_DRINK_WATER = "key.tutorialmod.drink.water";

    public static KeyBinding drinking_key;

    public static void registerKeyInputs(){
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (drinking_key.wasPressed()){
                client.player.sendMessage(Text.literal("Hello I pressed a Key"));
            }
        });
    }
    public static void register(){
        drinking_key = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_DRINK_WATER,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                KEY_CATEGORY_TUTORIAL
        ));

        registerKeyInputs();
    }
}
