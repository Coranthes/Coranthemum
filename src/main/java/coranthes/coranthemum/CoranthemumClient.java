package coranthes.coranthemum;

import net.fabricmc.api.ClientModInitializer;
import svenhjol.charm.loader.CharmModule;
import svenhjol.charm.loader.ClientLoader;
import svenhjol.charm.loader.CommonLoader;

public class CoranthemumClient implements ClientModInitializer {
    public static ClientLoader<CharmModule, CommonLoader<CharmModule>> LOADER
            = new ClientLoader<>(Coranthemum.MOD_ID, Coranthemum.LOADER, "coranthes.coranthemum.module");

    @Override
    public void onInitializeClient() {
        LOADER.init();
    }
}
