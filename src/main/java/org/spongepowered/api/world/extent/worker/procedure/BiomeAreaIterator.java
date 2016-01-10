package org.spongepowered.api.world.extent.worker.procedure;

import org.spongepowered.api.world.extent.UnmodifiableBiomeArea;

/**
 *
 */
@FunctionalInterface
public interface BiomeAreaIterator {

    void visit(UnmodifiableBiomeArea area, int x, int z);

}
