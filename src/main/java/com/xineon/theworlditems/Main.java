package com.xineon.theworlditems;

import com.xineon.theworlditems.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
   modid = "theworlditems",
   name = "The World Items 3",
   version = "3.0.0",
   acceptedMinecraftVersions = "[1.12.2]"
)
public class Main {

   @Instance
   public static Main instance;
   @SidedProxy(
      clientSide = "com.xineon.theworlditems.proxy.ClientProxy",
      serverSide = "com.xineon.theworlditems.proxy.CommonProxy"
   )
   public static CommonProxy proxy;


   @EventHandler
   public static void PreInit(FMLPreInitializationEvent event) {}

   @EventHandler
   public static void Init(FMLInitializationEvent event) {}

   @EventHandler
   public static void PostInit(FMLPostInitializationEvent event) {}
}
