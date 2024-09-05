package com.noisy_woman_20.more.item.items;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class DiamondSwordItem extends SwordItem {
	public DiamondSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
		super(toolMaterial, attackDamage, attackSpeed, settings);
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return true;
	}
}
