package com.spiffykai.magicalcrops.proxy;

import com.spiffykai.magicalcrops.ModCrafting;
import com.spiffykai.magicalcrops.blocks.ModBlocks;
import com.spiffykai.magicalcrops.items.ModItems;
import com.spiffykai.magicalcrops.worldgen.MainWorldGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        // Initialization of blocks and items typically goes here:
        ModBlocks.init();
        ModItems.init();
        ModCrafting.init();
    }

    public void init(FMLInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new MainWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
