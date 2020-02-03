package ch.saymn.vanillathings.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class ModBlockItem extends BlockItem{

	public ModBlockItem(Block block, ItemGroup tab1) {
		super(block, new Properties().group(tab1));
		setRegistryName(block.getRegistryName());
	}

}
