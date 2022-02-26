package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.WallMountLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class TorchLever extends LeverBlock implements PolymerBlock {
    private final Block blockmimic1;
    private final Block blockmimic2;
    protected TorchLever(Block blockmimic1, Block blockmimic2, Settings settings) {
        super(settings);
        this.blockmimic1 = blockmimic1;
        this.blockmimic2 = blockmimic2;
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        if (state.get(FACE) == WallMountLocation.WALL) {
            return state.get(POWERED) ? Blocks.LEVER : blockmimic2;
        } else {
            return state.get(POWERED) ? Blocks.LEVER : blockmimic1;
        }
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        if (state.get(FACE) == WallMountLocation.WALL) {
                     return state.get(POWERED) ? Blocks.LEVER.getDefaultState()
                            .with(LeverBlock.FACE, state.get(LeverBlock.FACE))
                            .with(LeverBlock.FACING, state.get(LeverBlock.FACING))
                            .with(LeverBlock.POWERED, true)
                            :
                            blockmimic2.getDefaultState()
                            .with(WallTorchBlock.FACING, state.get(LeverBlock.FACING));
        } else {
                     return state.get(POWERED) ? Blocks.LEVER.getDefaultState()
                            .with(LeverBlock.FACE, state.get(LeverBlock.FACE))
                            .with(LeverBlock.FACING, state.get(LeverBlock.FACING))
                            .with(LeverBlock.POWERED, true)
                            :
                            blockmimic1.getDefaultState();
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            BlockState blockState = state.cycle(POWERED);
            return ActionResult.SUCCESS;
        } else {
            BlockState blockState = this.togglePower(state, world, pos);
            world.emitGameEvent(player, blockState.get(POWERED) ? GameEvent.BLOCK_SWITCH : GameEvent.BLOCK_UNSWITCH, pos);
            return ActionResult.CONSUME;
        }
    }

}
