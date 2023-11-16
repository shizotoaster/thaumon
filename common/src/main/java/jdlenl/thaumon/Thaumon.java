package jdlenl.thaumon;

import jdlenl.thaumon.block.ThaumonBlocks;
import jdlenl.thaumon.item.ThaumonItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thaumon {
    public static final String MOD_ID = "thaumon";
    public static Logger logger = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        ThaumonItems.init();
        ThaumonBlocks.init();
    }
}
