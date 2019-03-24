package com.csp.utils;

public class CountingGenerator {

    public static class Boolean implements Generators<java.lang.Boolean> {

        private boolean value = false;

        @Override
        public java.lang.Boolean next() {
            value = !value;
            return value;
        }
    }

    public static class Byte implements Generators<java.lang.Byte> {
        private byte value = 0;

        @Override
        public java.lang.Byte next() {
            return value++;
        }
    }

    static char[] chars = ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

    public static class Character implements Generators<java.lang.Character> {
        private int index = -1;

        @Override
        public java.lang.Character next() {
            index = (index + 1) % chars.length;
            return chars[index];
        }
    }

    public static class String implements Generators<java.lang.String> {

        private int length = 7;
        Generators<java.lang.Character> cg = new Character();

        public String() {
        }

        public String(int length) {
            this.length = length;
        }

        @Override
        public java.lang.String next() {
            char[] buf = new char[length];
            for (int i = 0; i < length; i++) {
                buf[i] = cg.next();
            }
            return new java.lang.String(buf);
        }
    }

    public static class Short implements Generators<java.lang.Short> {
        private short value = 0;

        @Override
        public java.lang.Short next() {
            return value++;
        }
    }

    public static class Integer implements Generators<java.lang.Integer> {
        private int value = 0;

        @Override
        public java.lang.Integer next() {
            return value++;
        }
    }

    public static class Long implements Generators<java.lang.Long> {
        private long value = 0;

        @Override
        public java.lang.Long next() {
            return value++;
        }
    }

    public static class Float implements Generators<java.lang.Float> {
        private float value = 0;

        @Override
        public java.lang.Float next() {
            float result = value;
            value += 1.0;
            return result;
        }
    }

    public static class Double implements Generators<java.lang.Double> {
        private double value = 0;

        @Override
        public java.lang.Double next() {
            double result = value;
            value += 1.0;
            return result;
        }
    }
}
