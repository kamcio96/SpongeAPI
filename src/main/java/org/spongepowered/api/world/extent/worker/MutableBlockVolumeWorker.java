package org.spongepowered.api.world.extent.worker;

import org.spongepowered.api.world.extent.BlockVolume;
import org.spongepowered.api.world.extent.MutableBlockVolume;
import org.spongepowered.api.world.extent.worker.procedure.BlockVolumeFiller;
import org.spongepowered.api.world.extent.worker.procedure.BlockVolumeMapper;
import org.spongepowered.api.world.extent.worker.procedure.BlockVolumeMerger;

/**
 *
 */
public interface MutableBlockVolumeWorker<V extends MutableBlockVolume> extends BlockVolumeWorker<V> {

    default void map(BlockVolumeMapper mapper) {
        map(mapper, getVolume());
    }

    default void merge(BlockVolume right, BlockVolumeMerger merger) {
        merge(right, merger, getVolume());
    }

    void fill(BlockVolumeFiller filler);

}
