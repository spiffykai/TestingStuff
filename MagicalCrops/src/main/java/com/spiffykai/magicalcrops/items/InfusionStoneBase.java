package com.spiffykai.magicalcrops.items;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.blocks.ModBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;
import java.util.Set;

/**
 * Created by spiffykai on 4/17/2017.
 */
public class InfusionStoneBase extends ItemTool {

    private String information;
    private int durability;

    public InfusionStoneBase(String localName, String informationList, int durabilityList){
        super(ToolMaterial.IRON, null);
        this.information = informationList;
        this.durability = durabilityList;
        setCreativeTab(ModItems.tabMagicalCrops);
        setUnlocalizedName(MagicalCrops.MODID + "." + localName);
        setRegistryName(localName);
        setMaxDamage(durabilityList);
        setMaxStackSize(1);
        GameRegistry.register(this);
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack){
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack){
        ItemStack copiedStack = itemStack.copy();
        copiedStack.setItemDamage(copiedStack.getItemDamage() + 1);
        copiedStack.stackSize = 1;
        return copiedStack;
    }

    @Override
    public double getDurabilityForDisplay(ItemStack stack)
    {
        return (double)stack.getItemDamage() / (double)stack.getMaxDamage();
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(information);
        list.add("Durability: " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
    }
}
