package com.theoparis.essenceplus.entity;

import com.theoparis.essenceplus.EssencePlus;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

public class CreepinoEntity extends PathAwareEntity implements GeoEntity {
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

	private static final RawAnimation WALK_ANIM = RawAnimation.begin().thenPlay("animation.creepino.walk");

	public CreepinoEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
		controllers.add(
			// Add our flying animation controller
			new AnimationController<>(
				this,
				10,
				state -> state.setAndContinue(WALK_ANIM)));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return EssencePlus.CREEPINO_SCREECH_SOUND;
	}

	@Override
	protected void initGoals() {
		this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
		super.initGoals();
	}
}
