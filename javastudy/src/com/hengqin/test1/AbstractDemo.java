package com.hengqin.test1;

abstract class Ab{//定义一个抽象类
    public void fun(){//普通方法
        System.out.println("存在方法体的方法");
    }
    //此方法并没有方法体的声明，并且有abstract关键字,表示抽象方法
    public abstract void print();
}

//一个子类只能继承一个抽象类，属于单继承局限
class Ab2 extends Ab{//Ab2类是Ab类的子类，并且是一个普通类
    public void print(){//强制要求覆写的方法
        System.out.println("Hello world!");
    }

}
public class AbstractDemo {
    public static void main(String[] args) {
        Ab ab = new Ab2();//向上转型
        ab.print();
    }
}
