package coranthes.coranthemum.module;

import coranthes.coranthemum.Coranthemum;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.iface.Module;
import coranthes.coranthemum.block.AquaticLanternBlock;
import coranthes.coranthemum.client.AquaticLanternClient;

@Module(mod = Coranthemum.MOD_ID, client = AquaticLanternClient.class, description = "Gold version of the vanilla lanterns.")
public class AquaticLantern extends CharmModule {
    public static AquaticLanternBlock AQUATIC_LANTERN;

    @Override
    public void register() {
        AQUATIC_LANTERN = new AquaticLanternBlock(this, "aquatic_lantern");

    }
}
