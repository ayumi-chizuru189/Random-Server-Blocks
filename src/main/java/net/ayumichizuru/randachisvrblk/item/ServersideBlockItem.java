package net.ayumichizuru.randachisvrblk.item;

import eu.pb4.polymer.api.item.PolymerItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;

import javax.annotation.Nullable;

public class ServersideBlockItem extends BlockItem implements PolymerItem {
    private final Item itemmimic;
    public ServersideBlockItem(Block block, Item itemmimic, Settings settings) {
        super(block, settings);
        this.itemmimic = itemmimic;
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return itemmimic;
    }

}
