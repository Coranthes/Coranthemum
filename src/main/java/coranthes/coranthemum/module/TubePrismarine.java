package coranthes.coranthemum.module;

import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.iface.Module;
import coranthes.coranthemum.Coranthemum;
import coranthes.coranthemum.block.TubePrismarineBlock;

//come up with a better name!
@Module(mod = Coranthemum.MOD_ID, description = "Decorative Blocks crafted with tube coral and prismarine.")
public class TubePrismarine extends CharmModule {
    public static TubePrismarine TUBE_PRISMARINE_BLOCK;

    @Override
    public void register() {
        TubePrismarineBlock TUBE_PRISMARINE = new TubePrismarineBlock(this);
    }
}
