package ch.saymn.vanillathings.block.init;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.material.PushReaction;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class BlockCustomLamp extends LanternBlock{
	
	 public static final BooleanProperty HANGING = BlockStateProperties.HANGING;
	 public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	 
	   protected static final VoxelShape field_220279_b = Block.makeCuboidShape(11.0D, 0.0D, 5.0D, 5.0D, 12.0D, 11.0D);
	   protected static final VoxelShape field_220280_c = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);


	public BlockCustomLamp(Properties properties) {
		super(properties.lightValue(14).func_226896_b_());
	      this.setDefaultState(this.stateContainer.getBaseState().with(HANGING, Boolean.valueOf(false)).with(WATERLOGGED, Boolean.valueOf(false)));
	   }

	   @Nullable
	   public BlockState getStateForPlacement(BlockItemUseContext context) {
		      BlockPos blockpos = context.getPos();
		      IFluidState ifluidstate = context.getWorld().getFluidState(blockpos);
	      for(Direction direction : context.getNearestLookingDirections()) {
	         if (direction.getAxis() == Direction.Axis.Y) {
	            BlockState blockstate = this.getDefaultState().with(HANGING, Boolean.valueOf(direction == Direction.UP)).with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
	            if (blockstate.isValidPosition(context.getWorld(), context.getPos())) {
	               return blockstate.with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
	            }
	         }
	      }

	      return null;
	   }

	   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	      return state.get(HANGING) ? field_220280_c : field_220279_b;
	   }

	   protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
	      builder.add(HANGING, WATERLOGGED);
	   }

	   public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
	      Direction direction = func_220277_j(state).getOpposite();
	      return Block.func_220055_a(worldIn, pos.offset(direction), direction.getOpposite());
	   }

	   protected static Direction func_220277_j(BlockState p_220277_0_) {
	      return p_220277_0_.get(HANGING) ? Direction.DOWN : Direction.UP;
	   }

	   /**
	    * @deprecated call via {@link IBlockState#getMobilityFlag()} whenever possible. Implementing/overriding is fine.
	    */
	   public PushReaction getPushReaction(BlockState state) {
	      return PushReaction.DESTROY;
	   }

	   /**
	    * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
	    * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
	    * returns its solidified counterpart.
	    * Note that this method should ideally consider only the specific face passed in.
	    */
	   public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		   if (stateIn.get(WATERLOGGED)) {
		         worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
		         }
	      return func_220277_j(stateIn).getOpposite() == facing && !stateIn.isValidPosition(worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	   }
	   
	   public IFluidState getFluidState(BlockState state) {
		      return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
	   }

	   public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
	      return false;
	   }
}
