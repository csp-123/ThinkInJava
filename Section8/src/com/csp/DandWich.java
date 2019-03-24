package com.csp;

class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}

class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}

class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}

class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch{
    private Bread bread = new Bread();
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}

/**
 * 构造器调用顺序
 * 1. 调用基类构造器。这个步骤会一只递归下去，首先是构造这种层次的根，然后是下一层导出类，直到最底层的导出类
 * 2. 按声明顺序调用成员的初始化方法
 * 3. 调用导出类构造器的主体
 */
public class DandWich extends PortableLunch{
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();

    DandWich(){
        System.out.println("DandWich()");
    }

    public static void main(String[] args){
        new DandWich();

        /*Meal()
        Lunch()
        PortableLunch()
        Bread()
        Cheese()
        Lettuce()
        DandWich()*/

        /*Meal()
        Lunch()
        Bread()
        PortableLunch()
        Bread()
        Cheese()
        Lettuce()
        DandWich()*/
    }
}
