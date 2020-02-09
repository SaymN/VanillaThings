package ch.saymn.vanillathings.block.slabs.init;

import net.minecraft.block.SlabBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CustomSlabBlock extends SlabBlock{

	public CustomSlabBlock(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
}
	@OnlyIn(Dist.CLIENT)
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
}