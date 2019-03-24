package com.csp.p172;

import com.csp.utils.CollectionData;
import com.csp.utils.Generators;

import java.util.LinkedHashSet;
import java.util.Set;

class Government implements Generators<String> {

    String[] foundation = "strange women lying in ponds distributing swords is no basis for a system of goverment".split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<>(new Government(), 15));
        set.addAll(CollectionData.list(new Government(),15));
        System.out.println(set);
    }
}
