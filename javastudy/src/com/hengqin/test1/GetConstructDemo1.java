package com.hengqin.test1;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
class Book1{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
public class GetConstructDemo1 {
    public static void main(String[] args) throws Exception {
        String filename = "title";
        Class<?> cls = Class.forName("com.hengqin.test1.Book1");
        Object obj = cls.newInstance();
        Method setMet = cls.getMethod("set"+initcap(filename), String.class);
        Method getMet = cls.getMethod("get"+initcap(filename));
        setMet.invoke(obj,"java");
        System.out.println(getMet.invoke(obj));
    }
    public static String initcap(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
