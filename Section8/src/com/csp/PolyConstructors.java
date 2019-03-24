package com.csp;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph().radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw().radius = " + radius);
    }
}

/**
 * 初始化的实际过程：
 * 1. 在其他任何事物发生之前，将分配给对象的存储空间初始化为二进制零
 * 2. 如前所述调用基类构造器。此时调用被覆盖后的draw（）方法（要在调用子类构造器之前调用），由于1步骤的缘故，此时radius为0
 * 3. 按照声明的顺序调用成员初始化方法
 * 4. 调用子类的构造器主体
 */
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }

    /*
    Glyph() before draw()
    RoundGlyph.draw().radius = 0
    Glyph() after draw()
    RoundGlyph.RoundGlyph().radius = 5
    */
}
