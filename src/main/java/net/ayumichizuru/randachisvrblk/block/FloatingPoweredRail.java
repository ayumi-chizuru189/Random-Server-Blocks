package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class FloatingPoweredRail extends PoweredRailBlock implements PolymerBlock {
    private final Block blockmimic;
    protected FloatingPoweredRail(Block blockmimic, Settings settings) {
        super(settings);
        this.blockmimic = blockmimic;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return true;
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (world.isClient || !world.getBlockState(pos).isOf(this)) {
            return;
        }
        this.updateBlockState(state, world, pos, block);
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return blockmimic;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return blockmimic.getDefaultState()
                .with(PoweredRailBlock.SHAPE, state.get(PoweredRailBlock.SHAPE))
                .with(PoweredRailBlock.POWERED, state.get(PoweredRailBlock.POWERED))
                .with(PoweredRailBlock.WATERLOGGED, state.get(PoweredRailBlock.WATERLOGGED));
    }
}
