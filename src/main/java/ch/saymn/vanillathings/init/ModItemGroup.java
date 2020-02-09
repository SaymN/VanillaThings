package ch.saymn.vanillathings.init;

import ch.saymn.vanillathings.api.block.ModStairs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModItemGroup {
    public static final ItemGroup VANILLA_THINGS = new ItemGroup("vanillathings")
    {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        {
            return new ItemStack(ModStairs.GLOWSTONE.getStairs().asItem());
        }
    };
}