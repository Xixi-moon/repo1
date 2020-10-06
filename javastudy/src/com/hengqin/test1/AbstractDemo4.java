package com.hengqin.test1;

abstract class Abstr{
    public Abstr(){  //2、父类构造方法
        this.print();  //3、调用print()方法
    }
    public abstract void print();
}

class Abstr2 extends Abstr{
    private int num =100;
    public Abstr2(int num){
        this.num = num;
    }
    public void print(){   //4、调用覆写后方法
        System.out.println("num="+num); //num未初始化，内容是其对应数据类型的默认值
    }
}
public class AbstractDemo4 {
    public static void main(String[] args) {
        new Abstr2(30).print(); //1、执行构造
    }
}
