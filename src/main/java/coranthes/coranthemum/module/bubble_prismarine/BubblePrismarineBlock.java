package coranthes.coranthemum.module.bubble_prismarine;


import net.minecraft.world.level.block.Blocks;
import svenhjol.charm.block.CharmBlock;
import svenhjol.charm.loader.CharmModule;

public class BubblePrismarineBlock extends CharmBlock {
    public BubblePrismarineBlock(CharmModule module) {
        super(module, "bubble_prismarine", Properties.copy(Blocks.PRISMARINE));
    }
}


