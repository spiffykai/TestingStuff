package com.spiffykai.magicalcrops.blocks;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class ModBlocks {

    public static CropIron cropIron;
    public static CropGold cropGold;
    public static CropDiamond cropDiamond;

    public static OreMinicio oreMinicio;

    public static void init(){
        cropIron = new CropIron();
        GameRegistry.register(cropIron);
        cropGold = new CropGold();
        GameRegistry.register(cropGold);
        cropDiamond = new CropDiamond();
        GameRegistry.register(cropDiamond);

        oreMinicio = new OreMinicio();
    }

}
