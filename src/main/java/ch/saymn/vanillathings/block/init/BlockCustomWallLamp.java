package ch.saymn.vanillathings.block.init;

import java.util.Map;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.TorchBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockCustomWallLamp extends TorchBlock{
	
	   public static final DirectionProperty HORIZONTAL_FACING = HorizontalBlock.HORIZONTAL_FACING;
	   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	   private static final Map<Direction, VoxelShape> SHAPES = Maps.newEnumMap(ImmutableMap.of(
			   Direction.NORTH, Block.makeCuboidShape(5.0D, 3.0D, 5.0D, 11.0D, 15.0D, 16.0D), 
			   Direction.SOUTH, Block.makeCuboidShape(5.0D, 3.0D, 0.0D, 11.0D, 15.0D, 11.0D), 
			   Direction.WEST, Block.makeCuboidShape(5.0D, 3.0D, 5.0D, 16.0D, 15.0D, 11.0D), 
			   Direction.EAST, Block.makeCuboidShape(0.0D, 3.0D, 5.0D, 11.0D, 15.0D, 11.0D)));

	   public BlockCustomWallLamp(Block.Properties properties) {
	      super(properties.lightValue(14).func_226896_b_());
	      this.setDefaultState(this.stateContainer.getBaseState().with(HORIZONTAL_FACING, Direction.NORTH).with(WATERLOGGED, Boolean.valueOf(false)));
	   }

	   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	      return func_220289_j(state);
	   }

	   public static VoxelShape func_220289_j(BlockState p_220289_0_) {
	      return SHAPES.get(p_220289_0_.get(HORIZONTAL_FACING));
	   }

	   public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
	      Direction direction = state.get(HORIZONTAL_FACING);
	      BlockPos blockpos = pos.offset(direction.getOpposite());
	      BlockState blockstate = worldIn.getBlockState(blockpos);
	      return blockstate.func_224755_d(worldIn, blockpos, direction);
	   }

	   @Nullable
	   public BlockState getStateForPlacement(BlockItemUseContext context) {
	      BlockState blockstate = this.getDefaultState();
	      IWorldReader iworldreader = context.getWorld();
	      BlockPos blockpos = context.getPos();
	      Direction[] adirection = context.getNearestLookingDirections();
	      IFluidState ifluidstate = context.getWorld().getFluidState(blockpos);


	      for(Direction direction : adirection) {
	         if (direction.getAxis().isHorizontal()) {
	            Direction direction1 = direction.getOpposite();
	            blockstate = blockstate.with(HORIZONTAL_FACING, direction1).with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));;
	            if (blockstate.isValidPosition(iworldreader, blockpos)) {
	               return blockstate.with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
	            }
	         }
	      }

	      return null;
	   }
	   public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		   if (stateIn.get(WATERLOGGED)) {
		         worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
		         }
		      return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	   }
	   public BlockState rotate(BlockState state, Rotation rot) {
	      return state.with(HORIZONTAL_FACING, rot.rotate(state.get(HORIZONTAL_FACING))).with(WATERLOGGED, Boolean.valueOf(false));
	   }
	   public BlockState mirror(BlockState state, Mirror mirrorIn) {
	      return state.rotate(mirrorIn.toRotation(state.get(HORIZONTAL_FACING))).with(WATERLOGGED, Boolean.valueOf(false));
	   }
	   
	   public IFluidState getFluidState(BlockState state) {
		      return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
	   }

	   protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
	      builder.add(HORIZONTAL_FACING, WATERLOGGED);
	   }
	   
	   @Override
	   @OnlyIn(Dist.CLIENT)
	   public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		   return;
	   }
	}