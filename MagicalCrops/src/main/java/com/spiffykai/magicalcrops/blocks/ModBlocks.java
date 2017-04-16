package com.spiffykai.magicalcrops.blocks;

import com.spiffykai.magicalcrops.MagicalCrops;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class ModBlocks {

    public static CropIron cropIron;
    public static CropGold cropGold;
    public static CropBase cropDiamond;

    public static void init(){
        cropIron = new CropIron();
        GameRegistry.register(cropIron);
        cropGold = new CropGold();
        GameRegistry.register(cropGold);
        cropDiamond = new CropBase(Items.DIAMOND, Items.DIAMOND);
        GameRegistry.register(cropDiamond.setUnlocalizedName(MagicalCrops.MODID + ".cropdiamond").setRegistryName("cropdiamond"));
    }

}
