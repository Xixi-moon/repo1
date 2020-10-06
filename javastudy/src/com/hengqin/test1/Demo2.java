package com.hengqin.test1;

class City32{
    private String title;
    private double price;
    static String pub = "清华大学出版社";
    public static void setPub(String p){
        pub = p;
    }
    public static String getPub(){
        return pub;
    }
    public City32(String title,double price){
        this.title=title;
        setPrice(price);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price=price;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    //方法不在主类中不用加static
    public void getInfo(){//此方法将由对象调用
        System.out.println("图书名称："+title+",价格:"+price+"，出版社:"+pub);
    }

}

public class Demo2 {
    public static void main(String[] args) {
        //没有实例化对象之前直接输出
        System.out.println(City32.pub);
        City32.setPub("北京大学出版社");
        System.out.println(City32.pub);
        City32 bk1 = new City32("java开发",89.7);
        City32 bk2 = new City32("Java开发",89.7);
        City32 bk3 = new City32("oracle开发",89.7);
        //bk1.pub="pppp";
        bk1.getInfo();
        bk2.getInfo();
        bk3.getInfo();
    }
}
