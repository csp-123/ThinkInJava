package com.csp.utils;

public class Pair<K,V> {
    //key和value都是public和final为了使Pair成为只读的数据传输对象（或信使）
    public final K key;
    public final V value;
    public Pair(K k, V v) {
        key = k;
        value = v;
    }
}
