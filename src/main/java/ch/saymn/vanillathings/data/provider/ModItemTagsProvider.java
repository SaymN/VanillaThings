package ch.saymn.vanillathings.data.provider;

import ch.saymn.vanillathings.init.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;

public class ModItemTagsProvider extends ItemTagsProvider{

	public ModItemTagsProvider(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	protected void registerTags() {
		getBuilder(ModTags.Items.TUTORIAL);
	}

}
