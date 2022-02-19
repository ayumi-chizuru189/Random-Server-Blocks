package net.ayumichizuru.randachisvrblk.item;

import eu.pb4.polymer.api.item.PolymerItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;

import javax.annotation.Nullable;

public class UnrestrictedPistonHeadItem extends BlockItem implements PolymerItem {

    public UnrestrictedPistonHeadItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return  Items.PISTON;
    }

}
