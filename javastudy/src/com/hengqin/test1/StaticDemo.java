package com.hengqin.test1;

class Demo{
    private String title;
    private static int num = 0;
    public Demo(){
        num++;
        this.title = "Java-"+num;
    }
    public Demo(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println(new Demo().getTitle());
        System.out.println(new Demo().getTitle());
        System.out.println(new Demo("oracle").getTitle());

//        if(args.length != 3){
//            System.out.println("输入参数的个数不足3个，程序退出");
//            System.exit(1);   //直接退出
//        }
//        for (int x = 0; x<args.length;x++){
//            System.out.println("第"+(x+1)+"个参数："+args[x]);
//        }
    }
}
