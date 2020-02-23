package ch.saymn.vanillathings.block.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class BlockCustomTable extends Block{
	
public static final DirectionProperty facing = HorizontalBlock.HORIZONTAL_FACING;
public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;


	public BlockCustomTable(Properties properties) {
		super(properties.func_226896_b_());
		setDefaultState(getDefaultState().with(facing, Direction.NORTH).with(WATERLOGGED, Boolean.valueOf(false)));
	}
	
	//																	minX   minY  minZ   maxX   maxY   maxZ
	protected static final VoxelShape SHAPE_TOP	= Block.makeCuboidShape(16.0D, 14.0D, 0.0D, 0.0D, 16.0D, 16.0D);
	protected static final VoxelShape SHAPE_1 	= Block.makeCuboidShape(3.0D, 0.0D, 1.0D, 1.0D, 14.0D, 3.0D);
	protected static final VoxelShape SHAPE_2	= Block.makeCuboidShape(3.0D, 0.0D, 13.0D, 1.0D, 14.0D, 15.0D);
	protected static final VoxelShape SHAPE_3	= Block.makeCuboidShape(15.0D, 0.0D, 13.0D, 13.0D, 14.0D, 15.0D);	
	protected static final VoxelShape SHAPE_4 	= Block.makeCuboidShape(15.0D, 0.0D, 1.0D, 13.0D, 14.0D, 3.0D);
	private static final VoxelShape TABLE_SHAPE = VoxelShapes.or(SHAPE_TOP, SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4);
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos position, ISelectionContext context)
    {	
/*		if (Direction.NORTH == state.get(facing)) {
		return TABLE_SHAPE;
		}
		
		if (Direction.SOUTH == state.get(facing)) {
		return TABLE_SHAPE;
		}
		
		if (Direction.WEST == state.get(facing)) {
		return TABLE_SHAPE;
		}
		
		if (Direction.EAST == state.get(facing)) {
		return TABLE_SHAPE;
		}
		
		if (Direction.UP == state.get(facing)) {
		return TABLE_SHAPE;
		}
		
		if (Direction.DOWN == state.get(facing)) {
		return TABLE_SHAPE;
		}
		
		else
*/		return TABLE_SHAPE;

    }
    
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
	      BlockPos blockpos = context.getPos();
	      IFluidState ifluidstate = context.getWorld().getFluidState(blockpos);
		return getDefaultState().with(facing, context.getPlacementHorizontalFacing().getOpposite()).with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
	}
	
	public IFluidState getFluidState(BlockState state) {
	     return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
	}

	   public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		      if (stateIn.get(WATERLOGGED)) {
		         worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
		      }

		      return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
		   }
	
	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(facing, WATERLOGGED);
	}
	
}
