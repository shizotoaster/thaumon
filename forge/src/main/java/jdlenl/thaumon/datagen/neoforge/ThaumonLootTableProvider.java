package jdlenl.thaumon.datagen.neoforge;

import net.minecraft.data.DataOutput;
import net.minecraft.data.server.loottable.LootTableProvider;
import net.minecraft.loot.context.LootContextTypes;

import java.util.List;
import java.util.Set;

public class ThaumonLootTableProvider {
    public static LootTableProvider create(DataOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.LootTypeGenerator(ThaumonBlockLootTables::new, LootContextTypes.BLOCK)
        ));
    }
}
