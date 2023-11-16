package jdlenl.thaumon.forge;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.block.forge.ThaumonBlocksImpl;
import jdlenl.thaumon.color.forge.ColorRegistrationHandlers;
import jdlenl.thaumon.item.forge.ThaumonItemsImpl;
import jdlenl.thaumon.itemgroup.forge.ThaumonItemGroupForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Thaumon.MOD_ID)
public class ThaumonForge {
    public ThaumonForge() {
        Thaumon.init();

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ThaumonItemGroupForge.ITEM_GROUPS.register(eventBus);
        ThaumonBlocksImpl.BLOCKS.register(eventBus);
        ThaumonItemsImpl.ITEMS.register(eventBus);

        eventBus.addListener(ColorRegistrationHandlers::onBlockColorHandlerRegistration);
        eventBus.addListener(ColorRegistrationHandlers::onItemColorHandlerRegistration);
    }
}
