package coranthes.coranthemum.module;

import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.iface.Module;
import coranthes.coranthemum.Coranthemum;
import coranthes.coranthemum.block.PolishedPrismarineBlock;

@Module(mod = Coranthemum.MOD_ID, description = "Prismarine with a softer texture and a bit of a sparkle.")
public class PolishedPrismarine extends CharmModule {
    public static PolishedPrismarine POLISHED_PRISMARINE_BLOCK;

    @Override
    public void register() {
        PolishedPrismarineBlock POLISHED_PRISMARINE = new PolishedPrismarineBlock(this);
    }
}
