package com.csp.p158;

class ClassAsFactory<T> {
    T t;

    public ClassAsFactory(Class<T> kind) {
        try {
            t = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {
}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeeded");
        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ClassAsFactory<Integer> falied");
        }
    }
}
