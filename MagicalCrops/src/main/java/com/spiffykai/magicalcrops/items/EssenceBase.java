package com.spiffykai.magicalcrops.items;

import com.spiffykai.magicalcrops.MagicalCrops;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class EssenceBase extends Item{

    public EssenceBase(String localName){
        setCreativeTab(ModItems.tabMagicalCrops);
        setUnlocalizedName(MagicalCrops.MODID + "." + localName);
        setRegistryName(localName);
        GameRegistry.register(this);
    }

}
