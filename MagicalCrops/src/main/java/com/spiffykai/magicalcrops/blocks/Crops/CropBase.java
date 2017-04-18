package com.spiffykai.magicalcrops.blocks.Crops;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.blocks.BlockMagicalCrops;
import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by spiffykai on 4/17/2017.
 */
public class CropBase extends BlockMagicalCrops{

    private Item itemCrop;
    private Item itemSeed;

    public CropBase(Item itemCropItem, Item itemSeedItem, String localName){
        super();
        this.itemCrop = itemCropItem;
        this.itemSeed = itemSeedItem;
        setUnlocalizedName(MagicalCrops.MODID + "." + localName);
        setRegistryName(localName);
    }

    protected Item getSeed(){
        return itemSeed;
    }

    protected Item getCrop(){
        return itemCrop;
    }

}
