package coranthes.coranthemum.module.dark_purpur;


import net.minecraft.world.level.block.Blocks;
import svenhjol.charm.block.CharmBlock;
import svenhjol.charm.loader.CharmModule;

public class DarkPurpurPillarBlock extends CharmBlock {
    public DarkPurpurPillarBlock(CharmModule module) {
        super(module, "dark_purpur_pillar", Properties.copy(Blocks.PURPUR_BLOCK));
    }
}


