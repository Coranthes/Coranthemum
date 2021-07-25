package coranthes.coranthemum.enums;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import svenhjol.charm.enums.IWoodMaterial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum VariantMaterial implements IWoodMaterial {
    CONCRETE(Blocks.BLACK_CONCRETE),
    TERRACOTTA(Blocks.BLACK_TERRACOTTA);

    private Block block;

    private VariantMaterial(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

    public static List<VariantMaterial> getTypes() {
        return Arrays.stream(values()).collect(Collectors.toList());
    }

    public static List<VariantMaterial> getTypesWithout(VariantMaterial... types) {
        List<VariantMaterial> typesList = new ArrayList<>(Arrays.asList(types));
        return Arrays.stream(values()).filter(t -> !typesList.contains(t)).collect(Collectors.toList());
    }
}
