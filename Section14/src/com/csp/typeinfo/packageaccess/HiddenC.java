package com.csp.typeinfo.packageaccess;

import com.csp.typeinfo.interfacea.A;

class C implements A {
    @Override
    public void f() {
        System.out.println("Public C.f()");
    }

    public void g() {
        System.out.println("Public C.g()");
    }

    void u() {
        System.out.println("package C.u()");
    }

    protected void v() {
        System.out.println("protected C.v()");
    }

    private void w() {
        System.out.println("private C.w()");
    }
}

public class HiddenC {
    public static A makeA(){
        return new C();
    }
}
