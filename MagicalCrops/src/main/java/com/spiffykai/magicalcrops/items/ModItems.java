package com.spiffykai.magicalcrops.items;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class ModItems {

    public static MagicalSeed ironSeed;
    public static MagicalSeed goldSeed;
    public static Item ironEssence;
    public static Item goldEssence;

    public static void init(){
        ironSeed = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        ironEssence = new Item();
        GameRegistry.register(ironSeed.setUnlocalizedName(MagicalCrops.MODID + ".ironseed").setRegistryName("ironseed"));
        GameRegistry.register(ironEssence.setUnlocalizedName(MagicalCrops.MODID + ".ironessence").setRegistryName("ironessence").setCreativeTab(CreativeTabs.MATERIALS));

        goldSeed = new MagicalSeed(ModBlocks.cropGold, Blocks.FARMLAND);
        goldEssence = new Item();
        GameRegistry.register(goldSeed.setUnlocalizedName(MagicalCrops.MODID + ".goldseed").setRegistryName("goldseed"));
        GameRegistry.register(goldEssence.setUnlocalizedName(MagicalCrops.MODID + ".goldessence").setRegistryName("goldessence").setCreativeTab(CreativeTabs.MATERIALS));
    }

}
