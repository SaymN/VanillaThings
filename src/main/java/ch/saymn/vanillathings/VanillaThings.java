package ch.saymn.vanillathings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

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
