package com.noisy_woman_20.more.event;

import com.noisy_woman_20.more.More;
import com.noisy_woman_20.more.event.entity_event.ModEntityEvent;
import com.noisy_woman_20.more.event.sound_event.ModSoundEvents;

public class ModEvents {
    public static void registerModEvents() {    // 事件注册
		More.LOGGER.info("Mod event registration has begun");
		ModEntityEvent.registerModEntityEvents();
		ModSoundEvents.registerModSoundEvents();
		More.LOGGER.info("Mod event registration has ended");
	}
}
