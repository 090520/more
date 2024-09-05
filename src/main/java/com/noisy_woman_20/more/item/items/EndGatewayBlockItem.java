package com.noisy_woman_20.more.item.items;

import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class EndGatewayBlockItem extends BlockItem {
	public EndGatewayBlockItem(Settings settings) {
		super(Blocks.END_GATEWAY, settings);
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
