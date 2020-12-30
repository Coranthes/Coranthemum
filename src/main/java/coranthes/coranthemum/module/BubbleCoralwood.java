package coranthes.coranthemum.module;

import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.iface.Module;
import coranthes.coranthemum.Coranthemum;
import coranthes.coranthemum.block.BubbleCoralwoodBlock;

//come up with a better name!
@Module(mod = Coranthemum.MOD_ID, description = "Decorative Blocks crafted with bubble coral and wood planks.")
public class BubbleCoralwood extends CharmModule {
    public static BubbleCoralwood BUBBLE_CCORALWOOD_BLOCK;

    @Override
    public void register() {
        BubbleCoralwoodBlock BUBBLE_CORALWOOD = new BubbleCoralwoodBlock(this);
    }
}
