package com.noisy_woman_20.more.event.entity_event;

import com.noisy_woman_20.more.More;

public class ModEntityEvent {
	private static void registerEntityEvents() {}

	public static void registerModEntityEvents() {    // 实体事件注册
		registerEntityEvents();
		More.LOGGER.info("Registered mod sound events successfully");
	}
}
