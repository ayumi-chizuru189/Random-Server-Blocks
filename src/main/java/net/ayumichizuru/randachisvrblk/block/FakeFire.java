package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Util;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class FakeFire extends Block implements PolymerBlock {
    public static final BooleanProperty UP = ConnectingBlock.UP;
    public static final BooleanProperty NORTH = ConnectingBlock.NORTH;
    public static final BooleanProperty EAST = ConnectingBlock.EAST;
    public static final BooleanProperty SOUTH = ConnectingBlock.SOUTH;
    public static final BooleanProperty WEST = ConnectingBlock.WEST;
    public static final Map<Direction, BooleanProperty> FACING_PROPERTIES = ConnectingBlock.FACING_PROPERTIES.entrySet().stream().filter(entry -> entry.getKey() != Direction.DOWN).collect(Util.toMap());
    public FakeFire(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(UP, false).with(NORTH, false).with(EAST, false).with(SOUTH, false).with(WEST, false));
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        BlockState blockState = context.getWorld().getBlockState(context.getBlockPos());
        if (!blockState.get(EAST) &&
            !blockState.get(WEST) &&
            !blockState.get(NORTH) &&
            !blockState.get(SOUTH) &&
            !blockState.get(UP)) {
            return false;
        }
        return context.getStack().isOf(this.asItem());
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        boolean bl = blockState.isOf(this);
        BlockState blockState2 = bl ? blockState : this.getDefaultState();
        for (Direction direction : ctx.getPlacementDirections()) {
            boolean bl2;
            if (direction == Direction.DOWN) {
                if (blockState2.get(EAST) ||
                    blockState2.get(WEST) ||
                    blockState2.get(NORTH) ||
                    blockState2.get(SOUTH) ||
                    blockState2.get(UP)) {
                    continue;
                }
                return this.getDefaultState();
            }
            BooleanProperty booleanProperty = FACING_PROPERTIES.get(direction);
            bl2 = bl && blockState.get(booleanProperty);
            if (bl2) continue;
            return blockState2.with(booleanProperty, true);
        }
        return bl ? blockState2 : null;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(UP, NORTH, EAST, SOUTH, WEST);
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return Blocks.FIRE;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return  Blocks.FIRE.getDefaultState()
                .with(EAST, state.get(EAST))
                .with(WEST, state.get(WEST))
                .with(NORTH, state.get(NORTH))
                .with(SOUTH, state.get(SOUTH))
                .with(UP, state.get(UP));
    }

}
