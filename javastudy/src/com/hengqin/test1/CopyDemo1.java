package com.hengqin.test1;

import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        if (args.length!=2){
            System.out.println("输入的参数不正确");
            System.out.println("例如：java Copy 源文件路径 目标文件路径");
            System.exit(1);
        }
        File file = new File(args[0]);
        File file1 = new File(args[1]);
        if (!file.exists()){
            System.out.println("源文件不存在");
            System.exit(1);
        }
        if (!file1.getParentFile().exists()){
            file1.getParentFile().mkdir();
        }
        InputStream input = new FileInputStream(file);
        OutputStream out = new FileOutputStream(file1);
        int temp = 0; //保存每次读取的个数
        byte [] data = new byte[1024];
        while ((temp=input.read(data))!=-1){
            out.write(data,0,temp);
        }
        System.out.println("复制完成");
//        if (input!=null&&out!=null){
//            int temp = 0;
//            while ((temp=input.read())!=-1){
//                out.write(temp);
//            }
//            System.out.println("复制完成");
//        }
        input.close();
        out.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
