package com.theoparis.essenceplus.client.entity.model;

import com.theoparis.essenceplus.EssencePlus;
import com.theoparis.essenceplus.entity.CreepinoEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CreepinoEntityModel extends AnimatedGeoModel<CreepinoEntity> {
    @Override
    public Identifier getModelLocation(CreepinoEntity object) {
        return new Identifier(EssencePlus.MOD_ID, "geo/creepino.geo.json");

    }

    @Override
    public Identifier getTextureLocation(CreepinoEntity object) {
        return new Identifier(EssencePlus.MOD_ID, "textures/entity/creepino/creepino.png");
    }

    @Override
    public Identifier getAnimationFileLocation(CreepinoEntity animatable) {
        return new Identifier(EssencePlus.MOD_ID, "animations/creepino.animation.json");
    }
}
