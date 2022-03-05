package net.ayumichizuru.randachisvrblk.item;

import eu.pb4.polymer.api.item.PolymerItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;

import javax.annotation.Nullable;

public class ServersideItem extends Item implements PolymerItem {
    private final Item itemmimic;
    public ServersideItem(Item itemmimic, Settings settings) {
        super(settings);
        this.itemmimic = itemmimic;
    }


    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return itemmimic;
    }

}
