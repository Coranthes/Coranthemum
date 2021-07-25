package coranthes.coranthemum.module.dark_purpur;

import coranthes.coranthemum.Coranthemum;
import svenhjol.charm.annotation.CommonModule;
import svenhjol.charm.loader.CharmModule;


@CommonModule(mod = Coranthemum.MOD_ID, description = "Dark version of Purpur.")
public class DarkPurpur extends CharmModule {
    public static DarkPurpurBlock DARK_PURPUR;
    public static DarkPurpurPillarBlock DARK_PURPUR_PILLAR;

    @Override
    public void register() {
        DARK_PURPUR= new DarkPurpurBlock(this);
        DARK_PURPUR_PILLAR = new DarkPurpurPillarBlock(this);
    }
}
