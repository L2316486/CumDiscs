package com.L2316486.MinecraftMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

@Mod(modid = "cumdiscs", name = "CumDiscs", version = "2.0")

public class MinecraftMod {

	public static Item record_CumZone;
	public static Item record_Heir;
	public static Item record_WontLast;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		record_CumZone = new MusicDisc("WelcomeToTheCumZone").setUnlocalizedName("record_WelcomeToTheCumZone").setTextureName("cumdiscs:record_WelcomeToTheCumZone");
		GameRegistry.registerItem(record_CumZone, "record_CumZone");
		record_Heir = new MusicDisc("HeirToTheCumThrone").setUnlocalizedName("record_HeirToTheCumThrone").setTextureName("cumdiscs:record_HeirToTheCumThrone");
		GameRegistry.registerItem(record_Heir, "record_Heir");
		record_WontLast = new MusicDisc("YourCumWontLast").setUnlocalizedName("record_YourCumWontLast").setTextureName("cumdiscs:record_YourCumWontLast");
		GameRegistry.registerItem(record_WontLast, "record_WontLast");
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(record_CumZone), 1, 1, 5));
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(record_Heir), 1, 1, 5));
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(record_WontLast), 1, 1, 5));
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}