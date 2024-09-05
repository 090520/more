package com.noisy_woman_20.more.item.items;

import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class FrostedIceBlockItem extends BlockItem {
	public FrostedIceBlockItem(Settings settings) {
		super(Blocks.FROSTED_ICE, settings);
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
