package org.spongepowered.api.world.extent.worker;

import org.spongepowered.api.world.extent.BlockVolume;
import org.spongepowered.api.world.extent.MutableBlockVolume;
import org.spongepowered.api.world.extent.worker.procedure.BlockVolumeIterator;
import org.spongepowered.api.world.extent.worker.procedure.BlockVolumeMapper;
import org.spongepowered.api.world.extent.worker.procedure.BlockVolumeMerger;
import org.spongepowered.api.world.extent.worker.procedure.BlockVolumeReducer;

/**
 *
 */
public interface BlockVolumeWorker<V extends BlockVolume> {

    V getVolume();

    void map(BlockVolumeMapper mapper, MutableBlockVolume destination);

    void merge(BlockVolume right, BlockVolumeMerger merger, MutableBlockVolume destination);

    void iterate(BlockVolumeIterator iterator);

    <T> T reduce(BlockVolumeReducer<T> reducer, T zero);

}
