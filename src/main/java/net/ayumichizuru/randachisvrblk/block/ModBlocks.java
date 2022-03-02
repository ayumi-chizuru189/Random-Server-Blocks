package net.ayumichizuru.randachisvrblk.block;

import net.ayumichizuru.randachisvrblk.RandAchiSvrBlk;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.BedPart;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class ModBlocks {

    public static final Block UNRESTRICTED_PISTON_HEAD = registerBlock("unrestricted_piston_head",
            new UnrestrictedPistonHead(FabricBlockSettings.of(Material.PISTON).strength(1.5F)));

    public static final Block TORCH_LEVER = registerBlock("torch_lever",
            new TorchLever(Blocks.TORCH, Blocks.WALL_TORCH,
                    FabricBlockSettings.of(Material.DECORATION).noCollision().breakInstantly().luminance(14)));

    public static final Block REDSTONE_TORCH_LEVER = registerBlock("redstone_torch_lever",
            new TorchLever(Blocks.REDSTONE_TORCH, Blocks.REDSTONE_WALL_TORCH,
                    FabricBlockSettings.of(Material.DECORATION).noCollision().breakInstantly().luminance(7).sounds(BlockSoundGroup.WOOD)));

    public static final Block SOUL_TORCH_LEVER = registerBlock("soul_torch_lever",
            new TorchLever(Blocks.SOUL_TORCH, Blocks.SOUL_WALL_TORCH,
                    FabricBlockSettings.of(Material.DECORATION).noCollision().breakInstantly().luminance(10)));

    public static final Block UNMELTABLE_SNOW = registerBlock("unmeltable_snow",
            new UnmeltableSnow(FabricBlockSettings.of(Material.SNOW_LAYER).strength(0.1F).sounds(BlockSoundGroup.SNOW)
                    .blockVision((blockStatex, blockView, blockPos) -> blockStatex.get(SnowBlock.LAYERS) >= 8)
            ));

    public static final Block UNCHANGING_DIRT_PATH = registerBlock("unchanging_dirt_path",
            new UnchangingDirtPath(FabricBlockSettings.of(Material.SOIL).strength(0.65F).sounds(BlockSoundGroup.GRASS)));

    public static final Block UNCHANGING_GRASS_BLOCK = registerBlock("unchanging_grass_block",
            new UnchangingGrassBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(0.6F).sounds(BlockSoundGroup.GRASS)));

    public static final Block SURVIVAL_BARRIER = registerBlock("survival_barrier",
            new SurvivalBarrierBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(50.0f, 1200.0f).nonOpaque().allowsSpawning(ModBlocks::never)));

    public static final Block SURVIVAL_LIGHT = registerBlock("survival_light",
            new SurvivalLightBlock(FabricBlockSettings.of(Material.AIR).strength(1.5F, 9.0F).nonOpaque().luminance(LightBlock.STATE_TO_LUMINANCE)));

    public static final Block FLOATING_POWERED_RAIL = registerBlock("floating_powered_rail",
            new FloatingPoweredRail(Blocks.POWERED_RAIL, FabricBlockSettings.of(Material.DECORATION).noCollision().strength(0.7f).sounds(BlockSoundGroup.METAL)));

    public static final Block FLOATING_DETECTOR_RAIL = registerBlock("floating_detector_rail",
            new FloatingDetectorRail(FabricBlockSettings.of(Material.DECORATION).noCollision().strength(0.7f).sounds(BlockSoundGroup.METAL)));

    public static final Block FLOATING_RAIL = registerBlock("floating_rail",
            new FloatingRail(FabricBlockSettings.of(Material.DECORATION).noCollision().strength(0.7f).sounds(BlockSoundGroup.METAL)));

    public static final Block FLOATING_ACTIVATOR_RAIL = registerBlock("floating_activator_rail",
            new FloatingPoweredRail(Blocks.ACTIVATOR_RAIL, FabricBlockSettings.of(Material.DECORATION).noCollision().strength(0.7f).sounds(BlockSoundGroup.METAL)));

    public static final Block STONE_PEBBLE = registerBlock("stone_pebble",
            new StonePebble(Blocks.STONE_BUTTON, FabricBlockSettings.of(Material.DECORATION).noCollision().strength(0.5f)));

    public static final Block BLACKSTONE_PEBBLE = registerBlock("blackstone_pebble",
            new StonePebble(Blocks.POLISHED_BLACKSTONE_BUTTON, FabricBlockSettings.of(Material.DECORATION).noCollision().strength(0.5f)));

    public static final Block HALF_SUNFLOWER = registerBlock("half_sunflower",
            new HalfTallBlock(Blocks.SUNFLOWER, FabricBlockSettings.of(Material.AIR).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));

    public static final Block HALF_LILAC = registerBlock("half_lilac",
            new HalfTallBlock(Blocks.LILAC, FabricBlockSettings.of(Material.AIR).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));

    public static final Block HALF_ROSE_BUSH = registerBlock("half_rose_bush",
            new HalfTallBlock(Blocks.ROSE_BUSH, FabricBlockSettings.of(Material.AIR).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));

    public static final Block HALF_PEONY = registerBlock("half_peony",
            new HalfTallBlock(Blocks.PEONY, FabricBlockSettings.of(Material.AIR).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));

    public static final Block HALF_TALL_GRASS = registerBlock("half_tall_grass",
            new HalfTallBlock(Blocks.TALL_GRASS, FabricBlockSettings.of(Material.AIR).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));

    public static final Block HALF_LARGE_FERN = registerBlock("half_large_fern",
            new HalfTallBlock(Blocks.LARGE_FERN, FabricBlockSettings.of(Material.AIR).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));

    public static final Block GELLED_WATER = registerBlock("gelled_water",
            new GelledLiquid(Blocks.WATER, FabricBlockSettings.of(Material.AIR, MapColor.WATER_BLUE).strength(1200.0f).breakInstantly()));

    public static final Block GELLED_LAVA = registerBlock("gelled_lava",
            new GelledLiquid(Blocks.LAVA, FabricBlockSettings.of(Material.AIR, MapColor.BRIGHT_RED).strength(1200.0f).breakInstantly()));


    public static final Block UNRESTRICTED_WHITE_BED = registerBlock("unrestricted_white_bed",
            createUnrestrictedBedBlock(DyeColor.WHITE, Blocks.WHITE_BED));

     public static final Block UNRESTRICTED_RED_BED = registerBlock("unrestricted_red_bed",
             createUnrestrictedBedBlock(DyeColor.RED, Blocks.RED_BED));

    public static final Block UNRESTRICTED_LIGHT_GRAY_BED = registerBlock("unrestricted_light_gray_bed",
            createUnrestrictedBedBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_BED));

    public static final Block UNRESTRICTED_MAGENTA_BED = registerBlock("unrestricted_magenta_bed",
            createUnrestrictedBedBlock(DyeColor.MAGENTA, Blocks.MAGENTA_BED));

    public static final Block UNRESTRICTED_YELLOW_BED = registerBlock("unrestricted_yellow_bed",
            createUnrestrictedBedBlock(DyeColor.YELLOW, Blocks.YELLOW_BED));

    public static final Block UNRESTRICTED_LIGHT_BLUE_BED = registerBlock("unrestricted_light_blue_bed",
            createUnrestrictedBedBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_BED));

    public static final Block UNRESTRICTED_PURPLE_BED = registerBlock("unrestricted_purple_bed",
            createUnrestrictedBedBlock(DyeColor.PURPLE, Blocks.PURPLE_BED));

    public static final Block UNRESTRICTED_ORANGE_BED = registerBlock("unrestricted_orange_bed",
            createUnrestrictedBedBlock(DyeColor.ORANGE, Blocks.ORANGE_BED));

    public static final Block UNRESTRICTED_GREEN_BED = registerBlock("unrestricted_green_bed",
            createUnrestrictedBedBlock(DyeColor.GREEN, Blocks.GREEN_BED));

    public static final Block UNRESTRICTED_BROWN_BED = registerBlock("unrestricted_brown_bed",
            createUnrestrictedBedBlock(DyeColor.BROWN, Blocks.BROWN_BED));

    public static final Block UNRESTRICTED_BLACK_BED = registerBlock("unrestricted_black_bed",
            createUnrestrictedBedBlock(DyeColor.BLACK, Blocks.BLACK_BED));

    public static final Block UNRESTRICTED_PINK_BED = registerBlock("unrestricted_pink_bed",
            createUnrestrictedBedBlock(DyeColor.PINK, Blocks.PINK_BED));

    public static final Block UNRESTRICTED_LIME_BED = registerBlock("unrestricted_lime_bed",
            createUnrestrictedBedBlock(DyeColor.LIME, Blocks.LIME_BED));

    public static final Block UNRESTRICTED_GRAY_BED = registerBlock("unrestricted_gray_bed",
            createUnrestrictedBedBlock(DyeColor.GRAY, Blocks.GRAY_BED));

    public static final Block UNRESTRICTED_CYAN_BED = registerBlock("unrestricted_cyan_bed",
            createUnrestrictedBedBlock(DyeColor.CYAN, Blocks.CYAN_BED));

    public static final Block UNRESTRICTED_BLUE_BED = registerBlock("unrestricted_blue_bed",
            createUnrestrictedBedBlock(DyeColor.BLUE, Blocks.BLUE_BED));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(RandAchiSvrBlk.MOD_ID, name), block);
    }

    private static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    private static UnrestrictedBaseBed createUnrestrictedBedBlock(DyeColor color, Block blockmimic) {
        return new UnrestrictedBaseBed(color, blockmimic, FabricBlockSettings.of(Material.WOOL, state -> state.get(BedBlock.PART) == BedPart.FOOT ? color.getMapColor() : MapColor.WHITE_GRAY)
                .sounds(BlockSoundGroup.WOOD).strength(0.2f).nonOpaque());
    }


    public static void registerModBlocks() {
        RandAchiSvrBlk.LOGGER.info("Registering Mod Blocks for " + RandAchiSvrBlk.MOD_ID);
    }

}
