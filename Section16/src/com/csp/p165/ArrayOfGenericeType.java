package com.csp.p165;

public class ArrayOfGenericeType<T> {
    T[] array;

    public ArrayOfGenericeType(int size) {
        //array = new T[size]; 泛型擦除
        array = (T[]) new Object[size];
    }
}
