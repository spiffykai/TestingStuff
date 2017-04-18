package com.spiffykai.magicalcrops.blocks.Crops;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.blocks.BlockMagicalCrops;
import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.item.Item;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class CropDiamond extends BlockMagicalCrops {

    public CropDiamond(){
        super();
        setUnlocalizedName(MagicalCrops.MODID + ".cropdiamond");
        setRegistryName("cropdiamond");
    }

    protected Item getSeed(){
        return ModItems.seedDiamond;
    }

    protected Item getCrop(){
        return ModItems.essenceDiamond;
    }


}
