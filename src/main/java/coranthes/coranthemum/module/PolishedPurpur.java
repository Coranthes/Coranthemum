package coranthes.coranthemum.module;

import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.iface.Module;
import coranthes.coranthemum.Coranthemum;
import coranthes.coranthemum.block.PolishedPurpurBlock;
import coranthes.coranthemum.block.PolishedPurpurPillarBlock;

@Module(mod = Coranthemum.MOD_ID, description = "Polished Purpur Variants.")
public class PolishedPurpur extends CharmModule {
    public static PolishedPurpurBlock POLISHED_PURPUR;
    public static PolishedPurpurPillarBlock POLISHED_PURPUR_PILLAR;

    @Override
    public void register() {
        POLISHED_PURPUR = new PolishedPurpurBlock(this);
        POLISHED_PURPUR_PILLAR = new PolishedPurpurPillarBlock(this);
    }
}
