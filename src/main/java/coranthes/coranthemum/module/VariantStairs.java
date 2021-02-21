package coranthes.coranthemum.module;

import coranthes.coranthemum.Coranthemum;
import net.minecraft.block.BlockState;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import svenhjol.charm.Charm;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.enums.IVariantMaterial;
import coranthes.coranthemum.enums.VariantMaterials;
import svenhjol.charm.base.iface.Module;
import coranthes.coranthemum.block.VariantStairsBlock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Module(mod = Coranthemum.MOD_ID, description = "Stairs in all different materials.")
public class VariantStairs extends CharmModule {
    public static final Map<IVariantMaterial, VariantStairsBlock> STAIRS_BLOCK = new HashMap<>();

    public static boolean isEnabled = false;

    @Override
    public void register() {
        VariantMaterials.getTypes().forEach(type -> {
            STAIRS_BLOCK.put(type, new VariantStairsBlock(this, type));
        });

        isEnabled = this.enabled;
    }

    @Override
    public List<Identifier> getRecipesToRemove() {
        return Arrays.asList(new Identifier(Charm.MOD_ID, "stonecutters/stairs"));
    }
}
