package com.v.v_craft.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author Admin
 * date 2023/11/07
 * description： 音乐方块
 */
public class SoundBlock extends Block {
    public SoundBlock(Properties properties) {
        super(properties);
    }

    @SuppressWarnings("deprecation")
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {

        pLevel.playSound(pPlayer, pPos, SoundEvents.NOTE_BLOCK_DIDGERIDOO.get(), SoundSource.BLOCKS, 1.0F, 1.0F);

        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack p_49816_, @Nullable BlockGetter p_49817_, List<Component> p_49818_, TooltipFlag p_49819_) {
        p_49818_.add(Component.literal("Makes sounds when right-clicked!"));
        super.appendHoverText(p_49816_, p_49817_, p_49818_, p_49819_);
    }
}
