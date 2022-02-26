package net.ayumichizuru.randachisvrblk.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SurvivalLightBlock extends LightBlock implements PolymerBlock {
    public SurvivalLightBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        return false;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            world.setBlockState(pos, (BlockState)state.cycle(LEVEL_15), Block.NOTIFY_LISTENERS);
            player.sendMessage(new TranslatableText("block.randachisvrblk.survival_light.used", (state.get(LEVEL_15) == 15) ? 0 : state.get(LEVEL_15) + 1), true);
            return ActionResult.SUCCESS;
        }
        return ActionResult.CONSUME;
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return Blocks.LIGHT;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return Blocks.LIGHT.getDefaultState()
                .with(LightBlock.LEVEL_15, state.get(LightBlock.LEVEL_15))
                .with(LightBlock.WATERLOGGED, state.get(LightBlock.WATERLOGGED));
    }

}
