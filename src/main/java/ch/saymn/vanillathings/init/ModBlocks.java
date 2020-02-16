package ch.saymn.vanillathings.init;

import javax.annotation.Nullable;

import ch.saymn.vanillathings.VanillaThings;
import ch.saymn.vanillathings.api.block.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = VanillaThings.MODID, bus = Bus.MOD)
public class ModBlocks {
	
@SubscribeEvent
	    public static void RegisterModBlock(final RegistryEvent.Register<Block> event) {

	        if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName())) return;

	        for (ModStairs Stairs : ModStairs.VALUES) {
	            register(Stairs.getName() + "_stairs", Stairs.getStairs());
				
				if (FMLEnvironment.dist == Dist.CLIENT) {
	    		RenderTypeLookup.setRenderLayer(Stairs.getStairs(), RenderType.func_228645_f_());
				}
	        }

	        for (ModLamps Lamps : ModLamps.VALUES) {
	            register(Lamps.getName() + "_lamp", Lamps.getLamp());
				
				if (FMLEnvironment.dist == Dist.CLIENT) {
	    		RenderTypeLookup.setRenderLayer(Lamps.getLamp(), RenderType.func_228645_f_());
				}
	        }

	        for (ModWallLamps WallLamps : ModWallLamps.VALUES) {
	            register(WallLamps.getName() + "_wall_lamp", WallLamps.getWallLamp());
				
				if (FMLEnvironment.dist == Dist.CLIENT) {
	    		RenderTypeLookup.setRenderLayer(WallLamps.getWallLamp(), RenderType.func_228645_f_());
				}
	        }

	        for (ModTables Tables : ModTables.VALUES) {
	            register(Tables.getName() + "_table", Tables.getTable());
				
				if (FMLEnvironment.dist == Dist.CLIENT) {
	    		RenderTypeLookup.setRenderLayer(Tables.getTable(), RenderType.func_228645_f_());
				}
	        }
	        
	        for (ModFence Fence : ModFence.VALUES) {
	            register(Fence.getName() + "_fence", Fence.getFence());
				
				if (FMLEnvironment.dist == Dist.CLIENT) {
	    		RenderTypeLookup.setRenderLayer(Fence.getFence(), RenderType.func_228645_f_());
				}
	        }
	        
	        for (ModFenceGate FenceGate : ModFenceGate.VALUES) {
	            register(FenceGate.getName() + "_fence_gate", FenceGate.getFenceGate());
	        }
	        
	        for (ModSlabs Slab : ModSlabs.VALUES) {
	            register(Slab.getName() + "_slab", Slab.getSlab());
				
				if (FMLEnvironment.dist == Dist.CLIENT) {
	    		RenderTypeLookup.setRenderLayer(Slab.getSlab(), RenderType.func_228645_f_());
				}
	        }
	        
	        for (ModVerticalSlabs VerticalSlab : ModVerticalSlabs.VALUES) {
	            register(VerticalSlab.getName() + "_vertical_slab", VerticalSlab.getVerticalSlab());
				
				if (FMLEnvironment.dist == Dist.CLIENT) {
	    		RenderTypeLookup.setRenderLayer(VerticalSlab.getVerticalSlab(), RenderType.func_228645_f_());
				}
	        }
	        
	        for (ModWalls Walls : ModWalls.VALUES) {
	            register(Walls.getName() + "_wall", Walls.getWall());
	        }
	       
	        for (ModDoors Doors : ModDoors.VALUES) {
				register(Doors.getName() + "_door", Doors.getDoor());
				
				if (FMLEnvironment.dist == Dist.CLIENT) {
	    		RenderTypeLookup.setRenderLayer(Doors.getDoor(), RenderType.func_228645_f_());
				}
	        }
	       
	        for (ModLadders Ladders : ModLadders.VALUES) {
				register(Ladders.getName() + "_ladder", Ladders.getLadder());
				
				if (FMLEnvironment.dist == Dist.CLIENT) {
	    		RenderTypeLookup.setRenderLayer(Ladders.getLadder(), RenderType.func_228645_f_());
				}

	        }

	    }
		@SubscribeEvent
		public static void register(Register<Block> event) {
			final IForgeRegistry<Block> registry = event.getRegistry();
			
//			registry.register(oak_table.setRegistryName(VanillaThings.MODID, "oak_table"));
//			
//			if (FMLEnvironment.dist == Dist.CLIENT) {
//	    		RenderTypeLookup.setRenderLayer(oak_table.getBlock(), RenderType.func_228645_f_());
//				}
		
		}
		
		@SubscribeEvent
		public static void registerBlockItem(Register<Item> event) {
			final IForgeRegistry<Item> registry = event.getRegistry();
			
//			registry.register(new ModBlockItem(oak_table, ModItemGroup.VANILLA_THINGS));


			
		}

	    private static <T extends Block> T register(String name, T block) {
	        BlockItem item = new BlockItem(block, new Item.Properties().group(ModItemGroup.VANILLA_THINGS));
	        return register(name, block, item);

	    }


	    private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
	        ResourceLocation id = VanillaThings.location(name);
	        block.setRegistryName(id);
	        ForgeRegistries.BLOCKS.register(block);
	        if (item != null) {
	            ModItems.BLOCKS_TO_REGISTER.put(name, item);
	        }
	        return block;
	    }

}