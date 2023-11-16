package jdlenl.thaumon.color.fabric;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static jdlenl.thaumon.block.ThaumonBlocks.GREATWOOD_LEAVES;

public class ColorProviderRegistries {
    public static void init() {
        ColorProviderRegistry.BLOCK.register(
                new BlockColorProvider() {
                    @Override
                    public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
                        if (world != null && pos != null) {
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getDefaultColor();
                    }
                }, GREATWOOD_LEAVES.get()
        );

        ColorProviderRegistry.ITEM.register(
                new ItemColorProvider() {
                    @Override
                    public int getColor(ItemStack stack, int tintIndex) {
                        return FoliageColors.getDefaultColor();
                    }
                }, GREATWOOD_LEAVES.get().asItem()
        );
    }
}
