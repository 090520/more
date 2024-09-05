package com.noisy_woman_20.more.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import com.noisy_woman_20.more.item.ModItems;


public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup arg) {
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_MINECRAFT);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_INFINITE_AMETHYST);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_PRECIPICE);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_CREATOR);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX);
	}
}
