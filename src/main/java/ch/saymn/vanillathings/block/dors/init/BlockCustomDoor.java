package ch.saymn.vanillathings.block.dors.init;

import net.minecraft.block.DoorBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockCustomDoor extends DoorBlock {

	public BlockCustomDoor(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
}
	@OnlyIn(Dist.CLIENT)
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
}