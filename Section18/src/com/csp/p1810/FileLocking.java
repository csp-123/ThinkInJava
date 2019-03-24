package com.csp.p1810;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * 文件加锁
 * tryLock()是非阻塞式的，它设法获取锁，但是如果不能获得，它将直接从方法调用返回。
 * lock()是阻塞式的，它要阻塞进程直至锁可以获得，或者调用lock()的线程中断，或者调用lock()通道关闭。
 * release()可以释放锁。
 * 对文件部分加锁
 * tryLock(long position, long size, boolean shared)
 * lock(long position, long size, boolean shared)
 */
public class FileLocking {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file.txt");
        FileLock fl = fos.getChannel().tryLock();
        if(fl != null) {
            System.out.println("Locked File");
            TimeUnit.MILLISECONDS.sleep(100);
            fl.release();
            System.out.println("Released Lock");
        }
        fos.close();
    }
}
