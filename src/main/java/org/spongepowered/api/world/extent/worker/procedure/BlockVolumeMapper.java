package org.spongepowered.api.world.extent.worker.procedure;

import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.world.extent.UnmodifiableBlockVolume;

/**
 *
 */
@FunctionalInterface
public interface BlockVolumeMapper {

    BlockState map(UnmodifiableBlockVolume volume, int x, int y, int z, BlockState block);

}
