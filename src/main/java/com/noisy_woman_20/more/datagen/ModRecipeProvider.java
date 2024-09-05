package com.noisy_woman_20.more.datagen;

import com.noisy_woman_20.more.item.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
	public ModRecipeProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generate(Consumer<RecipeJsonProvider> exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.REINFORCED_DEEPSLATE, 1)
			.pattern("aba")
			.pattern("cdc")
			.pattern("aba")
			.input('a', Items.NETHERITE_SCRAP)
			.input('b', Items.NETHERITE_INGOT)
			.input('c', Items.BONE)
			.input('d', Items.DEEPSLATE)
			.criterion(FabricRecipeProvider.hasItem(Items.DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.DEEPSLATE))
			.offerTo(exporter, new Identifier("reinforced_deepslate"));
		ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REACTOR_CORE_STAGE, 1)
			.pattern("aba")
			.pattern("aba")
			.pattern("aba")
			.input('a', Items.IRON_INGOT)
			.input('b', Items.DIAMOND)
			.criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
			.offerTo(exporter, new Identifier("reactor_core_stage"));

		ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.COMMAND_BLOCK_MINECART, 1)
			.input(Items.COMMAND_BLOCK)
			.input(Items.MINECART)
			.criterion(FabricRecipeProvider.hasItem(Items.MINECART), FabricRecipeProvider.conditionsFromItem(Items.MINECART))
			.offerTo(exporter, new Identifier("command_block_minecart"));
		ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SPAWNER_MINECART, 1)
			.input(Items.SPAWNER)
			.input(Items.MINECART)
			.criterion(FabricRecipeProvider.hasItem(Items.MINECART), FabricRecipeProvider.conditionsFromItem(Items.MINECART))
			.offerTo(exporter, new Identifier("spawner_minecart"));

		ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_MINECRAFT, 1)
			.pattern("aaa")
			.pattern("aba")
			.pattern("aaa")
			.input('a', Items.DEEPSLATE)
			.input('b', Items.GRASS_BLOCK)
			.criterion(FabricRecipeProvider.hasItem(Items.DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.DEEPSLATE))
			.offerTo(exporter, new Identifier("music_disc_minecraft"));
		ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_INFINITE_AMETHYST, 1)
			.pattern("aaa")
			.pattern("aba")
			.pattern("aaa")
			.input('a', Items.AMETHYST_BLOCK)
			.input('b', Items.CALCITE)
			.criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
			.offerTo(exporter, new Identifier("music_disc_infinite_amethyst"));
		ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_CREATOR, 1)
			.pattern("aaa")
			.pattern("aba")
			.pattern("aaa")
			.input('a', Items.OXIDIZED_COPPER)
			.input('b', Items.GOLD_BLOCK)
			.criterion(FabricRecipeProvider.hasItem(Items.OXIDIZED_COPPER), FabricRecipeProvider.conditionsFromItem(Items.OXIDIZED_COPPER))
			.offerTo(exporter, new Identifier("music_disc_creator"));
		ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX, 1)
			.pattern("aaa")
			.pattern("aba")
			.pattern("aaa")
			.input('a', Items.COPPER_BLOCK)
			.input('b', Items.GOLD_BLOCK)
			.criterion(FabricRecipeProvider.hasItem(Items.COPPER_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.COPPER_BLOCK))
			.offerTo(exporter, new Identifier("music_disc_creator_music_box"));
		ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_PRECIPICE, 1)
			.pattern("aaa")
			.pattern("aba")
			.pattern("cde")
			.input('a', Items.TUFF)
			.input('b', Items.RAW_COPPER_BLOCK)
			.input('c', Items.COPPER_BLOCK)
			.input('d', Items.EXPOSED_COPPER)
			.input('e', Items.WEATHERED_COPPER)
			.criterion(FabricRecipeProvider.hasItem(Items.TUFF), FabricRecipeProvider.conditionsFromItem(Items.TUFF))
			.offerTo(exporter, new Identifier("music_disc_precipice"));
	}
}
