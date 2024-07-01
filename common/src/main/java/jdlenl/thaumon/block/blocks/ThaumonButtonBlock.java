package jdlenl.thaumon.block.blocks;

import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ThaumonButtonBlock extends ButtonBlock {
    public ThaumonButtonBlock(Properties properties, BlockSetType type, int ticksToStayPressed) {
        super(type, ticksToStayPressed, properties);
    }
}
