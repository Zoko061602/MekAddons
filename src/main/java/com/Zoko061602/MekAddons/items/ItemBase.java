package com.Zoko061602.MekAddons.items;

import com.Zoko061602.MekAddons.main.MekAddons;
import com.Zoko061602.MekAddons.main.MekTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBase extends Item {

	int maxMeta = 0;

	public ItemBase(String name) {
		this.setRegistryName(MekAddons.ModID,name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MekTab.tabMek);

	}

	public ItemBase(String name, int maxMeta) {
	   this(name);
	   this.setHasSubtypes(true);
	   this.maxMeta = maxMeta;
	}


    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
     if(tab == getCreativeTab()){
    	 items.add(new ItemStack(this));
      if(hasSubtypes)
        for(int i=1;!(i==maxMeta); i++)
        	items.add(new ItemStack(this, 1, i));
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
    	if(!hasSubtypes) return getUnlocalizedName();
    	return getUnlocalizedName() + "_" + stack.getItemDamage();
    }

    public int getMaxMeta() {
		return maxMeta;
	}

}
