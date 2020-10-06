package com.hengqin.test1;

class BookObject{
    public BookObject(){
        System.out.println("***无参构造***");
    }

    @Override
    public String toString() {
        return "这是一个例子";
    }
}
public class GetClassDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> cls = Class.forName("com.hengqin.test1.BookObject");
        Object obj = cls.newInstance();
        System.out.println(obj);
    }
}
