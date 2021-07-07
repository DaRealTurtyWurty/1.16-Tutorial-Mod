package com.turtywurty.tutorialmod.core.init;

import com.turtywurty.tutorialmod.TutorialMod;
import com.turtywurty.tutorialmod.common.items.SpecialItem;
import com.turtywurty.tutorialmod.core.enums.ToolMaterials;

import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			TutorialMod.MOD_ID);

	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item",
			() -> new SpecialItem(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)
					.addToolType(ToolType.SHOVEL, 5).maxDamage(200).rarity(Rarity.EPIC).isImmuneToFire()));

	public static final RegistryObject<Item> EXAMPLE_FOOD = ITEMS.register("example_food",
			() -> new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP).food(FoodInit.EXAMPLE_FOOD)));

	public static final RegistryObject<SwordItem> EXAMPLE_SWORD = ITEMS.register("example_sword",
			() -> new SwordItem(ToolMaterials.TUTORIAL, 4, -2,
					new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<PickaxeItem> EXAMPLE_PICKAXE = ITEMS.register("example_pickaxe",
			() -> new PickaxeItem(ToolMaterials.TUTORIAL, 2, -2,
					new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<ShovelItem> EXAMPLE_SHOVEL = ITEMS.register("example_shovel",
			() -> new ShovelItem(ToolMaterials.TUTORIAL, 2.5f, -2,
					new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<AxeItem> EXAMPLE_AXE = ITEMS.register("example_axe",
			() -> new AxeItem(ToolMaterials.TUTORIAL, 6, -2, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<HoeItem> EXAMPLE_HOE = ITEMS.register("example_hoe",
			() -> new HoeItem(ToolMaterials.TUTORIAL, -2, 1, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	// Block Items
	public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
			() -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),
					new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<BlockItem> EXAMPLE_ORE = ITEMS.register("example_ore",
			() -> new BlockItem(BlockInit.EXAMPLE_ORE.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<BlockItem> CUSTOM_BLOCK = ITEMS.register("custom_block",
			() -> new BlockItem(BlockInit.CUSTOM_BLOCK.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<BlockItem> CUSTOM_BLOCK2 = ITEMS.register("custom_block2",
			() -> new BlockItem(BlockInit.CUSTOM_BLOCK2.get(),
					new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
}
