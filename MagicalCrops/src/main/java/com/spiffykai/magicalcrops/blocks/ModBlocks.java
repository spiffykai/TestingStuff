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

    public static BaseBlock blockMinicio;
    public static BaseBlock blockAccio;
    public static BaseBlock blockCrucio;
    public static BaseBlock blockImperio;
    public static BaseBlock blockZivicio;
    public static BaseBlock blockMassZivicio;

    public static void init(){
        cropIron = new CropIron();
        GameRegistry.register(cropIron);
        cropGold = new CropGold();
        GameRegistry.register(cropGold);
        cropDiamond = new CropDiamond();
        GameRegistry.register(cropDiamond);

        oreMinicio = new OreMinicio();

        blockMinicio = new BaseBlock("blockminicio");
        blockAccio = new BaseBlock("blockaccio");
        blockCrucio = new BaseBlock("blockcrucio");
        blockImperio = new BaseBlock("blockimperio");
        blockZivicio = new BaseBlock("blockzivicio");
        blockMassZivicio = new BaseBlock("blockmasszivicio");
    }

}
