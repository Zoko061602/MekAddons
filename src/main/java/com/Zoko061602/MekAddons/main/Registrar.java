package com.Zoko061602.MekAddons.main;

import com.Zoko061602.MekAddons.items.MekItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=MekAddons.ModID)
public class Registrar {

	  @SubscribeEvent
	  public static void registerBlocks(RegistryEvent.Register<Block> e){
       //ReadoptedBlocks.registerBlocks(e);
	  }

	  @SubscribeEvent
	  public static void registerItems(RegistryEvent.Register<Item> e){
		  //ReadoptedBlocks.registerItemBlocks(e);
		  MekItems.registerItems(e);
	  }

	  @SubscribeEvent
	  public static void registerRecipes(RegistryEvent.Register<IRecipe> e){
       MachineRecipeLoader.loadRecipes(e);
	  }

	  @SubscribeEvent
	  public static void registerModels(ModelRegistryEvent e){
		  MekItems.registerRenders(e);
		 // ReadoptedBlocks.registerRenders(e);
	  }
}
