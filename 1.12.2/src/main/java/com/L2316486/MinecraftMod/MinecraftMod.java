package com.L2316486.MinecraftMod;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

@Mod(modid = "cumdiscs", name = "CumDiscs", version = "2.0")

//There's got to be a better way than all of this without turning this into a 10 file mod.

//TODO replace chestgenhooks for dungeon disc spawning

@EventBusSubscriber
public class MinecraftMod {
	
	private static Item[] gitem;
	
	static SoundEvent WELCOMETOTHECUMZONE;
	static SoundEvent HEIRTOTHECUMTHRONE;
	static SoundEvent YOURCUMWONTLAST;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		final Item[] items = {new MusicDisc("WelcomeToTheCumZone", WELCOMETOTHECUMZONE).setUnlocalizedName("record_WelcomeToTheCumZone").setCreativeTab(CreativeTabs.MISC),
							  new MusicDisc("HeirToTheCumThrone", HEIRTOTHECUMTHRONE).setUnlocalizedName("record_HeirToTheCumThrone").setCreativeTab(CreativeTabs.MISC),
							  new MusicDisc("YourCumWontLast", YOURCUMWONTLAST).setUnlocalizedName("record_YourCumWontLast").setCreativeTab(CreativeTabs.MISC)};
		
		gitem = items;
		
	    event.getRegistry().registerAll(items);
	}
	
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		final SoundEvent[] sounds = {WELCOMETOTHECUMZONE, HEIRTOTHECUMTHRONE, YOURCUMWONTLAST};
		
	    event.getRegistry().registerAll(sounds);
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(gitem[0], 0, new ModelResourceLocation(gitem[0].getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(gitem[1], 0, new ModelResourceLocation(gitem[1].getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(gitem[2], 0, new ModelResourceLocation(gitem[2].getRegistryName(), "inventory"));
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		WELCOMETOTHECUMZONE = new SoundEvent(new ResourceLocation("cumdiscs", "records.WelcomeToTheCumZone"));
		HEIRTOTHECUMTHRONE 	= new SoundEvent(new ResourceLocation("cumdiscs", "records.HeirToTheCumThrone"));
		YOURCUMWONTLAST 	= new SoundEvent(new ResourceLocation("cumdiscs", "records.YourCumWontLast"));
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}