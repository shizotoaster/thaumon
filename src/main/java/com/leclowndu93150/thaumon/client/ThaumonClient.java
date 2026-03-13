package com.leclowndu93150.thaumon.client;

import com.leclowndu93150.thaumon.Thaumon;
import com.leclowndu93150.thaumon.block.ThaumonBlocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Thaumon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ThaumonClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderType cutout = RenderType.cutout();
            RenderType translucent = RenderType.translucent();

            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.AMBERGLASS.get(), translucent);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.AMBERGLASS_PANE.get(), translucent);

            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.GREATWOOD_DOOR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.GREATWOOD_TRAPDOOR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.GILDED_GREATWOOD_DOOR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.GILDED_GREATWOOD_TRAPDOOR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.GREATWOOD_WINDOW.get(), translucent);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.GREATWOOD_WINDOW_PANE.get(), translucent);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.GREATWOOD_LEAVES.get(), cutout);

            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.SILVERWOOD_DOOR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.SILVERWOOD_TRAPDOOR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.SILVERWOOD_WINDOW.get(), translucent);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.SILVERWOOD_WINDOW_PANE.get(), translucent);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.SILVERWOOD_LEAVES.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.SILVERWOOD_LEAF_WALL.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.SILVERWOOD_LEAF_POST.get(), cutout);

            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.ARCANE_STONE_WINDOW.get(), translucent);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.ARCANE_STONE_WINDOW_PANE.get(), translucent);

            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.ELDRITCH_STONE_WINDOW.get(), translucent);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.ELDRITCH_STONE_WINDOW_PANE.get(), translucent);

            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.ANCIENT_STONE_DOOR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.ANCIENT_STONE_WINDOW.get(), translucent);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.ANCIENT_STONE_WINDOW_PANE.get(), translucent);

            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.GRIMOIRE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.GRIMOIRE_STACK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.RESEARCH_NOTES.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.CRYSTAL_LAMP.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.RETORT.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.VIAL_RACK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ThaumonBlocks.CRYSTAL_STAND.get(), cutout);
        });
    }

    @SubscribeEvent
    public static void onBlockColors(ColorHandlerEvent.Block event) {
        BlockColors colors = event.getBlockColors();
        colors.register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                ThaumonBlocks.GREATWOOD_LEAVES.get());
    }

    @SubscribeEvent
    public static void onItemColors(ColorHandlerEvent.Item event) {
        ItemColors colors = event.getItemColors();
        colors.register((stack, tintIndex) -> FoliageColor.getDefaultColor(),
                ThaumonBlocks.GREATWOOD_LEAVES.get());
    }
}
