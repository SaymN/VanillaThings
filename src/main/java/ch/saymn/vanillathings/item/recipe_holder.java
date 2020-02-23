package ch.saymn.vanillathings.item;

import ch.saymn.vanillathings.init.ModItemGroup;
import ch.saymn.vanillathings.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class recipe_holder extends Item{

	public recipe_holder() {
		super(new Properties()
				.group(ModItemGroup.VANILLA_THINGS).containerItem(ModItems.recipe_holder)
				);
	}
	
    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack ret = new ItemStack(this);
        return ret;
    }

}
