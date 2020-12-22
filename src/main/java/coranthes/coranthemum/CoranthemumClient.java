package coranthes.coranthemum;

import net.fabricmc.api.ClientModInitializer;
import svenhjol.charm.base.CharmClientLoader;

public class CoranthemumClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        new CharmClientLoader(Coranthemum.MOD_ID);
    }
}
