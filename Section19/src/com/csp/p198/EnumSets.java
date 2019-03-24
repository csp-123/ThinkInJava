package com.csp.p198;

import java.util.EnumSet;

import static com.csp.p198.AlarmPoints.*;

/**
 * EnumSet设计充分考虑了速度因素，因为它必须与非常高效的bit位相竞争，内部设计可能采用的long值作为比特向量
 * 所以EnumSet非常的高效
 */
public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(A);
        System.out.println(points);
        points.addAll(EnumSet.of(A, B, C));
        System.out.println(points);
        points.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(A, B, C));
        System.out.println(points);
        points.removeAll(EnumSet.range(D, E));
        System.out.println(points);
        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
}
