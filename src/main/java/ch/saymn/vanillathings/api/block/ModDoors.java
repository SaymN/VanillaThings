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
    DIORITE(Blocks.DIORITE);
    

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