package com.hengqin.test1;

class Sex{
    private String title;
    private static final Sex MALE = new Sex("男");
    private static final Sex FEMALE = new Sex("女");
    private Sex(String title){
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
    public static Sex getInstance(String title){
        if (title.equals("man")){
            return MALE;
        }else if (title.equals("woman")){
            return FEMALE;
        }else {
            return null;
        }
    }
}
public class MultiCaseDemo1 {
    public static void main(String[] args) {
        Sex sex = Sex.getInstance("man");
        System.out.println(sex);
    }
}
