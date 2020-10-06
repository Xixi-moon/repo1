package com.hengqin.test1;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo1 {
    public static void main(String[] args) {
        //访问的时候不用加后缀
        ResourceBundle rb = ResourceBundle.getBundle("Messages");
        //此时的properties文件一定要放在CLASSPATH路径下
//        System.out.println(rb.getString("info"));
        String str = rb.getString("wel.msg");
        System.out.println(MessageFormat.format(str,"王聪聪",new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date())));
        System.out.println(Locale.getDefault());
    }
}
