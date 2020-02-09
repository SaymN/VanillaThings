package ch.saymn.vanillathings.block.stairs.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;;

public class BlockCustomStairs extends StairsBlock {
    @SuppressWarnings("deprecation")
	public BlockCustomStairs(BlockState state, Block.Properties builder) {
        super(state, builder);
    }
	@OnlyIn(Dist.CLIENT)
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
}