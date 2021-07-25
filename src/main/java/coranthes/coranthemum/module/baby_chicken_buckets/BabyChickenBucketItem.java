package coranthes.coranthemum.module.baby_chicken_buckets;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import svenhjol.charm.helper.ItemNbtHelper;
import svenhjol.charm.helper.MobHelper;
import svenhjol.charm.item.CharmItem;
import svenhjol.charm.loader.CharmModule;

public class BabyChickenBucketItem extends CharmItem {
    public static final String STORED_CHICKEN = "stored_chicken";

    public BabyChickenBucketItem(CharmModule module) {
        super(module, "baby_chicken_bucket", new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {

        BlockPos pos = player.blockPosition();
        Direction facing = player.getDirection();
        ItemStack held = player.getItemInHand(hand);

        world.playSound(null, player.blockPosition(), SoundEvents.CHICKEN_AMBIENT, SoundSource.NEUTRAL, 1.0F, 1.25F);

        if (!world.isClientSide && !player.isCreative()) {
            double x = pos.getX() + 0.5F + facing.getStepX();
            double y = pos.getY() + 0.25F + (world.random.nextFloat() / 2.0F) + facing.getStepY();
            double z = pos.getZ() + 0.5F + facing.getStepZ();
            BlockPos spawnPos = new BlockPos(x, y, z);

            // spawn the chicken
            Chicken chicken = MobHelper.spawn(EntityType.CHICKEN, (ServerLevel) world, spawnPos, MobSpawnType.BUCKET);
            if (chicken != null) {

                CompoundTag data = ItemNbtHelper.getCompound(held, STORED_CHICKEN);
                if (!data.isEmpty())
                    chicken.readAdditionalSaveData(data);

                world.addFreshEntity(chicken);
            }
        }
        player.swing(hand);

        if (!player.isCreative())
            player.setItemInHand(hand, new ItemStack(Items.BUCKET));

        return InteractionResultHolder.consume(held);
    }
}
