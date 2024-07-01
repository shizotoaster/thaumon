package jdlenl.thaumon.neoforge;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.block.neoforge.ThaumonBlocksImpl;
import jdlenl.thaumon.item.neoforge.ThaumonItemsImpl;
import jdlenl.thaumon.itemgroup.neoforge.ThaumonItemGroupForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Thaumon.MOD_ID)
public class ThaumonNeoForge {
    public ThaumonNeoForge(IEventBus eventBus) {
        Thaumon.init();

        ThaumonItemGroupForge.ITEM_GROUPS.register(eventBus);
        ThaumonBlocksImpl.BLOCKS.register(eventBus);
        ThaumonItemsImpl.ITEMS.register(eventBus);
    }
}
