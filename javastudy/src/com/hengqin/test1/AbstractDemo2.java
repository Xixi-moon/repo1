package com.hengqin.test1;

abstract class Abs{
    //static定义的内部类属于外部类
    static abstract class Abs2{
        public abstract void print();
    }
}

class X extends Abs.Abs2{
    public void print(){
        System.out.println("Hello");
    }
}
public class AbstractDemo2 {
    public static void main(String[] args) {
        Abs.Abs2 a = new X();
        a.print();
    }
}

