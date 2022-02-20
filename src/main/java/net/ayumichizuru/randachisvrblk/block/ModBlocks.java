package net.ayumichizuru.randachisvrblk.block;

import net.ayumichizuru.randachisvrblk.RandAchiSvrBlk;
import net.ayumichizuru.randachisvrblk.block.beds.UnrestrictedBaseBed;
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
            new UnrestrictedBaseBed(DyeColor.WHITE , FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    // public static final Block UNRESTRICTED_RED_BED = registerBlock("unrestricted_red_bed",
    //         new UnrestrictedRedBed(DyeColor.RED , FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(RandAchiSvrBlk.MOD_ID, name), block);
    }


    public static void registerModBlocks() {
        RandAchiSvrBlk.LOGGER.info("Registering Mod Blocks for " + RandAchiSvrBlk.MOD_ID);
    }

}
