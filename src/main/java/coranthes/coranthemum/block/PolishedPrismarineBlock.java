package coranthes.coranthemum.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.CharmBlock;

public class PolishedPrismarineBlock extends CharmBlock {
    public PolishedPrismarineBlock(CharmModule module) {
        super(module, "polished_prismarine", AbstractBlock.Settings.copy(Blocks.PRISMARINE));
    }
}


