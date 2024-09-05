package com.noisy_woman_20.more.item.items;

import com.noisy_woman_20.more.block.ModBlocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class GlowingObsidianBlockItem extends BlockItem {
	public GlowingObsidianBlockItem(Settings settings) {
		super(ModBlocks.GLOWING_OBSIDIAN, settings);
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
