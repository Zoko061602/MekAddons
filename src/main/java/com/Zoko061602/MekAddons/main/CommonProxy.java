package com.Zoko061602.MekAddons.main;

import com.Zoko061602.MekAddons.fluid.MekFluids;
import com.Zoko061602.MekAddons.items.MekItems;

import mekanism.api.infuse.InfuseType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		MekItems.initItems();
		MekFluids.register();
	    MachineRecipeLoader.setupRecipes();;


	}

	public void init(FMLInitializationEvent e) {
		MekOreDict.regsiterOreDict();

	}

	public void postInit(FMLPostInitializationEvent e) {

	}

	public void loadComplete(FMLLoadCompleteEvent e) {

	}

}
