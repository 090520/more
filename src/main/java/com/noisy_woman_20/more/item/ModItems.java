package com.noisy_woman_20.more.item;

import com.noisy_woman_20.more.More;
import com.noisy_woman_20.more.event.sound_event.ModSoundEvents;
import com.noisy_woman_20.more.item.items.YukiSuouItem;
import com.noisy_woman_20.more.item.items.DiamondSwordItem;
import com.noisy_woman_20.more.item.items.EndGatewayBlockItem;
import com.noisy_woman_20.more.item.items.EndPortalBlockItem;
import com.noisy_woman_20.more.item.items.FrostedIceBlockItem;
import com.noisy_woman_20.more.item.items.GlowingObsidianBlockItem;
import com.noisy_woman_20.more.item.items.MusicDiscCreatorItem;
import com.noisy_woman_20.more.item.items.MusicDiscCreatorMusicBoxItem;
import com.noisy_woman_20.more.item.items.MusicDiscInfiniteAmethystItem;
import com.noisy_woman_20.more.item.items.MusicDiscMinecraftItem;
import com.noisy_woman_20.more.item.items.MusicDiscPrecipiceItem;
import com.noisy_woman_20.more.item.items.NetherPortalBlockItem;
import com.noisy_woman_20.more.item.items.ReactorCoreStageBlockItem;
import com.noisy_woman_20.more.item.items.SpawnerMinecartItem;
import com.noisy_woman_20.more.item.items.TotemOfDyingItem;
import com.noisy_woman_20.more.tool_material.ModToolMaterials;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
	public static void registerModItems() {    // 物品注册
		addItemsToItemGroup();
		More.LOGGER.info("Registered mod items successfully");
	}

	private static Item registerItems(String id, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(More.MOD_ID, id), item);
	}

	private static void addItemsToItemGroup() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlockItemGroup);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(ModItems::addItemsToOperatorItemGroup);
	}

	private static void addItemsToToolsItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
		fabricItemGroupEntries.add(MUSIC_DISC_MINECRAFT);
		fabricItemGroupEntries.add(MUSIC_DISC_INFINITE_AMETHYST);
		fabricItemGroupEntries.add(MUSIC_DISC_PRECIPICE);
		fabricItemGroupEntries.add(MUSIC_DISC_CREATOR);
		fabricItemGroupEntries.add(MUSIC_DISC_CREATOR_MUSIC_BOX);
	}

	private static void addItemsToCombatItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
		fabricItemGroupEntries.add(DIAMOND_SWORD);
		fabricItemGroupEntries.add(TOTEM_OF_DYING);
	}

	private static void addItemsToBuildingBlockItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
		fabricItemGroupEntries.add(Items.OBSIDIAN);
		fabricItemGroupEntries.add(Items.CRYING_OBSIDIAN);
		fabricItemGroupEntries.add(GLOWING_OBSIDIAN);
		fabricItemGroupEntries.add(REACTOR_CORE_STAGE);
	}

	private static void addItemsToOperatorItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
		fabricItemGroupEntries.add(NETHER_PORTAL);
		fabricItemGroupEntries.add(END_PORTAL);
		fabricItemGroupEntries.add(END_GATEWAY);
		fabricItemGroupEntries.add(FROSTED_ICE);
		fabricItemGroupEntries.add(SPAWNER_MINECART);
	}

	public static final Item DIAMOND_SWORD = registerItems(
		"diamond_sword", 
		new DiamondSwordItem(
			ModToolMaterials.DIAMOND,
			3,
			-2.4f,
			new FabricItemSettings().rarity(Rarity.COMMON).maxCount(1)
		)
	);

	public static final Item MUSIC_DISC_MINECRAFT = registerItems(
		"music_disc_minecraft",
		new MusicDiscMinecraftItem(
			15,
			ModSoundEvents.MINECRAFT,
			new FabricItemSettings().rarity(Rarity.RARE).maxCount(1),
			254
		)
	);

	public static final Item MUSIC_DISC_INFINITE_AMETHYST = registerItems(
		"music_disc_infinite_amethyst",
		new MusicDiscInfiniteAmethystItem(
			15,
			ModSoundEvents.INFINITE_AMETHYST,
			new FabricItemSettings().rarity(Rarity.RARE).maxCount(1),
			271
		)
	);

	public static final Item MUSIC_DISC_PRECIPICE = registerItems(
		"music_disc_precipice",
		new MusicDiscPrecipiceItem(
			13,
			ModSoundEvents.PRECIPICE,
			new FabricItemSettings().rarity(Rarity.RARE).maxCount(1),
			299
		)
	);

	public static final Item MUSIC_DISC_CREATOR = registerItems(
		"music_disc_creator",
		new MusicDiscCreatorItem(
			12,
			ModSoundEvents.CREATOR,
			new FabricItemSettings().rarity(Rarity.RARE).maxCount(1),
			177
		)
	);

	public static final Item MUSIC_DISC_CREATOR_MUSIC_BOX = registerItems(
		"music_disc_creator_music_box",
		new MusicDiscCreatorMusicBoxItem(
			11,
			ModSoundEvents.CREATOR_MUSIC_BOX,
			new FabricItemSettings().rarity(Rarity.RARE).maxCount(1),
			74
		)
	);

	public static final Item GLOWING_OBSIDIAN = registerItems(
		"glowing_obsidian",
		new GlowingObsidianBlockItem(new FabricItemSettings().rarity(Rarity.COMMON).maxCount(64))
	);

	public static final Item REACTOR_CORE_STAGE = registerItems(
		"reactor_core_stage",
		new ReactorCoreStageBlockItem(new FabricItemSettings().rarity(Rarity.COMMON).maxCount(64))
	);

	public static final Item NETHER_PORTAL = registerItems(
		"nether_portal",
		new NetherPortalBlockItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(64))
	);

	public static final Item END_PORTAL = registerItems(
		"end_portal",
		new EndPortalBlockItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(64))
	);

	public static final Item END_GATEWAY = registerItems(
		"end_gateway",
		new EndGatewayBlockItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(64))
	);

	public static final Item FROSTED_ICE = registerItems(
		"frosted_ice",
		new FrostedIceBlockItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(64))
	);

	public static final Item SPAWNER_MINECART = registerItems(
		"spawner_minecart",
		new SpawnerMinecartItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1))
	);

	public static final Item TOTEM_OF_DYING = registerItems(
		"totem_of_dying",
		new TotemOfDyingItem(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(1))
	);

	public static final Item YUKI_SUOU = registerItems(
		"yuki_suou",
		new YukiSuouItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(64))
	);
}

/*
/summon minecraft:minecart ~ ~ ~ {CustomDisplayTile:1,DisplayState:{Name:"minecraft:grass_block"},DisplayOffset:6}
*/