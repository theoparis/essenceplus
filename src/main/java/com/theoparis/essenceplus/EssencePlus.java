package com.theoparis.essenceplus;

import com.theoparis.essenceplus.entity.CreepinoEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;

public class EssencePlus implements ModInitializer {
    public static final String MOD_ID = "essenceplus";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static final EntityType<CreepinoEntity> CREEPINO_ENTITY = Registry.register(
        Registry.ENTITY_TYPE,
        new Identifier(MOD_ID, "creepino"),
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CreepinoEntity::new)
            .dimensions(EntityDimensions.fixed(0.75f, 2.5f)).build()
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(CREEPINO_ENTITY, CreepinoEntity.createMobAttributes());
    }
}
