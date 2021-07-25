package coranthes.coranthemum.module.variant_stairs;

import coranthes.coranthemum.Coranthemum;
import net.minecraft.resources.ResourceLocation;
import svenhjol.charm.Charm;
import coranthes.coranthemum.enums.VariantMaterial;
import svenhjol.charm.annotation.CommonModule;
import svenhjol.charm.block.CharmStairsBlock;
import svenhjol.charm.enums.IWoodMaterial;
import svenhjol.charm.loader.CharmModule;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CommonModule(mod = Coranthemum.MOD_ID, description = "Stairs in all different materials.")
public class VariantStairs extends CharmModule {
    public static final Map<IWoodMaterial, CharmStairsBlock> STAIRS_BLOCK = new HashMap<>();

    public static boolean isEnabled = false;

    @Override
    public void register() {
        VariantMaterial.getTypes().forEach(type -> {
            STAIRS_BLOCK.put(type, new CharmStairsBlock(this, type.getSerializedName()+"_stairs", type.getBlock()));
        });

        isEnabled = this.isEnabled();
    }


}
