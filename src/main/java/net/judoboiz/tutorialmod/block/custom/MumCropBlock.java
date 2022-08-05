package net.judoboiz.tutorialmod.block.custom;

import net.judoboiz.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class MumCropBlock extends CropBlock {
    public  static final IntProperty AGE = IntProperty.of("age",0,6);

    public MumCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.MUM_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return super.getMaxAge();
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
