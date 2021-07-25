package coranthes.coranthemum.module.polished_prismarine;

import net.minecraft.world.level.block.Blocks;
import svenhjol.charm.block.CharmBlock;
import svenhjol.charm.loader.CharmModule;

public class PolishedPrismarineBlock extends CharmBlock {
    public PolishedPrismarineBlock(CharmModule module) {
        super(module, "polished_prismarine", Properties.copy(Blocks.PRISMARINE));
    }
}


