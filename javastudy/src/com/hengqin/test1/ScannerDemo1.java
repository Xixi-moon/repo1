package com.hengqin.test1;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("请输入生日：");
        while (flag){
            Scanner scanner = new Scanner(System.in);//从键盘输入数据
            if (scanner.hasNext()){
                String bir = scanner.next();
                System.out.println("输入内容："+bir);
                flag=false;
            }else {
                System.out.println("输入格式错误");
            }
        }
    }
}
