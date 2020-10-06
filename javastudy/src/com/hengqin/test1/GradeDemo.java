package com.hengqin.test1;

public class GradeDemo {
    public static void main(String[] args) {
        int x =-1;
        if (x>100||x<0){
            System.out.println("输入错误成绩");
        }else {
            String grade = x==100?"满分":x>=90?"优秀":"普通";
            System.out.println(grade);
        }
    }
}
