package ch.saymn.vanillathings.init;

import javax.annotation.Nullable;

import ch.saymn.vanillathings.VanillaThings;
import ch.saymn.vanillathings.api.block.ModFence;
import ch.saymn.vanillathings.api.block.ModSlabs;
import ch.saymn.vanillathings.api.block.ModVerticalSlabs;
import ch.saymn.vanillathings.block.fence.*;
import ch.saymn.vanillathings.block.fence.gate.*;
import ch.saymn.vanillathings.block.slabs.*;
import ch.saymn.vanillathings.block.slabs.vertical.*;
import ch.saymn.vanillathings.block.stairs.*;
import ch.saymn.vanillathings.block.walls.*;
import ch.saymn.vanillathings.item.ModBlockItem;
import net.minecraft.block.Block;
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
public class ModBlocks {

//Fences
		public static final nether_brick_fence_gate nether_brick_fence_gate = new nether_brick_fence_gate();

	//Granite Fence
		public static final granite_fence granite_fence = new granite_fence();
		public static final granite_fence_gate granite_fence_gate = new granite_fence_gate();
		public static final polished_granite_fence polished_granite_fence = new polished_granite_fence();
		public static final polished_granite_fence_gate polished_granite_fence_gate = new polished_granite_fence_gate();
	
	//Andesite Fence
		public static final andesite_fence andesite_fence = new andesite_fence();
		public static final andesite_fence_gate andesite_fence_gate = new andesite_fence_gate();
		public static final polished_andesite_fence polished_andesite_fence = new polished_andesite_fence();
		public static final polished_andesite_fence_gate polished_andesite_fence_gate = new polished_andesite_fence_gate();
	
	//Diorite Fence
		public static final diorite_fence diorite_fence = new diorite_fence();
		public static final diorite_fence_gate diorite_fence_gate = new diorite_fence_gate();
		public static final polished_diorite_fence polished_diorite_fence = new polished_diorite_fence();
		public static final polished_diorite_fence_gate polished_diorite_fence_gate = new polished_diorite_fence_gate();

	//Stone Fence
		public static final stone_fence stone_fence = new stone_fence();
		public static final stone_fence_gate stone_fence_gate = new stone_fence_gate();
		public static final smooth_stone_fence smooth_stone_fence = new smooth_stone_fence();
		public static final smooth_stone_fence_gate smooth_stone_fence_gate = new smooth_stone_fence_gate();

	//Glowstone Fence
		public static final glowstone_fence glowstone_fence = new glowstone_fence();
		public static final glowstone_fence_gate glowstone_fence_gate = new glowstone_fence_gate();
		
	//Concrete Fence
		public static final red_concrete_fence red_concrete_fence = new red_concrete_fence();
		public static final red_concrete_fence_gate red_concrete_fence_gate = new red_concrete_fence_gate();
		
		public static final blue_concrete_fence blue_concrete_fence = new blue_concrete_fence();
		public static final blue_concrete_fence_gate blue_concrete_fence_gate = new blue_concrete_fence_gate();
		
		public static final white_concrete_fence white_concrete_fence = new white_concrete_fence();
		public static final white_concrete_fence_gate white_concrete_fence_gate = new white_concrete_fence_gate();
		
		public static final orange_concrete_fence orange_concrete_fence = new orange_concrete_fence();
		public static final orange_concrete_fence_gate orange_concrete_fence_gate = new orange_concrete_fence_gate();
		
//Stairs
		public static final smooth_stone_stairs smooth_stone_stairs = new smooth_stone_stairs();
		public static final glowstone_stairs glowstone_stairs = new glowstone_stairs();
		public static final red_concrete_stairs red_concrete_stairs = new red_concrete_stairs();
		public static final blue_concrete_stairs blue_concrete_stairs = new blue_concrete_stairs();
		public static final white_concrete_stairs white_concrete_stairs = new white_concrete_stairs();
		public static final orange_concrete_stairs orange_concrete_stairs = new orange_concrete_stairs();
		
//Walls
		public static final smooth_stone_wall smooth_stone_wall = new smooth_stone_wall();
		public static final glowstone_wall glowstone_wall = new glowstone_wall();
		public static final red_concrete_wall red_concrete_wall = new red_concrete_wall();
		public static final blue_concrete_wall blue_concrete_wall = new blue_concrete_wall();
		public static final white_concrete_wall white_concrete_wall = new white_concrete_wall();
		public static final orange_concrete_wall orange_concrete_wall = new orange_concrete_wall();
		
//Slabs
		
	//Normal
		public static final glowstone_slab glowstone_slab = new glowstone_slab();
		public static final red_concrete_slab red_concrete_slab = new red_concrete_slab();
		public static final blue_concrete_slab blue_concrete_slab = new blue_concrete_slab();
		public static final white_concrete_slab white_concrete_slab = new white_concrete_slab();
		public static final orange_concrete_slab orange_concrete_slab = new orange_concrete_slab();
		
