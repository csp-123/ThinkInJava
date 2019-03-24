package com.csp;

class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public f()");
    }
}

/**
 * 缺陷：覆盖私有方法
 */
public class PrivateOverride {
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args){
        PrivateOverride p = new Derived();
        p.f();//private f()
    }
}
