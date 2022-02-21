package net.ayumichizuru.randachisvrblk.block;

import net.ayumichizuru.randachisvrblk.RandAchiSvrBlk;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block UNRESTRICTED_PISTON_HEAD = registerBlock("unrestricted_piston_head",
            new UnrestrictedPistonHead(FabricBlockSettings.of(Material.PISTON).strength(1.5F)));

    public static final Block UNRESTRICTED_WHITE_BED = registerBlock("unrestricted_white_bed",
            new UnrestrictedBaseBed(DyeColor.WHITE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

     public static final Block UNRESTRICTED_RED_BED = registerBlock("unrestricted_red_bed",
             new UnrestrictedBaseBed(DyeColor.RED, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_LIGHT_GRAY_BED = registerBlock("unrestricted_light_gray_bed",
            new UnrestrictedBaseBed(DyeColor.LIGHT_GRAY, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_MAGENTA_BED = registerBlock("unrestricted_magenta_bed",
            new UnrestrictedBaseBed(DyeColor.MAGENTA, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_YELLOW_BED = registerBlock("unrestricted_yellow_bed",
            new UnrestrictedBaseBed(DyeColor.YELLOW, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_LIGHT_BLUE_BED = registerBlock("unrestricted_light_blue_bed",
            new UnrestrictedBaseBed(DyeColor.LIGHT_BLUE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_PURPLE_BED = registerBlock("unrestricted_purple_bed",
            new UnrestrictedBaseBed(DyeColor.PURPLE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_ORANGE_BED = registerBlock("unrestricted_orange_bed",
            new UnrestrictedBaseBed(DyeColor.ORANGE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_GREEN_BED = registerBlock("unrestricted_green_bed",
            new UnrestrictedBaseBed(DyeColor.GREEN, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_BROWN_BED = registerBlock("unrestricted_brown_bed",
            new UnrestrictedBaseBed(DyeColor.BROWN, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_BLACK_BED = registerBlock("unrestricted_black_bed",
            new UnrestrictedBaseBed(DyeColor.BLACK, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_PINK_BED = registerBlock("unrestricted_pink_bed",
            new UnrestrictedBaseBed(DyeColor.PINK, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_LIME_BED = registerBlock("unrestricted_lime_bed",
            new UnrestrictedBaseBed(DyeColor.LIME, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_GRAY_BED = registerBlock("unrestricted_gray_bed",
            new UnrestrictedBaseBed(DyeColor.GRAY, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_CYAN_BED = registerBlock("unrestricted_cyan_bed",
            new UnrestrictedBaseBed(DyeColor.CYAN, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    public static final Block UNRESTRICTED_BLUE_BED = registerBlock("unrestricted_blue_bed",
            new UnrestrictedBaseBed(DyeColor.BLUE, FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(RandAchiSvrBlk.MOD_ID, name), block);
    }


    public static void registerModBlocks() {
        RandAchiSvrBlk.LOGGER.info("Registering Mod Blocks for " + RandAchiSvrBlk.MOD_ID);
    }

}
