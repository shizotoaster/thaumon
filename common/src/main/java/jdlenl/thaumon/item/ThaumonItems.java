package jdlenl.thaumon.item;

import dev.architectury.injectables.annotations.ExpectPlatform;
import jdlenl.thaumon.item.items.MutagenItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import java.util.function.Supplier;

public class ThaumonItems {
    public static Supplier<Item> MUTAGEN;

    public static void init() {
        MUTAGEN = registerItem("mutagen", () -> new MutagenItem(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC)));
    }

    @ExpectPlatform
    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> supplier) {
        throw new AssertionError();
    }
}
