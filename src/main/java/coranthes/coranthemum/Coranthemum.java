package coranthes.coranthemum;

import coranthes.coranthemum.module.*;
import net.fabricmc.api.ModInitializer;
import svenhjol.charm.Charm;
import svenhjol.charm.base.CharmLoader;

import java.util.Arrays;

public class Coranthemum implements ModInitializer {
    public static final String MOD_ID = "coranthemum";

    @Override
    public void onInitialize() {
        // always ensure Charm runs first!
        Charm.runFirst();

        new CharmLoader(Coranthemum.MOD_ID, Arrays.asList(
            BabyChickenBuckets.class,
            BubblePrismarine.class,
            Slate.class,
            TubePrismarine.class,
            PolishedPurpur.class,
            PolishedPrismarine.class,
            DarkPurpur.class
        ));
    }
}
