package com.noisy_woman_20.more.item.items;

import com.noisy_woman_20.more.item.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TotemOfDyingItem extends Item {
	public TotemOfDyingItem(Settings settings) {
		super(settings);
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		if (entity instanceof PlayerEntity playerEntity) {
			if (
				!world.isClient &&
				playerEntity.isAlive() &&
				!(playerEntity.isCreative() || playerEntity.isSpectator()) &&
				(
					playerEntity.getMainHandStack().isOf(ModItems.TOTEM_OF_DYING) ||
					playerEntity.getOffHandStack().isOf(ModItems.TOTEM_OF_DYING)
				)
			) {
				if (playerEntity.getMainHandStack().isOf(ModItems.TOTEM_OF_DYING)) {
					playerEntity.getMainHandStack().decrement(1);
				} else if (playerEntity.getOffHandStack().isOf(ModItems.TOTEM_OF_DYING)) {
					playerEntity.getOffHandStack().decrement(1);
				}
				playerEntity.kill();
			} else {
				return;
			}
		} else {
			if (!world.isClient && entity.isAlive()) {
				stack.decrement(1);
				entity.kill();
			} else {
				return;
			}
		}
	}
}
