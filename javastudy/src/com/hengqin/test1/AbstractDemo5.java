package com.hengqin.test1;

abstract class Action1{
    public static final int EAT = 1;
    public static final int SLEEP =3;
    public static final int WORK =5;
    public void command(int flag){
        // switch 只支持数值判断，而if支持条件判断
        switch (flag){
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
            case EAT+WORK:
                this.eat();
                this.work();
                break;
        }
    }
    //因为现在不确定子类的实现是什么样的
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();

}
class Robot extends Action1{
    public void eat(){
        System.out.println("机器人补充能量");
    }
    public void sleep(){}
    public void work(){
        System.out.println("机器人正在努力工作");
    }
}
class Human extends Action1{
    public void eat(){
        System.out.println("人类正在吃饭");
    }
    public void sleep(){
        System.out.println("人在睡觉");
    }
    public void work(){
        System.out.println("人为了梦想在工作");
    }
}
class Pig extends Action1{
    public void eat(){
        System.out.println("猪正在吃东西");
    }
    public void sleep(){
        System.out.println("猪在睡觉养膘");
    }
    public void work(){}
}
public class AbstractDemo5 {
    public static void main(String[] args) {
        fun(new Robot());
        fun(new Human());
        fun(new Pig());
    }
    public static void fun(Action1 action){
        action.command(Action1.EAT);
        action.command(Action1.SLEEP);
        action.command(Action1.WORK);
    }
}
