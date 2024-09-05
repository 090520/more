package com.noisy_woman_20.more.enchantment;

import com.noisy_woman_20.more.More;
import com.noisy_woman_20.more.enchantment.enchantments.IronMaidenEnchantment;
import com.noisy_woman_20.more.enchantment.enchantments.NoDamageEnchantment;
import com.noisy_woman_20.more.enchantment.enchantments.PoisoningEnchantment;
import com.noisy_woman_20.more.enchantment.enchantments.RetributionEnchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {
	public static void registerModEnchantments() {    // 附魔注册
		More.LOGGER.info("Registered mod enchantments successfully");
	}

	private static Enchantment registerEnchantments(String id, Enchantment enchantment) {
		Identifier identifier = new Identifier(More.MOD_ID, id);
		return Registry.register(Registries.ENCHANTMENT, identifier, enchantment);
	}

	private static final EquipmentSlot[] ALL_ARMOR = new EquipmentSlot[] {
		EquipmentSlot.HEAD,
		EquipmentSlot.CHEST,
		EquipmentSlot.LEGS,
		EquipmentSlot.FEET
	};	

	public static final Enchantment BLUNTNESS = registerEnchantments(
		"bluntness",
		new NoDamageEnchantment(Enchantment.Rarity.COMMON, 0, EquipmentSlot.MAINHAND)
	);

	public static final Enchantment SPARE = registerEnchantments(
		"spare",
		new NoDamageEnchantment(Enchantment.Rarity.UNCOMMON, 1, EquipmentSlot.MAINHAND)
	);

	public static final Enchantment FRIEND_OF_ARTHROPODS = registerEnchantments(
		"friend_of_arthropods",
		new NoDamageEnchantment(Enchantment.Rarity.UNCOMMON, 2, EquipmentSlot.MAINHAND)
	);

	public static final Enchantment IRON_MAIDEN = registerEnchantments(
		"iron_maiden",
		new IronMaidenEnchantment(Enchantment.Rarity.VERY_RARE, ALL_ARMOR)
	);

	public static final Enchantment POISONING = registerEnchantments(
		"poisoning",
		new PoisoningEnchantment(Enchantment.Rarity.VERY_RARE, EquipmentSlot.MAINHAND)
	);

	public static final Enchantment RETRIBUTION = registerEnchantments(
		"retribution",
		new RetributionEnchantment(Enchantment.Rarity.RARE, EquipmentSlot.MAINHAND)
	);
}
