package com.hengqin.test1;

class Singleton{
    private static final Singleton SINGLETON =new Singleton();
    public static Singleton getSingleton(){
        return SINGLETON;
    }
    private Singleton(){};   //构造方法私有化
    public void print(){
        System.out.println("Hello,world!");
    }
}
public class SingletonDemo1 {
    public static void main(String[] args) {
        Singleton single = Singleton.getSingleton();  //直接访问static属性
        Singleton single2 = Singleton.getSingleton();
        Singleton single3 = Singleton.getSingleton();
        Singleton single4 = Singleton.getSingleton();
        System.out.println(single);
        System.out.println(single2);
        System.out.println(single3);
        System.out.println(single4);
    }
}
