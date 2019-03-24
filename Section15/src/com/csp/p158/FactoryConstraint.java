package com.csp.p158;

interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T t;

    public <F extends FactoryI<T>> Foo2(F factory) {
        t = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {

    @Override
    public Integer create() {
        return new Integer(0);
    }
}

class Widget {
    public static class Factory implements FactoryI<Widget> {

        @Override
        public Widget create() {
            return new Widget();
        }
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2(new IntegerFactory());
        new Foo2(new Widget.Factory());
    }
}
