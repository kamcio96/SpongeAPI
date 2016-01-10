package org.spongepowered.api.world.extent.worker.procedure;

import org.spongepowered.api.world.biome.BiomeType;
import org.spongepowered.api.world.extent.UnmodifiableBiomeArea;

/**
 *
 */
@FunctionalInterface
public interface BiomeAreaMerger {

    BiomeType merge(UnmodifiableBiomeArea leftArea, int xLeft , int zLeft, BiomeType leftBlock,
        UnmodifiableBiomeArea rightArea, int xRight, int zRight, BiomeType rightBlock);

}
