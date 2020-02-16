package ch.saymn.vanillathings.api.block;

import java.util.Locale;

import ch.saymn.vanillathings.block.init.BlockCustomWallLamp;
import ch.saymn.vanillathings.init.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.LazyValue;

public enum ModWallLamps {

    OAK(Blocks.OAK_PLANKS),
    BIRCH(Blocks.BIRCH_PLANKS),
    SPRUCE(Blocks.SPRUCE_PLANKS),
    JUNGLE(Blocks.JUNGLE_PLANKS),
    ACACIA(Blocks.ACACIA_PLANKS),
    DARK_OAK(Blocks.DARK_OAK_PLANKS),
    IRON(Blocks.IRON_BLOCK),
    GOLD(Blocks.GOLD_BLOCK),
    DIAMOND(Blocks.DIAMOND_BLOCK),
    EMERALD(Blocks.EMERALD_BLOCK)
    ;

    public static final ModWallLamps[] VALUES = values();

    private final LazyValue<Block> WallLamp;
    private final LazyValue<Item> Item;

    public final Block baseBlock;

    ModWallLamps(Block baseBlockIn) {
        this.baseBlock = baseBlockIn;
        
        WallLamp = new LazyValue<>(() -> new BlockCustomWallLamp(Block.Properties.from(getBaseBlock())));
        Item = new LazyValue<>(() -> new Item(new Item.Properties().group(ModItemGroup.VANILLA_THINGS)));
    }

    public Block getWallLamp() { return WallLamp.getValue(); }

    public Item getItem() { return Item.getValue(); }

    public String getName() { return name().toLowerCase(Locale.ROOT); }

    public Block getBaseBlock() { return this.baseBlock; }

}