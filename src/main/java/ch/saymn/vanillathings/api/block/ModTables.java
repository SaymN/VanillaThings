package ch.saymn.vanillathings.api.block;

import java.util.Locale;

import ch.saymn.vanillathings.block.init.BlockCustomTable;
import ch.saymn.vanillathings.init.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.LazyLoadBase;

public enum ModTables {

    OAK(Blocks.OAK_PLANKS),
    BIRCH(Blocks.BIRCH_PLANKS),
    SPRUCE(Blocks.SPRUCE_PLANKS),
    JUNGLE(Blocks.JUNGLE_PLANKS),
    ACACIA(Blocks.ACACIA_PLANKS),
    DARK_OAK(Blocks.DARK_OAK_PLANKS)
    ;

    public static final ModTables[] VALUES = values();

    private final LazyLoadBase<Block> Door;
    private final LazyLoadBase<Item> Item;

    public final Block baseBlock;

    ModTables(Block baseBlockIn) {
        this.baseBlock = baseBlockIn;
        
        Door = new LazyLoadBase<>(() -> new BlockCustomTable(Block.Properties.from(getBaseBlock())));
        Item = new LazyLoadBase<>(() -> new Item(new Item.Properties().group(ModItemGroup.VANILLA_THINGS)));
    }

    public Block getTable() { return Door.getValue(); }

    public Item getItem() { return Item.getValue(); }

    public String getName() { return name().toLowerCase(Locale.ROOT); }

    public Block getBaseBlock() { return this.baseBlock; }

}