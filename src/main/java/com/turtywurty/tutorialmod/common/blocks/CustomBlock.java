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

public class CustomBlock extends BaseHorizontalBlock {

	private static final VoxelShape SHAPE = Stream
			.of(Block.makeCuboidShape(14, 3, 7.888888888888889, 15, 4, 9.88888888888889),
					Block.makeCuboidShape(6, 0, -0.11111111111111072, 15, 1, 5.888888888888889),
					Block.makeCuboidShape(1, 1, 1.8888888888888893, 10, 2, 7.888888888888889),
					Block.makeCuboidShape(6, 2, 3.8888888888888893, 15, 3, 9.88888888888889),
					Block.makeCuboidShape(1, 3, 5.888888888888889, 10, 4, 11.88888888888889),
					Block.makeCuboidShape(6, 4, 7.888888888888889, 15, 5, 13.88888888888889),
					Block.makeCuboidShape(1, 5, 9.88888888888889, 10, 6, 15.88888888888889),
					Block.makeCuboidShape(14, 0, 9.88888888888889, 15, 4, 13.88888888888889),
					Block.makeCuboidShape(1, 0, 11.88888888888889, 2, 5, 14.88888888888889),
					Block.makeCuboidShape(1, 0, 7.888888888888889, 2, 3, 11.88888888888889),
					Block.makeCuboidShape(1, 0, 1.8888888888888893, 2, 1, 7.888888888888889),
					Block.makeCuboidShape(1, 2, 5.888888888888889, 2, 3, 7.888888888888889),
					Block.makeCuboidShape(1, 4, 9.88888888888889, 2, 5, 11.88888888888889),
					Block.makeCuboidShape(10, 0, 12.88888888888889, 14, 4, 13.88888888888889),
					Block.makeCuboidShape(9, 0, 13.88888888888889, 10, 5, 14.88888888888889),
					Block.makeCuboidShape(1, 0, 14.88888888888889, 10, 5, 15.88888888888889),
					Block.makeCuboidShape(14, 0, 5.888888888888889, 15, 2, 9.88888888888889),
					Block.makeCuboidShape(14, 1, 3.8888888888888893, 15, 2, 5.888888888888889),
					Block.makeCuboidShape(3, 6, 12, 5, 16, 14))
			.reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	public CustomBlock(Properties properties) {
		super(properties);
		runCalculation(SHAPE);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(this).get(state.get(HORIZONTAL_FACING));
	}
}
