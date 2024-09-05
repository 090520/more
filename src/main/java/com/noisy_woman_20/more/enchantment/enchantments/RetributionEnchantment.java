package com.noisy_woman_20.more.enchantment.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

/*
/summon minecraft:zombie ~ ~ ~ {NoAI:1b}
*/

public class RetributionEnchantment extends Enchantment {
	private float previousHealth;

	public RetributionEnchantment(Rarity weight, EquipmentSlot... slotTypes) {
		super(weight, EnchantmentTarget.WEAPON, slotTypes);
		this.previousHealth = 0f;
	}

	@Override
	public void onTargetDamaged(LivingEntity user, Entity target, int level) {
		if (target instanceof LivingEntity livingEntity) {
			float attackDamage = 0f;

			if (isEqual(previousHealth, 0f) && !isEqual(livingEntity.getHealth(), 0f)) {
				attackDamage = (livingEntity.getMaxHealth() - livingEntity.getHealth());
			} else {
				attackDamage = (this.previousHealth - livingEntity.getHealth());
			}

			user.damage(user.getDamageSources().mobAttack(user), attackDamage);
			this.previousHealth = livingEntity.getHealth();
		}

		super.onTargetDamaged(user, target, level);
	}

	@Override
	public int getMinPower(int level) {
		return 10 + 20 * (level - 1);
	}

	@Override
	public int getMaxPower(int level) {
		return super.getMinPower(level) + 50;
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public boolean isCursed() {
		return true;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	protected static boolean isEqual(int num1, int num2) {
		if (num1 == num2) {
			return true;
		} else {
			return false;
		}
	}

	protected static boolean isEqual(float num1, float num2) {
		if (Math.abs(num1 - num2) <= 0.0001f) {
			return true;
		} else {
			return false;
		}
	}
}
