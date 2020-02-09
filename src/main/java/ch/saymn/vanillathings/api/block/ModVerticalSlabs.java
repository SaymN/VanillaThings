package ch.saymn.vanillathings.api.block;

import java.util.Locale;

import ch.saymn.vanillathings.block.slabs.vertical.init.VerticalSlabBlock;
import ch.saymn.vanillathings.init.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.LazyLoadBase;

public enum ModVerticalSlabs {
    
GLOWSTONE(Blocks.GLOWSTONE),
	
    WHITE_CONCRETE(Blocks.WHITE_CONCRETE),
    RED_CONCRETE(Blocks.RED_CONCRETE),
    ORANGE_CONCRETE(Blocks.ORANGE_CONCRETE),
    BLUE_CONCRETE(Blocks.BLUE_CONCRETE),
    GREEN_CONCRETE(Blocks.GREEN_CONCRETE),
    BROWN_CONCRETE(Blocks.BROWN_CONCRETE),
    PURPLE_CONCRETE(Blocks.PURPLE_CONCRETE),
    CYAN_CONCRETE(Blocks.CYAN_CONCRETE),
    LIGHT_GRAY_CONCRETE(Blocks.LIGHT_GRAY_CONCRETE),
    GRAY_CONCRETE(Blocks.GRAY_CONCRETE),
    PINK_CONCRETE(Blocks.PINK_CONCRETE),
    LIME_CONCRETE(Blocks.LIME_CONCRETE),
    YELLOW_CONCRETE(Blocks.YELLOW_CONCRETE),
    LIGHT_BLUE_CONCRETE(Blocks.LIGHT_BLUE_CONCRETE),
    MAGENTA_CONCRETE(Blocks.MAGENTA_CONCRETE),
    BLACK_CONCRETE(Blocks.BLACK_CONCRETE),
    
    WHITE_WOOL(Blocks.WHITE_WOOL),
    RED_WOOL(Blocks.RED_WOOL),
    ORANGE_WOOL(Blocks.ORANGE_WOOL),
    BLUE_WOOL(Blocks.BLUE_WOOL),
    GREEN_WOOL(Blocks.GREEN_WOOL),
    BROWN_WOOL(Blocks.BROWN_WOOL),
    PURPLE_WOOL(Blocks.PURPLE_WOOL),
    CYAN_WOOL(Blocks.CYAN_WOOL),
    LIGHT_GRAY_WOOL(Blocks.LIGHT_GRAY_WOOL),
    GRAY_WOOL(Blocks.GRAY_WOOL),
    PINK_WOOL(Blocks.PINK_WOOL),
    LIME_WOOL(Blocks.LIME_WOOL),
    YELLOW_WOOL(Blocks.YELLOW_WOOL),
    LIGHT_BLUE_WOOL(Blocks.LIGHT_BLUE_WOOL),
    MAGENTA_WOOL(Blocks.MAGENTA_WOOL),
    BLACK_WOOL(Blocks.BLACK_WOOL),
    
    OAK(Blocks.OAK_SLAB),
    SPRUCE(Blocks.SPRUCE_SLAB),
    BIRCH(Blocks.BIRCH_SLAB),
    JUNGLE(Blocks.JUNGLE_SLAB),
    ACACIA(Blocks.ACACIA_SLAB),
    DARK_OAK(Blocks.DARK_OAK_SLAB),
	STONE(Blocks.STONE_SLAB),
	
