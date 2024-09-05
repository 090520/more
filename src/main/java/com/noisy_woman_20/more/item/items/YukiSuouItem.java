package com.noisy_woman_20.more.item.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class YukiSuouItem extends Item {
	public YukiSuouItem(Settings settings) {
		super(settings);
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
