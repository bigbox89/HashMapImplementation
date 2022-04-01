package com.github.bigbox89;

public interface HashMapInterface<K, V> extends Iterable<Entry<K, V>> {

    V get(K key);

    void put(K key, V value);

    void remove(K key);

    int size();

}
