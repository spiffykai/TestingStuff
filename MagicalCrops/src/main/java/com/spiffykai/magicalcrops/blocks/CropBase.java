package com.spiffykai.magicalcrops.blocks;

import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.item.Item;

/**
 * Created by spiffykai on 4/16/17.
 */
public class CropBase extends BlockMagicalCrops
{

    public Item returnItem;
    public Item returnSeed;

    public CropBase(Item returnItemItem, Item returnSeedItem){
        this.returnItem = returnItemItem;
        this.returnSeed = returnSeedItem;
    }

    protected Item getSeed(){
        return returnSeed;
    }

    protected Item getCrop(){
        return returnItem;
    }


}
