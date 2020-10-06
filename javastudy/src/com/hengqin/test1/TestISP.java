package com.hengqin.test1;

class Item{ //父栏目
    private int iid;
    private String name;
    private String note;
    //一个栏目下包含多个子栏目
    private Subitem [] subitems;
    private Product [] products;
    //构造方法
    public Item(int iid,String name,String note){
        this.iid = iid;
        this.name = name;
        this.note = note;
    }
    //方法
    public void setSubitem(Subitem [] subitems){
        this.subitems=subitems;
    }
    public Subitem [] getSubitems(){
        return this.subitems;
    }
    public void setProducts(Product [] products){
        this.products = products;
    }
    public Product [] getProducts(){
        return this.products;
    }
    public String getInfo(){
        return "栏目编号："+this.iid+"，名称："+this.name+"，内容："+this.note;
    }
}
class Subitem{   //子栏目
    private int sid;
    private String name;
    private String note;
    private Item item;
    private Product [] products;
    public Subitem(int sid,String name,String note){
        this.sid = sid;
        this.name = name;
        this.note = note;
    }
    public void setItem(Item item){
        this.item = item;
    }
    public Item getItem(){
        return this.item;
    }
    public void setProducts(Product [] products){
        this.products = products;
    }
    public Product [] getProducts(){
        return this.products;
    }
    public String getInfo(){
        return "子栏目："+this.sid+"，名称："+this.name+"，内容："+this.note;
    }
}
class Product{
    private int pid;
    private String name;
    private double price;
    private Item item;
    private Subitem subitem;
    public Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    public void setItem(Item item){
        this.item = item;
    }
    public Item getItem(){
        return this.item;
    }
    public void setSubitem(Subitem subitem){
        this.subitem = subitem;
    }
    public Subitem getSubitem(){
        return this.subitem;
    }
    public String getInfo(){
        return "商品编号："+this.pid+"，商品名称："+this.name+"，商品价格："+this.price;
    }
}
public class TestISP {
    public static void main(String[] args) {
        //设置数据关系
        Item item = new Item(1,"厨房用具","一");
        Subitem subitem1 = new Subitem(1001,"厨具","-");
        Subitem subitem2 = new Subitem(1002,"刀具","-");
        Subitem subitem3 = new Subitem(1003,"餐具","*");
        Product product1 = new Product(90001,"蒸锅",500);
        Product product2 = new Product(90002,"炒锅",300);
        Product product3 = new Product(90003,"菜刀",10);
        Product product4 = new Product(90004,"水果刀",5);
        Product product5 = new Product(90005,"青花瓷",850);
        Product product6 = new Product(90006,"水晶筷子",600);
        //设置对象间的引用关系
        subitem1.setItem(item);
        subitem2.setItem(item);
        subitem3.setItem(item);
        item.setSubitem(new Subitem[]{subitem1,subitem2,subitem3});
        product1.setSubitem(subitem1);
        product1.setItem(item);
        product2.setSubitem(subitem1);
        product2.setItem(item);
        product3.setSubitem(subitem2);
        product3.setItem(item);
        product4.setSubitem(subitem2);
        product4.setItem(item);
        product5.setSubitem(subitem3);
        product5.setItem(item);
        product6.setSubitem(subitem3);
        product6.setItem(item);
        subitem1.setProducts(new Product[]{product1,product2});
        subitem2.setProducts(new Product[]{product3,product4});
        subitem3.setProducts(new Product[]{product5,product6});
        item.setProducts(new Product[]{product1,product2,product3,product4,product5,product6});
        //取出数据
        //1、通过一个类型找到全部对应的子类型
        System.out.println(item.getInfo());
        for (int x = 0; x<item.getSubitems().length; x++){
            System.out.println("\t|- "+item.getSubitems()[x].getInfo());
        }
        System.out.println("---------------------------");
        System.out.println(item.getInfo());
        for (int x = 0; x< item.getProducts().length; x++){
            System.out.println("\t"+item.getProducts()[x].getInfo());
            System.out.println("\t\t"+item.getProducts()[x].getSubitem().getInfo());
        }
        System.out.println("----------------------------");
        Subitem [] subitems = new Subitem[]{subitem1,subitem2,subitem3};
        for (int x=0;x<subitems.length;x++){
            System.out.println(subitems[x].getInfo());
            for (int y = 0; y<subitems[x].getProducts().length;y++){
                System.out.println("\t"+subitems[x].getProducts()[y].getInfo());
            }
        }
    }
}
