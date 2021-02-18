package coranthes.coranthemum.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.CharmBlock;

public class DarkPurpurPillarBlock extends CharmBlock {
    public DarkPurpurPillarBlock(CharmModule module) {
        super(module, "dark_purpur_pillar", AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    }
}


