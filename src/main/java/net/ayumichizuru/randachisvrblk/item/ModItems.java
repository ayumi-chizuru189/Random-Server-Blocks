package net.ayumichizuru.randachisvrblk.item;

import net.ayumichizuru.randachisvrblk.RandAchiSvrBlk;
import net.ayumichizuru.randachisvrblk.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item UNRESTRICTED_PISTON_HEAD = registerItem("unrestricted_piston_head",
        new UnrestrictedPistonHeadItem(ModBlocks.UNRESTRICTED_PISTON_HEAD, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_WHITE_BED = registerItem("unrestricted_white_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_WHITE_BED, DyeColor.WHITE, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_RED_BED = registerItem("unrestricted_red_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_RED_BED, DyeColor.RED, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_LIGHT_GRAY_BED = registerItem("unrestricted_light_gray_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_LIGHT_GRAY_BED, DyeColor.LIGHT_GRAY, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_MAGENTA_BED = registerItem("unrestricted_magenta_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_MAGENTA_BED, DyeColor.MAGENTA, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_YELLOW_BED = registerItem("unrestricted_yellow_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_YELLOW_BED, DyeColor.YELLOW, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_LIGHT_BLUE_BED = registerItem("unrestricted_light_blue_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_LIGHT_BLUE_BED, DyeColor.LIGHT_BLUE, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_PURPLE_BED = registerItem("unrestricted_purple_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_PURPLE_BED, DyeColor.PURPLE, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_ORANGE_BED = registerItem("unrestricted_orange_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_ORANGE_BED, DyeColor.ORANGE, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_GREEN_BED = registerItem("unrestricted_green_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_GREEN_BED, DyeColor.GREEN, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_BROWN_BED = registerItem("unrestricted_brown_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_BROWN_BED, DyeColor.BROWN, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_BLACK_BED = registerItem("unrestricted_black_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_BLACK_BED, DyeColor.BLACK, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_PINK_BED = registerItem("unrestricted_pink_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_PINK_BED, DyeColor.PINK, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_LIME_BED = registerItem("unrestricted_lime_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_LIME_BED, DyeColor.LIME, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_GRAY_BED = registerItem("unrestricted_gray_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_GRAY_BED, DyeColor.GRAY, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_CYAN_BED = registerItem("unrestricted_cyan_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_CYAN_BED, DyeColor.CYAN, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_BLUE_BED = registerItem("unrestricted_blue_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_BLUE_BED, DyeColor.BLUE, new Item.Settings().group(ItemGroup.DECORATIONS)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RandAchiSvrBlk.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RandAchiSvrBlk.LOGGER.info("Registering Mod Items for " + RandAchiSvrBlk.MOD_ID);
    }

}