	//Vertical
		public static final red_concrete_vertical_slab red_concrete_vertical_slab = new red_concrete_vertical_slab();
		public static final blue_concrete_vertical_slab blue_concrete_vertical_slab = new blue_concrete_vertical_slab();
		public static final white_concrete_vertical_slab white_concrete_vertical_slab = new white_concrete_vertical_slab();
		public static final orange_concrete_vertical_slab orange_concrete_vertical_slab = new orange_concrete_vertical_slab();

		@SubscribeEvent
	    public static void RegisterModBlock(final RegistryEvent.Register<Block> event) {
	        if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName())) return;

	        for (ModVerticalSlabs VerticalSlab : ModVerticalSlabs.VALUES) {
	            register("vertical_" + VerticalSlab.getName() + "_slab", VerticalSlab.getVerticalSlab());
	        }
	        
	        for (ModSlabs Slab : ModSlabs.VALUES) {
	            register(Slab.getName() + "_slab", Slab.getSlab());
	        }
	        
	        for (ModFence Fence : ModFence.VALUES) {
	            register(Fence.getName() + "_fence", Fence.getFence());
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

	
	@SubscribeEvent
	public static void register(Register<Block> event) {
		final IForgeRegistry<Block> registry = event.getRegistry();

//Fences
		registry.register(nether_brick_fence_gate.setRegistryName(VanillaThings.MODID, "nether_brick_fence_gate"));

	//Granite Fence
		registry.register(granite_fence.setRegistryName(VanillaThings.MODID, "granite_fence"));
		registry.register(granite_fence_gate.setRegistryName(VanillaThings.MODID, "granite_fence_gate"));
		registry.register(polished_granite_fence.setRegistryName(VanillaThings.MODID, "polished_granite_fence"));
		registry.register(polished_granite_fence_gate.setRegistryName(VanillaThings.MODID, "polished_granite_fence_gate"));
		
	//Andesite Fence
		registry.register(andesite_fence.setRegistryName(VanillaThings.MODID, "andesite_fence"));
		registry.register(andesite_fence_gate.setRegistryName(VanillaThings.MODID, "andesite_fence_gate"));
		registry.register(polished_andesite_fence.setRegistryName(VanillaThings.MODID, "polished_andesite_fence"));
		registry.register(polished_andesite_fence_gate.setRegistryName(VanillaThings.MODID, "polished_andesite_fence_gate"));
		
	//Diorite Fence
		registry.register(diorite_fence.setRegistryName(VanillaThings.MODID, "diorite_fence"));
		registry.register(diorite_fence_gate.setRegistryName(VanillaThings.MODID, "diorite_fence_gate"));
		registry.register(polished_diorite_fence.setRegistryName(VanillaThings.MODID, "polished_diorite_fence"));
		registry.register(polished_diorite_fence_gate.setRegistryName(VanillaThings.MODID, "polished_diorite_fence_gate"));
		
	//Stone Fence
		registry.register(stone_fence.setRegistryName(VanillaThings.MODID, "stone_fence"));
		registry.register(stone_fence_gate.setRegistryName(VanillaThings.MODID, "stone_fence_gate"));
		registry.register(smooth_stone_fence.setRegistryName(VanillaThings.MODID, "smooth_stone_fence"));
		registry.register(smooth_stone_fence_gate.setRegistryName(VanillaThings.MODID, "smooth_stone_fence_gate"));
		
	//Glowstone Fence
		registry.register(glowstone_fence.setRegistryName(VanillaThings.MODID, "glowstone_fence"));
		registry.register(glowstone_fence_gate.setRegistryName(VanillaThings.MODID, "glowstone_fence_gate"));
		
	//Concrete Fence
		registry.register(red_concrete_fence.setRegistryName(VanillaThings.MODID, "red_concrete_fence"));
		registry.register(red_concrete_fence_gate.setRegistryName(VanillaThings.MODID, "red_concrete_fence_gate"));
		
		registry.register(blue_concrete_fence.setRegistryName(VanillaThings.MODID, "blue_concrete_fence"));
		registry.register(blue_concrete_fence_gate.setRegistryName(VanillaThings.MODID, "blue_concrete_fence_gate"));
		
		registry.register(white_concrete_fence.setRegistryName(VanillaThings.MODID, "white_concrete_fence"));
		registry.register(white_concrete_fence_gate.setRegistryName(VanillaThings.MODID, "white_concrete_fence_gate"));
		
		registry.register(orange_concrete_fence.setRegistryName(VanillaThings.MODID, "orange_concrete_fence"));
		registry.register(orange_concrete_fence_gate.setRegistryName(VanillaThings.MODID, "orange_concrete_fence_gate"));
		
//Stairs
		registry.register(smooth_stone_stairs.setRegistryName(VanillaThings.MODID, "smooth_stone_stairs"));
		registry.register(glowstone_stairs.setRegistryName(VanillaThings.MODID, "glowstone_stairs"));
		registry.register(red_concrete_stairs.setRegistryName(VanillaThings.MODID, "red_concrete_stairs"));
		registry.register(blue_concrete_stairs.setRegistryName(VanillaThings.MODID, "blue_concrete_stairs"));
		registry.register(white_concrete_stairs.setRegistryName(VanillaThings.MODID, "white_concrete_stairs"));
		registry.register(orange_concrete_stairs.setRegistryName(VanillaThings.MODID, "orange_concrete_stairs"));
		
//Walls
		registry.register(smooth_stone_wall.setRegistryName(VanillaThings.MODID, "smooth_stone_wall"));
		registry.register(glowstone_wall.setRegistryName(VanillaThings.MODID, "glowstone_wall"));
		registry.register(red_concrete_wall.setRegistryName(VanillaThings.MODID, "red_concrete_wall"));
		registry.register(blue_concrete_wall.setRegistryName(VanillaThings.MODID, "blue_concrete_wall"));
		registry.register(white_concrete_wall.setRegistryName(VanillaThings.MODID, "white_concrete_wall"));
		registry.register(orange_concrete_wall.setRegistryName(VanillaThings.MODID, "orange_concrete_wall"));
		
//Slabs
	
	//Normal
		registry.register(glowstone_slab.setRegistryName(VanillaThings.MODID, "glowstone_slab"));
		registry.register(red_concrete_slab.setRegistryName(VanillaThings.MODID, "red_concrete_slab"));
		registry.register(blue_concrete_slab.setRegistryName(VanillaThings.MODID, "blue_concrete_slab"));
		registry.register(white_concrete_slab.setRegistryName(VanillaThings.MODID, "white_concrete_slab"));
		registry.register(orange_concrete_slab.setRegistryName(VanillaThings.MODID, "orange_concrete_slab"));
		
	//Vertical
		registry.register(red_concrete_vertical_slab.setRegistryName(VanillaThings.MODID, "red_concrete_vertical_slab"));
		registry.register(blue_concrete_vertical_slab.setRegistryName(VanillaThings.MODID, "blue_concrete_vertical_slab"));
		registry.register(white_concrete_vertical_slab.setRegistryName(VanillaThings.MODID, "white_concrete_vertical_slab"));
		registry.register(orange_concrete_vertical_slab.setRegistryName(VanillaThings.MODID, "orange_concrete_vertical_slab"));

	}
	
	@SubscribeEvent
	public static void registerBlockItem(Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

//Fences
		registry.register(new ModBlockItem(nether_brick_fence_gate, ModItemGroup.VANILLA_THINGS));

	//Granite Fence
		registry.register(new ModBlockItem(granite_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(granite_fence_gate, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(polished_granite_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(polished_granite_fence_gate, ModItemGroup.VANILLA_THINGS));
		
	//Andesite Fence
		registry.register(new ModBlockItem(andesite_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(andesite_fence_gate, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(polished_andesite_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(polished_andesite_fence_gate, ModItemGroup.VANILLA_THINGS));
		
	//Diorite Fence
		registry.register(new ModBlockItem(diorite_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(diorite_fence_gate, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(polished_diorite_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(polished_diorite_fence_gate, ModItemGroup.VANILLA_THINGS));
	
	//Stone Fence
		registry.register(new ModBlockItem(stone_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(stone_fence_gate, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(smooth_stone_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(smooth_stone_fence_gate, ModItemGroup.VANILLA_THINGS));
		
	//Glowstone Fence
		registry.register(new ModBlockItem(glowstone_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(glowstone_fence_gate, ModItemGroup.VANILLA_THINGS));
		
	//Concrete Fence
		registry.register(new ModBlockItem(red_concrete_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(red_concrete_fence_gate, ModItemGroup.VANILLA_THINGS));
		
		registry.register(new ModBlockItem(blue_concrete_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(blue_concrete_fence_gate, ModItemGroup.VANILLA_THINGS));
		
		registry.register(new ModBlockItem(white_concrete_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(white_concrete_fence_gate, ModItemGroup.VANILLA_THINGS));
		
		registry.register(new ModBlockItem(orange_concrete_fence, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(orange_concrete_fence_gate, ModItemGroup.VANILLA_THINGS));

//Stairs
		registry.register(new ModBlockItem(smooth_stone_stairs, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(glowstone_stairs, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(red_concrete_stairs, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(blue_concrete_stairs, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(white_concrete_stairs, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(orange_concrete_stairs, ModItemGroup.VANILLA_THINGS));
		
//Walls
		registry.register(new ModBlockItem(smooth_stone_wall, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(glowstone_wall, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(red_concrete_wall, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(blue_concrete_wall, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(white_concrete_wall, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(orange_concrete_wall, ModItemGroup.VANILLA_THINGS));
		
//Slabs
		
	//Normal
		registry.register(new ModBlockItem(glowstone_slab, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(red_concrete_slab, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(blue_concrete_slab, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(white_concrete_slab, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(orange_concrete_slab, ModItemGroup.VANILLA_THINGS));
		
	//Vertical
		registry.register(new ModBlockItem(red_concrete_vertical_slab, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(blue_concrete_vertical_slab, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(white_concrete_vertical_slab, ModItemGroup.VANILLA_THINGS));
		registry.register(new ModBlockItem(orange_concrete_vertical_slab, ModItemGroup.VANILLA_THINGS));

}

}
