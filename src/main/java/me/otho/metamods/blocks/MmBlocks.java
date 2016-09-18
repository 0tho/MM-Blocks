package me.otho.metamods.blocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import me.otho.metamods.core.registry.RegisterHandler;

@Mod(modid = MmBlocks.MOD_ID, version = MmBlocks.VERSION)
public class MmBlocks
{
    public static final String MOD_ID = "mm-blocks";
    public static final String VERSION = "0.0.1";
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        // some example code
        RegisterHandler.addRegisterType(MOD_ID + "." + "block", new BlockRegister() );
    }
}
