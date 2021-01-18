package com.turtywurty.tutorialmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.turtywurty.tutorialmod.core.init.BlockInit;
import com.turtywurty.tutorialmod.core.init.ItemInit;
import com.turtywurty.tutorialmod.world.OreGeneration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TutorialMod.MOD_ID)
public class TutorialMod {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "tutorial";
	public static final ItemGroup TUTORIAL_GROUP = new TutorialGroup("tutorialtab");

	public TutorialMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	public static class TutorialGroup extends ItemGroup {

		public TutorialGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.EXAMPLE_ITEM.get().getDefaultInstance();
		}
	}
}
