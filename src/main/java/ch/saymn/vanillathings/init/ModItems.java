package ch.saymn.vanillathings.init;

import java.util.LinkedHashMap;
import java.util.Map;

import ch.saymn.vanillathings.VanillaThings;
import ch.saymn.vanillathings.item.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = VanillaThings.MODID, bus = Bus.MOD)
public class ModItems {
	
	public static final stone_rod stone_rod = new stone_rod();
	public static final recipe_holder recipe_holder = new recipe_holder();

	@SubscribeEvent
	public static void register(Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		registry.register(stone_rod.setRegistryName(VanillaThings.MODID, "stone_rod"));
		registry.register(recipe_holder.setRegistryName(VanillaThings.MODID, "recipe_holder"));

 }
	    static final Map<String, BlockItem> BLOCKS_TO_REGISTER = new LinkedHashMap<>();

	    @SubscribeEvent
	    public static void RegisterModItems(RegistryEvent.Register<Item> event) {
	        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName())) return;

	        BLOCKS_TO_REGISTER.forEach(ModItems::register);
	    }

	    /**
	     * Register the item. Also sets the registry name.
	     *
	     * @param name The path of the item ID
	     * @param item The item
	     * @param <T>  The item class
	     * @return The item
	     */
	    private static <T extends Item> T register(String name, T item) {
	        ResourceLocation id = VanillaThings.location(name);
	        item.setRegistryName(id);
	        ForgeRegistries.ITEMS.register(item);
	        return item;
	    }

	}


