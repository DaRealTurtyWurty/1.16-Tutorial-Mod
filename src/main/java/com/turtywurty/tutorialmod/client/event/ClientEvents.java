package com.turtywurty.tutorialmod.client.event;

import com.turtywurty.tutorialmod.TutorialMod;
import com.turtywurty.tutorialmod.core.init.ItemInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {

	@SubscribeEvent
	public static void renderHand(final RenderHandEvent event) {
		if (event.getItemStack().getItem().equals(ItemInit.SPECIAL_ITEM.get())) {
			event.setCanceled(true);
		}
	}
}
