package com.theoparis.essenceplus.client.entity.render;

import com.theoparis.essenceplus.EssencePlus;
import com.theoparis.essenceplus.client.entity.model.CreepinoEntityModel;
import com.theoparis.essenceplus.entity.CreepinoEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CreepinoEntityRenderer extends GeoEntityRenderer<CreepinoEntity> {
	public CreepinoEntityRenderer(EntityRendererFactory.Context context) {
		super(context, new CreepinoEntityModel());
	}
}
