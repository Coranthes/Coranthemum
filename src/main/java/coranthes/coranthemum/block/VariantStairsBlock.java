package coranthes.coranthemum.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.ICharmBlock;
import svenhjol.charm.base.enums.IVariantMaterial;

public class VariantStairsBlock extends StairsBlock implements ICharmBlock {
    private final CharmModule module;

    public VariantStairsBlock(CharmModule module, IVariantMaterial type) {
        super(Blocks.STONE_STAIRS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STONE_STAIRS));
        register(module, type.asString() + "_stairs");

        this.module = module;
    }

    @Override
    public void addStacksForDisplay(ItemGroup group, DefaultedList<ItemStack> list) {
        if (enabled())
            super.addStacksForDisplay(group, list);
    }

    @Override
    public boolean enabled() {
        return module.enabled;
    }
}
