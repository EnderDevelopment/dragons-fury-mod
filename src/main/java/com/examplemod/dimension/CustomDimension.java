package com.examplemod.dimension;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class CustomDimension {
    public static final ResourceKey<Level> CUSTOM_DIMENSION = ResourceKey.create(Registries.DIMENSION, com.examplemod.ExampleMod.location("custom_dimension"));
    public static final ResourceKey<DimensionType> CUSTOM_DIMENSION_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, com.examplemod.ExampleMod.location("custom_dimension_type"));
}