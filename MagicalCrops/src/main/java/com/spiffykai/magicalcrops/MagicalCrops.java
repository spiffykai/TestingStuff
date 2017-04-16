package com.spiffykai.magicalcrops;

import com.spiffykai.magicalcrops.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * Created by spiffykai on 4/16/2017.
 */
@Mod(modid = MagicalCrops.MODID, name = MagicalCrops.MODNAME, version = MagicalCrops.VERSION)
public class MagicalCrops {

    public static final String MODID = "magicalcrops";
    public static final String MODNAME = "Magical Crops";
    public static final String VERSION = "0.0.1a";

    @SidedProxy(clientSide = "com.spiffykai.magicalcrops.proxy.ClientProxy", serverSide = "com.spiffykai.magicalcrops.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static MagicalCrops instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

}
