package com.hengqin.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegexDemo2 {
    public static void main(String[] args) throws ParseException {
//        String str = "10.";
//        String regex = "\\d+(\\.\\d+)?";
//        String str1 = "192.168.1.1";
//        String regex2 = "(\\d{1,3}\\.){3}\\d{1,3}";
//        System.out.println(str1.matches(regex2));
//        String str = "2020-06-29";
//        String regex = "\\d{4}-\\d{2}-\\d{2}";
//        if (str.matches(regex)){
//            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
//            System.out.println(date);
//        }
        String str = "(010)-1234567";
        String regex = "((\\d{3,4}-)|(\\(\\d{3,4}\\)-))?\\d{7,8}";
        System.out.println(str.matches(regex));

//        if (str.matches(regex)){
//            System.out.println(Double.parseDouble(str));
//        }else {
//            return;
//        }
    }
}
