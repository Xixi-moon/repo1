package com.hengqin.test1;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("1、除法计算开始：");
        try {
            int x = 10;
            int y = 0;
            System.out.println("开始计算："+(x/y));
            System.out.println("除法结束");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("不管是否产生异常都执行");
        }
        System.out.println("**********");
    }
}
