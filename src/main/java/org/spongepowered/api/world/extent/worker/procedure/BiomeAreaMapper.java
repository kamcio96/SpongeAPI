package org.spongepowered.api.world.extent.worker.procedure;

import org.spongepowered.api.world.biome.BiomeType;
import org.spongepowered.api.world.extent.UnmodifiableBiomeArea;

/**
 *
 */
@FunctionalInterface
public interface BiomeAreaMapper {

    BiomeType map(UnmodifiableBiomeArea area, int x, int z, BiomeType biome);

}
