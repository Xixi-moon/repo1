package com.hengqin.test1;

class Block{
    static String mag;
    public Block(){
        System.out.println("2、构造方法");
    }
    {
        System.out.println("1、构造块");
    }
    static {
        mag = "Hello".substring(0,2);
        System.out.println("0、静态代码块");
    }
}
public class BlockDemo {
    static {
        System.out.println("*888888**88****");
    }
    public static void main(String[] args) {

//        new Block();
//        new Block();
//        new Block();
//        System.out.println(Block.mag);
        //在主类中定义
        System.out.println("Hello World");
    }
}
