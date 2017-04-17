package com.spiffykai.magicalcrops.blocks;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by spiffykai on 4/17/2017.
 */
public class BaseBlock extends Block{

    public BaseBlock(String localName){
        super(Material.ROCK);
        setCreativeTab(ModItems.tabMagicalCrops);
        setHardness(2.0f);
        setResistance(10.0f);
        setUnlocalizedName(MagicalCrops.MODID + "." + localName);
        setRegistryName(localName);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

}
