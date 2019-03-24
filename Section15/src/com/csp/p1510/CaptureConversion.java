package com.csp.p1510;

class Holder<T> {
    private T value;

    public Holder() {

    }

    public Holder(T val) {
        value = val;
    }

    public void set(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }
}

public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder);
    }

    public static void main(String[] args) {
        Holder row = new Holder<Integer>(1);
        f1(row);
        f2(row);

        Holder row1 = new Holder();
        row1.set(new Object()); //warning
        f2(row1);
        Holder<?> row2 = new Holder<Double>(1.0);
        f2(row2);
    }
}
