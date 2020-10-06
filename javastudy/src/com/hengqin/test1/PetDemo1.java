package com.hengqin.test1;

interface PetStandard{
    public String getName();
    public int getAge();
}

class Cat implements PetStandard{
   private String name;
   private int age;
    public Cat(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
   public void setName(String name) {
       this.name = name;
   }
    public void setAge(int age) {
        this.age = age;
    }
   public String getName() {
       return this.name;
   }
   public int getAge(){
        return this.age;
   }
//    public boolean equals(PetStandard pet){
//        if (this == pet){
//            return true;
//        }
//        if (pet==null){
//            return false;
//        }
//        if (pet.getName().equals(this.name)&&pet.getAge()==this.age){
//            return true;
//        }
//        return false;
//    }
}
class Dog implements PetStandard{
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
class PetShop{
    private PetStandard[]pets;    //保存多个属性
    private int foot;     //数据保存的位置
    public PetShop(int len){
        if (len>0){
            this.pets = new PetStandard[len];
        }else {
            this.pets = new PetStandard[1];
        }
    }
    public boolean add(PetStandard pet){  //增加宠物
        if (this.foot<this.pets.length){
            this.pets[this.foot]=pet;
            this.foot++;
            return true;
        }else {
            return false;
        }
    }
    public PetStandard[] search(String keyWord){
        int count =0;
        for (int i = 0; i<this.pets.length;i++){
            if (this.pets[i]!=null){
                if (this.pets[i].getName().indexOf(keyWord)!=-1){
                    count++;
                }
            }
        }
        PetStandard [] p =new PetStandard[count];
        int f= 0;
        for (int i =0;i<this.pets.length;i++){
            if (this.pets[i]!=null){
                if (this.pets[i].getName().indexOf(keyWord)!=-1){
                    p[f]=this.pets[i];
                    f++;
                }
            }
        }
        return p;
    }
    public boolean deleate(PetStandard pet){
        if (this.search(pet.getName())!=null){
            int len = this.pets.length;
            for (int i = 0;i<len;i++){
                if (pets[i].getName().equals(pet.getName())&&pets[i].getAge()==pet.getAge()){
                    pets[i]=pets[len-1];
                    len--;
                }
            }
            return true;
        }
        return false;
    }
}

public class PetDemo1 {
    public static void main(String[] args) {
        PetShop ps = new PetShop(6);
        ps.add(new Cat("白猫",2));
        ps.add(new Cat("黑猫",2));
        ps.add(new Cat("花猫",2));
        ps.add(new Dog("白狗",2));
        ps.add(new Dog("黑狗",2));
        ps.add(new Dog("花狗",2));
        System.out.println("删除前搜索：");
        print(ps.search("黑"));
        ps.deleate(new Cat("黑猫",1));
        System.out.println("删除后搜索：");
        print(ps.search("黑"));
    }
    public static void print(PetStandard [] p){
        for(int i =0;i<p.length;i++){
            if (p[i]!=null){
                System.out.println(p[i].getName()+","+p[i].getAge());
            }
        }
    }
}
