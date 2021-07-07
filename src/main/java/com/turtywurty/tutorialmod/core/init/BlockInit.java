package com.turtywurty.tutorialmod.core.init;

import com.turtywurty.tutorialmod.TutorialMod;
import com.turtywurty.tutorialmod.common.blocks.CustomBlock;
import com.turtywurty.tutorialmod.common.blocks.CustomBlock2;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			TutorialMod.MOD_ID);

	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS
			.register("example_block",
					() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)
							.hardnessAndResistance(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(5)
							.sound(SoundType.METAL).setRequiresTool()));

	public static final RegistryObject<CustomBlock> CUSTOM_BLOCK = BLOCKS.register("custom_block",
			() -> new CustomBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CustomBlock2> CUSTOM_BLOCK2 = BLOCKS.register("custom_block2",
			() -> new CustomBlock2(AbstractBlock.Properties.create(Material.ORGANIC).harvestTool(ToolType.SHOVEL)
					.harvestLevel(3).sound(SoundType.NETHERITE).jumpFactor(2.0f).speedFactor(1.5f).setRequiresTool()));

	public static final RegistryObject<Block> EXAMPLE_ORE = BLOCKS.register("example_ore",
			() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));
}
