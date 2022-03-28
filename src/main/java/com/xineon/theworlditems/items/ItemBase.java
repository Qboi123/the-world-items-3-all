package com.xineon.theworlditems.items;

import com.xineon.theworlditems.Main;
import com.xineon.theworlditems.init.ModItems;
import com.xineon.theworlditems.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

   public ItemBase(String name) {
      this.setTranslationKey(name);
      this.setRegistryName(name);
      this.setCreativeTab(CreativeTabs.MATERIALS);
      ModItems.ITEMS.add(this);
   }

   public void registerModels() {
      Main.proxy.registerItemRenderer(this, 0, "inventory");
   }
}
