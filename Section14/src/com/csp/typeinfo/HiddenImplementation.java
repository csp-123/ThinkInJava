package com.csp.typeinfo;

import com.csp.typeinfo.interfacea.A;
import com.csp.typeinfo.packageaccess.HiddenC;

import java.lang.reflect.Method;

/**
 * 没有任何方式可以阻止反射到达并调用那些非公共访问权限的方法，包括私有内部类，匿名内部类
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception{
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        /*if(a instanceof C){

        }*/

        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
        /*
        Public C.f()
        com.csp.typeinfo.packageaccess.C
        Public C.g()
        package C.u()
        protected C.v()
        private C.w()  调用私有方法
         */
    }

    static void callHiddenMethod(Object o, String methdName) throws Exception{
        Method g = o.getClass().getDeclaredMethod(methdName);
        g.setAccessible(true);
        g.invoke(o);
    }
}
