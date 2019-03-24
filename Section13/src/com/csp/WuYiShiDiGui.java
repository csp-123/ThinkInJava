package com.csp;

import java.util.ArrayList;
import java.util.List;

/**
 * 无意识递归
 * 当运行 "WuYiShiDiGui address: " + this 代码时，this发生自动类型转换
 * 要将WuYiShiDiGui对象转换成String对象，所以调用this.toString()方法，这时
 * 递归发生。解决办法：super.toString()
 */
public class WuYiShiDiGui {
    public String toString() {
        //return "WuYiShiDiGui address: " + this + "\n";
        return "WuYiShiDiGui address: " + super.toString() + "\n";
    }

    public static void main(String[] args){
        List<WuYiShiDiGui> v = new ArrayList<WuYiShiDiGui>();
        for (int i = 0; i < 10; i++){
            v.add(new WuYiShiDiGui());
        }
        System.out.println(v);
    }
}
