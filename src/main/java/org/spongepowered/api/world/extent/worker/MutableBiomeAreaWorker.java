package org.spongepowered.api.world.extent.worker;

import org.spongepowered.api.world.extent.BiomeArea;
import org.spongepowered.api.world.extent.MutableBiomeArea;
import org.spongepowered.api.world.extent.worker.procedure.BiomeAreaFiller;
import org.spongepowered.api.world.extent.worker.procedure.BiomeAreaMapper;
import org.spongepowered.api.world.extent.worker.procedure.BiomeAreaMerger;

/**
 *
 */
public interface MutableBiomeAreaWorker<A extends MutableBiomeArea> extends BiomeAreaWorker<A> {

    default void map(BiomeAreaMapper mapper) {
        map(mapper, getArea());
    }

    default void merge(BiomeArea right, BiomeAreaMerger merger) {
        merge(right, merger, getArea());
    }

    void fill(BiomeAreaFiller filler);

}
