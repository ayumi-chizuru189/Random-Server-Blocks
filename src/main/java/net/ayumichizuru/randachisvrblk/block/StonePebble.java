package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.WallMountLocation;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class StonePebble extends WallMountedBlock implements PolymerBlock {
    private final Block blockmimic;
    protected StonePebble(Block blockmimic, Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(FACE, WallMountLocation.WALL));
        this.blockmimic = blockmimic;
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return blockmimic;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return blockmimic.getDefaultState()
                .with(WallMountedBlock.FACING, state.get(WallMountedBlock.FACING))
                .with(WallMountedBlock.FACE, state.get(WallMountedBlock.FACE))
                .with(StoneButtonBlock.POWERED, true);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return state;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return true;
    }
}
