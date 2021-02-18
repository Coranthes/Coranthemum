package coranthes.coranthemum.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.CharmBlock;

public class PolishedPurpurBlock extends CharmBlock {
    public PolishedPurpurBlock(CharmModule module) {
        super(module, "polished_purpur", AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    }
}


