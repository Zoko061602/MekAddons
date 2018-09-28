package com.Zoko061602.MekAddons.items;

import java.util.ArrayList;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

public class MekItems {

	static ArrayList<ItemBase> itemList = new ArrayList<ItemBase>();

	public static ItemBase itemDust;
	public static ItemBase itemQuantumAlloy;
	public static ItemBase itemQuantumCircuit;
	public static ItemBase itemCompressedQuantum;
	public static ItemBase itemPTFE;

	public static void initItems() {
		addItem(itemPTFE = new ItemBase("item_ptfe", 4));
		addItem(itemDust = new ItemBase("item_dust", 2));
		addItem(itemQuantumAlloy = new ItemBase("item_quantum_alloy"));
		addItem(itemQuantumCircuit = new ItemBase("item_quantum_circuit"));
		addItem(itemCompressedQuantum = new ItemBase("item_quantum_compressed"));
	}

	public static void registerItems(RegistryEvent.Register<Item> e){
		for(ItemBase i:itemList)
		e.getRegistry().registerAll(i);
	}

	public static void registerRenders(ModelRegistryEvent event) {
		for(ItemBase item:itemList)
		registerRender(item,item.getMaxMeta());
	}

	private static void registerRender(Item item, int Maxmeta) {
		if(Maxmeta == 0) ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
		else for(int i=0;!(i==Maxmeta+1);i++)
		ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(item.getRegistryName()+"_"+i,"inventory"));
	}

	private static void addItem(ItemBase item) {
		itemList.add(item);
	}

}
