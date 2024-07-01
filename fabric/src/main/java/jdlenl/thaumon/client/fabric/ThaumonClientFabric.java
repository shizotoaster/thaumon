package jdlenl.thaumon.client.fabric;

import jdlenl.thaumon.color.fabric.ColorProviderRegistries;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

import static jdlenl.thaumon.block.ThaumonBlocks.*;

public class ThaumonClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.translucent(),
                AMBERGLASS.get(),
                AMBERGLASS_PANE.get()
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                GREATWOOD_WINDOW.get(),
                GREATWOOD_WINDOW_PANE.get(),
                SILVERWOOD_WINDOW.get(),
                SILVERWOOD_WINDOW_PANE.get(),
                ARCANE_STONE_WINDOW.get(),
                ARCANE_STONE_WINDOW_PANE.get(),
                ELDRITCH_STONE_WINDOW.get(),
                ELDRITCH_STONE_WINDOW_PANE.get(),
                ANCIENT_STONE_WINDOW.get(),
                ANCIENT_STONE_WINDOW_PANE.get(),
                SILVERWOOD_DOOR.get(),
                ANCIENT_STONE_DOOR.get(),
                GREATWOOD_DOOR.get(),
                GILDED_GREATWOOD_DOOR.get(),
                SILVERWOOD_TRAPDOOR.get(),
                GREATWOOD_TRAPDOOR.get(),
                GILDED_GREATWOOD_TRAPDOOR.get(),
                RESEARCH_NOTES.get()
        );

        ColorProviderRegistries.init();
    }
}
