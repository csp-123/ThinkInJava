package com.csp.p186;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 缓冲输入文件
 */
public class BufferedInputFile {
    public static String read(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = br.readLine()) != null)
            sb.append(s + "\n");
        br.close();
        return sb.toString();
    }
}
