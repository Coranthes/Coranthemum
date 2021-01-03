package coranthes.coranthemum;

import coranthes.coranthemum.module.BabyChickenBuckets;
import coranthes.coranthemum.module.BubbleCoralwood;
import coranthes.coranthemum.module.Slate;
import net.fabricmc.api.ModInitializer;
import svenhjol.charm.Charm;
import svenhjol.charm.base.CharmLoader;
import coranthes.coranthemum.module.AquaticLantern;

import java.util.Arrays;

public class Coranthemum implements ModInitializer {
    public static final String MOD_ID = "coranthemum";

    @Override
    public void onInitialize() {
        // always ensure Charm runs first!
        Charm.runFirst();

        new CharmLoader(Coranthemum.MOD_ID, Arrays.asList(
            BabyChickenBuckets.class,
            BubbleCoralwood.class,
            Slate.class,
            AquaticLantern.class
        ));
    }
}
