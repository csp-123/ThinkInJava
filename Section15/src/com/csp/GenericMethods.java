package com.csp;

public class GenericMethods {

    public <T, U> void f(T t, U u) {
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("", "");
        genericMethods.f(1, 1);
        genericMethods.f(1.0, 1.0);
        genericMethods.f(1.0F, 1.0F);
        genericMethods.f('c', 'c');
        genericMethods.f(genericMethods, genericMethods);
    }
}
