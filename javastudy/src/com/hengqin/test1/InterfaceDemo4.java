package com.hengqin.test1;

interface Fruit{
    public void  eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("***吃苹果");
    }
}
class Orange implements Fruit{
    public void eat(){
        System.out.println("***吃橘子");
    }
}
class Factory{
    public static Fruit getInstance(String furitname){
        if ("apple".equals(furitname)){
            return new Apple();
        }else if ("orange".equals(furitname)){
            return new Orange();
        }else {
            return null;
        }
    }
}
public class InterfaceDemo4 {
    public static void main(String[] args) {
        Fruit fruit = Factory.getInstance("apple");
        fruit.eat();
    }
}
