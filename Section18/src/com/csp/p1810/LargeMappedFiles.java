package com.csp.p1810;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 内存映射文件
 * 允许我们创建和修改那些因为太大而不能放入内存的文件。
 * 有了内存映射文件，我们可以假定文件都放入内存中，把它当做非常大的数组来访问。
 */
public class LargeMappedFiles {
    static int length = 0x8FFFFFF;//128 MB

    public static void main(String[] args) throws Exception {
        MappedByteBuffer out = new RandomAccessFile("test.dat", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i < length; i++)
            out.put((byte) 'x');

        System.out.println("Finished writing");
        for (int i = length / 2; i < length / 2 + 6; i++)
            System.out.print((char) out.get(i));
    }
}
