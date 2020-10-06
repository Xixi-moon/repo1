package com.hengqin.test1;
// 引用传递 第一道实例
class Message{
//    private int num=10;
//    public Message(int num){
//        this.num=num;
//    }
//    public void setNum(int num){
//        this.num=num;
//    }
//    public int getNum(){
//        return this.num;
//    }
    //第三道引用传递
    private String info = "Hello";
    public Message(String info){
        this.info = info;
    }
    public void setInfo(String info){
        this.info=info;
    }
    public String getInfo(){
        return info;
    }
}
public class Demo4 {
    public static void main(String[] args) {
//        Message msg = new Message(30);
//        fun(msg);                //引用传递
//        System.out.println(msg.getNum());
        //第二道引用传递
//        String msg = "Hello";
//        fun(msg);
//        System.out.println(msg);
        //第三道
        Message msg = new Message("hello");
        fun(msg);
        System.out.println(msg.getInfo());
    }
    public static void fun(Message temp){
//        temp.setNum(100);

          //temp = "World";
        temp.setInfo("world");
    }
}
