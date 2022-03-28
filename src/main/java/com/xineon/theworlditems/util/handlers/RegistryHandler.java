package com.xineon.theworlditems.util.handlers;

import com.xineon.theworlditems.init.ModItems;
import com.xineon.theworlditems.util.IHasModel;
import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber
public class RegistryHandler {

   @SubscribeEvent
   public static void onItemRegister(Register<Item> event) {
      event.getRegistry().registerAll((Item[])ModItems.ITEMS.toArray(new Item[0]));
   }

   @SubscribeEvent
   public static void onModelRegister(ModelRegistryEvent event) {
      Iterator<Item> var1 = ModItems.ITEMS.iterator();

      while(var1.hasNext()) {
         Item item = (Item)var1.next();
         if(item instanceof IHasModel) {
            ((IHasModel)item).registerModels();
         }
      }

   }
}
