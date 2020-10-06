package com.hengqin.test1;

class ObjDemo1{
    String name;
    int age;
    public ObjDemo1(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "姓名："+this.name+"，年龄："+this.age;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if (obj == null){
            return true;
        }
        if (!(obj instanceof ObjDemo1)){
            return false;
        }
        ObjDemo1 objDemo1 = (ObjDemo1)obj;
        if (this.name.equals(objDemo1.name)&&this.age==objDemo1.age){
            return true;
        }
        return false;
    }
}
public class ObjectDemo1 {
    public static void main(String[] args) {
        ObjDemo1 obj = new ObjDemo1("zacwe",12);
        ObjDemo1 obj2 = new ObjDemo1("cwcw",12);
        System.out.println(obj.equals(obj2));
    }
}
