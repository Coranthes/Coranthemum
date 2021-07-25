package coranthes.coranthemum.module.tube_prismarine;

import coranthes.coranthemum.Coranthemum;
import svenhjol.charm.annotation.CommonModule;
import svenhjol.charm.loader.CharmModule;

//come up with a better name!
@CommonModule(mod = Coranthemum.MOD_ID, description = "Decorative Blocks crafted with tube coral and prismarine.")
public class TubePrismarine extends CharmModule {
    public static TubePrismarine TUBE_PRISMARINE_BLOCK;

    @Override
    public void register() {
        TubePrismarineBlock TUBE_PRISMARINE = new TubePrismarineBlock(this);
    }
}
