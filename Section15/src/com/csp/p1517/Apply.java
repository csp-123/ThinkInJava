package com.csp.p1517;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Apply {
    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
        try {
            for (T t : seq) {
                f.invoke(t, args);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

class Shape {
    public void rotate() {
        System.out.println(this + " rotate");
    }
    public void resize(int newSize) {
        System.out.println(this + " resize " + newSize);
    }
}

class Square extends Shape {
}

class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> type, int size) throws IllegalAccessException, InstantiationException {
        for (int i = 0; i < size; i++) {
            add(type.newInstance());
        }
    }
}

class ApplyTest {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException {
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            shapes.add(new Shape());
        }
        Apply.apply(shapes, Shape.class.getMethod("rotate"));
        Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 5);

        Apply.apply(new FilledList<>(Shape.class, 10), Shape.class.getMethod("rotate"));
        Apply.apply(new FilledList<>(Shape.class, 10), Square.class.getMethod("rotate"));

    }
}

