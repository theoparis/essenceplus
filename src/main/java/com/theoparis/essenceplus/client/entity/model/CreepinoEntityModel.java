package com.theoparis.essenceplus.client.entity.model;

import com.theoparis.essenceplus.EssencePlus;
import com.theoparis.essenceplus.entity.CreepinoEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class CreepinoEntityModel extends GeoModel<CreepinoEntity> {
	@Override
	public Identifier getModelResource(CreepinoEntity object) {
		return new Identifier(EssencePlus.MOD_ID, "geo/creepino.geo.json");

	}

	@Override
	public Identifier getTextureResource(CreepinoEntity object) {
		return new Identifier(EssencePlus.MOD_ID, "textures/entity/creepino/creepino.png");
	}

	@Override
	public Identifier getAnimationResource(CreepinoEntity animatable) {
		return new Identifier(EssencePlus.MOD_ID, "animations/creepino.animation.json");
	}
}
