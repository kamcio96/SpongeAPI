package org.spongepowered.api.world.extent.worker.procedure;

import org.spongepowered.api.world.extent.UnmodifiableBiomeArea;

/**
 *
 */
@FunctionalInterface
public interface BiomeAreaReducer<T> {

    T reduce(UnmodifiableBiomeArea area, int x, int z, T reduction);

}
