package net.ayumichizuru.randachisvrblk.item;

import net.ayumichizuru.randachisvrblk.RandAchiSvrBlk;
import net.ayumichizuru.randachisvrblk.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item UNRESTRICTED_PISTON_HEAD = registerItem("unrestricted_piston_head",
        new ServersideBlockItem(ModBlocks.UNRESTRICTED_PISTON_HEAD, Items.PISTON,
                new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item TORCH_LEVER = registerItem("torch_lever",
            new ServersideBlockItem(ModBlocks.TORCH_LEVER, Items.TORCH,
                    new Item.Settings().group(ItemGroup.REDSTONE)));

    public static final Item REDSTONE_TORCH_LEVER = registerItem("redstone_torch_lever",
            new ServersideBlockItem(ModBlocks.REDSTONE_TORCH_LEVER, Items.REDSTONE_TORCH,
                    new Item.Settings().group(ItemGroup.REDSTONE)));

    public static final Item SOUL_TORCH_LEVER = registerItem("soul_torch_lever",
            new ServersideBlockItem(ModBlocks.SOUL_TORCH_LEVER, Items.SOUL_TORCH,
                    new Item.Settings().group(ItemGroup.REDSTONE)));

    public static final Item UNMELTABLE_SNOW = registerItem("unmeltable_snow",
            new ServersideBlockItem(ModBlocks.UNMELTABLE_SNOW, Items.SNOW,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNCHANGING_DIRT_PATH = registerItem("unchanging_dirt_path",
            new ServersideBlockItem(ModBlocks.UNCHANGING_DIRT_PATH, Items.DIRT_PATH,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNCHANGING_GRASS_BLOCK = registerItem("unchanging_grass_block",
            new ServersideBlockItem(ModBlocks.UNCHANGING_GRASS_BLOCK, Items.GRASS_BLOCK,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item SURVIVAL_BARRIER = registerItem("survival_barrier",
            new ServersideBlockItem(ModBlocks.SURVIVAL_BARRIER, Items.BARRIER,
                    new Item.Settings().group(ItemGroup.DECORATIONS).rarity(Rarity.EPIC)));

    public static final Item SURVIVAL_LIGHT = registerItem("survival_light",
            new ServersideBlockItem(ModBlocks.SURVIVAL_LIGHT, Items.LIGHT,
                    new Item.Settings().group(ItemGroup.DECORATIONS).rarity(Rarity.EPIC)));

    public static final Item FLOATING_POWERED_RAIL = registerItem("floating_powered_rail",
            new ServersideBlockItem(ModBlocks.FLOATING_POWERED_RAIL, Items.POWERED_RAIL,
                    new Item.Settings().group(ItemGroup.TRANSPORTATION)));

    public static final Item FLOATING_DETECTOR_RAIL = registerItem("floating_detector_rail",
            new ServersideBlockItem(ModBlocks.FLOATING_DETECTOR_RAIL, Items.DETECTOR_RAIL,
                    new Item.Settings().group(ItemGroup.TRANSPORTATION)));

    public static final Item FLOATING_RAIL = registerItem("floating_rail",
            new ServersideBlockItem(ModBlocks.FLOATING_RAIL, Items.RAIL,
                    new Item.Settings().group(ItemGroup.TRANSPORTATION)));

    public static final Item FLOATING_ACTIVATOR_RAIL = registerItem("floating_activator_rail",
            new ServersideBlockItem(ModBlocks.FLOATING_ACTIVATOR_RAIL, Items.ACTIVATOR_RAIL,
                    new Item.Settings().group(ItemGroup.TRANSPORTATION)));

    public static final Item STONE_PEBBLE = registerItem("stone_pebble",
            new ServersideBlockItem(ModBlocks.STONE_PEBBLE, Items.STONE_BUTTON,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item BLACKSTONE_PEBBLE = registerItem("blackstone_pebble",
            new ServersideBlockItem(ModBlocks.BLACKSTONE_PEBBLE, Items.POLISHED_BLACKSTONE_BUTTON,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item HALF_SUNFLOWER = registerItem("half_sunflower",
            new ServersideBlockItem(ModBlocks.HALF_SUNFLOWER, Items.SUNFLOWER,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item HALF_LILAC = registerItem("half_lilac",
            new ServersideBlockItem(ModBlocks.HALF_LILAC, Items.LILAC,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item HALF_ROSE_BUSH = registerItem("half_rose_bush",
            new ServersideBlockItem(ModBlocks.HALF_ROSE_BUSH, Items.ROSE_BUSH,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item HALF_PEONY = registerItem("half_peony",
            new ServersideBlockItem(ModBlocks.HALF_PEONY, Items.PEONY,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item HALF_TALL_GRASS = registerItem("half_tall_grass",
            new ServersideBlockItem(ModBlocks.HALF_TALL_GRASS, Items.TALL_GRASS,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item HALF_LARGE_FERN = registerItem("half_large_fern",
            new ServersideBlockItem(ModBlocks.HALF_LARGE_FERN, Items.LARGE_FERN,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item GELLED_WATER = registerItem("gelled_water",
            new ServersideBlockItem(ModBlocks.GELLED_WATER, Items.LIGHT_BLUE_DYE,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item GELLED_LAVA = registerItem("gelled_lava",
            new ServersideBlockItem(ModBlocks.GELLED_LAVA, Items.ORANGE_DYE,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));


    public static final Item UNRESTRICTED_WHITE_BED = registerItem("unrestricted_white_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_WHITE_BED, Items.WHITE_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_ORANGE_BED = registerItem("unrestricted_orange_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_ORANGE_BED, Items.ORANGE_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_MAGENTA_BED = registerItem("unrestricted_magenta_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_MAGENTA_BED, Items.MAGENTA_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_LIGHT_BLUE_BED = registerItem("unrestricted_light_blue_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_LIGHT_BLUE_BED, Items.LIGHT_BLUE_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_YELLOW_BED = registerItem("unrestricted_yellow_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_YELLOW_BED, Items.YELLOW_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_LIME_BED = registerItem("unrestricted_lime_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_LIME_BED, Items.LIME_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_PINK_BED = registerItem("unrestricted_pink_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_PINK_BED, Items.PINK_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_GRAY_BED = registerItem("unrestricted_gray_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_GRAY_BED, Items.GRAY_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_LIGHT_GRAY_BED = registerItem("unrestricted_light_gray_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_LIGHT_GRAY_BED, Items.LIGHT_GRAY_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_CYAN_BED = registerItem("unrestricted_cyan_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_CYAN_BED, Items.CYAN_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_PURPLE_BED = registerItem("unrestricted_purple_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_PURPLE_BED, Items.PURPLE_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_BLUE_BED = registerItem("unrestricted_blue_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_BLUE_BED, Items.BLUE_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_BROWN_BED = registerItem("unrestricted_brown_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_BROWN_BED, Items.BROWN_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_GREEN_BED = registerItem("unrestricted_green_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_GREEN_BED, Items.GREEN_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_RED_BED = registerItem("unrestricted_red_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_RED_BED, Items.RED_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_BLACK_BED = registerItem("unrestricted_black_bed",
            new ServersideBlockItem(ModBlocks.UNRESTRICTED_BLACK_BED, Items.BLACK_BED,
                    new Item.Settings().group(ItemGroup.DECORATIONS)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RandAchiSvrBlk.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RandAchiSvrBlk.LOGGER.info("Registering Mod Items for " + RandAchiSvrBlk.MOD_ID);
    }

}
