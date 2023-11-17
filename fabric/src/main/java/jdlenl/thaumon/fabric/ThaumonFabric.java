package jdlenl.thaumon.fabric;

import jdlenl.thaumon.Thaumon;
import jdlenl.thaumon.itemgroup.fabric.ThaumonItemGroupFabric;
import net.fabricmc.api.ModInitializer;

public class ThaumonFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Thaumon.init();

        ThaumonItemGroupFabric.init();
    }
}
