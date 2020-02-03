package ch.saymn.vanillathings.data.provider;

import java.util.function.Consumer;

import ch.saymn.vanillathings.VanillaThings;
import ch.saymn.vanillathings.api.block.*;
import ch.saymn.vanillathings.init.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

public class ModRecipeProvider extends RecipeProvider {

	public ModRecipeProvider(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		ShapedRecipeBuilder.shapedRecipe(ModItems.stone_rod, 4).patternLine("R").patternLine("R").key('R', Blocks.STONE).addCriterion("has_stone", hasItem(Blocks.STONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "stone_rod"));
		
//Stonecutter
	//Red Concrete
	    SingleItemRecipeBuilder.func_218644_a(Ingredient.fromItems(Blocks.RED_CONCRETE), ModSlabs.RED_CONCRETE.getSlab().asItem(), 2).func_218643_a("has_red_concrete", this.hasItem(Blocks.RED_CONCRETE)).func_218645_a(consumer, "red_concrete_slab_from_red_concrete_stonecutting");
	    SingleItemRecipeBuilder.func_218644_a(Ingredient.fromItems(Blocks.RED_CONCRETE), ModVerticalSlabs.RED_CONCRETE.getVerticalSlab().asItem(), 2).func_218643_a("has_red_concrete", this.hasItem(Blocks.RED_CONCRETE)).func_218645_a(consumer, "red_concrete_vertical_slab_from_red_concrete_stonecutting");
	    SingleItemRecipeBuilder.func_218648_a(Ingredient.fromItems(Blocks.RED_CONCRETE), ModStairs.RED_CONCRETE.getStairs().asItem()).func_218643_a("has_red_concrete", this.hasItem(Blocks.RED_CONCRETE)).func_218645_a(consumer, "red_concrete_stairs_from_red_concrete_stonecutting");
	    SingleItemRecipeBuilder.func_218648_a(Ingredient.fromItems(Blocks.RED_CONCRETE), ModWalls.RED_CONCRETE.getWall().asItem()).func_218643_a("has_red_concrete", this.hasItem(Blocks.RED_CONCRETE)).func_218645_a(consumer, "red_concrete_wall_from_red_concrete_stonecutting");
	
	//Blue Concrete
	    SingleItemRecipeBuilder.func_218644_a(Ingredient.fromItems(Blocks.BLUE_CONCRETE), ModSlabs.BLUE_CONCRETE.getSlab().asItem(), 2).func_218643_a("has_blue_concrete", this.hasItem(Blocks.BLUE_CONCRETE)).func_218645_a(consumer, "blue_concrete_slab_from_blue_concrete_stonecutting");
	    SingleItemRecipeBuilder.func_218644_a(Ingredient.fromItems(Blocks.BLUE_CONCRETE), ModVerticalSlabs.BLUE_CONCRETE.getVerticalSlab().asItem(), 2).func_218643_a("has_blue_concrete", this.hasItem(Blocks.BLUE_CONCRETE)).func_218645_a(consumer, "blue_concrete_vertical_slab_from_blue_concrete_stonecutting");
	    SingleItemRecipeBuilder.func_218648_a(Ingredient.fromItems(Blocks.BLUE_CONCRETE), ModStairs.BLUE_CONCRETE.getStairs().asItem()).func_218643_a("has_blue_concrete", this.hasItem(Blocks.BLUE_CONCRETE)).func_218645_a(consumer, "blue_concrete_stairs_from_blue_concrete_stonecutting");
	    SingleItemRecipeBuilder.func_218648_a(Ingredient.fromItems(Blocks.BLUE_CONCRETE), ModWalls.BLUE_CONCRETE.getWall().asItem()).func_218643_a("has_blue_concrete", this.hasItem(Blocks.BLUE_CONCRETE)).func_218645_a(consumer, "blue_concrete_wall_from_blue_concrete_stonecutting");
	      
	//White Concrete
	    SingleItemRecipeBuilder.func_218644_a(Ingredient.fromItems(Blocks.WHITE_CONCRETE), ModSlabs.WHITE_CONCRETE.getSlab().asItem(), 2).func_218643_a("has_white_concrete", this.hasItem(Blocks.WHITE_CONCRETE)).func_218645_a(consumer, "white_concrete_slab_from_white_concrete_stonecutting");
	    SingleItemRecipeBuilder.func_218644_a(Ingredient.fromItems(Blocks.WHITE_CONCRETE), ModVerticalSlabs.WHITE_CONCRETE.getVerticalSlab().asItem(), 2).func_218643_a("has_white_concrete", this.hasItem(Blocks.WHITE_CONCRETE)).func_218645_a(consumer, "white_concrete_vertical_slab_from_white_concrete_stonecutting");
	    SingleItemRecipeBuilder.func_218648_a(Ingredient.fromItems(Blocks.WHITE_CONCRETE), ModStairs.WHITE_CONCRETE.getStairs().asItem()).func_218643_a("has_white_concrete", this.hasItem(Blocks.WHITE_CONCRETE)).func_218645_a(consumer, "white_concrete_stairs_from_white_concrete_stonecutting");
	    SingleItemRecipeBuilder.func_218648_a(Ingredient.fromItems(Blocks.WHITE_CONCRETE), ModWalls.WHITE_CONCRETE.getWall().asItem()).func_218643_a("has_white_concrete", this.hasItem(Blocks.WHITE_CONCRETE)).func_218645_a(consumer, "white_concrete_wall_from_white_concrete_stonecutting");
	    
	//Orange Concrete
	    SingleItemRecipeBuilder.func_218644_a(Ingredient.fromItems(Blocks.ORANGE_CONCRETE), ModSlabs.ORANGE_CONCRETE.getSlab().asItem(), 2).func_218643_a("has_orange_concrete", this.hasItem(Blocks.ORANGE_CONCRETE)).func_218645_a(consumer, "orange_concrete_slab_from_orange_concrete_stonecutting");
		SingleItemRecipeBuilder.func_218644_a(Ingredient.fromItems(Blocks.ORANGE_CONCRETE), ModVerticalSlabs.ORANGE_CONCRETE.getVerticalSlab().asItem(), 2).func_218643_a("has_orange_concrete", this.hasItem(Blocks.ORANGE_CONCRETE)).func_218645_a(consumer, "orange_concrete_vertical_slab_from_orange_concrete_stonecutting");
		SingleItemRecipeBuilder.func_218648_a(Ingredient.fromItems(Blocks.ORANGE_CONCRETE), ModStairs.ORANGE_CONCRETE.getStairs().asItem()).func_218643_a("has_orange_concrete", this.hasItem(Blocks.ORANGE_CONCRETE)).func_218645_a(consumer, "orange_concrete_stairs_from_orange_concrete_stonecutting");
		SingleItemRecipeBuilder.func_218648_a(Ingredient.fromItems(Blocks.ORANGE_CONCRETE), ModWalls.ORANGE_CONCRETE.getWall().asItem()).func_218643_a("has_orange_concrete", this.hasItem(Blocks.ORANGE_CONCRETE)).func_218645_a(consumer, "orange_concrete_wall_from_orange_concrete_stonecutting");
		    
	//Green Concrete
		SingleItemRecipeBuilder.func_218644_a(Ingredient.fromItems(Blocks.ORANGE_CONCRETE), ModSlabs.GREEN_CONCRETE.getSlab().asItem(), 2).func_218643_a("has_green_concrete", this.hasItem(Blocks.GREEN_CONCRETE)).func_218645_a(consumer, "green_concrete_slab_from_orange_concrete_stonecutting");
		SingleItemRecipeBuilder.func_218644_a(Ingredient.fromItems(Blocks.ORANGE_CONCRETE), ModVerticalSlabs.GREEN_CONCRETE.getVerticalSlab().asItem(), 2).func_218643_a("has_green_concrete", this.hasItem(Blocks.GREEN_CONCRETE)).func_218645_a(consumer, "green_concrete_vertical_slab_from_orange_concrete_stonecutting");
		SingleItemRecipeBuilder.func_218648_a(Ingredient.fromItems(Blocks.ORANGE_CONCRETE), ModStairs.GREEN_CONCRETE.getStairs().asItem()).func_218643_a("has_green_concrete", this.hasItem(Blocks.GREEN_CONCRETE)).func_218645_a(consumer, "green_concrete_stairs_from_orange_concrete_stonecutting");
		SingleItemRecipeBuilder.func_218648_a(Ingredient.fromItems(Blocks.ORANGE_CONCRETE), ModWalls.GREEN_CONCRETE.getWall().asItem()).func_218643_a("has_green_concrete", this.hasItem(Blocks.GREEN_CONCRETE)).func_218645_a(consumer, "green_concrete_wall_from_orange_concrete_stonecutting");

		
		
//Fences
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.NETHER_BRICKS.getFenceGate().asItem(), 1).patternLine("NSN").patternLine("NSN").key('N', Blocks.NETHER_BRICKS).key('S', Items.NETHER_BRICK).addCriterion("has_nether_brick", hasItem(Items.NETHER_BRICK)).build(consumer, new ResourceLocation(VanillaThings.MODID, "nether_brick_fence_gate"));
		
