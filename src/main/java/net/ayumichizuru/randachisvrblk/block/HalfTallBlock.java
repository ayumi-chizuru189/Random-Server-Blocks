package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class HalfTallBlock extends Block implements PolymerBlock {
    public static final EnumProperty<DoubleBlockHalf> HALF = Properties.DOUBLE_BLOCK_HALF;
    private final Block blockmimic;
    public HalfTallBlock(Block blockmimic, Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(HALF, DoubleBlockHalf.LOWER));
        this.blockmimic = blockmimic;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HALF);
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        return false;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getSide();
        BlockPos blockPos = ctx.getBlockPos();
        return this.getDefaultState().with(HALF, direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getHitPos().y - (double)blockPos.getY() > 0.5D)) ? DoubleBlockHalf.LOWER : DoubleBlockHalf.UPPER);
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return blockmimic;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return blockmimic.getDefaultState()
                .with(TallPlantBlock.HALF, state.get(TallPlantBlock.HALF));
    }

}
