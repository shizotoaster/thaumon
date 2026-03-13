package com.leclowndu93150.thaumon.datagen;

import com.leclowndu93150.thaumon.Thaumon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ThaumonBlockTags {
    public static final TagKey<Block> GREATWOOD_LOGS = BlockTags.create(new ResourceLocation(Thaumon.MOD_ID, "greatwood_logs"));
    public static final TagKey<Block> SILVERWOOD_LOGS = BlockTags.create(new ResourceLocation(Thaumon.MOD_ID, "silverwood_logs"));
}
