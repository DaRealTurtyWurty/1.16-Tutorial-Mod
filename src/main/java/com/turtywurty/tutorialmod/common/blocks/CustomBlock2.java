package com.turtywurty.tutorialmod.common.blocks;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class CustomBlock2 extends BaseHorizontalBlock {

	private static final VoxelShape SHAPE = Stream
			.of(Block.makeCuboidShape(11, 15, 0, 16, 16, 2), Block.makeCuboidShape(0, 0, 0, 5, 1, 2),
					Block.makeCuboidShape(11, 11, 14, 16, 12, 16), Block.makeCuboidShape(0, 5, 14, 5, 6, 16))
			.reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	public CustomBlock2(Properties properties) {
		super(properties);
		runCalculation(SHAPE);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(this).get(state.get(HORIZONTAL_FACING));
	}
}
