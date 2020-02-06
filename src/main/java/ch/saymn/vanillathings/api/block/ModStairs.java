package ch.saymn.vanillathings.api.block;

import ch.saymn.vanillathings.block.stairs.init.BlockCustomStairs;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.LazyValue;

import java.util.Locale;

import ch.saymn.vanillathings.init.ModItemGroup;

public enum ModStairs {

    GLOWSTONE(Blocks.GLOWSTONE),
    SMOOTH_STONE(Blocks.SMOOTH_STONE),
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
    
    IRON(Blocks.IRON_BLOCK),
    GOLD(Blocks.GOLD_BLOCK),
    DIAMOND(Blocks.DIAMOND_BLOCK),
    LAPIS(Blocks.LAPIS_BLOCK),
    REDSTONE(Blocks.REDSTONE_BLOCK),
    SNOW(Blocks.SNOW)
    ;

    public static final ModStairs[] VALUES = values();

    private final LazyValue<Block> Stairs;
    private final LazyValue<Item> Item;

    public final Block baseBlock;

    ModStairs(Block baseBlockIn) {
        this.baseBlock = baseBlockIn;

        Stairs = new LazyValue<>(() -> new BlockCustomStairs(getBaseBlock().getDefaultState(), Block.Properties.from(getBaseBlock())));
        Item = new LazyValue<>(() -> new Item(new Item.Properties().group(ModItemGroup.VANILLA_THINGS)));
    }
    public Block getStairs() { return Stairs.getValue(); }

    public Item getItem() { return Item.getValue(); }

    public String getName() { return name().toLowerCase(Locale.ROOT); }

    public Block getBaseBlock() { return this.baseBlock; }

}