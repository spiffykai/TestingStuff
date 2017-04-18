package com.spiffykai.magicalcrops.blocks.Crops;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.blocks.BlockMagicalCrops;
import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.item.Item;

/**
 * Created by spiffykai on 4/17/2017.
 */
public class CropMinicio extends BlockMagicalCrops{

    public CropMinicio(){
        super();
        setUnlocalizedName(MagicalCrops.MODID + ".cropminicio");
        setRegistryName("cropminicio");
    }

    protected Item getSeed(){
        return ModItems.seedMinico;
    }

    protected Item getCrop(){
        return ModItems.essenceMinicio;
    }

}
