package com.shnupbups.contentcreator;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.resource.FileResourcePackProvider;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourcePackManager;
import net.minecraft.resource.ResourcePackProfile;
import net.minecraft.util.Identifier;

import javax.annotation.Nullable;
import java.io.File;

public class modid implements ModInitializer {
	public static final String MOD_ID = "modid";
	
	@Override
	public void onInitialize() {
	
	}
	
	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}
}
