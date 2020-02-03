package ch.saymn.vanillathings.data;

import ch.saymn.vanillathings.VanillaThings;
import ch.saymn.vanillathings.data.provider.ModBlockTagsProvider;
import ch.saymn.vanillathings.data.provider.ModItemTagsProvider;
import ch.saymn.vanillathings.data.provider.ModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = VanillaThings.MODID, bus = Bus.MOD)
public class ModDataGenerator {
	
	@SubscribeEvent
	public static void data(GatherDataEvent event) {
		final DataGenerator generator = event.getGenerator();
		if (event.includeServer()) {
			generator.addProvider(new ModBlockTagsProvider(generator));
			generator.addProvider(new ModItemTagsProvider(generator));
			generator.addProvider(new ModRecipeProvider(generator));
		}
	}

}
