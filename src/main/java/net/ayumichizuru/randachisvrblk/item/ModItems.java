package net.ayumichizuru.randachisvrblk.item;

import net.ayumichizuru.randachisvrblk.RandAchiSvrBlk;
import net.ayumichizuru.randachisvrblk.block.ModBlocks;
import net.ayumichizuru.randachisvrblk.item.beds.UnrestrictedBaseBedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item UNRESTRICTED_PISTON_HEAD = registerItem("unrestricted_piston_head",
        new UnrestrictedPistonHeadItem(ModBlocks.UNRESTRICTED_PISTON_HEAD, new Item.Settings().group(ItemGroup.DECORATIONS)));

    public static final Item UNRESTRICTED_WHITE_BED = registerItem("unrestricted_white_bed",
            new UnrestrictedBaseBedItem(ModBlocks.UNRESTRICTED_WHITE_BED, new Item.Settings().group(ItemGroup.DECORATIONS)));

    // public static final Item UNRESTRICTED_RED_BED = registerItem("unrestricted_red_bed",
    //         new UnrestrictedRedBedItem(ModBlocks.UNRESTRICTED_RED_BED, new Item.Settings().group(ItemGroup.DECORATIONS)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RandAchiSvrBlk.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RandAchiSvrBlk.LOGGER.info("Registering Mod Items for " + RandAchiSvrBlk.MOD_ID);
    }

}
