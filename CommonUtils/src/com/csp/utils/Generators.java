package com.csp.utils;

/**
 * 泛型接口，生成器，专门用于创建对象的类
 * @param <T>
 */
public interface Generators<T> {
    T next();
}
