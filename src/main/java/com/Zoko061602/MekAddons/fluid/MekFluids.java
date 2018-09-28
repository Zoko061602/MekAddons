package com.Zoko061602.MekAddons.fluid;

import mekanism.api.gas.Gas;
import mekanism.api.gas.GasRegistry;

public class MekFluids {

	public static final Gas Fluorine = new Gas("fluorine", "mekaddons:blocks/liquid/liquid_fluorine");
	public static final Gas HydrogenFluoride = new Gas("hydrogenfluoride", "mekaddons:blocks/liquid/liquid_hydrogen_fluoride");
	public static final Gas Tetrafluoroethene = new Gas("tetrafluoroethene", "mekaddons:blocks/liquid/liquid_tetrafluoroethene");

	public static final Gas Air = new Gas("air", "mekaddons:blocks/liquid/liquid_air");
	public static final Gas Nitrogen = new Gas("nitrogen", "mekaddons:blocks/liquid/liquid_nitrogen");
	public static final Gas Ammonia = new Gas("ammonia", "mekaddons:blocks/liquid/liquid_ammonia");
	public static final Gas NitricAcid = new Gas("nitricacid", "mekaddons:blocks/liquid/liquid_nitric_acid");

    public static void register() {
        GasRegistry.register(Fluorine).registerFluid("liquidfluorine");
    	GasRegistry.register(HydrogenFluoride).registerFluid("liquidhydrogenfluoride");
    	GasRegistry.register(Tetrafluoroethene).registerFluid("liquidtetrafluoroethene");

    	GasRegistry.register(Air).registerFluid("liquidair");
    	GasRegistry.register(Nitrogen).registerFluid("liquidnitrogen");
    	GasRegistry.register(Ammonia).registerFluid("liquidammonia");
    	GasRegistry.register(NitricAcid).registerFluid("liquidnitricacid");

    }


}
