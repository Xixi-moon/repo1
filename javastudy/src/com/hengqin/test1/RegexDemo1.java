package com.hengqin.test1;

public class RegexDemo1 {
    public static void main(String[] args) {
        String str1 = "ojd02n9dkas333-222-//";
        String regex = "[^a-z]";
        System.out.println(str1.replaceAll(regex,"")); //正则替换
        String regex1 = "\\d+";
        String [] result = str1.split(regex1);  //以数字拆分
        for (String i:result){
            System.out.print(i);
        }
    }
}
