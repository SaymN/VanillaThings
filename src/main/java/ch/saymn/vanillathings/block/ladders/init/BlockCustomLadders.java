package ch.saymn.vanillathings.block.ladders.init;

import net.minecraft.block.Block;
import net.minecraft.block.LadderBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockCustomLadders extends LadderBlock{

	public BlockCustomLadders(Block.Properties builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}
	
	@OnlyIn(Dist.CLIENT)
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}

}
