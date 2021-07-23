package coranthes.coranthemum.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import svenhjol.charm.item.CharmItem;
import svenhjol.charm.loader.CharmModule;

public class BabyChickenBucketItem extends CharmItem {
    public static final String STORED_CHICKEN = "stored_chicken";

    public BabyChickenBucketItem(CharmModule module) {
        super(module, "baby_chicken_bucket", new Item.Settings().group(ItemGroup.MISC).maxCount(1));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (context.getPlayer() == null || context.getWorld().isClient)
            return ActionResult.FAIL;

        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        Direction facing = context.getSide();
        Hand hand = context.getHand();
        ItemStack held = player.getStackInHand(hand);

        world.playSound(null, player.getBlockPos(), SoundEvents.ENTITY_CHICKEN_AMBIENT, SoundCategory.NEUTRAL, 1.0F, 1.25F);

        if (!world.isClient && !player.isCreative()) {
            double x = pos.getX() + 0.5F + facing.getOffsetX();
            double y = pos.getY() + 0.25F + (world.random.nextFloat() / 2.0F) + facing.getOffsetY();
            double z = pos.getZ() + 0.5F + facing.getOffsetZ();
            BlockPos spawnPos = new BlockPos(x, y, z);

            // spawn the chicken
            ChickenEntity chicken = MobHelper.spawn(EntityType.CHICKEN, (ServerWorld)world, spawnPos, SpawnReason.BUCKET);
            if (chicken != null) {

                CompoundTag data = ItemNBTHelper.getCompound(held, STORED_CHICKEN);
                if (!data.isEmpty())
                    chicken.readCustomDataFromTag(data);

                world.spawnEntity(chicken);
            }
        }
        player.swingHand(hand);

        if (!player.isCreative())
            player.setStackInHand(hand, new ItemStack(Items.BUCKET));

        return ActionResult.SUCCESS;
    }
}
