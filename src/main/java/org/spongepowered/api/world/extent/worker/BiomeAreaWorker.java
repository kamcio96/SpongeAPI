package org.spongepowered.api.world.extent.worker;

import org.spongepowered.api.world.extent.BiomeArea;
import org.spongepowered.api.world.extent.MutableBiomeArea;
import org.spongepowered.api.world.extent.worker.procedure.BiomeAreaIterator;
import org.spongepowered.api.world.extent.worker.procedure.BiomeAreaMapper;
import org.spongepowered.api.world.extent.worker.procedure.BiomeAreaMerger;
import org.spongepowered.api.world.extent.worker.procedure.BiomeAreaReducer;

/**
 *
 */
public interface BiomeAreaWorker<A extends BiomeArea> {

    A getArea();

    void map(BiomeAreaMapper mapper, MutableBiomeArea destination);

    void merge(BiomeArea right, BiomeAreaMerger merger, MutableBiomeArea destination);

    void iterate(BiomeAreaIterator iterator);

    <T> T reduce(BiomeAreaReducer<T> reducer, T zero);

}
