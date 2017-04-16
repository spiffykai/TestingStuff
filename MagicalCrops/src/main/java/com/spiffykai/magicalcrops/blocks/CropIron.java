package com.spiffykai.magicalcrops.blocks;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.items.ModItems;
import com.sun.scenario.effect.Crop;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class CropIron extends BlockMagicalCrops{

    public CropIron(){
        super();
        setUnlocalizedName(MagicalCrops.MODID + ".cropiron");
        setRegistryName("cropiron");
    }

    protected Item getSeed(){
        return ModItems.seedIron;
    }

    protected Item getCrop(){
        return ModItems.essenceIron;
    }

}
