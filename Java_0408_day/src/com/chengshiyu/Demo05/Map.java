package com.chengshiyu.Demo05;

public interface Map<K,V> {

    V put(K key,V value);

    V get(K key);

    boolean isEmpty();

    int size();



    interface Entry<K,V>{
        K getKey();
        V getValue();
    }
}
