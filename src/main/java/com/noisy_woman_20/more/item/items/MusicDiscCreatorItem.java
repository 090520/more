package com.noisy_woman_20.more.item.items;

import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class MusicDiscCreatorItem extends MusicDiscItem {
	public MusicDiscCreatorItem(int comparatorOutput, SoundEvent sound, Settings settings, int lengthInSeconds) {
		super(comparatorOutput, sound, settings, lengthInSeconds);
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
