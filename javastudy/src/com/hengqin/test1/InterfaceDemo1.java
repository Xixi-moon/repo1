package com.hengqin.test1;

interface A1{//定义了接口
    public static final String MSG = "Hello";//全局常量
    public abstract void print();//抽象方法

}
interface B1{
    public abstract void get();
}
abstract class C1{
    public abstract void say();
}
class Y extends C1 implements A1,B1{ //
    public void print(){
        System.out.println("A1接口的抽象方法");
    }
    public void get(){
        System.out.println("B1接口的抽象方法");
    }
    public void say(){
        System.out.println("C1抽象类的方法");
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        Y y = new Y();
        A1 a = y;  //向上转型
        B1 b = y;  //向上转型
        C1 c = y;
        a.print();
        b.get();
        c.say();
    }
}
