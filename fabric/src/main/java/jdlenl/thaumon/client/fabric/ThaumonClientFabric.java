package jdlenl.thaumon.client.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static jdlenl.thaumon.block.ThaumonBlocks.*;

public class ThaumonClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(AMBERGLASS.get(), RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AMBERGLASS_PANE.get(), RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GREATWOOD_WINDOW.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GREATWOOD_WINDOW_PANE.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SILVERWOOD_WINDOW.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SILVERWOOD_WINDOW_PANE.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ARCANE_STONE_WINDOW.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ARCANE_STONE_WINDOW_PANE.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ELDRITCH_STONE_WINDOW.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ELDRITCH_STONE_WINDOW_PANE.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ANCIENT_STONE_WINDOW.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ANCIENT_STONE_WINDOW_PANE.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SILVERWOOD_DOOR.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ANCIENT_STONE_DOOR.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GREATWOOD_DOOR.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GILDED_GREATWOOD_DOOR.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SILVERWOOD_TRAPDOOR.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GREATWOOD_TRAPDOOR.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GILDED_GREATWOOD_TRAPDOOR.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RESEARCH_NOTES.get(), RenderLayer.getCutout());
    }
}
