package ch.saymn.vanillathings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ch.saymn.vanillathings.api.block.ModDoors;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = VanillaThings.MODID)
public class VanillaThings {
	
	public static VanillaThings instance;

	public static final String MODID = "vanillathings";
	public static final Logger LOGGER = LogManager.getLogger(MODID);


	public static ResourceLocation getId(String path) {
        return new ResourceLocation(MODID, path);
	}

	public static String find(String name)
	{
		return VanillaThings.MODID + ":" + name;
	}
	public static ResourceLocation location(String name) {
        return new ResourceLocation(MODID, name);
    }
	

	
}
