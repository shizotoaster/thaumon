package jdlenl.thaumon.color.fabric;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import static jdlenl.thaumon.block.ThaumonBlocks.GREATWOOD_LEAVES;

public class ColorProviderRegistries {
    public static void init() {
        ColorProviderRegistry.BLOCK.register(
                new BlockColor() {
                    @Override
                    public int getColor(BlockState state, @Nullable BlockAndTintGetter world, @Nullable BlockPos pos, int tintIndex) {
                        if (world != null && pos != null) {
                            return BiomeColors.getAverageFoliageColor(world, pos);
                        }
                        return FoliageColor.getDefaultColor();
                    }
                }, GREATWOOD_LEAVES.get()
        );

        ColorProviderRegistry.ITEM.register(
                new ItemColor() {
                    @Override
                    public int getColor(ItemStack stack, int tintIndex) {
                        return FoliageColor.getDefaultColor();
                    }
                }, GREATWOOD_LEAVES.get().asItem()
        );
    }
}
