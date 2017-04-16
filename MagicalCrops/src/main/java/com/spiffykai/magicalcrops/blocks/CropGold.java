package com.spiffykai.magicalcrops.blocks;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.item.Item;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class CropGold extends BlockMagicalCrops{

    public CropGold(){
        super();
        setUnlocalizedName(MagicalCrops.MODID + ".cropgold");
        setRegistryName("cropgold");
    }

    protected Item getSeed(){
        return ModItems.goldSeed;
    }

    protected Item getCrop(){
        return ModItems.goldEssence;
    }

}
