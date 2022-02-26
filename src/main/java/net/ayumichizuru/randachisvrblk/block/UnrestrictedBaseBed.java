package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.BedPart;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.BlockTags;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UnrestrictedBaseBed extends BedBlock implements PolymerBlock {
    private final Block blockmimic;
    public UnrestrictedBaseBed(DyeColor color, Block blockmimic, Settings settings) {
        super(color, settings);
        this.blockmimic = blockmimic;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return state;
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        this.spawnBreakParticles(world, player, pos, state);
        if (state.isIn(BlockTags.GUARDED_BY_PIGLINS)) {
            PiglinBrain.onGuardedBlockInteracted(player, false);
        }

        world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.CONSUME;
        }
        if (state.get(PART) != BedPart.HEAD && !(state = world.getBlockState(pos = pos.offset(state.get(FACING)))).isOf(this)) {
            return ActionResult.CONSUME;
        }
        if (state.get(OCCUPIED)) {
            if (!this.wakeVillager(world, pos)) {
                player.sendMessage(new TranslatableText("block.minecraft.bed.occupied"), true);
            }
            return ActionResult.SUCCESS;
        }
        player.trySleep(pos).ifLeft(reason -> {
            if (reason != null) {
                player.sendMessage(reason.getMessage(), true);
            }
        });
        return ActionResult.SUCCESS;
    }

    private boolean wakeVillager(World world, BlockPos pos) {
        List<VillagerEntity> list = world.getEntitiesByClass(VillagerEntity.class, new Box(pos), LivingEntity::isSleeping);
        if (list.isEmpty()) {
            return false;
        }
        list.get(0).wakeUp();
        return true;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getSide();
        BlockPos blockPos = ctx.getBlockPos();
        return (BlockState)((BlockState) this.getDefaultState().with(FACING, ctx.getPlayerFacing())).with(PART, direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getHitPos().y - (double)blockPos.getY() > 0.5D)) ? BedPart.FOOT : BedPart.HEAD);
    }

    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.PUSH_ONLY;
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return blockmimic;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return blockmimic.getDefaultState()
                .with(BedBlock.FACING, state.get(BedBlock.FACING))
                .with(BedBlock.PART, state.get(BedBlock.PART))
                .with(BedBlock.OCCUPIED, state.get(BedBlock.OCCUPIED));
    }

}
