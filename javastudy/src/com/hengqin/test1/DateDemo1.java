package com.hengqin.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) throws ParseException {
        String str = "2020-06-29 11:13:15:526";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date date = sdf.parse(str);
        System.out.println(date);

//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//        String str = sdf.format(date);
//        System.out.println(str);


//        long cur = System.currentTimeMillis();
//        Date date1 = new Date(cur);
//        System.out.println(date1);  //输出对象
//        System.out.println(date1.getTime());  //输出对象信息
    }
}
