package jdlenl.thaumon.datagen;

import jdlenl.thaumon.Thaumon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ThaumonBlockTags {
    public static final TagKey<Block> GREATWOOD_LOGS = tag("greatwood_logs");
    public static final TagKey<Block> SILVERWOOD_LOGS = tag("silverwood_logs");

    private static TagKey<Block> tag(String name) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(Thaumon.MOD_ID, name));
    }
}
