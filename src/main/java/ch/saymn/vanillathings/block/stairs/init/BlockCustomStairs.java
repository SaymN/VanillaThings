package ch.saymn.vanillathings.block.stairs.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;;

public class BlockCustomStairs extends StairsBlock {
    @SuppressWarnings("deprecation")
	public BlockCustomStairs(BlockState state, Block.Properties builder) {
        super(state, builder.func_226896_b_());
    }
}