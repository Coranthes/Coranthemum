package coranthes.coranthemum.module.dark_purpur;

import net.minecraft.world.level.block.Blocks;
import svenhjol.charm.block.CharmBlock;
import svenhjol.charm.loader.CharmModule;

public class DarkPurpurBlock extends CharmBlock {
    public DarkPurpurBlock(CharmModule module) {
        super(module, "dark_purpur", Properties.copy(Blocks.PURPUR_BLOCK));
    }
}


