package com.Zoko061602.MekAddons.main;

import com.Zoko061602.MekAddons.items.MekItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MekOreDict {

	public static void regsiterOreDict(){
		OreDictionary.registerOre("dustSodium", new ItemStack(MekItems.itemDust,1,0));
		OreDictionary.registerOre("dustQuantum", new ItemStack(MekItems.itemDust,1,1));

	}

}
