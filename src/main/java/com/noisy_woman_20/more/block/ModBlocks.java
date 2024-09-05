package com.noisy_woman_20.more.block;

import com.noisy_woman_20.more.More;
import com.noisy_woman_20.more.block.blocks.GlowingObsidianBlock;
import com.noisy_woman_20.more.block.blocks.ReactorCoreStageBlock;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
	public static void registerModBlocks() {    // 方块注册
		More.LOGGER.info("Registered mod blocks successfully");
	}

	private static Block registerBlocks(String id, Block block) {
		return Registry.register(Registries.BLOCK, Identifier.of(More.MOD_ID, id), block);
	}

	public static final Block GLOWING_OBSIDIAN = registerBlocks(
		"glowing_obsidian",
		new GlowingObsidianBlock(
			FabricBlockSettings
			.create()
			.strength(10f, 1200f)
			.luminance(12)
			.mapColor(MapColor.DARK_RED)
			.instrument(Instrument.BASEDRUM)
			.requiresTool()
		)
	);

	public static final Block REACTOR_CORE_STAGE = registerBlocks(
		"reactor_core_stage",
		new ReactorCoreStageBlock(
			FabricBlockSettings
			.create()
			.strength(3, 6)
			.mapColor(MapColor.BLUE)
			.instrument(Instrument.BASEDRUM)
			.requiresTool()
		)
	);
}
