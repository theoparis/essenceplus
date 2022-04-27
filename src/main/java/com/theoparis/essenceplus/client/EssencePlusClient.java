package com.theoparis.essenceplus.client;

import com.theoparis.essenceplus.EssencePlus;
import com.theoparis.essenceplus.client.entity.render.CreepinoEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class EssencePlusClient implements ClientModInitializer {
	public static final EntityModelLayer MODEL_CREEPINO_LAYER = new EntityModelLayer(new Identifier(EssencePlus.MOD_ID, "creepino"), "main");

	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(EssencePlus.CREEPINO_ENTITY, CreepinoEntityRenderer::new);
	}
}
