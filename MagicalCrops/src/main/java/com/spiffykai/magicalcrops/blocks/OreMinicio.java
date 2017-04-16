package com.spiffykai.magicalcrops.blocks;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class OreMinicio extends Block{

    public OreMinicio(){
        super(Material.ROCK);
        setHardness(3.0f);
        setResistance(5.0f);
        setHarvestLevel("pickaxe", 2);
        setUnlocalizedName(MagicalCrops.MODID + ".oreminicio");
        setRegistryName("oreminicio");
        setCreativeTab(ModItems.tabMagicalCrops);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    @Override
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.seedMinico;
    }

    @Override
    public int quantityDropped(Random random)
    {
        return 4;
    }

}