		ShapedRecipeBuilder.shapedRecipe(ModFence.GRANITE.getFence().asItem(), 3).patternLine("GSG").patternLine("GSG").key('G', Blocks.GRANITE).key('S', ModItems.stone_rod).addCriterion("has_granite", hasItem(Blocks.GRANITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "granite_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.GRANITE.getFenceGate().asItem(), 1).patternLine("SGS").patternLine("SGS").key('G', Blocks.GRANITE).key('S', ModItems.stone_rod).addCriterion("has_granite", hasItem(Blocks.GRANITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "granite_fence_gate"));
		ShapedRecipeBuilder.shapedRecipe(ModFence.POLISHED_GRANITE.getFence().asItem(), 3).patternLine("GSG").patternLine("GSG").key('G', Blocks.POLISHED_GRANITE).key('S', ModItems.stone_rod).addCriterion("has_polished_granite", hasItem(Blocks.POLISHED_GRANITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "polished_granite_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.POLISHED_GRANITE.getFenceGate().asItem(), 1).patternLine("SGS").patternLine("SGS").key('G', Blocks.POLISHED_GRANITE).key('S', ModItems.stone_rod).addCriterion("has_polished_granite", hasItem(Blocks.POLISHED_GRANITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "polished_granite_fence_gate"));
		
		ShapedRecipeBuilder.shapedRecipe(ModFence.ANDESITE.getFence().asItem(), 3).patternLine("ASA").patternLine("ASA").key('A', Blocks.ANDESITE).key('S', ModItems.stone_rod).addCriterion("has_andesite", hasItem(Blocks.ANDESITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "andesite_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.ANDESITE.getFenceGate().asItem(), 1).patternLine("SAS").patternLine("SAS").key('A', Blocks.ANDESITE).key('S', ModItems.stone_rod).addCriterion("has_andesite", hasItem(Blocks.ANDESITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "andesite_fence_gate"));
		ShapedRecipeBuilder.shapedRecipe(ModFence.POLISHED_ANDESITE.getFence().asItem(), 3).patternLine("ASA").patternLine("ASA").key('A', Blocks.POLISHED_ANDESITE).key('S', ModItems.stone_rod).addCriterion("has_polished_andesite", hasItem(Blocks.POLISHED_ANDESITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "polished_andesite_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.POLISHED_ANDESITE.getFenceGate().asItem(), 1).patternLine("SAS").patternLine("SAS").key('A', Blocks.POLISHED_ANDESITE).key('S', ModItems.stone_rod).addCriterion("has_polished_andesite", hasItem(Blocks.POLISHED_ANDESITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "polished_andesite_fence_gate"));
		
		ShapedRecipeBuilder.shapedRecipe(ModFence.DIORITE.getFence().asItem(), 3).patternLine("DSD").patternLine("DSD").key('D', Blocks.DIORITE).key('S', ModItems.stone_rod).addCriterion("has_diorite", hasItem(Blocks.DIORITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "diorite_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.DIORITE.getFenceGate().asItem(), 1).patternLine("SDS").patternLine("SDS").key('D', Blocks.DIORITE).key('S', ModItems.stone_rod).addCriterion("has_diorite", hasItem(Blocks.DIORITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "diorite_fence_gate"));
		ShapedRecipeBuilder.shapedRecipe(ModFence.POLISHED_DIORITE.getFence().asItem(), 3).patternLine("DSD").patternLine("DSD").key('D', Blocks.POLISHED_DIORITE).key('S', ModItems.stone_rod).addCriterion("has_polished_diorite", hasItem(Blocks.POLISHED_DIORITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "polished_diorite_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.POLISHED_DIORITE.getFenceGate().asItem(), 1).patternLine("SDS").patternLine("SDS").key('D', Blocks.POLISHED_DIORITE).key('S', ModItems.stone_rod).addCriterion("has_polished_diorite", hasItem(Blocks.POLISHED_DIORITE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "polished_diorite_fence_gate"));

		ShapedRecipeBuilder.shapedRecipe(ModFence.STONE.getFence().asItem(), 3).patternLine("DSD").patternLine("DSD").key('D', Blocks.STONE).key('S', ModItems.stone_rod).addCriterion("has_stone", hasItem(Blocks.STONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "stone_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.STONE.getFenceGate().asItem(), 1).patternLine("SDS").patternLine("SDS").key('D', Blocks.STONE).key('S', ModItems.stone_rod).addCriterion("has_stone", hasItem(Blocks.STONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "stone_fence_gate"));
		ShapedRecipeBuilder.shapedRecipe(ModFence.SMOOTH_STONE.getFence().asItem(), 3).patternLine("DSD").patternLine("DSD").key('D', Blocks.SMOOTH_STONE).key('S', ModItems.stone_rod).addCriterion("has_smooth_stone", hasItem(Blocks.SMOOTH_STONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "smooth_stone_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.SMOOTH_STONE.getFenceGate().asItem(), 1).patternLine("SDS").patternLine("SDS").key('D', Blocks.SMOOTH_STONE).key('S', ModItems.stone_rod).addCriterion("has_smooth_stone", hasItem(Blocks.SMOOTH_STONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "smooth_stone_fence_gate"));
		
		ShapedRecipeBuilder.shapedRecipe(ModFence.GLOWSTONE.getFence().asItem(), 3).patternLine("GSG").patternLine("GSG").key('G', Blocks.GLOWSTONE).key('S', ModItems.stone_rod).addCriterion("has_glowstone", hasItem(Blocks.GLOWSTONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "glowstone_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.GLOWSTONE.getFenceGate().asItem(), 1).patternLine("SGS").patternLine("SGS").key('G', Blocks.GLOWSTONE).key('S', ModItems.stone_rod).addCriterion("has_glowstone", hasItem(Blocks.GLOWSTONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "glowstone_fence_gate"));
		
	//Concrete Fences
		ShapedRecipeBuilder.shapedRecipe(ModFence.RED_CONCRETE.getFence().asItem(), 3).patternLine("CSC").patternLine("CSC").key('C', Blocks.RED_CONCRETE).key('S', ModItems.stone_rod).addCriterion("has_red_concrete", hasItem(Blocks.RED_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "red_concrete_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.RED_CONCRETE.getFenceGate().asItem(), 1).patternLine("SCS").patternLine("SCS").key('C', Blocks.RED_CONCRETE).key('S', ModItems.stone_rod).addCriterion("has_red_concrete", hasItem(Blocks.RED_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "red_concrete_fence_gate"));
		
		ShapedRecipeBuilder.shapedRecipe(ModFence.BLUE_CONCRETE.getFence().asItem(), 3).patternLine("CSC").patternLine("CSC").key('C', Blocks.BLUE_CONCRETE).key('S', ModItems.stone_rod).addCriterion("has_blue_concrete", hasItem(Blocks.BLUE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "blue_concrete_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.BLUE_CONCRETE.getFenceGate().asItem(), 1).patternLine("SCS").patternLine("SCS").key('C', Blocks.BLUE_CONCRETE).key('S', ModItems.stone_rod).addCriterion("has_blue_concrete", hasItem(Blocks.BLUE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "blue_concrete_fence_gate"));
		
		ShapedRecipeBuilder.shapedRecipe(ModFence.WHITE_CONCRETE.getFence().asItem(), 3).patternLine("CSC").patternLine("CSC").key('C', Blocks.WHITE_CONCRETE).key('S', ModItems.stone_rod).addCriterion("has_white_concrete", hasItem(Blocks.WHITE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "white_concrete_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.WHITE_CONCRETE.getFenceGate().asItem(), 1).patternLine("SCS").patternLine("SCS").key('C', Blocks.WHITE_CONCRETE).key('S', ModItems.stone_rod).addCriterion("has_white_concrete", hasItem(Blocks.WHITE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "white_concrete_fence_gate"));
		
		ShapedRecipeBuilder.shapedRecipe(ModFence.ORANGE_CONCRETE.getFence().asItem(), 3).patternLine("CSC").patternLine("CSC").key('C', Blocks.ORANGE_CONCRETE).key('S', ModItems.stone_rod).addCriterion("has_orange_concrete", hasItem(Blocks.ORANGE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "orange_concrete_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.ORANGE_CONCRETE.getFenceGate().asItem(), 1).patternLine("SCS").patternLine("SCS").key('C', Blocks.ORANGE_CONCRETE).key('S', ModItems.stone_rod).addCriterion("has_orange_concrete", hasItem(Blocks.ORANGE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "orange_concrete_fence_gate"));
		
		ShapedRecipeBuilder.shapedRecipe(ModFence.GREEN_CONCRETE.getFence().asItem(), 3).patternLine("CSC").patternLine("CSC").key('C', Blocks.GREEN_CONCRETE).key('S', ModItems.stone_rod).addCriterion("has_green_concrete", hasItem(Blocks.GREEN_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "green_concrete_fence"));
		ShapedRecipeBuilder.shapedRecipe(ModFenceGate.GREEN_CONCRETE.getFenceGate().asItem(), 1).patternLine("SCS").patternLine("SCS").key('C', Blocks.GREEN_CONCRETE).key('S', ModItems.stone_rod).addCriterion("has_green_concrete", hasItem(Blocks.GREEN_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "green_concrete_fence_gate"));
		
		
//Blocks
		ShapedRecipeBuilder.shapedRecipe(Blocks.GLOWSTONE, 1).patternLine("G").patternLine("G").key('G', ModSlabs.GLOWSTONE.getSlab().asItem()).addCriterion("has_glowstone_slab", hasItem(ModSlabs.GLOWSTONE.getSlab().asItem())).build(consumer, new ResourceLocation(VanillaThings.MODID, "glowstone_slab_to_block"));
		
		ShapedRecipeBuilder.shapedRecipe(Blocks.RED_CONCRETE, 1).patternLine("C").patternLine("C").key('C', ModSlabs.RED_CONCRETE.getSlab().asItem()).addCriterion("has_red_concrete_slab", hasItem(ModSlabs.RED_CONCRETE.getSlab().asItem())).build(consumer, new ResourceLocation(VanillaThings.MODID, "red_concrete_slab_to_block"));
		ShapedRecipeBuilder.shapedRecipe(Blocks.BLUE_CONCRETE, 1).patternLine("C").patternLine("C").key('C', ModSlabs.BLUE_CONCRETE.getSlab().asItem()).addCriterion("has_blue_concrete_slab", hasItem(ModSlabs.BLUE_CONCRETE.getSlab().asItem())).build(consumer, new ResourceLocation(VanillaThings.MODID, "blue_concrete_slab_to_block"));
		ShapedRecipeBuilder.shapedRecipe(Blocks.WHITE_CONCRETE, 1).patternLine("C").patternLine("C").key('C', ModSlabs.WHITE_CONCRETE.getSlab().asItem()).addCriterion("has_white_concrete_slab", hasItem(ModSlabs.WHITE_CONCRETE.getSlab().asItem())).build(consumer, new ResourceLocation(VanillaThings.MODID, "white_concrete_slab_to_block"));
		ShapedRecipeBuilder.shapedRecipe(Blocks.ORANGE_CONCRETE, 1).patternLine("C").patternLine("C").key('C', ModSlabs.ORANGE_CONCRETE.getSlab().asItem()).addCriterion("has_orange_concrete_slab", hasItem(ModSlabs.ORANGE_CONCRETE.getSlab().asItem())).build(consumer, new ResourceLocation(VanillaThings.MODID, "orange_concrete_slab_to_block"));
		ShapedRecipeBuilder.shapedRecipe(Blocks.GREEN_CONCRETE, 1).patternLine("C").patternLine("C").key('C', ModSlabs.GREEN_CONCRETE.getSlab().asItem()).addCriterion("has_green_concrete_slab", hasItem(ModSlabs.GREEN_CONCRETE.getSlab().asItem())).build(consumer, new ResourceLocation(VanillaThings.MODID, "orange_green_slab_to_block"));
		
		
//Stairs
		ShapedRecipeBuilder.shapedRecipe(ModStairs.SMOOTH_STONE.getStairs().asItem(), 4).patternLine("D  ").patternLine("DD ").patternLine("DDD").key('D', Blocks.SMOOTH_STONE).addCriterion("has_smooth_stone", hasItem(Blocks.SMOOTH_STONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "smooth_stone_stairs"));
		ShapedRecipeBuilder.shapedRecipe(ModStairs.GLOWSTONE.getStairs().asItem(), 4).patternLine("G  ").patternLine("GG ").patternLine("GGG").key('G', Blocks.GLOWSTONE).addCriterion("has_glowstone", hasItem(Blocks.GLOWSTONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "glowstone_stairs"));
		
		ShapedRecipeBuilder.shapedRecipe(ModStairs.RED_CONCRETE.getStairs().asItem(), 4).patternLine("C  ").patternLine("CC ").patternLine("CCC").key('C', Blocks.RED_CONCRETE).addCriterion("has_red_concrete", hasItem(Blocks.RED_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "red_concrete_stairs"));
		ShapedRecipeBuilder.shapedRecipe(ModStairs.BLUE_CONCRETE.getStairs().asItem(), 4).patternLine("C  ").patternLine("CC ").patternLine("CCC").key('C', Blocks.BLUE_CONCRETE).addCriterion("has_blue_concrete", hasItem(Blocks.BLUE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "blue_concrete_stairs"));
		ShapedRecipeBuilder.shapedRecipe(ModStairs.WHITE_CONCRETE.getStairs().asItem(), 4).patternLine("C  ").patternLine("CC ").patternLine("CCC").key('C', Blocks.WHITE_CONCRETE).addCriterion("has_white_concrete", hasItem(Blocks.WHITE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "white_concrete_stairs"));
		ShapedRecipeBuilder.shapedRecipe(ModStairs.ORANGE_CONCRETE.getStairs().asItem(), 4).patternLine("C  ").patternLine("CC ").patternLine("CCC").key('C', Blocks.ORANGE_CONCRETE).addCriterion("has_orange_concrete", hasItem(Blocks.ORANGE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "orange_concrete_stairs"));
		ShapedRecipeBuilder.shapedRecipe(ModStairs.GREEN_CONCRETE.getStairs().asItem(), 4).patternLine("C  ").patternLine("CC ").patternLine("CCC").key('C', Blocks.GREEN_CONCRETE).addCriterion("has_green_concrete", hasItem(Blocks.GREEN_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "green_concrete_stairs"));
		
		
//Walls
		ShapedRecipeBuilder.shapedRecipe(ModWalls.SMOOTH_STONE.getWall().asItem(), 6).patternLine("DDD").patternLine("DDD").key('D', Blocks.SMOOTH_STONE).addCriterion("has_smooth_stone", hasItem(Blocks.SMOOTH_STONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "smooth_stone_wall"));
		ShapedRecipeBuilder.shapedRecipe(ModWalls.GLOWSTONE.getWall().asItem(), 6).patternLine("GGG").patternLine("GGG").key('G', Blocks.GLOWSTONE).addCriterion("has_glowstone", hasItem(Blocks.GLOWSTONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "glowstone_wall"));
		
		ShapedRecipeBuilder.shapedRecipe(ModWalls.RED_CONCRETE.getWall().asItem(), 6).patternLine("CCC").patternLine("CCC").key('C', Blocks.RED_CONCRETE).addCriterion("has_red_concrete", hasItem(Blocks.RED_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "red_concrete_wall"));
		ShapedRecipeBuilder.shapedRecipe(ModWalls.BLUE_CONCRETE.getWall().asItem(), 6).patternLine("CCC").patternLine("CCC").key('C', Blocks.BLUE_CONCRETE).addCriterion("has_blue_concrete", hasItem(Blocks.BLUE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "blue_concrete_wall"));
		ShapedRecipeBuilder.shapedRecipe(ModWalls.WHITE_CONCRETE.getWall().asItem(), 6).patternLine("CCC").patternLine("CCC").key('C', Blocks.WHITE_CONCRETE).addCriterion("has_white_concrete", hasItem(Blocks.WHITE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "white_concrete_wall"));
		ShapedRecipeBuilder.shapedRecipe(ModWalls.ORANGE_CONCRETE.getWall().asItem(), 6).patternLine("CCC").patternLine("CCC").key('C', Blocks.WHITE_CONCRETE).addCriterion("has_orange_concrete", hasItem(Blocks.ORANGE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "orange_concrete_wall"));
		ShapedRecipeBuilder.shapedRecipe(ModWalls.GREEN_CONCRETE.getWall().asItem(), 6).patternLine("CCC").patternLine("CCC").key('C', Blocks.GREEN_CONCRETE).addCriterion("has_green_concrete", hasItem(Blocks.GREEN_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "green_concrete_wall"));
		
		
//Slabs
		
	//Normal
		ShapedRecipeBuilder.shapedRecipe(ModSlabs.GLOWSTONE.getSlab().asItem(), 6).patternLine("GGG").key('G', Blocks.GLOWSTONE).addCriterion("has_glowstone", hasItem(Blocks.GLOWSTONE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "glowstone_slab"));
		
		ShapedRecipeBuilder.shapedRecipe(ModSlabs.RED_CONCRETE.getSlab().asItem(), 6).patternLine("CCC").key('C', Blocks.RED_CONCRETE).addCriterion("has_red_concrete", hasItem(Blocks.RED_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "red_concrete_slab"));
		ShapedRecipeBuilder.shapedRecipe(ModSlabs.BLUE_CONCRETE.getSlab().asItem(), 6).patternLine("CCC").key('C', Blocks.BLUE_CONCRETE).addCriterion("has_blue_concrete", hasItem(Blocks.BLUE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "blue_concrete_slab"));
		ShapedRecipeBuilder.shapedRecipe(ModSlabs.WHITE_CONCRETE.getSlab().asItem(), 6).patternLine("CCC").key('C', Blocks.WHITE_CONCRETE).addCriterion("has_white_concrete", hasItem(Blocks.WHITE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "white_concrete_slab"));
		ShapedRecipeBuilder.shapedRecipe(ModSlabs.ORANGE_CONCRETE.getSlab().asItem(), 6).patternLine("CCC").key('C', Blocks.WHITE_CONCRETE).addCriterion("has_orange_concrete", hasItem(Blocks.ORANGE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "orange_concrete_slab"));
		ShapedRecipeBuilder.shapedRecipe(ModSlabs.GREEN_CONCRETE.getSlab().asItem(), 6).patternLine("CCC").key('C', Blocks.GREEN_CONCRETE).addCriterion("has_green_concrete", hasItem(Blocks.GREEN_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "green_concrete_slab"));
		
		
	//Vertical
		ShapedRecipeBuilder.shapedRecipe(ModVerticalSlabs.RED_CONCRETE.getVerticalSlab().asItem(), 6).patternLine("C").patternLine("C").patternLine("C").key('C', Blocks.RED_CONCRETE).addCriterion("has_red_concrete", hasItem(Blocks.RED_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "red_concrete_vertical_slab"));
		ShapedRecipeBuilder.shapedRecipe(ModVerticalSlabs.BLUE_CONCRETE.getVerticalSlab().asItem(), 6).patternLine("C").patternLine("C").patternLine("C").key('C', Blocks.BLUE_CONCRETE).addCriterion("has_blue_concrete", hasItem(Blocks.BLUE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "blue_concrete_vertical_slab"));
		ShapedRecipeBuilder.shapedRecipe(ModVerticalSlabs.WHITE_CONCRETE.getVerticalSlab().asItem(), 6).patternLine("C").patternLine("C").patternLine("C").key('C', Blocks.WHITE_CONCRETE).addCriterion("has_white_concrete", hasItem(Blocks.WHITE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "white_concrete_vertical_slab"));
		ShapedRecipeBuilder.shapedRecipe(ModVerticalSlabs.ORANGE_CONCRETE.getVerticalSlab().asItem(), 6).patternLine("C").patternLine("C").patternLine("C").key('C', Blocks.WHITE_CONCRETE).addCriterion("has_orange_concrete", hasItem(Blocks.ORANGE_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "orange_concrete_vertical_slab"));
		ShapedRecipeBuilder.shapedRecipe(ModVerticalSlabs.GREEN_CONCRETE.getVerticalSlab().asItem(), 6).patternLine("C").patternLine("C").patternLine("C").key('C', Blocks.GREEN_CONCRETE).addCriterion("has_green_concrete", hasItem(Blocks.GREEN_CONCRETE)).build(consumer, new ResourceLocation(VanillaThings.MODID, "green_concrete_vertical_slab"));
		
		}
}
