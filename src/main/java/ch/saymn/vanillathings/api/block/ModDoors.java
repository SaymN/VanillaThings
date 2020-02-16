package ch.saymn.vanillathings.api.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.LazyLoadBase;

import java.util.Locale;

import ch.saymn.vanillathings.block.dors.init.BlockCustomDoor;
import ch.saymn.vanillathings.init.ModItemGroup;

public enum ModDoors {

    STONE(Blocks.STONE),
    COBBLESTONE(Blocks.COBBLESTONE),
    ANDESITE(Blocks.ANDESITE),
    GRANITE(Blocks.GRANITE),
    DIORITE(Blocks.DIORITE),
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

    public static final ModDoors[] VALUES = values();

    private final LazyLoadBase<Block> Door;
    private final LazyLoadBase<Item> Item;

    public final Block baseBlock;

    ModDoors(Block baseBlockIn) {
        this.baseBlock = baseBlockIn;
        
        Door = new LazyLoadBase<>(() -> new BlockCustomDoor(Block.Properties.from(getBaseBlock())));
        Item = new LazyLoadBase<>(() -> new Item(new Item.Properties().group(ModItemGroup.VANILLA_THINGS)));
    }

    public Block getDoor() { return Door.getValue(); }

    public Item getItem() { return Item.getValue(); }

    public String getName() { return name().toLowerCase(Locale.ROOT); }

    public Block getBaseBlock() { return this.baseBlock; }

}