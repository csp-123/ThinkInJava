package com.csp.p1510;

class Fruit {
}

class Apple extends Fruit {
}

class Jonathan extends Apple {
}

class Orange extends Fruit {
}

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new Jonathan();

        fruits[2] = new Fruit(); //java.lang.ArrayStoreException
        fruits[3] = new Orange();//java.lang.ArrayStoreException
    }
}
