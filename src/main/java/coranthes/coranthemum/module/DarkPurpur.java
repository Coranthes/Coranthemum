package coranthes.coranthemum.module;

import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.iface.Module;
import coranthes.coranthemum.Coranthemum;
import coranthes.coranthemum.block.DarkPurpurBlock;
import coranthes.coranthemum.block.DarkPurpurPillarBlock;


@Module(mod = Coranthemum.MOD_ID, description = "Dark version of Purpur.")
public class DarkPurpur extends CharmModule {
    public static DarkPurpurBlock DARK_PURPUR;
    public static DarkPurpurPillarBlock DARK_PURPUR_PILLAR;

    @Override
    public void register() {
        DARK_PURPUR= new DarkPurpurBlock(this);
        DARK_PURPUR_PILLAR = new DarkPurpurPillarBlock(this);
    }
}
