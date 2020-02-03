package ch.saymn.vanillathings.block.slabs.vertical.init;

import net.minecraft.util.IStringSerializable;

public enum VerticalSlabType implements IStringSerializable {
    STRAIGHT("straight"),
    INNER_LEFT("inner_left"),
    INNER_RIGHT("inner_right"),
    OUTER_LEFT("outer_left"),
    OUTER_RIGHT("outer_right");

   private final String name;

   private VerticalSlabType(String name) {
      this.name = name;
   }

   public String toString() {
      return this.name;
   }

   public String getName() {
      return this.name;
   }
}