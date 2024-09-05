package com.noisy_woman_20.more.datagen;

import com.noisy_woman_20.more.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
	public ModBlockLootTableProvider(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate() {
		addDrop(ModBlocks.GLOWING_OBSIDIAN);
		addDrop(ModBlocks.REACTOR_CORE_STAGE);
	}
}
