package ch.saymn.vanillathings.block.slabs.init;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CustomSlabBlock extends net.minecraft.block.SlabBlock{

	public CustomSlabBlock(Properties properties) {
		super(properties.func_226896_b_());
		// TODO Auto-generated constructor stub
	}
	   @OnlyIn(Dist.CLIENT)
	   public float func_220080_a(BlockState state, IBlockReader worldIn, BlockPos pos) {
	      return 1.0F;
	   }

	   public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
	      return true;
	   }

	   public boolean func_229869_c_(BlockState p_229869_1_, IBlockReader p_229869_2_, BlockPos p_229869_3_) {
	      return false;
	   }

	   public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
	      return false;
	   }

	   public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
	      return false;
	   }
	   public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
		      return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
		   }
}