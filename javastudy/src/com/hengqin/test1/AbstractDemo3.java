package com.hengqin.test1;

abstract class Abst{//定义一个抽象类
    public abstract void print();
    private static class Abst2 extends Abst{//内部抽象类子类
        public void print(){
            System.out.println("Hello");
        }
    }
    public static Abst getInstance(){
        return new Abst2();
    }
}

public class AbstractDemo3 {
    public static void main(String[] args) {
        //此时取得抽象类，完全不需要知道B类的存在
        Abst a = Abst.getInstance();
        a.print();
    }
}
