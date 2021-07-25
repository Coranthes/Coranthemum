package coranthes.coranthemum.module.polished_prismarine;

import coranthes.coranthemum.Coranthemum;
import svenhjol.charm.annotation.CommonModule;
import svenhjol.charm.loader.CharmModule;

@CommonModule(mod = Coranthemum.MOD_ID, description = "Prismarine with a softer texture and a bit of a sparkle.")
public class PolishedPrismarine extends CharmModule {
    public static PolishedPrismarine POLISHED_PRISMARINE_BLOCK;

    @Override
    public void register() {
        PolishedPrismarineBlock POLISHED_PRISMARINE = new PolishedPrismarineBlock(this);
    }
}
