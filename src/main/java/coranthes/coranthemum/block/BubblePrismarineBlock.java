package coranthes.coranthemum.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.CharmBlock;

public class BubblePrismarineBlock extends CharmBlock {
    public BubblePrismarineBlock(CharmModule module) {
        super(module, "bubble_prismarine", AbstractBlock.Settings.copy(Blocks.PRISMARINE));
    }
}


