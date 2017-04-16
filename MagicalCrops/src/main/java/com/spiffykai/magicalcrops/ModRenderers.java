package com.spiffykai.magicalcrops;

import com.spiffykai.magicalcrops.blocks.ModBlocks;
import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class ModRenderers {

    public static void preInit(){
        //ModelLoader.setCustomModelResourceLocation(ModItems.ironSeed, 0, new ModelResourceLocation("ironseed", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironSeed, 0, new ModelResourceLocation("magicalcrops:ironseed", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironEssence, 0, new ModelResourceLocation("magicalcrops:ironessence", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.cropIron), 0, new ModelResourceLocation("magicalcrops:cropiron", "inventory"));

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.goldSeed, 0, new ModelResourceLocation("magicalcrops:goldseed", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.goldEssence, 0, new ModelResourceLocation("magicalcrops:goldessence", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.cropGold), 0, new ModelResourceLocation("magicalcrops:cropgold", "inventory"));
    }

}
