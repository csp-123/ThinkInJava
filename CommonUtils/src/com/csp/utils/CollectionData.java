package com.csp.utils;

import java.util.ArrayList;

public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generators<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generators<T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
}
