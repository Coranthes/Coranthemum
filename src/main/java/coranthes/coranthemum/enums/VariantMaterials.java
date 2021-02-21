package coranthes.coranthemum.enums;

import svenhjol.charm.base.enums.IVariantMaterial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum VariantMaterials implements IVariantMaterial {
    CONCRETE,
    TERRACOTTA;

    public static List<IVariantMaterial> getTypes() {
        return Arrays.stream(values()).collect(Collectors.toList());
    }

    public static List<IVariantMaterial> getTypesWithout(IVariantMaterial... types) {
        List<IVariantMaterial> typesList = new ArrayList<>(Arrays.asList(types));
        return Arrays.stream(values()).filter(t -> !typesList.contains(t)).collect(Collectors.toList());
    }
}
