package com.leclowndu93150.thaumon.item;

import com.leclowndu93150.thaumon.Thaumon;
import com.leclowndu93150.thaumon.item.items.MutagenItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ThaumonItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Thaumon.MOD_ID);

    public static final RegistryObject<Item> MUTAGEN = ITEMS.register("mutagen",
            () -> new MutagenItem(new Item.Properties().tab(Thaumon.TAB).stacksTo(64).rarity(Rarity.EPIC)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
