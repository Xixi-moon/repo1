package com.hengqin.test1;

import java.io.InputStream;

public class SysteminDemo {
    public static void main(String[] args) throws Exception {
        InputStream input = System.in;
        StringBuffer buf = new StringBuffer();
        System.out.println("请输入内容：");
        int temp =0 ;
        while ((temp=input.read())!=-1){
            char c = (char) temp;
            if (c=='\n'){
                break;
            }
            buf.append(c);
        }
        System.out.println("输入的内容为："+buf);
        input.close();
    }
}
