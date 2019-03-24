package com.csp.p194;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore {HERE, THERE}

/**
 * values()神秘之处
 * values()由编译器添加的static方法
 */
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("------------Analyzing " + enumClass + " ------------");
        System.out.println("Interfaces:");
        for (Type t : enumClass.getGenericInterfaces())
            System.out.println(t);
        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Method: ");
        Set<String> methods = new TreeSet<>();
        for (Method m : enumClass.getMethods())
            methods.add(m.getName());
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println(exploreMethods.containsAll(enumMethods));
        exploreMethods.removeAll(enumMethods);
        System.out.println(exploreMethods);

        /*
        ------------Analyzing class com.csp.p194.Explore ------------
Interfaces:
Base: class java.lang.Enum
Method:
[compareTo, equals, getClass, getDeclaringClass, hashCode, name, notify, notifyAll, ordinal, toString, valueOf, values, wait]
------------Analyzing class java.lang.Enum ------------
Interfaces:
java.lang.Comparable<E>
interface java.io.Serializable
Base: class java.lang.Object
Method:
[compareTo, equals, getClass, getDeclaringClass, hashCode, name, notify, notifyAll, ordinal, toString, valueOf, wait]
true
[values]
         */
    }
}
