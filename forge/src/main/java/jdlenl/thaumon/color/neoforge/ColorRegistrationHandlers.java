package jdlenl.thaumon.color.neoforge;

import jdlenl.thaumon.Thaumon;
import net.minecraft.block.BlockState;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
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
        event.register(new BlockColorProvider() {
            @Override
            public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
                if (world != null && pos != null) {
                    return BiomeColors.getFoliageColor(world, pos);
                }
                return FoliageColors.getDefaultColor();
            }
        }, GREATWOOD_LEAVES.get());
    }

    @SubscribeEvent
    public static void onItemColorHandlerRegistration(RegisterColorHandlersEvent.Item event) {
        event.register(new ItemColorProvider() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return FoliageColors.getDefaultColor();
            }
        }, GREATWOOD_LEAVES.get().asItem());
    }
}
