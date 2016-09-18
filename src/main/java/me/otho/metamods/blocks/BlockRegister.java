package me.otho.metamods.blocks;

import com.google.gson.JsonObject;

import me.otho.metamods.core.registry.IRegister;

public class BlockRegister implements IRegister {

	@Override
	public void register(JsonObject obj) {
		System.out.println( "It works" );
		System.out.println( obj.toString());
	}

}
