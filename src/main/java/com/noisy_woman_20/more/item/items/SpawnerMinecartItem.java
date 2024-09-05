package com.noisy_woman_20.more.item.items;

import net.minecraft.entity.vehicle.AbstractMinecartEntity.Type;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MinecartItem;

public class SpawnerMinecartItem extends MinecartItem {
	public SpawnerMinecartItem(Settings settings) {
		super(Type.SPAWNER, settings);
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
