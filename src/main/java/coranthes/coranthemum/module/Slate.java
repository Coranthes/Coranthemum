package coranthes.coranthemum.module;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import coranthes.coranthemum.Coranthemum;
import coranthes.coranthemum.block.SlateBlock;
import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.iface.Module;

@Module(mod = Coranthemum.MOD_ID, description = "New stone added to worldgen.")
public class Slate extends CharmModule {
    public static Identifier ID = new Identifier(Coranthemum.MOD_ID, "slate");
    public static SlateBlock SLATE_BLOCK;

    public static ConfiguredFeature<?, ?> FEATURE;

    @Override
    public void register() {
        SLATE_BLOCK = new SlateBlock(this);

//        SLATE_BLOCK_GEN = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, SLATE_BLOCK.getDefaultState(), 33)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(25, 0, 120)).spreadHorizontally().repeat(8));

        FEATURE = Feature.ORE
                .configure(new OreFeatureConfig(
                        OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                        SLATE_BLOCK.getDefaultState(),
                        10)) // vein size
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        0, // bottom offset
                        0, // min y level
                        // max y level
                        70)))
                .spreadHorizontally()
                .repeat(5); // number of veins per chunk

        RegistryKey<ConfiguredFeature<?, ?>> key = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, ID);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, key);
    }

}