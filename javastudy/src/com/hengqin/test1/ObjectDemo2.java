package com.hengqin.test1;

interface O{
    public void fun();
}
class Ob implements O{
    public void fun(){
        System.out.println("Hello");
    }
}

public class ObjectDemo2 {
    public static void main(String[] args) {
        O o =new Ob();  //接口对象
        Object obj = o;  //接收接口对象
        Ob ob = (Ob)obj;  //向下转型
        ob.fun();
//        Object obj = new int[] {1,2,3};
//        if(obj instanceof int[]){
//            int [] data = (int [])obj;
//            for (int x:data){
//                System.out.println(x);
//            }
//        }
    }
}
