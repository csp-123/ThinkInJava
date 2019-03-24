package com.csp;

class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

/**
 * 对象创建的过程：假设有个名为Dog的类
 * 1. 即使没有显示的使用static关键字，构造器实际上也是静态方法。因此，
 *    当首次创建类型为Dog的对象时（构造器可以看成是静态方法），或者Dog
 *    类的静态方法/静态域首次被访问时，Java解释器必须查找类路径，以定位Dog.class文件。
 * 2. 然后载入Dog.class，有关静态初始化的所有动作都会执行。因此，静态
 *    初始化只在class首次加载的时候进行一次。
 * 3. 当用new Dog()创建对象的时候，首先将在堆上为Dog对象分配足够的存储空间。
 * 4. 这块存储空间会被清零，这就自动的将Dog对象中的所有基本类型都设置成默认值
 *    （对于数字来说就是0，对布尔型和字符型也相同），而引用则被设置成null。
 * 5. 执行所有出现于字段定义处的初始化操作。
 * 6. 执行构造器。
 */
public class StaticInitialization {
    int a;
    boolean b;
    char c;

    //可变参数重载测试
    static void f(float i, Character... args){
        System.out.println("first");
    }

    static void f(Character... args){
        System.out.println("second");
    }

    public static void main(String[] args){
        System.out.println("Create new Cupboard in main");
        new Cupboard();

        System.out.println("Create new Cupboard in main");
        new Cupboard();

        table.f2(1);
        cupboard.f3(1);

        StaticInitialization s = new StaticInitialization();
        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(s.c);

        //System.out.println(args.toString());

        /*Bowl(1)
        Bowl(2)
        Table()
        f1(1)
        Bowl(4)
        Bowl(5)
        Bowl(3)
        Cupboard()
        f1(2)
        Create new Cupboard in main
        Bowl(3)
        Cupboard()
        f1(2)
        Create new Cupboard in main
        Bowl(3)
        Cupboard()
        f1(2)
        f2(1)
        f3(1)
        0
        false*/
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
