package com.hengqin.test1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString(){
        return "姓名："+this.name+"，年龄："+this.age;
    }

//    @Override
//    public int compareTo(Person o) {
//        if (this.age>o.age){
//            return 1;
//        }else if (this.age<o.age){
//            return -1;
//        }else {
//            return this.name.compareTo(o.name);
//        }
//    }
    }
public class SetDemo {
    public static void main(String[] args) throws Exception {
        Set<Person> all = new HashSet<Person>();
        all.add(new Person("张三",30));
        all.add(new Person("李四",40));
        all.add(new Person("王五",50));
        all.add(new Person("赵柳",6));
        all.add(new Person("王五",40));
        all.add(new Person("赵柳",6));
        System.out.println(all);
//        all.add("A");
//        all.add("Hello");
//        all.add("Hello");
//        all.add("world");
//        System.out.println(all);
    }
}
