package com.Zoko061602.MekAddons.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MekAddons.ModID, name=MekAddons.ModName, version=MekAddons.Version, dependencies=MekAddons.Dependencies)
public class MekAddons {

	public static final String ModID = "mekaddons";
	public static final String ModName = "MekAddons";
	public static final String Version = "0.0.1";
	public static final String Dependencies = "required-after:mekanism;";

		@SidedProxy(clientSide="com.Zoko061602.MekAddons.client.ClientProxy", serverSide="com.Zoko061602.MekAddons.main.CommonProxy")
		public static CommonProxy proxy;

		@EventHandler
		public void preInit(FMLPreInitializationEvent e) {
	        proxy.preInit(e);
		}

		@EventHandler
		public void init(FMLInitializationEvent e){
			proxy.init(e);
		}

		@EventHandler
		public void postInit(FMLPostInitializationEvent e) {
			proxy.postInit(e);
		}

		@EventHandler
		public void loadComplete(FMLLoadCompleteEvent e) {
	      proxy.loadComplete(e);
		}

}
