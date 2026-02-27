package com.bootcamp.week3.Ejercicios.Dos;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExpiringCache<K, V> {
    private final Map<K, CacheEntry<V>> store = new HashMap<>();
    private final long defaultTtlMillis;

    private record CacheEntry<V>(V value, long expiresAt) {
        boolean isExpired() {
            return System.currentTimeMillis() > expiresAt;
        }
    }

    public ExpiringCache(long defaultTtlMillis) {
        this.defaultTtlMillis = defaultTtlMillis;
    }

    public void put(K key, V value) {
        // almacenar con TTL por defecto
        put(key, value, defaultTtlMillis);
    }

    public void put(K key, V value, long ttlMillis) {
        // calcular expiresAt y crear CacheEntry
        long expiresAt = System.currentTimeMillis() + ttlMillis;
        store.put(key, new CacheEntry<>(value, expiresAt));
    }

    public Optional<V> get(K key) {
        CacheEntry<V> entry = store.get(key);

        if (entry == null || entry.isExpired()) {
            store.remove(key); // limpieza lazy
            return Optional.empty();
        }

        return Optional.of(entry.value());
    }

    public void evictExpired() {
        // remover todas las entradas expiradas
        store.entrySet().removeIf(e -> e.getValue().isExpired());
    }

    public int size() {
        evictExpired();
        return store.size();
    }

    @Override
    public String toString() {
        evictExpired();
        StringBuilder sb = new StringBuilder("Cache{");
        store.forEach((k, v) -> sb.append(k)
                .append("=")
                .append(v.value())
                .append(", "));
        if (!store.isEmpty()) sb.setLength(sb.length() - 2);
        return sb.append("}").toString();
    }
}