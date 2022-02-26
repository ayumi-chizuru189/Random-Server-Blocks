package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class FloatingDetectorRail extends DetectorRailBlock implements PolymerBlock {
    protected FloatingDetectorRail(Settings settings) {
        super(settings);
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
        return Blocks.DETECTOR_RAIL;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return Blocks.DETECTOR_RAIL.getDefaultState()
                .with(DetectorRailBlock.SHAPE, state.get(DetectorRailBlock.SHAPE))
                .with(DetectorRailBlock.POWERED, state.get(DetectorRailBlock.POWERED))
                .with(DetectorRailBlock.WATERLOGGED, state.get(DetectorRailBlock.WATERLOGGED));
    }
}
