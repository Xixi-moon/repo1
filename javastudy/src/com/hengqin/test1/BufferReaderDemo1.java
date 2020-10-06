package com.hengqin.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.println("请输入内容：");
        try {
            str=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入的内容为："+str);
    }
}
