package com.spiffykai.magicalcrops.proxy;

import com.spiffykai.magicalcrops.ModRenderers;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class ClientProxy extends CommonProxy{

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        // Typically initialization of models and such goes here:
        ModRenderers.preInit();
    }

}
