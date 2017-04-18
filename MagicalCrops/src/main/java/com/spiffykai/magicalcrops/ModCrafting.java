package com.spiffykai.magicalcrops;

import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class ModCrafting {

    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.essenceAccio), new Object[]{
                " # ",
                "#I#",
                " # ",
                '#', ModItems.essenceMinicio, 'I', new ItemStack(ModItems.infusionStoneWeak, 1, OreDictionary.WILDCARD_VALUE)
        });
    }

}
