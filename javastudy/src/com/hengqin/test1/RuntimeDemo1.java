package com.hengqin.test1;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        Process pro = null;
        try {
            pro = run.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pro.destroy();
//        System.out.println("JVM最大内存容量："+run.maxMemory());
//        System.out.println("JVM空闲内存量："+run.freeMemory());
//        String str = "Hello World"+"\t"+"welcome";
//        for (int i = 0;i<1000;i++){  //不断修改String，产生很多垃圾
//            str+=i;
//        }
//        System.out.println("操作之后，JVM空闲内存量："+run.freeMemory());
//        run.gc();   //进行垃圾收集，释放空间
//        System.out.println("垃圾回收后："+run.freeMemory());

    }
}
