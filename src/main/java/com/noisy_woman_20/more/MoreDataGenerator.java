package com.noisy_woman_20.more;

import com.noisy_woman_20.more.datagen.ModBlockLootTableProvider;
import com.noisy_woman_20.more.datagen.ModBlockTagProvider;
import com.noisy_woman_20.more.datagen.ModItemTagProvider;
import com.noisy_woman_20.more.datagen.ModModelProvider;
import com.noisy_woman_20.more.datagen.ModRecipeProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MoreDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
	}
}
