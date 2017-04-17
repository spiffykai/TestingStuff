package com.spiffykai.magicalcrops.items;

import com.spiffykai.magicalcrops.MagicalCrops;
import com.spiffykai.magicalcrops.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import sun.awt.image.ImagingLib;

/**
 * Created by spiffykai on 4/16/2017.
 */
public class ModItems {

    public static MagicalSeed seedAir;
    public static MagicalSeed seedCoal;
    public static MagicalSeed seedDye;
    public static MagicalSeed seedEarth;
    public static MagicalSeed seedFire;
    public static MagicalSeed seedMinico;
    public static MagicalSeed seedNature;
    public static MagicalSeed seedWater;
    public static MagicalSeed seedRedstone;
    public static MagicalSeed seedGlowstone;
    public static MagicalSeed seedObsidian;
    public static MagicalSeed seedNether;
    public static MagicalSeed seedIron;
    public static MagicalSeed seedGold;
    public static MagicalSeed seedLapis;
    public static MagicalSeed seedExperience;
    public static MagicalSeed seedQuartz;
    public static MagicalSeed seedDiamond;
    public static MagicalSeed seedEmerald;
    public static MagicalSeed seedBlaze;
    public static MagicalSeed seedCreeper;
    public static MagicalSeed seedEnderman;
    public static MagicalSeed seedGhast;
    public static MagicalSeed seedSkeleton;
    public static MagicalSeed seedSlime;
    public static MagicalSeed seedSpider;
    public static MagicalSeed seedWither;
    public static MagicalSeed seedChicken;
    public static MagicalSeed seedCow;
    public static MagicalSeed seedPig;
    public static MagicalSeed seedSheep;

    public static EssenceBase essenceMinicio;
    public static EssenceBase essenceAccio;
    public static EssenceBase essenceCrucio;
    public static EssenceBase essenceImperio;
    public static EssenceBase essenceZivicio;
    public static EssenceBase essenceTainted;
    public static EssenceBase essenceAir;
    public static EssenceBase essenceCoal;
    public static EssenceBase essenceTechnicolor;
    public static EssenceBase essenceEarth;
    public static EssenceBase essenceFire;
    public static EssenceBase essenceNature;
    public static EssenceBase essenceWater;
    public static EssenceBase essenceRedstone;
    public static EssenceBase essenceGlowstone;
    public static EssenceBase essenceObsidian;
    public static EssenceBase essenceNether;
    public static EssenceBase essenceIron;
    public static EssenceBase essenceGold;
    public static EssenceBase essenceLapis;
    public static EssenceBase essenceExperience;
    public static EssenceBase essenceQuartz;
    public static EssenceBase essenceDiamond;
    public static EssenceBase essenceEmerald;
    public static EssenceBase essenceBlaze;
    public static EssenceBase essenceCreeper;
    public static EssenceBase essenceEnderman;
    public static EssenceBase essenceGhast;
    public static EssenceBase essenceSkeleton;
    public static EssenceBase essenceSlime;
    public static EssenceBase essenceSpider;
    public static EssenceBase essenceWither;
    public static EssenceBase essenceChicken;
    public static EssenceBase essenceCow;
    public static EssenceBase essencePig;
    public static EssenceBase essenceSheep;



    //public static Item essenceIron;
    //public static Item essenceGold;
    //public static Item essenceDiamond;

    public static final CreativeTabs tabMagicalCrops = new CreativeTabs("magicalcrops"){
        @Override public Item getTabIconItem(){
            return ModItems.seedIron;
        }
    };

