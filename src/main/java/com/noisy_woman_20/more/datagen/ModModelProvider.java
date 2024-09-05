package com.noisy_woman_20.more.datagen;

import com.noisy_woman_20.more.block.ModBlocks;
import com.noisy_woman_20.more.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOWING_OBSIDIAN);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.DIAMOND_SWORD, Models.HANDHELD);

		itemModelGenerator.register(ModItems.TOTEM_OF_DYING, Models.GENERATED);
		itemModelGenerator.register(ModItems.YUKI_SUOU, Models.GENERATED);
		itemModelGenerator.register(ModItems.MUSIC_DISC_MINECRAFT, Models.GENERATED);
		itemModelGenerator.register(ModItems.MUSIC_DISC_INFINITE_AMETHYST, Models.GENERATED);
		itemModelGenerator.register(ModItems.MUSIC_DISC_PRECIPICE, Models.GENERATED);
		itemModelGenerator.register(ModItems.MUSIC_DISC_CREATOR, Models.GENERATED);
		itemModelGenerator.register(ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX, Models.GENERATED);
		itemModelGenerator.register(ModItems.SPAWNER_MINECART, Models.GENERATED);
	}
}
