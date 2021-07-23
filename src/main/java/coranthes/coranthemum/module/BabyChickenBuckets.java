package coranthes.coranthemum.module;

import coranthes.coranthemum.Coranthemum;
import coranthes.coranthemum.item.BabyChickenBucketItem;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import svenhjol.charm.loader.CharmModule;


@Module(mod = Coranthemum.MOD_ID, description = "Transport a baby chicken using a bucket.")
public class BabyChickenBuckets extends CharmModule {
    public static BabyChickenBucketItem BABY_CHICKEN_BUCKET;

    @Override
    public void register() {
        BABY_CHICKEN_BUCKET = new BabyChickenBucketItem(this);
    }

    @Override
    public void init() {
        UseEntityCallback.EVENT.register(this::tryCapture);
    }

    private ActionResult tryCapture(PlayerEntity player, World world, Hand hand, Entity entity, EntityHitResult hitResult) {
        if (!entity.world.isClient
            && entity instanceof ChickenEntity
            && ((ChickenEntity)entity).getHealth() > 0
            && ((ChickenEntity)entity).isBaby()
        ) {
            ChickenEntity chicken = (ChickenEntity)entity;
            ItemStack held = player.getStackInHand(hand);

            if (held.isEmpty() || held.getItem() != Items.BUCKET)
                return ActionResult.PASS;

            ItemStack chickenBucket = new ItemStack(BABY_CHICKEN_BUCKET);
            CompoundTag tag = new CompoundTag();
            ItemNBTHelper.setCompound(chickenBucket, BabyChickenBucketItem.STORED_CHICKEN, chicken.toTag(tag));

            if (held.getCount() == 1) {
                player.setStackInHand(hand, chickenBucket);
            } else {
                held.decrement(1);
                PlayerHelper.addOrDropStack(player, chickenBucket);
            }

            player.swingHand(hand);
            entity.remove();
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
