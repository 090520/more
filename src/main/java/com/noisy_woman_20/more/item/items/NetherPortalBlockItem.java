package com.noisy_woman_20.more.item.items;

import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class NetherPortalBlockItem extends BlockItem {
	public NetherPortalBlockItem(Settings settings) {
		super(Blocks.NETHER_PORTAL, settings);
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