    public static void init(){
        //seedIron = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        //essenceIron = new Item();
        //GameRegistry.register(seedIron.setUnlocalizedName(MagicalCrops.MODID + ".seediron").setRegistryName("seediron"));
        //GameRegistry.register(essenceIron.setUnlocalizedName(MagicalCrops.MODID + ".essenceiron").setRegistryName("essenceiron").setCreativeTab(CreativeTabs.MATERIALS));

        //seedGold = new MagicalSeed(ModBlocks.cropGold, Blocks.FARMLAND);
        //essenceGold = new Item();
        //GameRegistry.register(seedGold.setUnlocalizedName(MagicalCrops.MODID + ".seedgold").setRegistryName("seedgold"));
        //GameRegistry.register(essenceGold.setUnlocalizedName(MagicalCrops.MODID + ".essencegold").setRegistryName("essencegold").setCreativeTab(CreativeTabs.MATERIALS));

        //seedDiamond = new MagicalSeed(ModBlocks.cropDiamond, Blocks.FARMLAND);
        //essenceDiamond = new Item();
        //GameRegistry.register(seedDiamond.setUnlocalizedName(MagicalCrops.MODID + ".seeddiamond").setRegistryName("seeddiamond"));
        //GameRegistry.register(essenceDiamond.setUnlocalizedName(MagicalCrops.MODID + ".essencediamond").setRegistryName("essencediamond").setCreativeTab(CreativeTabs.MATERIALS));

        seedAir = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedCoal = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedDye = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedEarth = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedFire = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedMinico = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedNature = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedWater = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedRedstone = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedGlowstone = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedObsidian = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedNether = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedIron = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedGold = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedLapis = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedExperience = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedQuartz = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedDiamond = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedEmerald = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedBlaze = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedCreeper = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedEnderman = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedGhast = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedSkeleton = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedSlime = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedSpider = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedWither = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedChicken = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedCow = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedPig = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);
        seedSheep = new MagicalSeed(ModBlocks.cropIron, Blocks.FARMLAND);

        GameRegistry.register(seedAir.setUnlocalizedName(MagicalCrops.MODID + ".seedair").setRegistryName("seedair"));
        GameRegistry.register(seedCoal.setUnlocalizedName(MagicalCrops.MODID + ".seedcoal").setRegistryName("seedcoal"));
        GameRegistry.register(seedDye.setUnlocalizedName(MagicalCrops.MODID + ".seeddye").setRegistryName("seeddye"));
        GameRegistry.register(seedEarth.setUnlocalizedName(MagicalCrops.MODID + ".seedearth").setRegistryName("seedearth"));
        GameRegistry.register(seedFire.setUnlocalizedName(MagicalCrops.MODID + ".seedfire").setRegistryName("seedfire"));
        GameRegistry.register(seedMinico.setUnlocalizedName(MagicalCrops.MODID + ".seedminico").setRegistryName("seedminico"));
        GameRegistry.register(seedNature.setUnlocalizedName(MagicalCrops.MODID + ".seednature").setRegistryName("seednature"));
        GameRegistry.register(seedWater.setUnlocalizedName(MagicalCrops.MODID + ".seedwater").setRegistryName("seedwater"));
        GameRegistry.register(seedRedstone.setUnlocalizedName(MagicalCrops.MODID + ".seedredstone").setRegistryName("seedredstone"));
        GameRegistry.register(seedGlowstone.setUnlocalizedName(MagicalCrops.MODID + ".seedglowstone").setRegistryName("seedglowstone"));
        GameRegistry.register(seedObsidian.setUnlocalizedName(MagicalCrops.MODID + ".seedobsidian").setRegistryName("seedobsidian"));
        GameRegistry.register(seedNether.setUnlocalizedName(MagicalCrops.MODID + ".seednether").setRegistryName("seednether"));
        GameRegistry.register(seedIron.setUnlocalizedName(MagicalCrops.MODID + ".seediron").setRegistryName("seediron"));
        GameRegistry.register(seedGold.setUnlocalizedName(MagicalCrops.MODID + ".seedgold").setRegistryName("seedgold"));
        GameRegistry.register(seedLapis.setUnlocalizedName(MagicalCrops.MODID + ".seedlapis").setRegistryName("seedlapis"));
        GameRegistry.register(seedExperience.setUnlocalizedName(MagicalCrops.MODID + ".seedexperience").setRegistryName("seedexperience"));
        GameRegistry.register(seedQuartz.setUnlocalizedName(MagicalCrops.MODID + ".seedquartz").setRegistryName("seedquartz"));
        GameRegistry.register(seedDiamond.setUnlocalizedName(MagicalCrops.MODID + ".seeddiamond").setRegistryName("seeddiamond"));
        GameRegistry.register(seedEmerald.setUnlocalizedName(MagicalCrops.MODID + ".seedemerald").setRegistryName("seedemerald"));
        GameRegistry.register(seedBlaze.setUnlocalizedName(MagicalCrops.MODID + ".seedblaze").setRegistryName("seedblaze"));
        GameRegistry.register(seedCreeper.setUnlocalizedName(MagicalCrops.MODID + ".seedcreeper").setRegistryName("seedcreeper"));
        GameRegistry.register(seedEnderman.setUnlocalizedName(MagicalCrops.MODID + ".seedenderman").setRegistryName("seedenderman"));
        GameRegistry.register(seedGhast.setUnlocalizedName(MagicalCrops.MODID + ".seedghast").setRegistryName("seedghast"));
        GameRegistry.register(seedSkeleton.setUnlocalizedName(MagicalCrops.MODID + ".seedskeleton").setRegistryName("seedskeleton"));
        GameRegistry.register(seedSlime.setUnlocalizedName(MagicalCrops.MODID + ".seedslime").setRegistryName("seedslime"));
        GameRegistry.register(seedSpider.setUnlocalizedName(MagicalCrops.MODID + ".seedspider").setRegistryName("seedspider"));
        GameRegistry.register(seedWither.setUnlocalizedName(MagicalCrops.MODID + ".seedwither").setRegistryName("seedwither"));
        GameRegistry.register(seedChicken.setUnlocalizedName(MagicalCrops.MODID + ".seedchicken").setRegistryName("seedchicken"));
        GameRegistry.register(seedCow.setUnlocalizedName(MagicalCrops.MODID + ".seedcow").setRegistryName("seedcow"));
        GameRegistry.register(seedPig.setUnlocalizedName(MagicalCrops.MODID + ".seedpig").setRegistryName("seedpig"));
        GameRegistry.register(seedSheep.setUnlocalizedName(MagicalCrops.MODID + ".seedsheep").setRegistryName("seedsheep"));

