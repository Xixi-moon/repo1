package com.hengqin.test1;

class Outer{
    private String msg = "Hello World";
    class Inner{
        private String info = "世界你好";
        public void print(){
            System.out.println(msg);
        }
    }
//    public String getMsg(){
//        return this.msg;
//    }
    public void fun(){
        Inner inner = new Inner();
        //利用内部类对象  访问内部类中定义的私有属性
        System.out.println(inner.info);
        //实例化内部类对象，并且调用print方法
        new Inner().print();
    }
}
//class Inner{
//    private Outer outer;
//    public Inner(Outer outer){
//        this.outer = outer;
//    }
//    public void print(){
//        System.out.println(this.outer.getMsg());
//    }
//}
public class InnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer(); //实例化外部类对象
        outer.fun();//调用外部类方法
    }
}
