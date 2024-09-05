package com.noisy_woman_20.more.datagen;

import java.util.concurrent.CompletableFuture;

import com.noisy_woman_20.more.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	public void configure(WrapperLookup arg) {
		getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
			.add(ModBlocks.GLOWING_OBSIDIAN)
			.add(ModBlocks.REACTOR_CORE_STAGE);

		getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
			.add(ModBlocks.GLOWING_OBSIDIAN);
	}
}
