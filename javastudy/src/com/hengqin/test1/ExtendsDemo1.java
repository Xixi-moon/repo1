package com.hengqin.test1;

class A{
    public void print(){
        System.out.println("A");
    }
}

class B extends A{
    public void print(){
        System.out.println("B");
    }
}
public class ExtendsDemo1 {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof B);

        A a = new B();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        if (a instanceof B){//如果a对象是B类的实例
            B b = (B) a;
            b.print();
        }
    }
}


