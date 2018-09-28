package com.Zoko061602.MekAddons.main;

import com.Zoko061602.MekAddons.fluid.MekFluids;
import com.Zoko061602.MekAddons.items.MekItems;

import mekanism.api.MekanismAPI;
import mekanism.api.MekanismRecipeHelper;
import mekanism.api.gas.GasRegistry;
import mekanism.api.gas.GasStack;
import mekanism.api.infuse.InfuseObject;
import mekanism.api.infuse.InfuseRegistry;
import mekanism.api.infuse.InfuseType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MachineRecipeLoader {

	private static MekanismRecipeHelper recipeHelper = MekanismAPI.recipeHelper();

	public static void setupRecipes() {
		InfuseRegistry.registerInfuseType(new InfuseType("QUANTUM", new ResourceLocation("mekaddons:blocks/infuse/quantum")).setUnlocalizedName("quantum"));
	}

	public static void loadRecipes(Register<IRecipe> e) {
     addMetallurgicInfuserRecipes();
     addCrystalizerRecipes();
     addChemicalInfuserRecipes();
     addPRCRecipes();
     addElectrolyzerRecipes();
     addEnrichmentChamberRecipes();
	}

	private static void addEnrichmentChamberRecipes() {
		recipeHelper.addEnrichmentChamberRecipe(new ItemStack(MekItems.itemDust,1,1), new ItemStack(MekItems.itemCompressedQuantum));

	}

	private static void addMetallurgicInfuserRecipes(){
        InfuseRegistry.registerInfuseObject(new ItemStack(MekItems.itemDust,1,1), new InfuseObject(InfuseRegistry.get("QUANTUM"), 10));
		InfuseRegistry.registerInfuseObject(new ItemStack(MekItems.itemCompressedQuantum), new InfuseObject(InfuseRegistry.get("QUANTUM"), 100));
		recipeHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("QUANTUM"), 10, GameRegistry.makeItemStack("mekanism:atomicalloy", 0, 1, null), new ItemStack(MekItems.itemQuantumAlloy));
	}

	private static void addCrystalizerRecipes() {
        recipeHelper.addChemicalCrystallizerRecipe(new GasStack(GasRegistry.getGas("sodium"), 100), new ItemStack(MekItems.itemDust,1,0));
	}

	private static void addChemicalInfuserRecipes(){
		recipeHelper.addChemicalInfuserRecipe(new GasStack(MekFluids.Fluorine, 1), new GasStack(GasRegistry.getGas("hydrogen"), 1), new GasStack(MekFluids.HydrogenFluoride,1));
		recipeHelper.addChemicalInfuserRecipe(new GasStack(MekFluids.HydrogenFluoride, 4), new GasStack(GasRegistry.getGas("ethene"), 1), new GasStack(MekFluids.Tetrafluoroethene,1));
		recipeHelper.addChemicalInfuserRecipe(new GasStack(MekFluids.Nitrogen, 1), new GasStack(GasRegistry.getGas("hydrogen"), 3), new GasStack(MekFluids.Ammonia,1));
		recipeHelper.addChemicalInfuserRecipe(new GasStack(MekFluids.Ammonia, 1), new GasStack(GasRegistry.getGas("oxygen"), 3), new GasStack(MekFluids.NitricAcid,1));

	}

	private static void addPRCRecipes(){
		recipeHelper.addPRCRecipe(
			GameRegistry.makeItemStack("mekanism:substrate", 0, 1, null), new FluidStack(MekFluids.Tetrafluoroethene.getFluid(), 50), new GasStack(GasRegistry.getGas("oxygen"),10),
			new ItemStack(MekItems.itemPTFE,1,0), new GasStack(GasRegistry.getGas("oxygen"), 5), 5000, 200);
	}

	private static void addElectrolyzerRecipes() {
		recipeHelper.addElectrolyticSeparatorRecipe(new FluidStack(MekFluids.Air.getFluid(), 4), 2000, new GasStack(MekFluids.Nitrogen, 3), new GasStack(GasRegistry.getGas("oxygen"), 1));
	}


}
