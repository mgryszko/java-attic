package com.grysz.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class MapBuilder<K, V> {
    public static <K, V> MapBuilder<K, V> newMap() {
        return new MapBuilder<>();
    }

    private final Map<K, V> map = new HashMap<>();

    private MapBuilder() {
    }

    public MapBuilder<K, V> put(K key, V value) {
        map.put(key, value);
        return this;
    }

    public Map<K, V> build() {
        return Collections.unmodifiableMap(map);
    }
}
