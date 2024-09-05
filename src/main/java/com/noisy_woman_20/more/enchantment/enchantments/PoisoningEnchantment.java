package com.noisy_woman_20.more.enchantment.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class PoisoningEnchantment extends Enchantment {
	public PoisoningEnchantment(Rarity weight, EquipmentSlot... slotTypes) {
		super(weight, EnchantmentTarget.WEAPON, slotTypes);
	}

	@Override
	public void onTargetDamaged(LivingEntity user, Entity target, int level) {
		if(target instanceof LivingEntity) {
			((LivingEntity)target).addStatusEffect(
				new StatusEffectInstance(StatusEffects.POISON, 200, (level - 1))
			);
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
	public int getMinLevel() {
		return 1;
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}
