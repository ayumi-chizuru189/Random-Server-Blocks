package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class UnchangingGrassBlock extends Block implements PolymerBlock {
    public static final BooleanProperty SNOWY = Properties.SNOWY;
    public UnchangingGrassBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(SNOWY, false));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getSide();
        BlockPos blockPos = ctx.getBlockPos();
        return (BlockState)((BlockState) this.getDefaultState()).with(SNOWY, direction == Direction.DOWN || (direction != Direction.UP && ctx.getHitPos().y - (double) blockPos.getY() > 0.5D));
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return Blocks.GRASS_BLOCK;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return Blocks.GRASS_BLOCK.getDefaultState()
                .with(SnowyBlock.SNOWY, state.get(SnowyBlock.SNOWY));
    }


    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SNOWY);
    }

}
