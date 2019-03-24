package com.csp.p1810;

import java.nio.ByteBuffer;

/**
 * 获取基本类型
 */
public class GetData {
    private static final int BSIZE = 1024;
    public static void main(String[] args){
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        int i = 0;
        while (i++ < buff.limit())
            if (buff.get() != 0)
                System.out.print("nonzero");
        System.out.print("i = " + i);
        buff.rewind();

        buff.asCharBuffer().put("Howdy!");
        char c;
        while ((c = buff.getChar()) != 0)
            System.out.println(c + " ");
        System.out.println();
        buff.rewind();

        buff.asShortBuffer().put((short)471142);
        System.out.println(buff.getShort());

        buff.asIntBuffer().put(99471142);
        System.out.println(buff.getInt());
        buff.rewind();
        buff.asLongBuffer().put(99471142);
        System.out.println(buff.getLong());
        buff.rewind();
        buff.asFloatBuffer().put(99471142);
        System.out.println(buff.getFloat());
        buff.rewind();
        buff.asDoubleBuffer().put(99471142);
        System.out.println(buff.getDouble());
        buff.rewind();
    }
}
