package coranthes.coranthemum;

import net.fabricmc.api.ModInitializer;
import svenhjol.charm.Charm;
import svenhjol.charm.loader.CharmModule;
import svenhjol.charm.loader.CommonLoader;

import java.util.Arrays;

public class Coranthemum implements ModInitializer {
    public static final String MOD_ID = "coranthemum";

    public static CommonLoader<CharmModule> LOADER = new CommonLoader<>(MOD_ID, "coranthes.coranthemum.module");

    @Override
    public void onInitialize() {
        // always ensure Charm runs first!
        Charm.init();
        LOADER.init();


    }
}
