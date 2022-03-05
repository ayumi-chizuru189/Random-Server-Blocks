package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.ayumichizuru.randachisvrblk.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

public class GelledLiquid extends Block implements PolymerBlock {
    public static final IntProperty LEVEL = Properties.LEVEL_15;
    private final Block blockmimic1;
    private final Block blockmimic2;
    public GelledLiquid(Block blockmimic1, Block blockmimic2, Settings settings) {
        super(settings);
        this.blockmimic1 = blockmimic1;
        this.blockmimic2 = blockmimic2;
        this.setDefaultState(this.stateManager.getDefaultState().with(LEVEL, 7));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LEVEL);
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        if (blockState.isOf(this)) {
            int i = blockState.get(LEVEL);
            return blockState.with(LEVEL, Math.max(0, i - 1));
        }
        return super.getPlacementState(ctx);
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        int i = state.get(LEVEL);
        if (context.getStack().isOf(this.asItem())) {
            if (context.canReplaceExisting()) {
                return context.getSide() == Direction.UP;
            }
            return true;
        }
        return i == 7;
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return blockmimic1;
    }

    @Override
    public Block getPolymerBlock(ServerPlayerEntity player, BlockState state) {
        return (player.getMainHandStack().isOf(ModItems.GELL_REMOVER)) ? blockmimic2 : blockmimic1;
    }


    @Override
    public BlockState getPolymerBlockState(ServerPlayerEntity player, BlockState state) {
        return (player.getMainHandStack().isOf(ModItems.GELL_REMOVER)) ?
                blockmimic2.getDefaultState()
                .with(CoralParentBlock.WATERLOGGED, true)
                :
                blockmimic1.getDefaultState()
               .with(LEVEL, state.get(LEVEL));
    }

}
