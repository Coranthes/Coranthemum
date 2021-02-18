package coranthes.coranthemum.module;

import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.iface.Module;
import coranthes.coranthemum.Coranthemum;
import coranthes.coranthemum.block.BubblePrismarineBlock;

@Module(mod = Coranthemum.MOD_ID, description = "Decorative Blocks crafted with bubble coral and prismarine.")
public class BubblePrismarine extends CharmModule {
    public static BubblePrismarine BUBBLE_PRISMARINE_BLOCK;

    @Override
    public void register() {
        BubblePrismarineBlock BUBBLE_PRISMARINE = new BubblePrismarineBlock(this);
    }
}
