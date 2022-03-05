package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;

public class UnmeltableSnow extends SnowBlock implements PolymerBlock {
    protected UnmeltableSnow(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return state;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return Blocks.SNOW;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return Blocks.SNOW.getDefaultState()
                .with(SnowBlock.LAYERS, state.get(SnowBlock.LAYERS));
    }

}
