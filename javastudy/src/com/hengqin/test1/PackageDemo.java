package com.hengqin.test1;

public class PackageDemo {
    public static void main(String[] args) {
//        // JDK1.5之前的做法
//        int x =30;
//        Integer integer = new Integer(x); // 装箱：将基本数据类型变为包装类
//        int temp = integer.intValue();  //拆箱：将包装类变为基本数据类型

        // 自动装箱及拆箱操作
//        Integer i = 30;           //自动装箱成Integer
//        Float f = 30.3f;
//        int x =i;                 //自动拆箱为int
//        float y =f;
//
        // 字符串变为基本数据类型
        String str1 = "30";
        String str2 = "30.3";
        int x = Integer.parseInt(str1);
        float f = Float.parseFloat(str2);
        System.out.println("整数乘方："+x+"*"+x+"="+(x*x));
        System.out.println("小数乘方："+f+"*"+f+"="+(f*f));

        Integer i = new Integer(100);
        int j = 100;
        System.out.println(i == j); //true

        Integer a = new Integer(100);
        Integer b = 100;
        System.out.println(a == b); //false
        System.out.println(a.equals(b)); //true

        Integer c = 100;
        Integer d = 100;
        System.out.println(c == d); //true

        Integer y = 128;
        Integer z = 128;
        System.out.println(y == z); //false
        System.out.println(y.equals(z));//true
        Integer l =10;
        System.out.println(l);
    }
}
