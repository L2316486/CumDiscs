package com.L2316486.MinecraftMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraft.util.SoundEvent;

public class MusicDisc extends ItemRecord{
	public MusicDisc(String name, SoundEvent soundIn){
		super(name, soundIn);
        setRegistryName(name).setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
}