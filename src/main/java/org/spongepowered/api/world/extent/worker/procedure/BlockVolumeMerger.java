package org.spongepowered.api.world.extent.worker.procedure;

import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.world.extent.UnmodifiableBlockVolume;

/**
 *
 */
@FunctionalInterface
public interface BlockVolumeMerger {

    BlockState merge(UnmodifiableBlockVolume leftVolume, int xLeft, int yLeft, int zLeft, BlockState leftBlock,
        UnmodifiableBlockVolume rightVolume, int xRight, int yRight, int zRight, BlockState rightBlock);

}
