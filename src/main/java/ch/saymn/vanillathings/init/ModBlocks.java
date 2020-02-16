package ch.saymn.vanillathings.init;

import javax.annotation.Nullable;

import ch.saymn.vanillathings.VanillaThings;
import ch.saymn.vanillathings.api.block.ModDoors;
import ch.saymn.vanillathings.api.block.ModFence;
import ch.saymn.vanillathings.api.block.ModFenceGate;
import ch.saymn.vanillathings.api.block.ModLadders;
import ch.saymn.vanillathings.api.block.ModLamps;
import ch.saymn.vanillathings.api.block.ModSlabs;
import ch.saymn.vanillathings.api.block.ModStairs;
import ch.saymn.vanillathings.api.block.ModTables;
import ch.saymn.vanillathings.api.block.ModVerticalSlabs;
import ch.saymn.vanillathings.api.block.ModWallLamps;
import ch.saymn.vanillathings.api.block.ModWalls;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(modid = VanillaThings.MODID, bus = Bus.MOD)
public class ModBlocks {


@SubscribeEvent
	    public static void RegisterModBlock(final RegistryEvent.Register<Block> event) {
	        if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName())) return;

	        for (ModStairs Stairs : ModStairs.VALUES) {
	            register(Stairs.getName() + "_stairs", Stairs.getStairs());
	        }

	        for (ModLamps Lamps : ModLamps.VALUES) {
	            register(Lamps.getName() + "_lamp", Lamps.getLamp());
	        }

	        for (ModWallLamps WallLamps : ModWallLamps.VALUES) {
	            register(WallLamps.getName() + "_wall_lamp", WallLamps.getWallLamp());
	        }

	        for (ModTables Tables : ModTables.VALUES) {
	            register(Tables.getName() + "_table", Tables.getTable());
	        }
	        
	        for (ModFence Fence : ModFence.VALUES) {
	            register(Fence.getName() + "_fence", Fence.getFence());
	        }
	        
	        for (ModFenceGate FenceGate : ModFenceGate.VALUES) {
	            register(FenceGate.getName() + "_fence_gate", FenceGate.getFenceGate());
	        }
	        
	        for (ModSlabs Slab : ModSlabs.VALUES) {
	            register(Slab.getName() + "_slab", Slab.getSlab());
	        }
	        
	        for (ModVerticalSlabs VerticalSlab : ModVerticalSlabs.VALUES) {
	            register(VerticalSlab.getName() + "_vertical_slab", VerticalSlab.getVerticalSlab());
	        	
	        }
	        
	        for (ModWalls Walls : ModWalls.VALUES) {
	            register(Walls.getName() + "_wall", Walls.getWall());
	        }
	        
	        for (ModDoors Doors : ModDoors.VALUES) {
				register(Doors.getName() + "_door", Doors.getDoor());
	        }
	       
	        for (ModLadders Ladders : ModLadders.VALUES) {
				register(Ladders.getName() + "_ladder", Ladders.getLadder());

	        }

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
