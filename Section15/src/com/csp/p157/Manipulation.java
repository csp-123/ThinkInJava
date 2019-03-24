package com.csp.p157;

class Manipulator<T extends HasF> {
    private T t;

    public Manipulator(T t) {
        this.t = t;
    }

    public void manipulate() {
        t.f();
    }
}

class Manipulator1<T> {
    private T t;

    public Manipulator1(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

/**
 * 泛型类型参数将擦除到它的第一个边界
 */
public class Manipulation {
    public static void main(String[] args) {
        HasF hasF = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hasF);
        manipulator.manipulate();

        Manipulator1<HasF> manipulator1 = new Manipulator1<>(new HasF());

        HasF hasF1 = manipulator1.getT();
        hasF1.f();
    }
}
