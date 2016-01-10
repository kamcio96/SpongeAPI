package org.spongepowered.api.world.extent.worker.procedure;

import org.spongepowered.api.world.extent.UnmodifiableBlockVolume;

/**
 *
 */
@FunctionalInterface
public interface BlockVolumeIterator {

    void visit(UnmodifiableBlockVolume volume, int x, int y, int z);

}
