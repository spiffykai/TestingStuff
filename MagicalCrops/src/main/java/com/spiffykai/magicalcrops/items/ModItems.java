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
    public static MagicalSeed diamondSeed;
    public static Item ironEssence;
    public static Item goldEssence;
    public static Item diamondEssence;
    public static Item redstoneEssence;
    public static Item waterEssence;

    public static void init(){
        ironSeed = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        ironEssence = new Item();
        GameRegistry.register(ironSeed.setUnlocalizedName(MagicalCrops.MODID + ".ironseed").setRegistryName("ironseed"));
        GameRegistry.register(ironEssence.setUnlocalizedName(MagicalCrops.MODID + ".ironessence").setRegistryName("ironessence").setCreativeTab(CreativeTabs.MATERIALS));

        goldSeed = new MagicalSeed(ModBlocks.cropGold, Blocks.FARMLAND);
        goldEssence = new Item();
        GameRegistry.register(goldSeed.setUnlocalizedName(MagicalCrops.MODID + ".goldseed").setRegistryName("goldseed"));
        GameRegistry.register(goldEssence.setUnlocalizedName(MagicalCrops.MODID + ".goldessence").setRegistryName("goldessence").setCreativeTab(CreativeTabs.MATERIALS));

        diamondSeed = new MagicalSeed(ModBlocks.cropDiamond, Blocks.FARMLAND);
        diamondEssence = new Item();
        GameRegistry.register(diamondSeed.setUnlocalizedName(MagicalCrops.MODID + ".diamondseed").setRegistryName("diamondseed"));
        GameRegistry.register(diamondEssence.setUnlocalizedName(MagicalCrops.MODID + ".diamondessence").setRegistryName("diamondessence").setCreativeTab(CreativeTabs.MATERIALS));
    }

}
