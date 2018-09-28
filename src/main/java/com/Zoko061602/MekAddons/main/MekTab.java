package com.Zoko061602.MekAddons.main;

import com.Zoko061602.MekAddons.items.MekItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MekTab extends CreativeTabs {

	public static final MekTab tabMek = new MekTab();

	private MekTab() {
		super("tabMek");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(MekItems.itemQuantumAlloy, 1, 0);
	}

}
