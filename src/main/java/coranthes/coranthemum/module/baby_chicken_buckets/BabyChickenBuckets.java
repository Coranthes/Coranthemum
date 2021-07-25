package coranthes.coranthemum.module.baby_chicken_buckets;

import coranthes.coranthemum.Coranthemum;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import svenhjol.charm.annotation.CommonModule;
import svenhjol.charm.helper.ItemNbtHelper;
import svenhjol.charm.helper.PlayerHelper;
import svenhjol.charm.loader.CharmModule;


@CommonModule(mod = Coranthemum.MOD_ID, description = "Transport a baby chicken using a bucket.")
public class BabyChickenBuckets extends CharmModule {
    public static BabyChickenBucketItem BABY_CHICKEN_BUCKET;

    @Override
    public void register() {
        BABY_CHICKEN_BUCKET = new BabyChickenBucketItem(this);
    }

    @Override
    public void runWhenEnabled() {
        UseEntityCallback.EVENT.register(this::tryCapture);
    }

    private InteractionResult tryCapture(Player player, Level world, InteractionHand hand, Entity entity, EntityHitResult hitResult) {
        if (!entity.level.isClientSide
            && entity instanceof Chicken
            && ((Chicken)entity).getHealth() > 0
            && ((Chicken)entity).isBaby()
        ) {
            Chicken chicken = (Chicken)entity;
            ItemStack held = player.getItemInHand(hand);

            if (held.isEmpty() || held.getItem() != Items.BUCKET)
                return InteractionResult.PASS;

            ItemStack chickenBucket = new ItemStack(BABY_CHICKEN_BUCKET);
            CompoundTag tag = new CompoundTag();
            ItemNbtHelper.setCompound(chickenBucket, BabyChickenBucketItem.STORED_CHICKEN, chicken.saveWithoutId(tag));

            if (held.getCount() == 1) {
                player.setItemInHand(hand, chickenBucket);
            } else {
                held.shrink(1);
                PlayerHelper.addOrDropStack(player, chickenBucket);
            }

            player.swing(hand);
            entity.discard();
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
}
