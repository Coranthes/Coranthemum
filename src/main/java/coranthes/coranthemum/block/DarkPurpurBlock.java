package coranthes.coranthemum.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.CharmBlock;

public class DarkPurpurBlock extends CharmBlock {
    public DarkPurpurBlock(CharmModule module) {
        super(module, "dark_purpur", AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    }
}


