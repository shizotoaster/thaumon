package jdlenl.thaumon.color.neoforge;

import jdlenl.thaumon.Thaumon;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import org.jetbrains.annotations.Nullable;

import static jdlenl.thaumon.block.ThaumonBlocks.GREATWOOD_LEAVES;

@Mod.EventBusSubscriber(modid = Thaumon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ColorRegistrationHandlers {
    @SubscribeEvent
    public static void onBlockColorHandlerRegistration(RegisterColorHandlersEvent.Block event) {
        event.register(new BlockColor() {
            @Override
            public int getColor(BlockState state, @Nullable BlockAndTintGetter world, @Nullable BlockPos pos, int tintIndex) {
                if (world != null && pos != null) {
                    return BiomeColors.getAverageFoliageColor(world, pos);
                }
                return FoliageColor.getDefaultColor();
            }
        }, GREATWOOD_LEAVES.get());
    }

    @SubscribeEvent
    public static void onItemColorHandlerRegistration(RegisterColorHandlersEvent.Item event) {
        event.register(new ItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return FoliageColor.getDefaultColor();
            }
        }, GREATWOOD_LEAVES.get().asItem());
    }
}
