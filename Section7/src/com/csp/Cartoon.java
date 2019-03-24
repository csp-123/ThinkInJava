package com.csp;

class Art {
    Art() {
        System.out.println("Art");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing");
    }
}

/**
 * java会自动在导出类中插入对基类构造器的调用
 * 构造过程是从基类向外扩散的，所以基类在导出类构造器可以访问他之前就已经完成了初始化。
 */
public class Cartoon extends Drawing {
    Cartoon() {
        System.out.println("Cartoon");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
