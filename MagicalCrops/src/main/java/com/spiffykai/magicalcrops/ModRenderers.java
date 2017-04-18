package com.spiffykai.magicalcrops;

import com.spiffykai.magicalcrops.blocks.ModBlocks;
import com.spiffykai.magicalcrops.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class ModRenderers {

    public static void preInit(){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.cropIron), 0, new ModelResourceLocation("magicalcrops:cropiron", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.cropGold), 0, new ModelResourceLocation("magicalcrops:cropgold", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.cropDiamond), 0, new ModelResourceLocation("magicalcrops:cropdiamond", "inventory"));
        registerBlock(ModBlocks.cropMinicio, "cropminicio");

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

        registerModel(ModItems.essenceMinicio, "essenceminicio");
        registerModel(ModItems.essenceAccio, "essenceaccio");
        registerModel(ModItems.essenceCrucio, "essencecrucio");
        registerModel(ModItems.essenceImperio, "essenceimperio");
        registerModel(ModItems.essenceZivicio, "essencezivicio");
        registerModel(ModItems.essenceTainted, "essencetainted");
        registerModel(ModItems.essenceAir, "essenceair");
        registerModel(ModItems.essenceCoal, "essencecoal");
        registerModel(ModItems.essenceTechnicolor, "essencetechnicolor");
        registerModel(ModItems.essenceEarth, "essenceearth");
        registerModel(ModItems.essenceFire, "essencefire");
        registerModel(ModItems.essenceNature, "essencenature");
        registerModel(ModItems.essenceWater, "essencewater");
        registerModel(ModItems.essenceRedstone, "essenceredstone");
        registerModel(ModItems.essenceGlowstone, "essenceglowstone");
        registerModel(ModItems.essenceObsidian, "essenceobsidian");
        registerModel(ModItems.essenceNether, "essencenether");
        registerModel(ModItems.essenceIron, "essenceiron");
        registerModel(ModItems.essenceGold, "essencegold");
        registerModel(ModItems.essenceLapis, "essencelapis");
        registerModel(ModItems.essenceExperience, "essenceexperience");
        registerModel(ModItems.essenceQuartz, "essencequartz");
        registerModel(ModItems.essenceDiamond, "essencediamond");
        registerModel(ModItems.essenceEmerald, "essenceemerald");
        registerModel(ModItems.essenceBlaze, "essenceblaze");
        registerModel(ModItems.essenceCreeper, "essencecreeper");
        registerModel(ModItems.essenceEnderman, "essenceenderman");
        registerModel(ModItems.essenceGhast, "essenceghast");
        registerModel(ModItems.essenceSkeleton, "essenceskeleton");
        registerModel(ModItems.essenceSlime, "essenceslime");
        registerModel(ModItems.essenceSpider, "essencespider");
        registerModel(ModItems.essenceWither, "essencewither");
        registerModel(ModItems.essenceChicken, "essencechicken");
        registerModel(ModItems.essenceCow, "essencecow");
        registerModel(ModItems.essencePig, "essencepig");
        registerModel(ModItems.essenceSheep, "essencesheep");

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.oreMinicio), 0, new ModelResourceLocation("magicalcrops:oreminicio", "inventory"));
        registerBlock(ModBlocks.blockMinicio, "blockminicio");
        registerBlock(ModBlocks.blockAccio, "blockaccio");
        registerBlock(ModBlocks.blockCrucio, "blockcrucio");
        registerBlock(ModBlocks.blockImperio, "blockimperio");
        registerBlock(ModBlocks.blockZivicio, "blockzivicio");
        registerBlock(ModBlocks.blockMassZivicio, "blockmasszivicio");

        registerModel(ModItems.infusionStoneWeak, "infusionstoneweak");
        registerModel(ModItems.infusionStoneRegular, "infusionstoneregular");
        registerModel(ModItems.infusionStoneStrong, "infusionstonestrong");
        registerModel(ModItems.infusionStoneExtreme, "infusionstoneextreme");
        registerModel(ModItems.infusionStoneMaster, "infusionstonemaster");
    }

    public static void registerModel(Item item, String resourceName){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("magicalcrops:" + resourceName, "inventory"));
    }

    public static void registerBlock(Block block, String resourceName){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("magicalcrops:" + resourceName, "inventory"));
    }

}
