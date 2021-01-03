package coranthes.coranthemum.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.block.CharmBlock;

import java.util.Random;

public class SlateBlock extends CharmBlock {
    public SlateBlock(CharmModule module) {
        super(module, "slate", FabricBlockSettings
                .of(Material.STONE)
                .sounds(BlockSoundGroup.STONE)
                .breakByTool(FabricToolTags.PICKAXES)
                .strength(2.0F)
        );
    }

    @Override
    public ItemGroup getItemGroup() {
        return ItemGroup.BUILDING_BLOCKS;
    }
}