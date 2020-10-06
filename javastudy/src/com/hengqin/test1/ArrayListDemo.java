package com.hengqin.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class City3{
    private String title;
    private double price;
    public City3(String title,double price){
        this.title = title;
        this.price = price;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if (!(obj instanceof City3)){
            return false;
        }
        City3 City3 = (City3) obj;
        if (this.title.equals(City3.title)&& this.price == City3.price){
            return true;
        }
        return false;
    }
    public String toString(){
        return "书名："+this.title+"，价格："+this.price+"\n";
    }
}
public class ArrayListDemo {
    public static void main(String[] args) throws Exception{//此处直接抛出
        List<City3> all = new ArrayList<City3>();
        all.add(new City3("Java",78.9));
        all.add(new City3("JSP",80));
        all.add(new City3("oracle",40));
        //任何情况下集合数据的删除与内容的查询都必须提供有equals()方法
        all.remove(new City3("JSP",80));
        System.out.println(all);

//        //设置了泛型，从而保证集合中所有的数据类型都一致。
//        List<String> all = new ArrayList<>();
//        Collection<String> allc = new ArrayList<>();
//        System.out.println("长度："+all.size()+"，是否为空"+all.isEmpty());
//        all.add("Hello");
//        all.add("Hello");   //重复元素
//        all.add("World");
//        System.out.println("长度："+all.size()+"，是否为空"+all.isEmpty());
//        allc.addAll(all);
//        Object [] obj = allc.toArray();
//        for (int y = 0; y<obj.length;y++){
//            System.out.println(obj[y]);
//        }
//        //Collection接口定义了size()方法可以取得集合长度
//        //List子接口扩充了一个get()方法，可以根据缩印取得数据
//        for(int x =0; x<all.size();x++){
//            String str = all.get(x);    /取得的索引数据
//            System.out.println(str);
//        }

    }
}
