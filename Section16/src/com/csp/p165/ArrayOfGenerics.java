package com.csp.p165;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {
    public static void main(String[] args) {
        List<String>[] ls;
        //ls = new List<String>[10]; 不可以创建持有泛型的数组对象
        List[] la = new List[10];
        ls = (List<String>[])la; //但是可以创建非泛型数组对象，然后将其转型

        ls[0] = new ArrayList<String>();

        //ls[1] = new ArrayList<>(Integer);
    }
}
