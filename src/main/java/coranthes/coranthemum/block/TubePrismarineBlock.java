package coranthes.coranthemum.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.CharmBlock;

public class TubePrismarineBlock extends CharmBlock {
    public TubePrismarineBlock(CharmModule module) {
        super(module, "tube_prismarine", AbstractBlock.Settings.copy(Blocks.PRISMARINE));
    }
}


