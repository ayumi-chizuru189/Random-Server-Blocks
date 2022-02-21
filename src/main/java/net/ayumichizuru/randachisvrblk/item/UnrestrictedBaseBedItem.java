package net.ayumichizuru.randachisvrblk.item;

import eu.pb4.polymer.api.item.PolymerItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.DyeColor;

import javax.annotation.Nullable;

public class UnrestrictedBaseBedItem extends BlockItem implements PolymerItem {
    private final DyeColor color;

    public UnrestrictedBaseBedItem(Block block, DyeColor color, Settings settings) {
        super(block, settings);
        this.color = color;
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return  getMimicItems();
    }

    private Item getMimicItems(){
        return switch (this.color) {
            case RED -> Items.RED_BED;
            case LIGHT_GRAY -> Items.LIGHT_GRAY_BED;
            case MAGENTA -> Items.MAGENTA_BED;
            case YELLOW -> Items.YELLOW_BED;
            case LIGHT_BLUE -> Items.LIGHT_BLUE_BED;
            case PURPLE -> Items.PURPLE_BED;
            case ORANGE -> Items.ORANGE_BED;
            case GREEN -> Items.GREEN_BED;
            case BROWN -> Items.BROWN_BED;
            case BLACK -> Items.BLACK_BED;
            case PINK -> Items.PINK_BED;
            case LIME -> Items.LIME_BED;
            case GRAY -> Items.GRAY_BED;
            case CYAN -> Items.CYAN_BED;
            case BLUE -> Items.BLUE_BED;
            default -> Items.WHITE_BED;
        };

    }

}
