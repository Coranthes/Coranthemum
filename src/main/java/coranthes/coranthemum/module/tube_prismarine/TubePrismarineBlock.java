package coranthes.coranthemum.module.tube_prismarine;


import net.minecraft.world.level.block.Blocks;
import svenhjol.charm.block.CharmBlock;
import svenhjol.charm.loader.CharmModule;

public class TubePrismarineBlock extends CharmBlock {
    public TubePrismarineBlock(CharmModule module) {
        super(module, "tube_prismarine", Properties.copy(Blocks.PRISMARINE));
    }
}


