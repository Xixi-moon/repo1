package com.hengqin.test1;
class Person1{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}

class Student extends Person1{

}
public class Per_StuDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("zhangsan");
        stu.setAge(16);
        System.out.println("name:"+stu.getName()+",age:"+stu.getAge());
    }
}
