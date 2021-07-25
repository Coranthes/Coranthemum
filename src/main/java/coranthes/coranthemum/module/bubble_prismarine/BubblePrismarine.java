package coranthes.coranthemum.module.bubble_prismarine;

import svenhjol.charm.annotation.CommonModule;
import coranthes.coranthemum.Coranthemum;
import svenhjol.charm.loader.CharmModule;

@CommonModule(mod = Coranthemum.MOD_ID, description = "Decorative Blocks crafted with bubble coral and prismarine.")
public class BubblePrismarine extends CharmModule {
    public static BubblePrismarine BUBBLE_PRISMARINE_BLOCK;

    @Override
    public void register() {
        BubblePrismarineBlock BUBBLE_PRISMARINE = new BubblePrismarineBlock(this);
    }
}
