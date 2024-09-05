package com.noisy_woman_20.more.item.items;

import com.noisy_woman_20.more.block.ModBlocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class ReactorCoreStageBlockItem extends BlockItem {
	public ReactorCoreStageBlockItem(Settings settings) {
		super(ModBlocks.REACTOR_CORE_STAGE, settings);
	}

	 @Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
