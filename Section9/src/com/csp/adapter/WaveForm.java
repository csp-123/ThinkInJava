package com.csp.adapter;

/**
 * 电子滤波器例子，使用适配器模式实现策略模式
 */
public class WaveForm {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "WaveForm " + id;
    }
}
