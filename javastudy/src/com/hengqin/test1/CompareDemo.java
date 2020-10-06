package com.hengqin.test1;

class Book{
    private String title;
    private double price;

    @Override
    public String toString() {
        return "title="+this.title+",price="+this.price;
    }

    public Book(String title, double price){
        this.title=title;
        setPrice(price);
    }
    public boolean compare(Book book){
        if (this == null){
            return false;
        }
        if(this == book){
            return true;
        }
        if (this.title.equals(book.title)
        && this.price == book.price){
            return true;
        }else {
            return false;
        }
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
        System.out.println("图书名称："+title+",价格:"+price);
    }

}

public class CompareDemo {
    public static void main(String[] args) {
        Book bk1 = new Book("java开发",89.7);
        Book bk2 = new Book("Java开发",89.7);
        if (bk1.compare(bk2)){
            System.out.println("是同一个对象");
        }else{
            System.out.println("不是同一个对象");
        }
    }
}
