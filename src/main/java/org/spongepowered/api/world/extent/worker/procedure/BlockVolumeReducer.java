package org.spongepowered.api.world.extent.worker.procedure;

import org.spongepowered.api.world.extent.UnmodifiableBlockVolume;

/**
 *
 */
@FunctionalInterface
public interface BlockVolumeReducer<T> {

    T reduce(UnmodifiableBlockVolume volume, int x, int y, int z, T reduction);

}
