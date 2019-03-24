package com.csp;

class PrivateOverride1 {
    private void f(){
        System.out.println("private f()");
    }
}

public class Derived1 extends PrivateOverride1{
    public void f(){
        System.out.println("public f()");
    }

    public static void main(String[] args){
        PrivateOverride1 p = new Derived1();
        //p.f();无法获取方法
    }
}
