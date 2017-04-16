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
        //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedIron, 0, new ModelResourceLocation("magicalcrops:seediron", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.essenceIron, 0, new ModelResourceLocation("magicalcrops:essenceiron", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.cropIron), 0, new ModelResourceLocation("magicalcrops:cropiron", "inventory"));

        //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedGold, 0, new ModelResourceLocation("magicalcrops:seedgold", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.essenceGold, 0, new ModelResourceLocation("magicalcrops:essencegold", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.cropGold), 0, new ModelResourceLocation("magicalcrops:cropgold", "inventory"));

        //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedDiamond, 0, new ModelResourceLocation("magicalcrops:seeddiamond", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.essenceDiamond, 0, new ModelResourceLocation("magicalcrops:essencediamond", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.cropDiamond), 0, new ModelResourceLocation("magicalcrops:cropdiamond", "inventory"));

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedAir, 0, new ModelResourceLocation("magicalcrops:seedair", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedCoal, 0, new ModelResourceLocation("magicalcrops:seedcoal", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedDye, 0, new ModelResourceLocation("magicalcrops:seeddye", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedEarth, 0, new ModelResourceLocation("magicalcrops:seedearth", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedFire, 0, new ModelResourceLocation("magicalcrops:seedfire", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedMinico, 0, new ModelResourceLocation("magicalcrops:seedminico", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedNature, 0, new ModelResourceLocation("magicalcrops:seednature", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedWater, 0, new ModelResourceLocation("magicalcrops:seedwater", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedRedstone, 0, new ModelResourceLocation("magicalcrops:seedredstone", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedGlowstone, 0, new ModelResourceLocation("magicalcrops:seedglowstone", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedObsidian, 0, new ModelResourceLocation("magicalcrops:seedobsidian", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedNether, 0, new ModelResourceLocation("magicalcrops:seednether", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedIron, 0, new ModelResourceLocation("magicalcrops:seediron", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedGold, 0, new ModelResourceLocation("magicalcrops:seedgold", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedLapis, 0, new ModelResourceLocation("magicalcrops:seedlapis", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedExperience, 0, new ModelResourceLocation("magicalcrops:seedexperience", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedQuartz, 0, new ModelResourceLocation("magicalcrops:seedquartz", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedDiamond, 0, new ModelResourceLocation("magicalcrops:seeddiamond", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedEmerald, 0, new ModelResourceLocation("magicalcrops:seedemerald", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedBlaze, 0, new ModelResourceLocation("magicalcrops:seedblaze", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedCreeper, 0, new ModelResourceLocation("magicalcrops:seedcreeper", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedEnderman, 0, new ModelResourceLocation("magicalcrops:seedenderman", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedGhast, 0, new ModelResourceLocation("magicalcrops:seedghast", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedSkeleton, 0, new ModelResourceLocation("magicalcrops:seedskeleton", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedSlime, 0, new ModelResourceLocation("magicalcrops:seedslime", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedSpider, 0, new ModelResourceLocation("magicalcrops:seedspider", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedWither, 0, new ModelResourceLocation("magicalcrops:seedwither", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedChicken, 0, new ModelResourceLocation("magicalcrops:seedchicken", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedCow, 0, new ModelResourceLocation("magicalcrops:seedcow", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedPig, 0, new ModelResourceLocation("magicalcrops:seedpig", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.seedSheep, 0, new ModelResourceLocation("magicalcrops:seedsheep", "inventory"));

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.oreMinicio), 0, new ModelResourceLocation("magicalcrops:oreminicio", "inventory"));
    }

}
