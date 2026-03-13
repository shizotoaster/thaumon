package com.leclowndu93150.thaumon;

import com.leclowndu93150.thaumon.block.ThaumonBlocks;
import com.leclowndu93150.thaumon.item.ThaumonItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Thaumon.MOD_ID)
public class Thaumon {
    public static final String MOD_ID = "thaumon";

    public static final CreativeModeTab TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ThaumonBlocks.ARCANE_STONE.get());
        }
    };

    public Thaumon() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        ThaumonBlocks.register(bus);
        ThaumonItems.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