    SMOOTH_STONE(Blocks.SMOOTH_STONE_SLAB),
    COBBLESTONE(Blocks.COBBLESTONE_SLAB),
	MOSSY_COBBLESTONE(Blocks.MOSSY_COBBLESTONE_SLAB),
    STONE_BRICK(Blocks.STONE_BRICK_SLAB),
    MOSSY_STONE_BRICK(Blocks.MOSSY_STONE_BRICK_SLAB),
    ANDESITE(Blocks.ANDESITE_SLAB),
	POLISHED_ANDESITE(Blocks.POLISHED_ANDESITE_SLAB),
    DIORITE(Blocks.DIORITE_SLAB),
    POLISHED_DIORITE(Blocks.POLISHED_DIORITE_SLAB),
    GRANITE(Blocks.GRANITE_SLAB),
    POLISHED_GRANITE(Blocks.POLISHED_GRANITE_SLAB),
    SANDSTONE(Blocks.SANDSTONE_SLAB),
    CUT_SANDSTONE(Blocks.CUT_SANDSTONE_SLAB),
    SMOOTH_SANDSTONE(Blocks.SMOOTH_SANDSTONE_SLAB),
    RED_SANDSTONE(Blocks.RED_SANDSTONE_SLAB),
    CUT_RED_SANDSTONE(Blocks.CUT_RED_SANDSTONE_SLAB),
    SMOOTH_RED_SANDSTONE(Blocks.SMOOTH_RED_SANDSTONE_SLAB),
    BRICK(Blocks.BRICK_SLAB),
    PRISMARINE(Blocks.PRISMARINE_SLAB),
    PRISMARINE_BRICK(Blocks.PRISMARINE_BRICK_SLAB),
    DARK_PRISMARINE(Blocks.DARK_PRISMARINE_SLAB),
    NETHER_BRICK(Blocks.NETHER_BRICK_SLAB),
    RED_NETHER_BRICK(Blocks.RED_NETHER_BRICK_SLAB),
    QUARTZ(Blocks.QUARTZ_SLAB),
    SMOOTH_QUARTZ(Blocks.SMOOTH_QUARTZ_SLAB),
    PURPUR(Blocks.PURPUR_SLAB),
    END_STONE_BRICK(Blocks.END_STONE_BRICK_SLAB),
    
    IRON(Blocks.IRON_BLOCK),
    GOLD(Blocks.GOLD_BLOCK),
    DIAMOND(Blocks.DIAMOND_BLOCK),
    EMERALD(Blocks.EMERALD_BLOCK),
    COAL(Blocks.COAL_BLOCK),
    OBSIDIAN(Blocks.OBSIDIAN),
    LAPIS(Blocks.LAPIS_BLOCK),
    REDSTONE(Blocks.REDSTONE_BLOCK),
    SNOW(Blocks.SNOW),
    BONE(Blocks.BONE_BLOCK),
    
    GLASS(Blocks.GLASS),
    WHITE_STAINED_GLASS(Blocks.WHITE_STAINED_GLASS),
    ORANGE_STAINED_GLASS(Blocks.ORANGE_STAINED_GLASS),
    MAGENTA_STAINED_GLASS(Blocks.MAGENTA_STAINED_GLASS),
    LIGHT_BLUE_STAINED_GLASS(Blocks.LIGHT_BLUE_STAINED_GLASS),
    YELLOW_STAINED_GLASS(Blocks.YELLOW_STAINED_GLASS),
    LIME_STAINED_GLASS(Blocks.LIME_STAINED_GLASS),
    PINK_STAINED_GLASS(Blocks.PINK_STAINED_GLASS),
    GRAY_STAINED_GLASS(Blocks.GRAY_STAINED_GLASS),
    LIGHT_GRAY_STAINED_GLASS(Blocks.LIGHT_GRAY_STAINED_GLASS),
    CYAN_STAINED_GLASS(Blocks.CYAN_STAINED_GLASS),
    PURPLE_STAINED_GLASS(Blocks.PURPLE_STAINED_GLASS),
    BLUE_STAINED_GLASS(Blocks.BLUE_STAINED_GLASS),
    BROWN_STAINED_GLASS(Blocks.BROWN_STAINED_GLASS),
    GREEN_STAINED_GLASS(Blocks.GREEN_STAINED_GLASS),
    RED_STAINED_GLASS(Blocks.RED_STAINED_GLASS),
    BLACK_STAINED_GLASS(Blocks.BLACK_STAINED_GLASS)
    ;

    public static final ModVerticalSlabs[] VALUES = values();

    private final LazyLoadBase<Block> VerticalSlab;
    private final LazyLoadBase<Item> Item;

    public final Block baseBlock;

    ModVerticalSlabs(Block baseBlockIn) {
        this.baseBlock = baseBlockIn;

        VerticalSlab = new LazyLoadBase<>(() -> new VerticalSlabBlock(Block.Properties.from(getBaseBlock())));
        Item = new LazyLoadBase<>(() -> new Item(new Item.Properties().group(ModItemGroup.VANILLA_THINGS)));
    }

    public Block getVerticalSlab() { return VerticalSlab.getValue(); }

    public Item getItem() { return Item.getValue(); }

    public String getName() { return name().toLowerCase(Locale.ROOT); }

    public Block getBaseBlock() { return this.baseBlock; }
    
}