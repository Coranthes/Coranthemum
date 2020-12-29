package coranthes.coranthemum.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.CharmBlock;

public class BubbleWoodBlock  extends CharmBlock {
    public BubbleWoodBlock(CharmModule module) {
        super(module, "carrot_crate", AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    }
}


