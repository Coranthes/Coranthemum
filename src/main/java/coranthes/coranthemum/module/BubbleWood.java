package coranthes.coranthemum.module;

import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.iface.Module;
import coranthes.coranthemum.Coranthemum;
import coranthes.coranthemum.block.BubbleWoodBlock;

//come up with a better name!
@Module(mod = Coranthemum.MOD_ID, description = "Decorative Blocks crafted with bubble coral and wood planks.")
public class BubbleWood extends CharmModule {
    public static BubbleWoodBlock BUBBLE_WOOD_BLOCK;

    @Override
    public void register() {BUBBLE_WOOD_BLOCK = new BubbleWoodBlock(this); }
}
