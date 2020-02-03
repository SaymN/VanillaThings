package ch.saymn.vanillathings.data.provider;

import ch.saymn.vanillathings.init.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;

public class ModBlockTagsProvider extends BlockTagsProvider{

	public ModBlockTagsProvider(DataGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void registerTags() {
		getBuilder(ModTags.Blocks.TUTORIAL);
	}

}
