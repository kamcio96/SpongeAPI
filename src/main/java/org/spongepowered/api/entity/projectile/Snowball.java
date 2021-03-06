/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.entity.projectile;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.data.manipulator.mutable.entity.DamagingData;
import org.spongepowered.api.data.value.mutable.MapValue;
import org.spongepowered.api.data.value.mutable.MutableBoundedValue;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.living.Living;

/**
 * Represents a Snowball.
 */
public interface Snowball extends Projectile {

    /**
     * Gets a copy of the current {@link DamagingData} that this snowball will
     * deal on an {@link Entity} when hit.
     *
     * @return A copy of the damaging data
     */
    default DamagingData getDamagingData() {
        return get(DamagingData.class).get();
    }

    /**
     * Gets the damage this projectile will deal to a {@link Living}
     * if hit.
     *
     * @return The damage to deal
     */
    default MutableBoundedValue<Double> damage() {
        return getValue(Keys.ATTACK_DAMAGE).get();
    }

    /**
     * Gets the {@link MapValue} for representing the custom damage
     * values to use if the owner strikes an entity of that type.
     *
     * <p>Note that in events, the damage defined for the provided
     * {@link EntityType} will take priority over the "default" damage as
     * defined from {@link #damage()}.</p>
     *
     * @return The immutable map value for the entity damage values
     */
    default MapValue<EntityType, Double> damageForEntity() {
        return getValue(Keys.DAMAGE_ENTITY_MAP).get();
    }
}
