package ch.saymn.vanillathings.api.block;

import ch.saymn.vanillathings.init.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import ch.saymn.vanillathings.block.ladders.init.BlockCustomLadders;
import net.minecraft.item.Item;
import net.minecraft.util.LazyLoadBase;

import java.util.Locale;

public enum ModLadders {
	
	GLOWSTONE(Blocks.GLOWSTONE),
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
    SPRUCE(Blocks.SPRUCE_PLANKS),
    BIRCH(Blocks.BIRCH_PLANKS),
    JUNGLE(Blocks.JUNGLE_PLANKS),
    ACACIA(Blocks.ACACIA_PLANKS),
    DARK_OAK(Blocks.DARK_OAK_PLANKS),
	STONE(Blocks.STONE),
    SMOOTH_STONE(Blocks.SMOOTH_STONE),
    COBBLESTONE(Blocks.COBBLESTONE),
    MOSSY_COBBLESTONE(Blocks.MOSSY_COBBLESTONE),
    STONE_BRICK(Blocks.STONE_BRICKS),
    MOSSY_STONE_BRICK(Blocks.MOSSY_STONE_BRICKS),
    ANDESITE(Blocks.ANDESITE),
    POLISHED_ANDESITE(Blocks.POLISHED_ANDESITE),
    DIORITE(Blocks.DIORITE),
    POLISHED_DIORITE(Blocks.POLISHED_DIORITE),
    GRANITE(Blocks.GRANITE),
    POLISHED_GRANITE(Blocks.POLISHED_GRANITE),
    SANDSTONE(Blocks.SANDSTONE),
    RED_SANDSTONE(Blocks.RED_SANDSTONE),
    BRICK(Blocks.BRICKS),
    PRISMARINE(Blocks.PRISMARINE),
    PRISMARINE_BRICK(Blocks.PRISMARINE_BRICKS),
    DARK_PRISMARINE(Blocks.DARK_PRISMARINE),
    NETHER_BRICK(Blocks.NETHER_BRICKS),
    RED_NETHER_BRICK(Blocks.RED_NETHER_BRICKS),
    QUARTZ(Blocks.QUARTZ_BLOCK),
    PURPUR(Blocks.PURPUR_BLOCK),
    END_STONE_BRICK(Blocks.END_STONE_BRICKS),
    IRON(Blocks.IRON_BLOCK),
    GOLD(Blocks.GOLD_BLOCK),
    DIAMOND(Blocks.DIAMOND_BLOCK),
    EMERALD(Blocks.EMERALD_BLOCK),
    COAL(Blocks.COAL_BLOCK),
    OBSIDIAN(Blocks.OBSIDIAN),
    LAPIS(Blocks.LAPIS_BLOCK),
    REDSTONE(Blocks.REDSTONE_BLOCK),
    SNOW(Blocks.SNOW),
    BONE(Blocks.BONE_BLOCK)
    ;

    public static final ModLadders[] VALUES = values();

    private final LazyLoadBase<Block> LadderBlock;
    private final LazyLoadBase<Item> Item;

    public final Block baseBlock;

    ModLadders(Block baseBlockIn) {
        this.baseBlock = baseBlockIn;

        LadderBlock = new LazyLoadBase<>(() -> new BlockCustomLadders(Block.Properties.from(getBaseBlock())));
        Item = new LazyLoadBase<>(() -> new Item(new Item.Properties().group(ModItemGroup.VANILLA_THINGS)));
    }

    public Block getLadder() { return LadderBlock.getValue(); }

    public Item getItem() { return Item.getValue(); }

    public String getName() { return name().toLowerCase(Locale.ROOT); }

    public Block getBaseBlock() { return this.baseBlock; }
}