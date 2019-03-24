package com.csp.p1510;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> fruits = new ArrayList<Apple>();
        //不能添加任何类型的对象
        //fruits.add(new Apple());
        //fruits.add(new Fruit());
        //fruits.add(new Object());
        fruits.add(null);
    }
}
