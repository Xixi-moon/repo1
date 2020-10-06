package com.hengqin.test1;

import java.io.IOException;
import java.io.OutputStream;

public class SystemoutDemo1 {
    public static void main(String[] args) {
        OutputStream out = System.out;    //此时的输出流是向屏幕上输出
        try {
            out.write("hello world!!!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
