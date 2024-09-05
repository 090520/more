package com.noisy_woman_20.more.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class ReactorCoreStageBlock extends Block {
	public static final IntProperty STATE = IntProperty.of("state", 0, 2);

	public ReactorCoreStageBlock(Settings settings) {
		super(settings);
		setDefaultState(getDefaultState().with(STATE, 0));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(STATE);
	}
}
