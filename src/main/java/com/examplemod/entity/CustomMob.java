package com.examplemod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class CustomMob extends Mob {
    protected CustomMob(EntityType<? extends Mob> entityType, Level level) {
        super(entityType, level);
    }

    // Custom mob abilities
}