package coranthes.coranthemum.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.CharmBlock;

public class BubbleCoralwoodBlock extends CharmBlock {
    public BubbleCoralwoodBlock(CharmModule module) {
        super(module, "bubble_coralwood", AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    }
}