        essenceMinicio = new EssenceBase("essenceminicio");
        essenceAccio = new EssenceBase("essenceaccio");
        essenceCrucio = new EssenceBase("essencecrucio");
        essenceImperio = new EssenceBase("essenceimperio");
        essenceZivicio = new EssenceBase("essencezivicio");
        essenceTainted = new EssenceBase("essencetainted");
        essenceAir = new EssenceBase("essenceair");
        essenceCoal = new EssenceBase("essencecoal");
        essenceTechnicolor = new EssenceBase("essencetechnicolor");
        essenceEarth = new EssenceBase("essenceearth");
        essenceFire = new EssenceBase("essencefire");
        essenceNature = new EssenceBase("essencenature");
        essenceWater = new EssenceBase("essencewater");
        essenceRedstone = new EssenceBase("essenceredstone");
        essenceGlowstone = new EssenceBase("essenceglowstone");
        essenceObsidian = new EssenceBase("essenceobsidian");
        essenceNether = new EssenceBase("essencenether");
        essenceIron = new EssenceBase("essenceiron");
        essenceGold = new EssenceBase("essencegold");
        essenceLapis = new EssenceBase("essencelapis");
        essenceExperience = new EssenceBase("essenceexperience");
        essenceQuartz = new EssenceBase("essencequartz");
        essenceDiamond = new EssenceBase("essencediamond");
        essenceEmerald = new EssenceBase("essenceemerald");
        essenceBlaze = new EssenceBase("essenceblaze");
        essenceCreeper = new EssenceBase("essencecreeper");
        essenceEnderman = new EssenceBase("essenceenderman");
        essenceGhast = new EssenceBase("essenceghast");
        essenceSkeleton = new EssenceBase("essenceskeleton");
        essenceSlime = new EssenceBase("essenceslime");
        essenceSpider = new EssenceBase("essencespider");
        essenceWither = new EssenceBase("essencewither");
        essenceChicken = new EssenceBase("essencechicken");
        essenceCow = new EssenceBase("essencecow");
        essencePig = new EssenceBase("essencepig");
        essenceSheep = new EssenceBase("essencesheep");
    }

}
